import React,{useEffect,useState} from 'react'
import Nav from "./components/Nav";
import {Link} from "react-router-dom"
import {Dialog} from "primereact/dialog";
import {InputText} from "primereact/inputtext";
import profile from "./profile.png";
import PostCard from "./components/PostCard";


function Profile(){

    const [imgfile, uploadimg] = useState([])
    const [profileImg, setProfileImg] = useState(null)
    console.log("Image FIles",imgfile);
    const imgFilehandler = (e) => {
        if (e.target.files.length !== 0) {
            uploadimg(imgfile => [...imgfile, URL.createObjectURL(e.target.files[0])])
        }

    }

    return(
        <>
            <Nav />
            <div className="Profile">
                <div>
                    <center>
                        <input type="file" onChange={imgFilehandler} />
                        <hr />

                        {
                            imgfile.length > 0 ?
                            imgfile.map((elem) => {
                                return <>
                                  <span key={elem}>
                                    <img src={elem} height="200" width="200" alt="med1" />
                                  </span>
                                </>
                            })
                                :
                                <img src={profileImg ? profileImg : profile} width="100" height="100"/>

                        }
                    </center>
                </div>
            </div>
            <Link to={'/NewRekko'}> New Rekko </Link>

            <main className="form-signin w-100 m-auto text-center ">
                <form>

                    <div className="form-floating m-3 ">
                    <input type="text" placeholder="Username"
                    className="bg-purple"></input>
                    </div>
                    <textarea id="bio" name="bio" rows="4" cols="50" placeholder="User Bio" className="bg-purple"></textarea>
                    <center>
                        <button type="button">Update Profile</button>
                    </center>
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
                    <div className="form-floating m-3">
                        <h2 className="h3 mb-3 fw-normal text-center text-purple"> My Rekko Songs </h2>
                        <div className="row">
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
export default Profile;