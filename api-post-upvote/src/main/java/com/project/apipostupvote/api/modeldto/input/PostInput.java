package com.project.apipostupvote.api.modeldto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostInput {

    @NotBlank
    @NotNull
    @Size(min = 3, max = 255)
    private String postText;

    @Size(max = 60)
    private String user;
}
