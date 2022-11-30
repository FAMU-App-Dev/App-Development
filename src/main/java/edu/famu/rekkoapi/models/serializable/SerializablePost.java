package edu.famu.rekkoapi.models.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializablePost {
    private @Nullable String id;
    private String name;
    private String desc;
    private String test;

    public String getNAME() {
        return null;
    }

    public String getDESC() {
        return null;
    }

    public String getTEST() {
        return null;
    }
}

