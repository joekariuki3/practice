import React, { useState } from "react";
import "./App.css";
import ProfileImage from "./ProfileImage.js";
import Info from "./Info.js";
import Footer from "./Footer.js";

function App() {
  // use checkbox to change to dark mode
  const [isChecked, setIsChecked] = useState(false);
  const handleCheckboxChange = () => {
    setIsChecked(!isChecked);
  };

  return (
    <div className="cointiner">
      <ProfileImage />
      {/* pass is checked value from the checkbox TRUE or FALSE to Info and Footer compomponent */}
      <Info isChecked={isChecked} />
      <Footer isChecked={isChecked} />

      {/* checkbox to change to darkmode */}
      <div>
        <input
          type="checkbox"
          checked={isChecked}
          onChange={handleCheckboxChange}
        />
      </div>
    </div>
  );
}

export default App;
