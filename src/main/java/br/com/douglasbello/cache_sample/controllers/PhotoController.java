package br.com.douglasbello.cache_sample.controllers;

import br.com.douglasbello.cache_sample.dto.PhotoDto;
import br.com.douglasbello.cache_sample.services.PhotoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/photos")
public class PhotoController {
    private final PhotoService photoService;

    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @GetMapping
    public ResponseEntity<List<PhotoDto>> getPhotos() {
        return ResponseEntity.ok().body(photoService.getPhotos());
    }
}