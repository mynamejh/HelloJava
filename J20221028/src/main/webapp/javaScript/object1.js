//object1.js

function Student(stdNo, stdName, mathScore){
    this.stdNo = stdNo;
    this.stdName = stdName;
    this.mathScore = mathScore;
}

let std1 = new Student('1111','김민수',80);
let std2 = new Student('2222','이수만',85);
let std3 = new Student('3333','홍수현',90);

const students = [std1, std2, std3];
 
// <ul><li>학생1</li><li>학생2</li><li>학생3</li></ul>
//<ul><li>학생정보</li></ul> 이라는 태그를 만들기 위해 .. document.createElement 써서 생성!
let ulTag = document.createElement('ul');
for(let i=0; i<students.length; i++){
    let liTag = document.createElement('li');
    // 값이 들어가면됨! `문자열` 사용! std1참조값이 가지고 있는 stdNo를 가져오겠다~
    let txt = document.createTextNode(`학번: ${students[i].stdNo} 이름:${students[i].stdName} 점수:${students[i].mathScore}`);
    ulTag.appendChild(liTag); // 
    liTag.appendChild(txt);

}
//ultag를 붙이겠습니다~ 어디에.. ?
document.getElementById('show').appendChild(ulTag);
