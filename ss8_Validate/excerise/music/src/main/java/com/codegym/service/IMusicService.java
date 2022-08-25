package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findALl();
    void create(Music music);
    void update(Music music);
    Music findById(int id);
}
