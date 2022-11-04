document.addEventListener('DOMContentLoaded', function(){
   		//버튼 태그를 가져오겠다 # 아이디 조회해서 화면에서 삭제!  ,클릭하면 실행할 함수
	    document.querySelector('button').addEventListener('click', deleteFunc);
		
		function deleteFunc(){
			let trs = document.querySelector('#show>table>tr');
			
			for(let i = 0; i<trs.length;i++){
				if(trs[i].children[0].textContent == document.getElementById('id').value){
						trs[i].remove();
				}
								
		}
	
}	
	    
	    
	    let tableObject = { //오브젝트로 만들어보기~
		id: 'hong',
		titles:["아이디","이름","이메일","삭제"],
		data:[{id: 'user1', name:'홍길동', email:'hong@email'},
			   {id: 'user2', name:'김민서', email:'kim@email'},
			   {id: 'user3', name: '박항서', email: 'park@email'}],
		
		//한줄 데이터 추가!
		addData: function(row){
			this.data.push(row);
		},
		makeTable: function() {
			let table = document.createElement('table');
			let thead = this.makeHead();
			let tbody = this.makeBody();
			table.append(thead, tbody);
			return table;
		},
		makeHead: function(){
			let thead = document.createElement('thead');
			let tr = document.createElement('tr');
			this.titles.forEach(function(title){
				let td = document.createElement('th');
				let txt = document.createTextNode(title);
				td.append(txt);
				tr.append(td);
			})
			thead.append(tr);
			return thead;
		},
		makeBody: function(){
			let tbody = document.createElement('tbody');
			this.data.forEach(val => {
				let tr = document.createElement('tr');
				tbody.append(tr);
				for(let field in val){ //object 필드를 가져옴 (for in 기억해두기!!)
					let td = document.createElement('td');
					let txt = document.createTextNode(val[field]);
					td.append(txt);
					tr.append(td);
				}
				//# 삭제버튼. 클릭하면 한 건 삭제
				let delBtn = document.createElement('button');
				delBtn.addEventListener('click', function(){
				delBtn.parentElement.parentElement.remove();
				});	
				
				let td = document.createElement('td');
				delBtn.textContent = '삭제';
				td.append(delBtn);
				
				
				tr.appendChild(td);
				
			});
			return tbody;
		},
		init: function() {
			document.getElementsByTagName('body')[0].append(this.makeTable());// 테이블을 만든다
		}
	}
	//데이터 추가(위에 adddata 함수 미리 만들었음!)
	tableObject.addData({id: 'user4', name: '황선홍', email:'hwang@email'});
	tableObject.init();

	})//end of DOMceontentLoaded 