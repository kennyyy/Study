import { useEffect } from "react";

function App(){
  
  //화면 로드이후에 단 1번 실행
  useEffect(() => {
    (async () =>{
			
			let b = await fetch("http://localhost:8181/getJSON2", {
				method : "POST",
				headers : {
					"Content-Type" : "application/json",

				},
				
				body : JSON.stringify( {"id" : "홍길동", "age" : 20} )
				
			})
			.then( response => response.text() )
			
			console.log(b);
    })();
  }, [])
  return (
    <div>
      <h3>REST API 호출하기</h3>
    </div>
  )
}


export default App;