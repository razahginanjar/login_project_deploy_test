package com.razahDev.login_test.controller;

import com.razahDev.login_test.entities.Picture;
import com.razahDev.login_test.services.PictService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1/pict/my_girlfriend")
public class PictController {
    private final PictService pictService;

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Picture> getPicture(
            @RequestParam(name = "id_pict", required = true) int id_pict
    )
    {
        Picture orGet = pictService.createOrGet(id_pict);
        return ResponseEntity.status(HttpStatus.OK)
                .body(orGet);
    }
}
