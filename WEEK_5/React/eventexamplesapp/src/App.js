import React, { Component } from "react";
import "./App.css";

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      count: 0,
      amount: "",
      currency: ""
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayHello = () => {
    alert("Hello!");
  };

  incrementCounter = () => {
    this.increment();
    this.sayHello();
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  onPress = () => {
    alert("I was clicked");
  };

  changeAmount = (e) => {
    this.setState({ amount: e.target.value });
  };

  convertCurrency = (e) => {
    this.setState({ currency: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();

    if (this.state.amount === "") {
      alert("Please enter amount");
      return;
    }

    const euro = (parseFloat(this.state.amount) / 90).toFixed(2);

    this.setState({
      currency: euro
    });
  };

  render() {
    return (
      <div style={{ padding: "10px" }}>
        <h2>{this.state.count}</h2>

        <button onClick={this.incrementCounter}>Increment</button>
        <br />
        <button onClick={this.decrement}>Decrement</button>
        <br />
        <button onClick={() => this.sayWelcome("Welcome")}>
          Say welcome
        </button>
        <br />
        <button onClick={this.onPress}>Click on me</button>

        <br />
        <br />

        <h1 style={{ color: "green" }}>Currency Convertor!!!</h1>

        <form onSubmit={this.handleSubmit}>
          <table>
            <tbody>
              <tr>
                <td>Amount:</td>
                <td>
                  <input
                    type="number"
                    value={this.state.amount}
                    onChange={this.changeAmount}
                  />
                </td>
              </tr>

              <tr>
                <td>Currency:</td>
                <td>
                  <input
                    type="text"
                    value={this.state.currency}
                    onChange={this.convertCurrency}
                    readOnly
                  />
                </td>
              </tr>

              <tr>
                <td></td>
                <td>
                  <button type="submit">Submit</button>
                </td>
              </tr>
            </tbody>
          </table>
        </form>
      </div>
    );
  }
}

export default App;