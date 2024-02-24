package me.lordierclaw.proptit_social_network.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link me.lordierclaw.proptit_social_network.entity.UserEntity}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOnlineInfoDto implements Serializable {
    @NotNull
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Date lastOnlineDate;
    @NotNull
    private String profilePicture;
}