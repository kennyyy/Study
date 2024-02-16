import { useParams } from "react-router-dom";

function BoardContent(){

  let {num} = useParams();

  return(
    <div>
      <h3>글 상세</h3>
      {num}번글..
    </div>
  )
}

export default BoardContent;