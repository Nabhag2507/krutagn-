import CmpC from "./CmpC";

function CmpB(props){
  return (
    <>
      <button onClick={()=>{
        props.setName(document.getElementById("abc").value);
      }}>click me</button>
      <CmpC name = {props.name} setName = {props.setName}/>
    </>
  );
}
export default CmpB;