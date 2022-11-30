package edu.famu.rekkoapi.models.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializableFriends {
    private @Nullable String id;
    private String name;
    private String img;
    private String recommendation;


    public SerializableFriends(String id, String name, String picture, String sender, String receiver) {
    }
}
