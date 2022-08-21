package com.codegym.service;

import com.codegym.model.MusicApp;

import java.util.List;

public interface IMusicService {
    List<MusicApp> findAll();
    void saveMusic(MusicApp musicApp);
    void updateMusic(MusicApp musicApp);
    void deleteMusic(int id);
    MusicApp findById(int id);
}
