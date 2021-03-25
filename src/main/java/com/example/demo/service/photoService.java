package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.photo;
import com.example.demo.repository.photoRepository;

@Service
public class photoService {

	@Autowired
	private photoRepository photoRepository;

	public List<photo> findAllPhotos() {
		List<photo> photos = photoRepository.findAllPhotos();
		return photos;
	}
}
