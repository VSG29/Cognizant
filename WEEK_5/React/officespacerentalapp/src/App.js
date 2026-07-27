import React from "react";

function App() {

  const office = {
    name: "DBS",
    rent: 50000,
    address: "Chennai"
  };

  const officeSpaces = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai"
    },
    {
      name: "Regus",
      rent: 75000,
      address: "Bangalore"
    },
    {
      name: "WeWork",
      rent: 65000,
      address: "Hyderabad"
    }
  ];

  const image =
    "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=800";

  return (
    <div style={{ padding: "20px" }}>
      <h1>Office Space Rental App</h1>

      <img
        src={image}
        alt="Office Space"
        width="500"
      />

      <h2>Featured Office</h2>

      <p><b>Name:</b> {office.name}</p>

      <p
        style={{
          color: office.rent < 60000 ? "red" : "green"
        }}
      >
        <b>Rent:</b> Rs. {office.rent}
      </p>

      <p><b>Address:</b> {office.address}</p>

      <hr />

      <h2>Available Office Spaces</h2>

      {officeSpaces.map((item, index) => (
        <div key={index}>
          <p><b>Name:</b> {item.name}</p>

          <p
            style={{
              color: item.rent < 60000 ? "red" : "green"
            }}
          >
            <b>Rent:</b> Rs. {item.rent}
          </p>

          <p><b>Address:</b> {item.address}</p>

          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;