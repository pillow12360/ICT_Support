package ictproj.ictcomplain.repository;

import ictproj.ictcomplain.domain.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
}
