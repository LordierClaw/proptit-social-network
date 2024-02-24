package me.lordierclaw.proptit_social_network.repository;

import me.lordierclaw.proptit_social_network.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
