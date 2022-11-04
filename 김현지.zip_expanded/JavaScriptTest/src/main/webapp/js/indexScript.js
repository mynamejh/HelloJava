//indexScript.js

document.addEventListener('DOMContentLoaded', function () {
    fetch('BookListServlet')
        .then(result => result.json())
        .then(showData)
        .catch(err => console.log(err));

    //추가버튼 이벤트
    document.querySelector('#submit').addEventListener('click', addFunc);

    document.getElementById('checkbox').addEventListener('change', function () {
        let cks = document.querySelectorAll('#show input[type="checkbox"]');
        cks.forEach(function (check) {
            check.checked = checkbox.checked;
        });
    });

    //선택삭제 이벤트
    document.querySelector('#selectDelete').addEventListener('click', deleteFunc);


    //목록 띄우기
    function showData(result) {
        console.log(result);
        result.forEach(row => {
            document.querySelector('#list').append(makeTr(row));
        });
    }

    //추가
    function addFunc() {
        let bc = document.getElementById('bookCode').value;
        let bn = document.getElementById('bookName').value;
        let ba = document.getElementById('bookAuthor').value;
        let bPs = document.getElementById('bookPress').value;
        let bPc = document.getElementById('bookPrice').value;
        let check = bc && bn && ba && bPs && bPc; //값이있으면 true, 없으면 false
        if (!check) {
            alert('필수항목입니다');
            return false;
        }
        let data = "bookCode=" + bc + "&bookName=" + bn + "&bookAuthor=" + ba + "&bookPress=" + bPs + "&bookPrice=" + bPc;

        fetch('./BookAddServlet', {
                method: 'post',
                headers: {
                    'Content-type': 'application/x-www-form-urlencoded'
                },
                body: data
            })
            .then(result => result.json())
            .then(addCallback)
            .catch(err => console.log(err));

        return false;
    }

    //리스트에 보여주기
    function addCallback(result) {
        document.querySelector('#list').append(makeTr(result));

        document.querySelector('#bookCode').value = '';
        document.querySelector('#bookName').value = '';
        document.querySelector('#bookAuthor').value = '';
        document.querySelector('#bookPress').value = '';
        document.querySelector('#bookPrice').value = '';

    }

    //tr만들기
    function makeTr(obj) {
        let tr = document.createElement('tr');
        tr.setAttribute('id', obj.bookCode);
        //체크박스
        let chbx = document.createElement('input');
        chbx.setAttribute('type', 'checkbox');
        let td = document.createElement('td');
        td.append(chbx);
        tr.append(td);
        //필드명
        for (let field in obj) {
            let td = document.createElement('td');
            let txt = document.createTextNode(obj[field]);
            td.append(txt);
            tr.append(td);
        }
        //삭제버튼
        let btn = document.createElement('button');
        btn.addEventListener('click', deleteFnc);
        td = document.createElement('td');
        let txt = document.createTextNode('삭제');
        btn.appendChild(txt);
        td.append(btn);
        tr.appendChild(td);

        return tr;
    }

    //개별 삭제
    function deleteFnc() {
        let bcd = this.parentElement.parentElement.getAttribute('id');
        let delAjax = new XMLHttpRequest();
        delAjax.open('post', './BookDelServlet');
        delAjax.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
        delAjax.send('bookCode=' + bcd);
        delAjax.onload = function () {
            let result = delAjax.responseText;
            if (result == 'O') {
                document.getElementById(bcd).remove();
                alert('삭제가 완료되었습니다')
            } else if (result == 'X') {
                alert('처리중 에러 발생');
            }
        }
    }

    //체크삭제
    function deleteFunc() {
        let trs = document.querySelectorAll('#list>tr');
        trs.forEach(tr => {
            if (tr.firstElementChild.firstElementChild.checked) {
                let bcd = tr.getAttribute('id');
                let delAjax = new XMLHttpRequest();
                delAjax.open('post', './BookDelServlet');
                delAjax.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
                delAjax.send('bookCode=' + bcd);
                delAjax.onload = function () {
                    tr.remove();
                    return true;
                }
            }
        });
        document.getElementById('checkbox').checked = false;
    }
});