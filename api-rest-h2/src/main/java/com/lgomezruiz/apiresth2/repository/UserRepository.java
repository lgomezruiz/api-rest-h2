package com.lgomezruiz.apiresth2.repository;

import com.lgomezruiz.apiresth2.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
}
