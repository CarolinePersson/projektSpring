package se.caroline.projektspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import se.caroline.projektspring.db.ApplicationUserRepository;
import se.caroline.projektspring.model.ApplicationUser;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {


    private final ApplicationUserRepository userRepository;

    public CustomUserDetailsService(ApplicationUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser user = userRepository.findByUsername(username);


        if (user == null) {
            throw new UsernameNotFoundException(" user not found");
        }

        List<GrantedAuthority> authorities = List.of(
                new SimpleGrantedAuthority("ROLE_" + user.getRole())
        );

        return new User(user.getUsername(), user.getPassword(), authorities);


    }
}
