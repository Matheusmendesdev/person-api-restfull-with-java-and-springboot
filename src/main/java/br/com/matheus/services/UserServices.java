package br.com.matheus.services;

import br.com.matheus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.logging.Logger;

public class UserServices implements UserDetailsService {
    private Logger logger = Logger.getLogger(BookServices.class.getName());

    @Autowired
    UserRepository repository;

    public UserServices(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("Find by user name " + username + "!");
        var user = repository.findByUsername(username);
        if (user != null) {
            return user;
        }else{
            throw new UsernameNotFoundException("User name " + username + " not found!");
        }
    }
}
