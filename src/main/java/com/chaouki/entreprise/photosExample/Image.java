package com.chaouki.entreprise.photosExample;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Data
@Entity
public class Image {
    @Id
    @GeneratedValue
    Long id;

    @Lob
    byte[] data;
    private String name;
}
