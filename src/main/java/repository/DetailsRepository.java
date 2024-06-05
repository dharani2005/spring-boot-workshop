package repository;

import entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetailsRepository extends JpaRepository<Details,Long> {
    Optional<Details> findByEmailIgnoreCase(String email);

    Optional<Details> findByNameContaining(String name);

    Optional<Details> findByNameIgnoreCase(String name);
}
