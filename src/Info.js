import userData from "./data.json";
import MailIcon from "./images/Mail.png";
import LinkedInIcon from "./images/linkedin.png";
//Info function receivs input (props) from the checkbox then renders info element with appropriate colors
function Info(props) {
  // declare colors of darkmode. when checkbox is checked it changes accodingly
  const backgroundColor = props.isChecked ? "#1A1B21" : "#f5f5f5";
  const textcolor = props.isChecked ? "#FFFFFF" : "#2b283a";

  return (
    <div className="info" style={{ backgroundColor, color: textcolor }}>
      <h1 className="Name">{userData.name}</h1>
      <p className="career">{userData.career}</p>
      <a className="link" href={userData.link.url} style={{ color: textcolor }}>
        {userData.link.lable}
      </a>
      <div className="buttons">
        <button className="btn1">
          <img className="icon" src={MailIcon} alt="Mail Icon" />
          Email
        </button>
        <button className="btn2">
          <img className="icon" src={LinkedInIcon} alt="LinkedIn Icon" />
          Linkedin
        </button>
      </div>
      <div className="more-info">
        <div className="about">
          <h2>About</h2>
          <p>{userData.about}</p>
        </div>
        <div className="intrest">
          <h2>Intrests</h2>
          <p>{userData.intrests}</p>
        </div>
      </div>
    </div>
  );
}
export default Info;
