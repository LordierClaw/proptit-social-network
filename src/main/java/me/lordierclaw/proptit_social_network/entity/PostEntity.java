package me.lordierclaw.proptit_social_network.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id", nullable = false)
    private UserEntity owner;
    @NonNull
    private String text;
    @NonNull
    private Visibility visibility;
    @NonNull
    private Date createdAt = new Date();
    @NonNull
    private Date lastModified = (Date) createdAt.clone();
    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER)
    private Set<PostResourceEntity> resources = new HashSet<>();
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_like_post",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<UserEntity> userLikes = new HashSet<>();

    public enum Visibility {
        PUBLIC,
        FRIENDS,
        PRIVATE
    }
}
