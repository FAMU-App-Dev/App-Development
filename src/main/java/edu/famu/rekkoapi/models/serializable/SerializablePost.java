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
    private String Description;
    private String Testimonial;
    private String Type;
    private String Poster;
    private int Like;


   }

