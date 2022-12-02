import React, {Component} from 'react';
import axios from 'axios';
import MovieCard from "./MovieCard";



class MovieList extends Component {
    constructor(props){
        super(props);
        this.state = { movies: [] };

    }

    componentDidMount() {
        const BEST_SELLER_URL = `https://api.themoviedb.org/3/movie/now_playing?api_key=${process.env.REACT_APP_NY_TIMES_API_KEY}`;

        const getMovies = async () => {

            await axios.get(BEST_SELLER_URL)
                .then(response =>{
                    this.setState({movies: response.data.results});
                    console.log({movies: response.data.results})
                }).catch((err) =>{
                    console.log("Fetch Error: " + err)
                });
        }
        getMovies();


    }


    render() {
        return (
            <>
                <div className="row row-cols-sm-2 row-cols-md-5 row-cols-xxl-6">
                    {
                        this.state.movies.map((movie,idx) => {
                            return <MovieCard movie={movie} key={movie["id"]} />

                        })

                    }
                </div>
            </>
        );
    }

}

export default MovieList;
