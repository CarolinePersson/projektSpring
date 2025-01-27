package se.caroline.projektspring.db;

import org.springframework.data.jpa.repository.JpaRepository;
import se.caroline.projektspring.model.ApplicationUser;
import java.util.Optional;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
   ApplicationUser findByUsername(String username);
}

