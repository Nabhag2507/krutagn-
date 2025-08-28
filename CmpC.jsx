import CmpD from "./CmpD";

function CmpC(props) {
  return (
    <>
      <CmpD name={props.name} setName={props.setName} />
    </>
  );
}
export default CmpC;