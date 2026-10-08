package com.instaclone.repository;
import com.instaclone.model.Post; import org.springframework.data.jpa.repository.JpaRepository; import java.util.*;
public interface PostRepository extends JpaRepository<Post,Long>{List<Post> findAllByOrderByIdDesc();}
