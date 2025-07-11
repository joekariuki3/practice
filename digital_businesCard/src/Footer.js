import React from "react";
import userData from "./data.json";
import { v4 as uuidv4 } from "uuid";
//Footer function receivs input (props) from the checkbox then renders info element with appropriate colors
function Footer(props) {
  // declare colors of darkmode. when checkbox is checked it changes accodingly
  const backgroundColor = props.isChecked ? "#161619" : "#f5f5f5";
  const textcolor = props.isChecked ? "#918E9B" : "#2b283a";

  // return the footer component
  return (
    <div className="footer" style={{ backgroundColor }}>
      <div className="socials">
        {userData.socials &&
          userData.socials.map((social) => {
            return <img src={social.imgUrl} key={uuidv4()} alt={social.alt} />;
          })}
      </div>
    </div>
  );
}

function SocialsIcons() {
  return <img src="" alt="" />;
}
export default Footer;
