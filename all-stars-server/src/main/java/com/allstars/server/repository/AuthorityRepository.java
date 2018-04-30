package com.allstars.server.repository;

import com.allstars.server.entity.AuthorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<AuthorityEntity, String> {

}
