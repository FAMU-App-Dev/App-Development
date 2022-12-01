import React,{useEffect,useState} from 'react'
import Nav from "./components/Nav";
import FriendsCard from "./components/FriendsCard";
import {Link} from "react-router-dom"


function Friends(){

    return(
        <>
            <Nav />
            <FriendsCard />
        </>


    )
}

export default Friends;