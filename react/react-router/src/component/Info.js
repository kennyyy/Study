import { useParams } from "react-router-dom";

function Info(){

  //useParams - URL파라미터를 받는 훅

  let params = useParams();
  console.log(params);
  console.log(params.a);//params안에는 라우터에 설정한 키가 있습니다.

  let {a, b} = params;

  //a를 이용해서 데이터 받아오기
  //info페이지에서는 URL파라미터를 2개 받고 싶다면?

  return(
    <div>
      인포...
      <br />
      {a} 번 데이터 입니다. <br />
      {b} 님 안녕하세요?
    </div>
  )
}

export default Info;