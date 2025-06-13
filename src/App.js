// import logo from './logo.svg';
import './App.css';
import Sravanthi from './sravanthi.js';
import Form from './loginform.js';
import Registration from './regform.js';
function App() {
  return (
    <div className="App">
      <header className="App-header">
         <img src={"https://www.sviet.edu.in/wp-content/uploads/2023/05/SVIET-LOGO-Edited.png"} className="App-logo" alt="logo" />
        <p>
          SRI VASAVI INSTITUTE OF ENGINEERING AND TECHNOLOGY
        </p>
        <a
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          Sviet
        </a>
        <Sravanthi/> 
        <Form/>
        <Registration/>
      </header>
    </div>
  );
}

export default App;
