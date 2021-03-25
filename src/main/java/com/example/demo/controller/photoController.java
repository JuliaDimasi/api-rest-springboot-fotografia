package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.photoService;

@RestController
@RequestMapping("/api/photo")

public class photoController {

	@Autowired
    private photoService photoService;
        
    @GetMapping
    public List<photo> findAllPhotos() {
        // Implement
    	List<photo> photos = new ArrayList<photo>();
    	photos = this.photoService.findAllPhotos();
    	return photos;
    }
	
}
