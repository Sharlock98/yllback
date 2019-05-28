package com.example.yllback.service.impl;

import com.example.yllback.dao.VideosDao;
import com.example.yllback.entity.Videos;
import com.example.yllback.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServicelmpl implements VideoService {
    @Autowired
    private VideosDao dao;

    @Override
    public List<Videos> getAllVideo() {
        return dao.selectAllVideo();
    }

    @Override
    public Videos getVideoById(int id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public boolean addVideo(Videos videos) {
        return dao.insert(videos) > 0;
    }

    @Override
    public boolean deleteVideo(int id) {
        return dao.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public boolean modifyVideo(Videos videos) {
        return dao.updateByPrimaryKeySelective(videos) > 0;
    }
}
