package lab.demo.spring.security.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import lab.demo.spring.security.jpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
