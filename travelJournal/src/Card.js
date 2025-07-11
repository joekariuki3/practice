import React from "react";

export default function Card(props) {
  return (
    <div className="card">
      <div className="card--cover-img">
        <img src={props.item.img} />
      </div>
      <div className="card--info">
        <div className="info-location">
          <img src="/images/locationicon.png" className="location-icon" />
          <p className="location-name">{props.item.city}</p>
          <a href={props.item.mapLink} className="location-link">
            {props.item.mapLable}
          </a>
        </div>
        <p className="title">{props.item.Title}</p>
        <p className="date">{props.item.date}</p>
        <p className="description">{props.item.description}</p>
      </div>
    </div>
  );
}
