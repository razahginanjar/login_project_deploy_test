package com.razahDev.login_test.repositories;

import com.razahDev.login_test.entities.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Picture, Integer> {
}
