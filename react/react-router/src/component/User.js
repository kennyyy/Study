import { useLocation, useSearchParams } from "react-router-dom";

function User(){
  //1. userLocation훅을 이용해서 파라미터 받음
  //let location = useLocation();
  //console.log(location);
  //console.log(location.search);

  //2. useSearchParams
  //let result = useSearchParams();
  //console.log(result);
  let [obj, f] = useSearchParams(); // obj - 파라미터값을 제어할 수 있는 함수, f - 파라미터를 변경하는 함수
  console.log(obj);
  console.log(f);

  let name = obj.get("name");
  let age = obj.get("age");

  obj.append("id", "user1");

  let id =  obj.get("id");

  console.log(name, age,);
  return(
    <div>
      유저...
      쿼리스트링으로 넘어온 값 : {name}, {age}, {id}
      <br />
      <button type="button" onClick={() => {f({name : "변경", age: "변경"})}}>파라미터를 강제로 변경</button>
    </div>
  )
}

export default User;