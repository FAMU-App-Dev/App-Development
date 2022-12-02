import React, {useEffect, useState} from 'react'
import Nav from "./components/Nav";
import PostCard from "./components/PostCard";
import Dropdown from "./components/Dropdown";
import axios from "axios";

function NewRekko(){

    const [name, setName] = useState("");
    const [description, setDescription] = useState("")
    const [testimonial, setTestimonial] = useState("");
    const [type, setType] = useState("");
    const [poster, setPoster] = useState("");
    const [movies, setMovies] = useState([]);

        const api = "https://api.themoviedb.org/3/search/movie?api_key=a07e22bc18f5cb106bfe4cc1f83ad8ed&query="
        const getMovie = async () => {
            await axios.get(api)
                .then(response => {
                    console.log(response);
                    console.log(query);
                    this.setState({movies: response.data.results});
                }).catch(err => console.log("Fetch Error: " + err));
        }
        getMovie();

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
    const nameAssignment = (e) => {
        setName(e.target.value)
    }
    const descriptionAssignment = () => {
        setDescription(e.target.value)
    }

    const testimonialAssignment = (e) => {
        setTestimonial(e.target.value)
    }

    const typeAssignment = (e) => {
        setType(e.target.value)
    }

    const posterAssignment = (e) => {
        setPoster(e.target.value)
    }

    const packagePost = () => {

        const account = {
            "Name": "",
            "Description": "",
            "Testimonial": "",
            "Type":  "",
            "Poster": ""
        };
        const addPost = () => {
            axios.post('http://localhost:8080/api/v1/post', account).then(r => {})
        }

        addPost();


    return(

        <>
            <Nav />

            <main className="form-signin w-100 m-auto text-center ">

                <form>
                    <div className="topnav text-center m-3">
                        <input type="text" placeholder="Search.."/>
                    </div>
                    <Dropdown onChange = {typeAssignment} />
                    <div className="form-floating m-3">
                        <div className="form-floating m-3">
                            <input type="text" className="form-control" id="floatingInput" placeholder="Title"
                                onChange = {nameAssignment}/>
                            <label htmlFor="floatingInput">Title</label>
                        </div>
                    </div>
                    <div >
                    <textarea onChange={descriptionAssignment} id="Description" name="Description" rows="4" cols="50" placeholder="Description" className="bg-purple "></textarea>
                    </div>
                    <div>
                    <textarea onChange={testimonialAssignment} id="Testimonial" name="Testimonial" rows="4" cols="50" placeholder="Rekko Review" className="bg-purple "></textarea>
                    </div>
                    <div className="form-floating m-3">
                        <h2 className="h3 mb-3 fw-normal text-center text-purple"> My Rekko's </h2>
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
                    <button type="button">New Rekko's</button>
                </form>
            </main>
        </>


    )

}
export default NewRekko;