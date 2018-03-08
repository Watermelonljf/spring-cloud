package com.itmuch.cloud.dao;

import com.itmuch.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ljianf on 2017/9/30.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
