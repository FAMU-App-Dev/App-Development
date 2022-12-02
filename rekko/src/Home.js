import React, {useEffect} from 'react'
import Nav from "./components/Nav";
import PostCard from "./components/PostCard";
function Home(){



    return(

        <>
            <Nav />
            <main className="form-signin w-100 m-auto ">
                <form>
                    <div className="topnav text-center m-3">
                        <input type="text" placeholder="Search.."/>
                    </div>
                    <h1 className=" fw-normal text-center text-purple">Let's get rekkin!</h1>

                    <div className="form-floating m-3">
                        <h2 className="h3 mb-3 fw-normal text-center text-purple"> Highest Rekko's </h2>
                        <div className="row">
                            <div className="col"> <PostCard /> </div>
                            <div className="col"> <PostCard /> </div>
                            <div className="col"> <PostCard /> </div>
                            <div className="col"> <PostCard /> </div>
                            <div className="col"> <PostCard /> </div>
                            <div className="col"> <PostCard /> </div>
                            <div className="col"> <PostCard /> </div>
                            <div className="col"> <PostCard /> </div>
                        </div>
                    </div>

                </form>
            </main>


        </>


    )

}
export default Home;