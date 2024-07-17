package br.com.douglasbello.cache_sample.clients;

import br.com.douglasbello.cache_sample.dto.PhotoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "photos", url = "https://jsonplaceholder.typicode.com/")
public interface PhotoClient {

    @RequestMapping(method = RequestMethod.GET, value = "/photos")
    List<PhotoDto> getPhotos();
}