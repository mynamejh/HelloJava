// dom2.js

document.addEventListener('DOMContentLoaded', domLoadedFunc);

function domLoadedFunc() {

    let data = `[{"id":1,"first_name":"Gregoor","last_name":"Longthorn","email":"glongthorn0@shop-pro.jp","gender":"Male","salary":2832},
                 {"id":2,"first_name":"Adina","last_name":"Desquesnes","email":"adesquesnes1@shinystat.com","gender":"Female","salary":7973},
                 {"id":3,"first_name":"Doralyn","last_name":"Alenichev","email":"dalenichev2@surveymonkey.com","gender":"Female","salary":7815},
                 {"id":4,"first_name":"Murdock","last_name":"Sellars","email":"msellars3@odnoklassniki.ru","gender":"Male","salary":2790}
                ]`;
    let result = JSON.parse(data);
    // 확장for.
    // table 
    let table = document.createElement('table');
    let show = document.getElementById('show');
    show.appendChild(table);
    // thead
    let thead = document.createElement('thead');
	let tr = document.createElement('tr');
    let titles = ['아이디', '이름', '이메일', '성별', '급여', '삭제'];
    for (let title of titles) {
        let idTag = document.createElement('th');
        let idTxt = document.createTextNode(title); // <th>아이디</th>
        idTag.appendChild(idTxt);
        tr.appendChild(idTag);
    }
	// checkbox 생성.
	let td = document.createElement('th');
	let checkbox = document.createElement('input');
	checkbox.setAttribute('type', 'checkbox');
	checkbox.addEventListener('change', function() {
		document.querySelectorAll('#show input[type="checkbox"]')
		  .forEach(function(check) {
			check.checked = checkbox.checked;
		});
	})
	td.appendChild(checkbox);
	tr.appendChild(td);	
	
	thead.appendChild(tr);
    table.appendChild(thead);

    // tbody
    let tbody = document.createElement('tbody');
    table.appendChild(tbody);
    let fields = ['id', 'first_name', 'email', 'gender', 'salary'];
    for (let obj of result) {

        let tr = makeTr(obj);
        tbody.appendChild(tr);
    } // end of for (let obj of result)

    /////////////////////////// event ////////////////////////////
    // 추가버튼에 이벤트 등록.
    document.querySelector('button[type="button"]').addEventListener('click', addFunc);

    // 수정버튼에 이벤트 등록.
    document.querySelectorAll('button[type="button"]')[1].addEventListener('click', updateFunc);

    // 선택삭제 이벤트 등록.
    document.querySelectorAll('button[type="button"]')[2].addEventListener('click', deleteCheckedFunc);

    /////////////////////////// function ////////////////////////////
    function addFunc() {
        let id = document.getElementById('id').value;
        let fn = document.getElementById('fname').value;
        let em = document.getElementById('email').value;
        let sa = document.getElementById('salary').value;
        let gn = document.getElementById('gender').value;
        // 필수입력항목 확인.
        let check = id && fn && em && sa && gn;
        if (!check) {
            alert('입력항목 확인');
            return;
        }

        let newRow = {
            id: id,
            first_name: fn,
            email: em,
            salary: sa,
            gender: gn
        }
        document.querySelector('#show>table>tbody').appendChild(makeTr(newRow));

    };

    function updateFunc() {
        let trs = document.querySelectorAll('#show>table>tbody>tr');
        let id = document.getElementById('id').value;
        console.log(id, trs[0].children[0].textContent);

        for (let i = 0; i < trs.length; i++) {
            if (id == trs[i].children[0].textContent) {
                trs[i].children[4].textContent = document.getElementById('salary').value;
                trs[i].children[3].textContent = document.getElementById('gender').value;
                trs[i].children[2].textContent = document.getElementById('email').value;
                trs[i].children[1].textContent = document.getElementById('fname').value;

            }
        }
    } // end of updateFunc()

    function deleteCheckedFunc() {
        let trs = document.querySelectorAll('#show>table>tbody>tr');
        for (let i = 0; i < trs.length; i++) {
            if (trs[i].children[6].firstElementChild.checked) {
                trs[i].remove();
            }
        }
    } // end of deleteCheckedFunc()

    function makeTr(row) {
        // 데이터 건수만큼 반복.
        let tr = document.createElement('tr');
        tr.addEventListener('mouseover', function () {
            this.style.backgroundColor = 'yellow';
        })
        tr.addEventListener('mouseout', function () {
            this.style.backgroundColor = null;
        })
        tr.addEventListener('click', showDetailFunc);

        for (let field of fields) {
            // 항목만큼 반복.
            let td = document.createElement('td');
            let txt = document.createTextNode(row[field]);
            td.appendChild(txt);
            tr.appendChild(td);
        }
        // 삭제버튼. <td><button>삭제</button></td>
        let td = document.createElement('td');
        let btn = document.createElement('button');
        btn.addEventListener('click', function () {
            this.parentElement.parentElement.remove();
        });
        let txt = document.createTextNode('삭제');
        td.appendChild(btn);
        btn.appendChild(txt);
        tr.appendChild(td);

        // 체크박스.
        td = document.createElement('td');
        td.style.textAlign = 'center';
        let check = document.createElement('input');
        check.addEventListener('change', function () {
            console.log(this.checked);
        })
        check.setAttribute('type', 'checkbox');
        td.appendChild(check);
        tr.appendChild(td);

        return tr;
    } // end of makeTr()

    function showDetailFunc() {

        document.getElementById('id').value = this.children[0].textContent;
        document.getElementById('fname').value = this.children[1].textContent;
        document.getElementById('email').value = this.children[2].textContent;
        document.getElementById('gender').value = this.children[3].textContent;
        document.getElementById('salary').value = this.children[4].textContent;
    }

} // end of domLoadedFunc()