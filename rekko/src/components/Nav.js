import React from "react";
import {Link} from "react-router-dom";
 function Nav(props) {
     return (
         <nav className="navbar navbar-expand-lg bg-light ">
             <div className="container-fluid bg-purple">
                 <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                         aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                     <span className="navbar-toggler-icon"></span>
                 </button>
                 <div className="collapse navbar-collapse" id="navbarNav">
                     <div className="navbar-nav">
                         <div className = "col">
                             <li className="col-md-4 nav-item ">
                                 <a className="col-md-4 nav-link active " href="/Home"><h1>Rekko</h1></a>
                             </li>
                         </div>
                         <div className = "col">
                             <li className="col-md-4" className="nav-item">
                                 <a className="col-md-4" className="nav-link active" aria-current="page" href="/Home">Home</a>
                             </li>
                        </div>
                         <div className = "col">
                             <li className="col-md-4 nav-item ">
                                 <a className="col-md-4 nav-link active " href="/Profile">Profile</a>
                             </li>
                         </div>
                         <div className = "col">
                             <li className="col-md-4 nav-item ">
                                 <a className="col-md-4 nav-link active " href="/Friends">Friends</a>
                             </li>
                         </div>
                    </div>
                </div>
             </div>
         </nav>

     )
 }
export default Nav;