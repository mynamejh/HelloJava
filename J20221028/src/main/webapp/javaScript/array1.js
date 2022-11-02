fetch('data/MOCK_DATA.json')
.then(result => result.json())// true 
.then(composeFnc) // 밑에 만들어주고 실행할 함수 넣기! 
.catch(error=> console.error(error)); //오류날때 => console 창에 뜬다!!


function composeFnc(result=[]){ //result=[]쓰면 배열이란거 알기!
	//급여가 5000넘는 사람들만 filter한 후에 새로운 모임을 만드는 방법!
	result.filter(row => row.salary>5000)
	.map(row =>{
		let team ={//오브젝트 생성
			t_id:row.id,
			t_name:row.first_name+'/'+row.last_name
		} 
		
		team.t_mail=row.email;
		team['t_dept']='Account'; //account 팀을 만들겠다
		return team
	})	
	.forEach(team =>console.log(team));
}

//Array.map()=> row 하나를 받아서 새로운 형태를 만든다 ▶ (A - A')
function mappingFnc(result =[]){
	let newAry = result.map(row =>{
		let newObj ={}; // new Object 생성!
		newObj.user_id = row.id; //user_id 를 row가 가지고 있는 id에 넣고
		newObj.user_name = row.first_name+'-'+ row.last_name;
		newObj.info = row.email; // info에 row의 email값을 담겠다!
		
		return newObj;
	});
	
	newAry.forEach(obj =>console.log(obj)); // 위에 생성한거를 obj라고하는건가
	
}


//Array.filter() => 매개함수의 반환값이 true인 요소들만 모아서 새로운 배열을 만든다
function filterFnc(result=[]){ // 만약에 값이 안들어온다면 result=[] 빈공간!
	result.filter((row,idx)=> row.salary >5000).forEach(row => console.log(row));  // row는 그냥 매개변수임!! 새로운 값을 만들어주는 메소드(filter)
			 //return 값이 true에 배열에 새로운값을 넣어준다.
			//oddAry.forEach(row => console.log(row));
}


//Array.forEach()=>최종처리하는 기능구현한다.
function showMain(result){
	console.log(result);
	result.forEach((row,idx) => { //배열에있는 개수만큼 반복하겠다!
	console.log(row)

		//if(row.gender=='Female'){ // row 안에 있는 gender값이 female이면!
		if(idx%2 ==0){ //idx값이 짝수면 아래 row값 콘솔에 출력!
		console.log(row.id, row.first_name, row.last_name); 
		}

	});
}


function Sum(a,b){
	if(a){
		return a + 0;
	}

	if(b){
		return 0+ b;
	}


	if(a && b){
	return a+b;

}
}
