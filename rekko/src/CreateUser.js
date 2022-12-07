import React, {useEffect, useState} from 'react'
import axios from "axios";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {regular} from "@fortawesome/fontawesome-svg-core/import.macro";

function CreateUser(){



    useEffect(()=>{
        window.document.body.classList.add("bg-purple")
    })


        return (
            <>

                <main className="form-signin w-50 m-auto bg-purple vh-100">
                    <form>


                        <h1 className="h3 mb-3 fw-normal text-center">REKKO</h1>

                        <div className="form-floating m-3">
                            <input type="email" className="form-control" id="floatingInput"
                                   placeholder="name@example.com"
                                  // onChange={emailAssignment}
                            />
                            <label htmlFor="floatingInput">Email address</label>

                        </div>

                        <div className="form-floating m-3">
                            <input type="text" className="form-control" id="floatingInput"
                                   placeholder="name@example.com"
                                  // onChange={() => usernameAssignment}
                            />
                            <label htmlFor="floatingInput">Username</label>
                        </div>


                        <div className="form-floating m-3">
                            <input type="password" className="form-control" id="floatingPassword" placeholder="Password"
                                  // onChange={passwordAssignment}
                            />
                            <label htmlFor="floatingPassword">Password</label>
                        </div>

                        <div className="form-floating m-3">
                            <input type="password" className="form-control" id="floatingPassword"
                                   placeholder="Confirm Password"
                                  // onChange={cpasswordAssignment}
                            />
                            <label htmlFor="floatingPassword"> Confirm Password</label>
                        </div>

                        <button>Create Account</button>

                    </form>
                </main>

            </>
        )
}
export default CreateUser;