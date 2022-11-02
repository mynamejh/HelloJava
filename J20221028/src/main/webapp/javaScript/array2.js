fetch('./MemberListServlet')
    .then(result =>result.json())
    .then(listShow) //true면 listshow 함수 실행!
    .catch(error => console.error(error));

function listShow(data = []) { //data는 변수라서 아무거나 이름 붙여도 됨!
    
    //responsibility가 admin인 사람들민 가져오는 방법!
    data.forEach(member => {
        if(member.responsibility=='admin')
            console.log(member)
    })

    //responsibility가 user인 사람들 배열 생성하고,  가져오는 방법!
    let userGroup=[];
    data.forEach(member =>{ //있던 데이터줄로 반복해서 보기위해!
        if(member.responsibility =='user') //user가 맞으면
            userGroup.push(member); //값을 넣어라! (push)
    })
    userGroup = data.filter(member => member.responsibility ='user');
 }

