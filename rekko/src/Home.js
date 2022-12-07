import React from 'react'
import Nav from "./components/Nav";
//import PostCard from "./components/PostCard";
import MovieList from "./components/MovieList";

function Home(){


    return(

        <>
            <Nav />
            <main className="form-signin w-100 m-auto ">
                <form>
                    <div  className="container">
                    <div className="topnav text-center m-3">
                        <input type="text" placeholder="Search.."/>
                    </div>
                    <h1 className=" fw-normal text-center text-purple">Let's get rekkin!</h1>

                    <div className="form-floating m-3">
                        <h2 className="h3 mb-3 fw-normal text-center text-purple">  </h2>
                    </div>
                        <MovieList />
                    </div>
                </form>
            </main>


        </>


    )

}
export default Home;