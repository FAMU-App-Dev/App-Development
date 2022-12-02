import React, {useEffect, useState} from 'react'
import axios from "axios";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {regular} from "@fortawesome/fontawesome-svg-core/import.macro";

function CreateUser(){
    const [email, setEmail] = useState("");
    const [username, setUsername] = useState("")
    const [password, setPassword] = useState("");
    const [cpassword, setCPassword] = useState("");


    useEffect(()=>{
        window.document.body.classList.add("bg-purple")
    })

    const usernameAssignment = (e) => {
        setUsername(e.target.value)
    }
    const emailAssignment = (e) => {
        setEmail(e.target.value)
    }

    const passwordAssignment = (e) => {
        setPassword(e.target.value)
    }

    const cpasswordAssignment = (e) => {
        setCPassword(e.target.value)
    }
    const packageAccount = () => {

        const account = {
            "id": "N/A",
            "bio": "",
            "username": username,
            "password": password,
            "email": email,
            "picture": "",
            "city": ""
        };
        const addAccount = () => {
            axios.post('http://localhost:8080/api/v1/user', account).then(r => {})
        }

        addAccount();

        return (
            <>

                <main className="form-signin w-50 m-auto bg-purple vh-100">
                    <form>


                        <h1 className="h3 mb-3 fw-normal text-center">REKKO</h1>

                        <div className="form-floating m-3">
                            <input type="email" className="form-control" id="floatingInput"
                                   placeholder="name@example.com"
                                   onChange={emailAssignment}/>
                            <label htmlFor="floatingInput">Email address</label>

                        </div>

                        <div className="form-floating m-3">
                            <input type="text" className="form-control" id="floatingInput"
                                   placeholder="name@example.com"
                                   onChange={() => usernameAssignment}/>
                            <label htmlFor="floatingInput">Username</label>
                        </div>


                        <div className="form-floating m-3">
                            <input type="password" className="form-control" id="floatingPassword" placeholder="Password"
                                   onChange={passwordAssignment}/>
                            <label htmlFor="floatingPassword">Password</label>
                        </div>

                        <div className="form-floating m-3">
                            <input type="password" className="form-control" id="floatingPassword"
                                   placeholder="Confirm Password"
                                   onChange={cpasswordAssignment}/>
                            <label htmlFor="floatingPassword">Password</label>
                        </div>

                        <button className="w-100 btn btn-lg btn-light m-3" type="submit">Create Account
                            onClick={packageAccount}
                        </button>
                    </form>
                </main>

            </>
        )
    }
}
export default CreateUser;