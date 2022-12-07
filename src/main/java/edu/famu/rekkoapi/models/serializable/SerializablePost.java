package edu.famu.rekkoapi.models.serializable;

import edu.famu.rekkoapi.models.parse.User;
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
    private String Description;
    private String Testimonial;
    private String Type;
    private SerializableUser Poster;
    private int MovieId;

}

