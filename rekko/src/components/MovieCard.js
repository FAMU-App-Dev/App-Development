import React from 'react';

function MovieCard(props){
    let movie = props.movie;
    let altText = movie.title + " " + movie.title;
    return(
        <div className="col mb-3" key={movie["id"]}>
            <div className="card h-100  position-relative">
                <img src={"https://image.tmdb.org/t/p/w500/" + movie["poster_path"]} className="card-img-top book-img mx-auto pt-1" alt={altText}></img>
                <div className="card-body book-card-details">
                    <h5 className="card-title book-title">{movie["title"]} &nbsp;&nbsp;
                        <span className="badge position-absolute top-0 start-0 rounded-pill translate-middle bg-primary">{movie["release_date"]}</span>
                    </h5>
                    <h5 className="card-title on-list">RATING: {movie["vote_average"]}</h5>
                    <p className="card-text">{movie["overview"]}</p>
                </div>
            </div>
        </div>
    );
}

export default MovieCard;