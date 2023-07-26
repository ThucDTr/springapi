package com.example.thewebmovie.repo;


import com.example.thewebmovie.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Account,Integer> {
    Optional<Account> findByEmailAndPassword(String email, String password);

    @Query(value = "select * from account where email=:email", nativeQuery = true)
    Account findByEmail(String email);

}
