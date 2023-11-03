package org.progress.services;

import org.progress.domain.User;
import org.progress.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        // Save a new user to the database using the repository.
        return userRepository.save(user);
    }

    public User findUserByUsername(String username) {
        // Retrieve a user by their username using a custom query method.
        return userRepository.findByUsername(username);
    }

    public List<User> findUsersOlderThan(int minAge) {
        // Retrieve a list of users older than a specified age using a custom query method.
        return userRepository.findUsersOlderThan(minAge);
    }
}

