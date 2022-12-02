import React,{useEffect,useState} from 'react'
import Nav from "./components/Nav";
import FriendsCard from "./components/FriendsCard";
import {Link} from "react-router-dom"


function Friends(){

    return(
        <>
            <Nav />
            <div className="topnav text-center m-3">
                <input type="text" placeholder="Search.."/>
            </div>
            <FriendsCard />
        </>


    )
}

export default Friends;