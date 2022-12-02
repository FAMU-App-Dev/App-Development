package edu.famu.rekkoapi.models.serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;
import java.util.ArrayList;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializableUser {
    private @Nullable String id;
    private String username;
    private String email;
    private String password;
    private String Bio;
    private String Picture;
    private String city;

}
