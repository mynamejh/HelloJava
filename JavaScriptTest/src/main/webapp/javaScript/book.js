 document.addEventListener('DOMContentLoaded',function(){

function domloadData(){
    let ajax = new XMLHttpRequest(); 
    ajax.open('get','data/MOCK_DATA.json');
    ajax.send(); 
    ajax.onload = loadCallback;
}


let table = documnet.createElement('table');
let show = document.getElementById('show');
show.appendChild(table);

let thead = documnet.createElement('thead');
let tr = documnet.createElement(tr);
let titles =['도서코드','도서명','저자','출판사','가격','삭제']

for(let title of titles){
    let tag = document.createElement('th');
    let tag2 = documnet.createTextNode(title);
    tag.appendChild(tag2);
    tr.appendChild(tag);
}

let td = documnet.createElement('th');
let checkbox = documnet.createElement('input');
checkbox.setAttribute('type','checkbox');


document.querySelector('button')[1].addEventListener('click', delFunc);

function delFunc(){
    let bookdata = document.querySelector('#table>tr');

    for(let i=0; i<bookdata.length; i++){
        if(bookdata[i].children[0].textContent== document.getElementById('bookCode').value){
            bookdata[i].remove();
        }
  }
  }

