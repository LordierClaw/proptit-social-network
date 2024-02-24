package me.lordierclaw.proptit_social_network.repository;

import me.lordierclaw.proptit_social_network.entity.PostResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostResourceRepository extends JpaRepository<PostResourceEntity, Long> {
}
