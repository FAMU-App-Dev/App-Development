package edu.famu.rekkoapi.models.parse;

import edu.famu.rekkoapi.models.serializable.SerializableFriends;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;


@ParseClassName("Friends")
public class Friends extends ParseObject {
    final static String ID = "id";
    final static String NAME = "name";
    final static String PICTURE = "Picture";

    final static String SENDER = "sender";

    final static String RECEIVER = "receiver";

    public String getID() {return getString(ID);}
    public void setID(String id) {put(ID, id);}
    public String getName() {return getString(NAME);}
    public void setName(String name) {put(NAME,name);}
    public String getPicture() {return getString(PICTURE);}
    public void setPicture(String Picture) {put(PICTURE, Picture);}
    public String getSender() {return getString(SENDER);}
    public void setSender(String sender) {put(SENDER, sender);}
    public String getReceiver() {return getString(RECEIVER);}
    public void setReceiver(String receiver) {put(RECEIVER, receiver);}


    public SerializableFriends getSerializable() {
        return new SerializableFriends(getID(),getPicture(),getName());
    }
}
