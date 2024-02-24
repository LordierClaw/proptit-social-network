package me.lordierclaw.proptit_social_network.repository;

import me.lordierclaw.proptit_social_network.entity.ConnectionEntity;
import me.lordierclaw.proptit_social_network.entity.ConnectionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConnectionRepository extends JpaRepository<ConnectionEntity, ConnectionKey> {
    List<ConnectionEntity> findConnectionEntityBySenderId(Long senderId);

    List<ConnectionEntity> findConnectionEntityByReceiverId(Long senderId);
}
