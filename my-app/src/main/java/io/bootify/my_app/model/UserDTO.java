package io.bootify.my_app.model;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserDTO {

    private Long id;

    @Size(max = 255)
    private String name;

    @Size(max = 255)
    private String lastName;



}
