import Navbar from "./Navbar";
import Card from "./Card";
import data from "./data.js";
import { v4 as uuidv4 } from "uuid";
import "./App.css";
// console.log(data);
const locations = data.map((location) => {
  return <Card key={uuidv4()} item={location} />;
});

function App() {
  return (
    <div className="App">
      <Navbar />
      {locations}
    </div>
  );
}

export default App;
