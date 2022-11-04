//shopItem.js

fetch('../ShopItemListServlet')
.then( result => result.json())
.then( itemListShow)
.catch( err => console.error(err));

function itemListShow(result){
    result.forEach(item => {
        makeItemDIv(item);
    });
      //addcart누르면..올라간다함..
   let addCart = document.querySelectorAll('div.card-footer a');
   console.log(addCart);
   //console.log(numClick);

   addCart.forEach(item=>{
    console.log(item);
    item.addEventListener('click', addClick);
   });

   
    
}

function makeItemDIv(item = {}) {

    let template = document.querySelector('#template>div');
    
    let good = template.cloneNode(true);
    good.querySelector('h5').textContent = item.itemName;
    good.querySelector('img.card-img-top').src = '../images/' + item.image;
    good.querySelector('span.text-muted').textContent = item.originPrice;
    good.querySelector('span.text-muted').nextSibling.textContent= " $"+ item.salePrice;
    //span태그의 그다음 요소

    //review-별점
    let review = item.likeIt; //4.5
    let a = Math.floor(review); //온쪽.
    let b = review - a; //o , 0.5 반쪽별
    for(let i=0; i<a; i++){
        let div = document.createElement('div');
        div.className = 'bi-star-fill'; //<div class='bi-star-fill'>
        //div.setAttribute('class','bi=star-fill')
        good.querySelector('div.d-flex').append(div);
    } 
    //b가 존재하면.. 
    if(b) {
        let div = document.createElement('div');
        div.className = 'bi-star-half';
        good.querySelector('div.d-flex').append(div); 
    }
    //상품목록.
    let parent = document.querySelector('section.py-5>div>div');
    parent.append(good);
    console.log(good);

    //addCart를 누르면 1씩 증가하는 함수
    function addClick(e){
        e.preventDefault();
        let cart = document.querySelector('nav.navbar>div>div>form.d-flex>button');
        let numClick = cart.querySelector('span.badge').textContent;
        numClick ++;
        
        cart.querySelector('span.badge').textContent = numClick;
       }


}