package me.lordierclaw.proptit_social_network.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NonNull
    private String firstName;
    @Column(nullable = false)
    @NonNull
    private String lastName;
    @Column(unique = true, nullable = false)
    @NonNull
    private String email;
    @Column(nullable = false)
    @NonNull
    private String password;
    @Column(nullable = false)
    @NonNull
    private LocalDate dateOfBirth;
    @Column(nullable = false)
    @NonNull
    private Gender gender;
    private Date createdDate = new Date();
    private Date lastOnlineDate;
    private String phoneNumber;
    private String introduction;
    private String profilePicture;
    private String coverPicture;
    @Column(nullable = false)
    private StatusType status = StatusType.ACTIVE;
    public enum StatusType {
        ACTIVE,
        TEMPORARILY_DISABLED,
        SUSPENDED,
        DELETED
    }

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }
}
