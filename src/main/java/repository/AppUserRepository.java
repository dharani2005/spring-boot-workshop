package repository;

import entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUserName(String username);

    Optional<AppUser> findByRegDateBetween(LocalDate start, LocalDate end);

    Optional<AppUser> findByUserDetails_Id(Long id);

    Optional<AppUser> findByUserDetails_EmailIgnoreCase(String email);

    Optional<AppUser> findByUserDetails_NameIgnoreCase(String name);
}
