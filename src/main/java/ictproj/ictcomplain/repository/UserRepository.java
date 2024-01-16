package ictproj.ictcomplain.repository;


import ictproj.ictcomplain.domain.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long> { 
}

