//클래스형 컴포넌트
import React from "react";

class MyCompnent3 extends React.Component{
  //클래스형에서는 props를 사용하기 전에 생성자의 매개변수를 통해서 초기화해주는 작업이 필수
  //생성자 첫번째 매개변수에 props가 전달이 됩니다.
  constructor(props){
    super(props); //부모클래스와 연결
    this.props = props; //나의 멤버변수에 props를 저장한다.
    this.state = {a : "홍길동", b : "이순신"} //클래스형 컴포넌트에서는 멤버변수로 state를 관리함
  }

  //렌더 함수 오버라이드
  render() {
    let {age} = this.props;

    return(
      <div>
        이거슨 클래스형 컴포넌트에요
        프롭스값 : {age} <br />
        스테이트값 : {this.state.a} <br />
        스테이트값 : {this.state.b} <br />

        <button type="button" onClick={()=> {this.setState({a : '변경!'})}}>스테이트 체인지</button>
      </div>
    )
  }



}


export default MyCompnent3;