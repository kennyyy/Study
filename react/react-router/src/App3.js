import { useEffect, useState } from "react"
import axios from 'axios';

function App() {
  const [data, setData] = useState(null);

  let handleClick = async () => {
    //let Promise = axios.get()
    // axios.get('https://run.mocky.io/v3/f0026144-1a89-4a10-a8f4-3e9263d5698e')
    // .then( response => setData(response.data) )

    //시나리오
    //순서대로 데이터를 3개를 가져와 볼거에요
    //비동기는 순서보장을 하지 않는다는 점!
    // axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/hi.json')
    // .then( response => console.log(response.data) )

    // axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/hello.json')
    // .then( response => console.log(response.data) )

    // axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/by.json')
    // .then( response => console.log(response.data) )


    // 순서를 보장 받으려면 콜백지옥을 만들어야 하는데, async, await으로 깔끔하게 해결할 수 있습니다
    // axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/hi.json')
    // .then( response => {
    //   console.log(response.data); //hi.json도착

    //   axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/hello.json')
    //   .then( response => {
    //     console.log(response.data); //hello.json도착

    //     axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/by.json')
    //     .then( response => {
    //       console.log(response.data); //by.json도착
    //     })
    //   })
    // })

    const response = await axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/hi.json')
    console.log(response.data); //hi.json

    const response2 = await axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/hello.json')
    console.log(response2.data); //hello.json

    const response3 = await axios.get('https://raw.githubusercontent.com/yopy0817/data_example/master/by.json')
    console.log(response3.data); //by.json

    const response4 = await fetch("https://raw.githubusercontent.com/yopy0817/data_example/master/hi.json")
    const data = await response4.json();
    console.log(data);

  }

  //화면이 로드가 일어날때 데이터를 가져오려면? asnyc, await
  //useEffect에는 async키워드를 사용 할 수 없음
  useEffect(() => {
    //fetch~~~ or axios
    //await을 쓰고 싶으면?
    (async () => {

    })()

  }, [])

  return (
    <div>
      <h3>엑시오스 사용하기</h3>

      <button type="button" onClick={handleClick}>클릭시 데이터 가져오기</button>


      {
        data &&
        <div>
          짠 : {data.name}
        </div>
      }
    </div>
  )
}

export default App