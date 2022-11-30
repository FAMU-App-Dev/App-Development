package edu.famu.rekkoapi.models.parse;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;

public class Post extends ParseObject {

    final static String ID = "id";
    final static String NAME = "name";
    final static String DESC = "desc";
    final static String TEST = "test";

    public String getID() {return getString(ID);}
    public void setID(String id) {put(ID, id);}
    public String getNAME() {return getString(NAME);}
    public void setNAME(String name) {put(NAME, name);}

    

}