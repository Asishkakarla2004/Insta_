package com.instaclone.repository;
import com.instaclone.model.User; import org.springframework.data.jpa.repository.JpaRepository; import java.util.*;
public interface UserRepository extends JpaRepository<User,Long>{Optional<User> findByUsername(String username); List<User> findTop10ByUsernameContainingIgnoreCase(String q);}
