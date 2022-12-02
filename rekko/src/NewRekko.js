import React, {useEffect, useState} from 'react'
import Nav from "./components/Nav";
import PostCard from "./components/PostCard";
import Dropdown from "./components/Dropdown";
import axios from "axios";
import MovieList from "./components/MovieList";
function NewRekko(){

    return(

        <>
            <Nav />

            <main className="form-signin w-100 m-auto text-center ">

                <form>
                    <div className="topnav text-center m-3">
                        <input type="text" placeholder="Search.."/>
                    </div>
                    <Dropdown />
                    <div className="form-floating m-3">
                        <div className="form-floating m-3">
                            <input type="text" className="form-control" id="floatingInput" placeholder="Title"
                                />
                            <label htmlFor="floatingInput">Title</label>
                        </div>
                    </div>
                    <div >
                    <textarea  id="Description" name="Description" rows="4" cols="50" placeholder="Description" className="bg-purple "></textarea>
                    </div>
                    <div>
                    <textarea  id="Testimonial" name="Testimonial" rows="4" cols="50" placeholder="Rekko Review" className="bg-purple "></textarea>
                    </div>
                    <div className="form-floating m-3">
                        <h2 className="h3 mb-3 fw-normal text-center text-purple"> My Rekko's </h2>
                        <div className="container">
                            <MovieList />
                        </div>
                    </div>
                    <button type="button">New Rekko's</button>
                </form>
            </main>
        </>


    )

}
export default NewRekko;
