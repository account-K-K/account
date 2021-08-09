package com.test.account.repository;

import java.util.List;

import com.test.account.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByName(String name);

    @Query("select id, name, password from User order by recentLogin")
    List<Integer> getUserIdOrderByRecentLogin();

    @Transactional
    @Modifying
    @Query("update User u set u.name = 'test' where u.name = :name1")
    int updateUser(@Param("name1") String name);
}



