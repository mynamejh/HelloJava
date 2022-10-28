//object.js
//자바 스크립트 = 오브젝트 만드는 방법
let obj = {
    user_id: "hong",
    user_name: "HongKildong",
    user_age: 20,
    hobbies: ['독서','낮잠','자전거타기'],  // 자바스크립트 배열 [] 로 선언! <자바는{}이거>
    show_info: function() {
        return 'id: '+ this.user_id +', name: ' + this.user_name +',age: ' + this.user_age;
    }
}

console.log('id: ' + obj.user_id);
console.log('name: '+ obj["user_name"]);
let field ="user_age";
console.log('age: '+ obj[field]);
console.log('홍의정보' + obj.show_info());
console.log('첫째 취미: ' + obj.hobbies[0]); // 인덱스값으로 첫번째걸 보여달라


//#객체 생성.
function Person(name, age) {
    this.name = name;
    this.age = age;

    this.showinfo= function(){
        return '이름은' + this.name + ', 나이는' + this.age;
    }
}


let p1 = new Person('홍길동',20);
let p2 = new Person('김유신',21);
let p3 = new Person('박명수',22);

const persons = [p1,p2,p3];
for(let i=0; i<persons.length; i++){
    console.log(persons[i].showinfo());
}

//#객체 생성
function person(name){
    this.name = name;
}
//#김민수라는 사람 객체 생성
person('김민수');

console.log(this);

//this : 함수, 전역영역에서 this를 사용하면-> window 객체를 가리키고
//       object에서 this를 사용하면-> 객체 자신을 가리킨다.