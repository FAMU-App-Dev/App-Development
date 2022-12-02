import React, {useEffect} from 'react'
import Nav from "./components/Nav";
import PostCard from "./components/PostCard";
import Dropdown from "./components/Dropdown";

function NewRekko(){

    useEffect(()=>{

        const options = {
            method: 'GET',
            url: 'https://movie-database-alternative.p.rapidapi.com/',
            params: {s: 'Avengers Endgame', r: 'json', page: '1'},
            headers: {
                'X-RapidAPI-Key': 'b28daa6a41mshde6134f83c6e493p12399fjsn297a40f8469f',
                'X-RapidAPI-Host': 'movie-database-alternative.p.rapidapi.com'
            }
        };

        axios.request(options).then(function (response) {
            console.log(response.data);
        }).catch(function (error) {
            console.error(error);
        });
    },[])

    const btnClick = ()=>{

    }


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