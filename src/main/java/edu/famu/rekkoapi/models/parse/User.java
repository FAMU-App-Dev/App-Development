package edu.famu.rekkoapi.models.parse;

import edu.famu.rekkoapi.models.serializable.SerializableUser;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;
import org.parse4j.ParseUser;

@ParseClassName("User")
public class User extends ParseUser {
    final static String ID = "id";
    final static String USERNAME = "username";
    final static String EMAIL = "email";
    final static String BIO = "Bio";
    final static String IMG = "img";
    final static String CITY = "city";
    final static String ISADMIN = "isAdmin";

    public String getID() {return getString(ID);}
    public void setID(String id) {put(ID, id);}
    public String getUsername() {return getString(USERNAME);}
    public void setUsername(String username) {put(USERNAME, username);}
    public String getEmail() {return getString(EMAIL);}
    public void setEmail(String email) {put(EMAIL, email);}
    public String getBio() {return getString(BIO);}
    public void setBio(String Bio) {put(BIO, Bio);}
    public String getImg() {return getString(IMG);}
    public void setImg(String img) {put(IMG, img);}
    public String getCity() {return getString(CITY);}
    public void setCity(String city) {put(CITY, city);}
    public boolean getIsAdmin() {return getBoolean(ISADMIN);}
    public void setIsAdmin(boolean isAdmin) {put(ISADMIN, isAdmin);}

    public SerializableUser getSerializable() {
        return new SerializableUser(getID(),getUsername(),getEmail(),getBio(),getImg(),getCity(),getIsAdmin());
    }

}
