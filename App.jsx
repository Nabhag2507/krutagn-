import { useState } from 'react'
import CmpA from './CmpA';

function App() {
  const [name,setName] = useState("ruturaj GOAT");
  return (
    <>
      <CmpA name = {name} setName={setName}/>
    </>
  )
}

export default App