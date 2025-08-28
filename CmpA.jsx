import CmpB from "./CmpB";

function CmpA(props){
  return (
  <>
    <input type="text" id="abc"/>
    <CmpB name = {props.name} setName = {props.setName}/>
  </>);
}
export default CmpA;