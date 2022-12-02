import React, {useEffect} from 'react'
import Nav from "./components/Nav";
import PostCard from "./components/PostCard";
import Dropdown from "./components/Dropdown";
function NewRekko(){



    return(

        <>
            <Nav />


            <main className="form-signin w-100 m-auto text-center ">

                <form>
                    <div className="form-floating m-3 ">
                        <Dropdown />
                    </div>
                    <textarea id="Testimonial" name="Testimonial" rows="4" cols="50" placeholder="Rekko Review" className="bg-purple"></textarea>

                    <div className="form-floating m-3">
                        <h2 className="h3 mb-3 fw-normal text-center text-purple"> My Rekko Movies </h2>
                        <div className="row">
                            <div className="col"> <PostCard /> </div>
                            <div className="col"> <PostCard /> </div>
                            <div className="col"> <PostCard /> </div>
                        </div>
                    </div>
                    <div className="form-floating m-3">
                        <h2 className="h3 mb-3 fw-normal text-center text-purple"> My Rekko Shows </h2>
                        <div className="row">
                            <div className="col"> <PostCard /> </div>
                            <div className="col"> <PostCard /> </div>
                            <div className="col"> <PostCard /> </div>
                        </div>
                    </div>


                    <button type="button">New Rekko's</button>




                </form>
            </main>


        </>


    )

}
export default NewRekko;