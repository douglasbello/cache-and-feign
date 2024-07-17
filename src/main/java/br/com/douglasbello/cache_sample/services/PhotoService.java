package br.com.douglasbello.cache_sample.services;

import br.com.douglasbello.cache_sample.clients.PhotoClient;
import br.com.douglasbello.cache_sample.dto.PhotoDto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    private final PhotoClient photoClient;

    public PhotoService(PhotoClient photoClient) {
        this.photoClient = photoClient;
    }

    @Cacheable(value = "photosCache")
    public List<PhotoDto> getPhotos() {
        return photoClient.getPhotos();
    }
}