
//dom1.js / dom활용해서 페이지 생성!
// 1. 폼이라는 객체를 만들겠다~
//2. appendchild 하위요소로 만들겠다~

document.addEventListener('DOMcontentLoaded', function() {
	let show = document.getElementById('show');
	let form = document.createElement('form');

	// # id 부분 
	let txt = document.createTextNode('ID:');
	let input = document.createElement('input');
	input.setAttribute('type', 'text'); //두번째 들어간 곳에 매개값 넣음!
	input.setAttribute('id', 'id');
	let br = document.createElement('br');
	form.appendChild(txt);
	form.appendChild(input);
	form.appendChild(br);
	show.appendChild(form);

	// # name 부분
	txt = document.createTextNode('Name:');
	input = document.createElement('input');
	input.setAttribute('type', 'text');
	input.setAttribute('id', 'name');
	br = document.createElement('br');
	form.appendChild(txt);
	form.appendChild(input);
	form.appendChild(br);
	show.appendChild(form);
	
	//#phone 부분
	txt = document.createTextNode("phone:");
	input = document.createElement('input');
	input.setAttribute('type', 'text');
	input.setAttribute('id', 'phone');
	br = document.createElement('br');
	form.appendChild(txt);
	form.appendChild(input);
	form.appendChild(br);
	show.appendChild(form);
	
	//#전송(sumbit) 부분
	input = document.createElement('input');
	input.setAttribute('type', 'submit');
	input.setAttribute('value','전송');
	form.appendChild(input);
	show.appendChild(form);
	
	
})