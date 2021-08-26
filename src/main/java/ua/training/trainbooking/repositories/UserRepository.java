package ua.training.trainbooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.training.trainbooking.entities.User;

import java.util.Optional;

/**
 * @author Kozka Ivan
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> getUserById(Integer id);
    Optional<User> getUserByEmail(String email);
}
