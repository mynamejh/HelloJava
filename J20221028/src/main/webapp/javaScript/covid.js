//covid.js

window.onload = function(){
    //request url. 
    console.log('win')
    let url =
			'https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=284&serviceKey=kXYUIGsEAx1r27IP08jggeNOPdkZ6VcKh2T4eAFxZIwRo2xqHyypvk52CZvuT54rl9%2BEpy%2Fx0M4FaH2uzhiJkQ%3D%3D';


		fetch(url)
			.then(result => result.json()) //json -> object
			.then(showList)
			.catch(error => console.log(error));

        document.querySelector('#findBtn').addEventListener('click', findCenterList)
}
let data;

let titles = {
    id: '센터아이디',
    centerName: '센터명',
    phoneNumber: '연락처',
    lat: '위도',
    lng:'경도'
  
};



function showList(result){
    //타이틀생성부분
    makeHead();

    //body영역생성

    //result : 전체
    //data : center의 집합
    //center : data안에서 한 덩어리!

    //바디영역생성, 데이터초기화
    console.log(result);
    data = result.data;
    console.log(data);

    //select태그 생성., option태그 생성
    makeOption(data);

    let selectedCity = data.filter(center => center.sido == '서울특별시');
    makeList(selectedCity);

}

function findCenterList(){
    let searchKey = document.querySelector('#city').value;
    //searchKey : 내가 검색창에 입력한 값
    let searchAry = data.filter(center => center.sido == searchKey);
    makeList(searchAry);
}


function makeList(ary = []){
    //화면에 tr이 있으면 tr 삭제 
    document.querySelectorAll('#list>tr').forEach(tr =>tr.remove());
    //document.querySelectorAll('#list>tr') : 모든 tr값 줌. tr덩어리
    let list = document.getElementById('list');
    
    ary.forEach(center => {
        list.append(makeTr(center));
    });

    document.querySelectorAll('#list>tr').forEach((tr,idx) => {
        let td = document.createElement('td');
        td.textContent = idx+1;
        tr.prepend(td); //append():마지막위치에 추가. prepend() : 처음위치에추가
    })
}

function makeTr(row){
    let tr = document.createElement('tr');
    tr.setAttribute('lng',row.lng); //lng값이랑
    tr.setAttribute('lat',row.lat); //lat
    tr.setAttribute('fac',row.facilityName); //row.facility 값 생성!! (지도마크 이름써주기위해 만들었음!!)
    tr.addEventListener('click',openInfoWindow);
 
    //td생성
    for(let field in titles) {
        let td= document.createElement('td');
        let txt = document.createTextNode(row[field]); 
        //row가 갖고있는값과 field가 갖고 있는 값의 조합
        td.appendChild(txt);
        tr.appendChild(td);
    }
    return tr;
}


function openInfoWindow(e){
	console.log(e.target.parentElement); // tr,lng, lat이벤트를 받는 것이 타겟이다.
	let lng = e.target.parentElement.getAttribute('lng');
	let lat = e.target.parentElement.getAttribute('lat');
    let building = e.target.parentElement.getAttribute('fac');

	//infoWindow.html?x=127.0707093&y=37.6481759
	window.location.href='infoWindow.html?x='+lng+'&y='+lat+'&fac='+building;
	//window.location에 내가 원하는 링크를 넣어주겠다?
}



function makeHead(){
    //타이틀
    let tr = document.createElement('tr');
    let th = document.createElement('th');
    th.textContent= '순번';
    tr.appendChild(th);
    for(let title in titles){
        let th = document.createElement('th');
        let txt = document.createTextNode(titles[title]);
        th.appendChild(txt);
        tr.appendChild(th);
    }
    document.getElementById('title').append(tr);
}

//option태그 생성
function makeOption(ary = []){
    let sidoAry = []; //['서울특별시', '대전광역시', 등등.. 경기도..] 중복x
    //.중복된 값 빼고 sidoAry에 담고, 옵션에넣고, 그걸 city에 appendchild하삼..
    data.forEach(center => {
        //data에 있는 센터정보와 siAry에 있는 센터정보 비교.
        //sidoAry에 값이있으면 no, sidoAry에 값이 없으면 추가.
      
        if(sidoAry.indexOf(center.sido) == -1){
            sidoAry.push(center.sido);
        }
    }); 
    let cityList = document.getElementById('city');
        sidoAry.forEach(sido => {
            let option = document.createElement('option');
            option.value = sido;
            option.textContent = sido;
            cityList.append(option);
    });
}

