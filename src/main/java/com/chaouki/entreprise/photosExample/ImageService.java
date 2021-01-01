package com.chaouki.entreprise.photosExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ImageService {
    @Autowired
    ImageRepository imageRepos;

    public Long addImage(MultipartFile mpImage) throws Exception
    {
        Image image=new Image();
        image.setName(mpImage.getName());
        image.setData(mpImage.getBytes());
        return imageRepos.save(image).getId();
    }
    public Resource retreiveImage(Long imageId) {
        byte[] image = imageRepos.findById(imageId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND))
                .getData();
        return new ByteArrayResource(image);
    }
}
