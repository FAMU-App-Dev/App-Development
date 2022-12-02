import React, {useEffect} from 'react'
import {Link} from "react-router-dom"
function Login(){


    useEffect(()=>{
        window.document.body.classList.add("bg-purple")

    })
    return(

            <>

            <main className="form-signin w-100 m-auto bg-purple vh-100">
            <form>
                <i className="fa-regular fa-arrow-right-to-arc"></i>
                    <h1 className="h3 mb-3 fw-normal text-center">REKKO</h1>

                    <div className="form-floating m-3">
                        <input type="email" className="form-control" id="floatingInput" placeholder="name@example.com"/>
                            <label htmlFor="floatingInput">Email address</label>
                    </div>
                    <div className="form-floating m-3">
                        <input type="password" className="form-control" id="floatingPassword" placeholder="Password"/>
                            <label htmlFor="floatingPassword">Password</label>
                    </div>
                <div className="checkbox mb-3">
                    <label>
                        <input type="checkbox" value="remember-me"/> Remember me
                    </label>
                </div>

                    <button className="w-100 btn btn-lg btn-light m-3" type="submit">Sign in</button>
                <p className="mt-5 mb-3 text-muted">Don't have an account? <Link to ="/CreateUser"> Create Account </Link> </p>
            </form>
            </main>


            </>


    )

}
export default Login;