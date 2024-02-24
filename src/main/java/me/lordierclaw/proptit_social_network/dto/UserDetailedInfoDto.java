package me.lordierclaw.proptit_social_network.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.lordierclaw.proptit_social_network.entity.UserEntity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * DTO for {@link me.lordierclaw.proptit_social_network.entity.UserEntity}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailedInfoDto implements Serializable {
    @NotNull
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    @Email
    private String email;
    @NotNull
    private LocalDate dateOfBirth;
    @NotNull
    private UserEntity.Gender gender;
    @NotNull
    private Date createdDate;
    @NotNull
    private Date lastOnlineDate;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String introduction;
    @NotNull
    private String profilePicture;
    @NotNull
    private String coverPicture;
    @NotNull
    private UserEntity.StatusType status;
}