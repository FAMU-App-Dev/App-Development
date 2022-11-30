package edu.famu.rekkoapi.models.parse;

import edu.famu.rekkoapi.models.serializable.SerializableFriends;
import org.parse4j.ParseClassName;
import org.parse4j.ParseFriends;
@ParseClassName("Friends")
public class Friends extends ParseFriends{
    public SerializableFriends getSerializable() {
    }
}
