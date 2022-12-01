import React from "react";
import {Link} from "react-router-dom";
function Dropdown(props) {
    return (
        <form>
            <div className="form-row align-items-center">
                <div className="col-auto my-1">
                    <select className="custom-select mr-sm-2" id="inlineFormCustomSelect">
                        <option selected>Choose...</option>
                        <option value="1">Music</option>
                        <option value="2">Movies</option>
                        <option value="3">Shows</option>
                    </select>
                </div>
            </div>
        </form>
    )
}
export default Dropdown;