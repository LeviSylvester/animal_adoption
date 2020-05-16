package com.sda.animal_adoption.dao.user;

import com.sda.animal_adoption.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
//    List<User> findAllByName(String name);
//
//    @Query("Select a from User a where a.name=:name")
//    List<User> findAllByName(@Param("name") String name);
}
