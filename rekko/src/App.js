import logo from './logo.svg';
import './App.css';
import Login from './Login'
import CreateUser from "./CreateUser";
import Home from "./Home";
import Profile from "./Profile";
import NewRekko from "./NewRekko";
import Friends from "./Friends";
import {BrowserRouter as Router, Route, Routes} from "react-router-dom";
import Nav from "./components/Nav";
import MovieList from "./components/MovieList";
import React from 'react';

function App() {
  return (

      <>
              <Router>
                  <div className="container">
                  <Routes>
                      <Route  exact path="/" element={<Login />} />
                      <Route path="/Home" element={<Home />} />
                      <Route path="/CreateUser" element={<CreateUser />} />
                      <Route path="/Profile" element={<Profile />} />
                      <Route path="/NewRekko" element={<NewRekko />} />
                      <Route path="/Friends" element={<Friends />} />
                  </Routes>

                  </div>
              </Router>
      </>

  );
}

export default App;
