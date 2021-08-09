package com.test.account.repository;

import java.util.List;

import com.test.account.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByName(String name);

    @Query("select id, name, password from User order by recentLogin")
    List<Integer> getUserIdOrderByRecentLogin();
}



