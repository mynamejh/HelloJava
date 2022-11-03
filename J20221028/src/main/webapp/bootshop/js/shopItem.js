//shopItem.js

fetch('../ShopItemListServlet')
.then(result => result.json())
.then(itemListShow)
.catch(err => console.log(err));


//>>>>실행되는 부분(main)
function itemListShow(result){
	for(let i=0; i<result.length; i++){
    makeItemDiv(result[i]);
	}
}


//>>>>>속성만들기
function makeItemDiv(item={}){

    let template = document.querySelector('#template>div');
    let good = template.cloneNode(true);
    good.querySelector('h5').textContent=item.itemName;
    good.querySelector('img.card-img-top').src='../images/'+item.image;
    good.querySelector('span.text-muted').textContent=item.originPrice;
    good.querySelector('span.text-muted').nextSibling.textContent=" "+4000;
    
    //리뷰>>
    let review = item.likeIt;// 4.5점
    let a = Math.floor(review); //온쪽
    let b = review-a; //0,.5 반쪽
    
    console.log(a,b);
    for(let i=0; i<a; i++){
        let div= document.createElement('div');
        div.className ='bi-star-fill';
        good.querySelector('div.d-flex').append(div);
    }
    if(b){
        let div = document.createElement('div');
        div.className ='bi-star-half';
        good.querySelector('div.d-flex').append(div);
    }
    //목록>>
    let parent = document.querySelector('section.py-5>div>div');
    parent.append(good);
    console.log(good);
}



document.querySelector('button[type="submit"]').addEventListener('click', addFunc);


function addFunc(e){
	e.preventDefault();
    console.log('이거 어디서부터 잘못된거지')
	let div = document.createElement('a.btn');
	div.className = 'btn btn-outline-dark mt-auto';
	let shop='badge bg-dark text-white ms-1 rounded-pill';
	shop+=1;
	

}