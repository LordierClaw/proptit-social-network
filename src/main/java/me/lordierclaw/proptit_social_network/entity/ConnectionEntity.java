package me.lordierclaw.proptit_social_network.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity(name = "connection")
@IdClass(ConnectionKey.class)
public class ConnectionEntity {
    @Id
    @NonNull
    private Long senderId;
    @Id
    @NonNull
    private Long receiverId;
    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("senderId")
    @JoinColumn(name = "sender_id")
    private UserEntity sender;
    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("receiverId")
    @JoinColumn(name = "receiver_id")
    private UserEntity receiver;
    @NonNull
    private Status status;
    private Date sentTime = new Date();

    public enum Status {
        PENDING,
        ACCEPTED,
        BLOCKED
    }
}
