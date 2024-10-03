package com.razahDev.login_test.services.impl;

import com.razahDev.login_test.entities.Picture;
import com.razahDev.login_test.repositories.PictureRepository;
import com.razahDev.login_test.services.PictService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PictServiceImpl implements PictService {
    private final PictureRepository pictureRepository;

    @Override
    public Picture createOrGet(int id) {
        String url = "";
        if(id == 1)
        {
            url = "https://drive.google.com/file/d/1cbTC7grW2uyfyUzLNu3Um1Ip5mOBzHxa/view?usp=drive_link";
        }else{
            url = "https://drive.google.com/file/d/1XsoUYJGfT971J4l6IzstJK33f1ys-oBA/view?usp=drive_link";
        }

        String finalUrl = url;
        return pictureRepository.findById(id).orElseGet(
                () -> pictureRepository.save(
                        Picture.builder()
                                .url(finalUrl)
                                .build()
                )
        );
    }
}
