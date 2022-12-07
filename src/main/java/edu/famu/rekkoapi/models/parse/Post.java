package edu.famu.rekkoapi.models.parse;
import edu.famu.rekkoapi.models.serializable.SerializablePost;
import edu.famu.rekkoapi.models.serializable.SerializableUser;
import org.parse4j.ParseClassName;
import org.parse4j.ParseException;
import org.parse4j.ParseObject;
import org.parse4j.ParseQuery;

@ParseClassName("Post")
public class Post extends ParseObject {

    final static String NAME = "Name";
    final static String DESC = "Description";
    final static String TEST = "Testimonial";
    final static String TYPE = "Type";
    final static String POSTER = "Poster";
    final static String MOVIEID = "MovieId";

    public String getNAME() {return getString(NAME);}
    public void setNAME(String Name) {put(NAME, Name);}
    public String getDESC() {return getString(DESC);}
    public void setDESC(String Description) {put(DESC, Description);}
    public String getTEST() {return getString(TEST);}
    public void setTEST(String Testimonial) {put(TEST, Testimonial);}
    public String getTYPE() {return getString(TYPE);}
    public void setTYPE(String Type) {put(TYPE, Type);}
    public SerializableUser getPOSTER() {
        ParseObject user = (ParseObject) get(POSTER);
        return new SerializableUser(user.getObjectId(), user.getString("username"), user.getString("email"), user.getString("Bio"), user.getString("Picture"), user.getString("city"));
    }
    public void setPOSTER(String Poster) {
       ParseQuery<User> query = ParseQuery.getQuery(User.class);
       try{
           User user = query.get(Poster);
           put(POSTER, user);
       } catch (ParseException e) {
           e.printStackTrace();
       }

    ;}
    public int getMOVIEID() {return getInt(MOVIEID);}
    public void setMOVIEID(int MovieId) {put(MOVIEID, MovieId);}
    public SerializablePost getSerializable() {

        return new SerializablePost(getObjectId(), getNAME(), getDESC(), getTEST(), getTYPE(),
                getPOSTER(), getMOVIEID());
    }

}