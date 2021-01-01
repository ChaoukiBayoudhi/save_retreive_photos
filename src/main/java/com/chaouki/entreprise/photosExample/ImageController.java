package com.chaouki.entreprise.photosExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/images")
public class ImageController {
    @Autowired
    private ImageService imageServ;
    @PostMapping(value="/upload", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
   public  Long uploadImage(@RequestPart (value="image",required = true) MultipartFile mpImage) throws Exception{
        return imageServ.addImage(mpImage);
    }
    @GetMapping(value="/get/{id}", produces= MediaType.IMAGE_PNG_VALUE)
    public Resource downloadImage(@PathVariable Long id)
    {
        return imageServ.retreiveImage(id);
    }
}
