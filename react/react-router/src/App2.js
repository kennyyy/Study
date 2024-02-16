import { useEffect, useState } from "react"

function App() {



  const [data, setData] = useState(null);


  let handleClick = () => {
    fetch("https://run.mocky.io/v3/00e32299-647f-479c-8fb7-cbf4530eda91")
      .then(response => response.json())
      .then(data => setData(data))
  }

  //화면이 렌더링 되는 순간 데이터를 가져옴

  //무한루프에 빠집니다
  // const [example, setExample] = useState(null);
  // fetch('https://run.mocky.io/v3/00e32299-647f-479c-8fb7-cbf4530eda91')
  //   .then( response => response.json() )
  //   .then( data => setExample(data) )  
  const [example, setExample] = useState(null);
  useEffect(() => {
    fetch('https://run.mocky.io/v3/00e32299-647f-479c-8fb7-cbf4530eda91')
      .then(response => response.json())
      .then(data => setExample(data))
  }, [])//첫번째 렌더링에만 실행됨


  return (
    <div>
      hello world
      <button onClick={handleClick}>mock에서 데이터가져오기</button>
      {
        data === null ?
        null
        :
        <div>
          {data.name}<br/>
          {data.info.age} <br/>
          {data.info.phone} <br/>
        </div>
      }

      <hr />
      {/* 위에 구문과 동일한 문장
      example이 null이면, 뒤를 실행 안하고, null이 아니면 뒤에를 반환 */}
      {
        example &&
        <div>
          {example.name} <br />
          {example.info.age} <br />
          {example.info.phone} <br />
        </div>
      }

    </div>
  )
}

export default App