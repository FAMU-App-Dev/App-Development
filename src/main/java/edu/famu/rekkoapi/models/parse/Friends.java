package edu.famu.rekkoapi.models.parse;

import edu.famu.rekkoapi.models.serializable.SerializableFriends;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;


@ParseClassName("Friends")
public class Friends extends ParseObject {

    final static String ID = "id";
    final static String IMG = "img";
    final static String NAME = "name";
    final static String RECOMMENDATION = "recommendation";

    public String getID() {return getString(ID);}
    public void setID(String id) {put(ID, id);}
    public String getImg() {return getString(IMG);}
    public void setImg(String img) {put(IMG, img);}
    public String getName() {return getString(NAME);}
    public void setName(String name) {put(NAME,name);}
    public String getRecommendation() {return getString(RECOMMENDATION);}
    public void setRecommendation(String recommendation) {put(RECOMMENDATION, recommendation);}

    public SerializableFriends getSerializable() {
        return new SerializableFriends(getName(),getImg(),getRecommendation());
    }
}
