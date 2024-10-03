package com.razahDev.login_test.services;

import com.razahDev.login_test.entities.Picture;

public interface PictService {
    Picture createOrGet(int id);
}
