package com.nucleussoftware.p2p.repositories;

import com.nucleussoftware.p2p.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Find by email user password code.
     *
     * @param email the email
     * @return the user
     */
    User findByEmail(String email);

}
