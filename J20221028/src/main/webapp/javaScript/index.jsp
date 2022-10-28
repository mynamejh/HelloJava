<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body><!-- onsubmit => on은 무조건 이벤트~ id값은 한개당 하나! 중복 안됨-->
    <form action="index.html" onsubmit="submitFunc()">
            id: <input type="text" id="uid" value="user1"><br>
            pw: <input type="password" id="upw" value="1234"><br>
            <input type="submit" value="로그인">
    </form>
    <div id="show"></div>
    <script>
        function saveFnc(){
        // document.write('<p>Hello, World</p>');
        // DOM 요소생성
         let pTag = document.createElement('P'); // <p></p>
         let txt = document.createTextNode('Hello,World');
        pTag.appendChild(txt); //<p>Hello,World</p>
        console.log(pTag);

        let show = document.getElementById('show');
        show.appendChild(pTag);
        console.log(show);
        }

        function submitFunc(){
            event.preventDefault(); //form 기본 기능 차단!
            console.log('submitFunc() call.');

            //엘리먼트: 우리가 만드는거 그대로 보여주는것
            //엘리먼트 선택하는데 id속성을 엘리먼트를 선택하고 싶다
            let id = document.getElementById('uid').value;
            let pw = document.getElementById('upw').value;

            let pTag = document.createElement('p');
            let txt = document.createTextNode('id는 ' + id + ', 비번은' + pw);
            pTag.appendChild(txt);

            //ptag에다가 온클릭(이벤트)를 추가하겠다~
            pTag.onclick = function() {
                console.log(this.remove());
            }

            document.getElementById('show').appendChild(pTag);
        }

</script>
</body>
</html>