package me.lordierclaw.proptit_social_network.repository;

import me.lordierclaw.proptit_social_network.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
