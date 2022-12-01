import React, {useEffect} from 'react'
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";

import {regular} from "@fortawesome/fontawesome-svg-core/import.macro";
function CreateUser(){


useEffect(()=>{
    window.document.body.classList.add("bg-purple")
})
    return(

        <>

            <main className="form-signin w-50 m-auto bg-purple vh-100">
                <form>


                    <h1 className="h3 mb-3 fw-normal text-center">REKKO</h1>

                    <div className="form-floating m-3">
                        <input type="email" className="form-control" id="floatingInput" placeholder="name@example.com"/>
                        <label htmlFor="floatingInput">Email address</label>
                    </div>

                    <div className="form-floating m-3">
                        <input type="text" className="form-control" id="floatingInput" placeholder="name@example.com"/>
                        <label htmlFor="floatingInput">Username</label>
                    </div>


                    <div className="form-floating m-3">
                        <input type="password" className="form-control" id="floatingPassword" placeholder="Password"/>
                        <label htmlFor="floatingPassword">Password</label>
                    </div>

                    <div className="form-floating m-3">
                        <input type="password" className="form-control" id="floatingPassword" placeholder="Confirm Password"/>
                        <label htmlFor="floatingPassword">Password</label>
                    </div>

                    <button className="w-100 btn btn-lg btn-light m-3" type="submit">Create Account</button>
                </form>
            </main>


        </>


    )

}
export default CreateUser;