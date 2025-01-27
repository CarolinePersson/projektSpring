package se.caroline.projektspring.db;

import jakarta.annotation.PostConstruct;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import se.caroline.projektspring.Role;
import se.caroline.projektspring.model.ApplicationUser;

@Component
public class DataInitializer {

    private final ApplicationUserRepository applicationUserRepository;
    private final PasswordEncoder passwordEncoder;

    // Injicera repository och password-encoder i denna klass via konstruktorn

    public DataInitializer(ApplicationUserRepository applicationUserRepository, PasswordEncoder passwordEncoder) {
        this.applicationUserRepository = applicationUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void init() {
        // Vi kollar först om användaren redan finns
        if (applicationUserRepository.findByUsername("user") == null) {
            ApplicationUser user = new ApplicationUser();
            user.setUsername("user");
            user.setPassword(passwordEncoder.encode("pass"));
            user.setRole(Role.USER); // Ange rollen för användaren
            applicationUserRepository.save(user);
        }

        // Lägg till en admin-användare
        if (applicationUserRepository.findByUsername("admin") == null) {
            ApplicationUser admin = new ApplicationUser();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("pass"));
            admin.setRole(Role.ADMIN); // Ange rollen för admin
            applicationUserRepository.save(admin);
        }

        // Lägg till en manager-användare
        if (applicationUserRepository.findByUsername("manager") == null) {
            ApplicationUser manager = new ApplicationUser();
            manager.setUsername("manager");
            manager.setPassword(passwordEncoder.encode("pass"));
            manager.setRole(Role.MANAGER); // Ange rollen för manager
            applicationUserRepository.save(manager);
        }
    }
}

