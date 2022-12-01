package edu.famu.rekkoapi.models.parse;
import edu.famu.rekkoapi.models.serializable.SerializablePost;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;
@ParseClassName("Post")
public class Post extends ParseObject {
    final static String ID = "id";
    final static String NAME = "Name";
    final static String DESC = "Description";
    final static String TEST = "Testimonial";
    final static String TYPE = "Type";
    final static String POSTER = "Poster";
    final static String REKKNUM = "rekko_num";

    public String getID() {return getString(ID);}
    public void setID(String id) {put(ID, id);}
    public String getNAME() {return getString(NAME);}
    public void setNAME(String Name) {put(NAME, Name);}
    public String getDESC() {return getString(DESC);}
    public void setDESC(String Description) {put(DESC, Description);}
    public String getTEST() {return getString(TEST);}
    public void setTEST(String Testimonial) {put(TEST, Testimonial);}
    public String getTYPE() {return getString(TYPE);}
    public void setTYPE(String Type) {put(TYPE, Type);}
    public String getPOSTER() {return getString(POSTER);}
    public void setPOSTER(String Poster) {put(POSTER, Poster);}
    public int getREKKNUM() {return getInt(REKKNUM);}
    public void setREKKNUM(int rekko_num) {put(REKKNUM, rekko_num);}

    public SerializablePost getSerializable() {

        return new SerializablePost(getID(), getNAME(), getDESC(), getTEST(), getTYPE(),
                getPOSTER(), getREKKNUM());
    }

}