package edu.famu.rekkoapi.models.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializablePost {
    private String name;
    private String type;
    private String city;
    private String address;
    private String distance;
    private String title;
    private int rating;
    private double cheapestPrice;
    private boolean featured;

    public SerializablePost(String id, String name, String desc, String test) {
    }

    public String getDESC() {
        return null;
    }

    public String getNAME() {
        return null;
    }

    public String getTEST() {
        return null;
    }
}
