package com.example.yllback.service;

import com.example.yllback.entity.Videos;

import java.util.List;

public interface VideoService {
    List<Videos> getAllVideo();

    Videos getVideoById(int id);

    boolean addVideo(Videos videos);

    boolean deleteVideo(int id);

    boolean modifyVideo(Videos videos);
}
