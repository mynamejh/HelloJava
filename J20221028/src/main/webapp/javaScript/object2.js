/**
 object2.js
 */ 
//domcontenloaded => 다 읽어낸다음에 이벤트가 실행 
document.addEventListener('DOMContentLoaded', function(){
	//document.getElementById('show').innerHTML = '<p>Hello, World</p>';
	let data = `[{"id":1,"first_name":"Celina","last_name":"Fidilis","email":"cfidilis0@dedecms.com","gender":"Female","salary":8451},
{"id":2,"first_name":"Shamus","last_name":"Chern","email":"schern1@amazon.co.jp","gender":"Male","salary":6870},
{"id":3,"first_name":"Kip","last_name":"Prydie","email":"kprydie2@ebay.co.uk","gender":"Female","salary":6908},
{"id":4,"first_name":"Jeffie","last_name":"de Glanville","email":"jdeglanville3@google.ru","gender":"Male","salary":5022},
{"id":5,"first_name":"Martie","last_name":"Burhill","email":"mburhill4@deviantart.com","gender":"Male","salary":2524},
{"id":6,"first_name":"Lorne","last_name":"Conquest","email":"lconquest5@reuters.com","gender":"Male","salary":9884},
{"id":7,"first_name":"Frederigo","last_name":"Defond","email":"fdefond6@gnu.org","gender":"Male","salary":3063},
{"id":8,"first_name":"Jesus","last_name":"Rosser","email":"jrosser7@meetup.com","gender":"Male","salary":1091},
{"id":9,"first_name":"Aguistin","last_name":"Fairhurst","email":"afairhurst8@loc.gov","gender":"Male","salary":9226},
{"id":10,"first_name":"Alvina","last_name":"Boomes","email":"aboomes9@nasa.gov","gender":"Female","salary":2583}]`;
 
 
 
//jason 타입 => 자바스크립트 오브젝트
let result = JSON.parse(data);
console.log(result);

//for (String str : personList){} => 자바스크립트는 row of result 로 씀: 개수만큼 반복~


//<ul><li> obj</li></ul> 이모양으로 10번 반복해서 만들기
//<div id = "show"></div>

//table 태그 만들겠다
const fields = ['id','first_name','email','salary'];
let ulTag = document.createElement('table');

for(row of result){
	ulTag.appendChild(makeTr(row));
		
}

document.getElementById('show').appendChild(ulTag);

function makeTr(obj){
	
}

function makeList(obj){
	let liTag = document.createElement('li');
	let str = '';
	for(field of fields){ //fields에 있는값 반복해서 field에 넣음~
		str += `${field}: ${obj[field]}` ; // {id값}:{obj.id값}가져옴~ 
	}
	let txt = document.createTextNode(str);
	liTag.appendChild(txt);
	
	return liTag;	
	
}
});
 