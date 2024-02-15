import img1 from '../img/img1.png'
import '../css/IterationComponentQ.css'
import { useState } from 'react'

function IterationComponentQ() {
  /*
   img or css 파일 참조하는 방법 - 2가지방법
    만약 src넣는 경우 - import문장
    <img src={import 이미지변수} alt="" />

    public폴더에 넣는 경우
    <img src={"경로참조"} alt="" />
  */
  const arr = [
    { src: '/img/img1.png', title: '아이폰10', price: 1000 },
    { src: '/img/img2.png', title: '아이폰11', price: 2000 },
    { src: '/img/img3.png', title: '아이폰12', price: 3000 },
    { src: '/img/img4.png', title: '아이폰13', price: 4000 },
  ]

  let [img, setImg] = useState(arr[0].src);

  let handleImgChange = (imgSrc)=>{
    setImg(imgSrc)
  }

  let lis = arr.map( (v) => {
    return ( 
    <div key={v.src}>
      <div className='item' onClick={() => handleImgChange(v.src)}>
        <img src={v.src} alt="" />
        <p>상품 : {v.title}</p>
        <p>가격 : {v.price}원</p>
      </div>
    </div>);
  })

  console.log(lis);


  return (
    /*
     <img src={im1g1} alt="" />
     <img src={"/img/img1.png"} alt="" /> 
    */
    <>
    <img src={img} alt="이미지" />
    <div className='container'>

    
    {lis}
    </div>
    </>
  )
}

export default IterationComponentQ;