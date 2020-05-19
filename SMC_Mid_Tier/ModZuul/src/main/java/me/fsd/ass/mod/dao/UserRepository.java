package me.fsd.ass.mod.dao;

import me.fsd.ass.mod.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository  //可选
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);


}
