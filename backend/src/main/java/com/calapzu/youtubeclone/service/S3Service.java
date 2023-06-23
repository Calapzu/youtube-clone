package com.calapzu.youtubeclone.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class S3Service implements FileService{

    @Override
    public String uploadFile(MultipartFile file){
        //Subir archivo a AWS S3
    }
}
