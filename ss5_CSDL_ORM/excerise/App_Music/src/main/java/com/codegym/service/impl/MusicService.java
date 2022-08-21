package com.codegym.service.impl;

import com.codegym.model.MusicApp;
import com.codegym.repository.IMusicRepository;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository iMusicRepository;

    @Override
    public List<MusicApp> findAll() {
        return iMusicRepository.findAll();
    }

    @Override
    public void saveMusic(MusicApp musicApp) {
        iMusicRepository.saveMusic(musicApp);
    }

    @Override
    public void updateMusic(MusicApp musicApp) {
        iMusicRepository.updateMusic(musicApp);
    }

    @Override
    public void deleteMusic(int id) {
        iMusicRepository.deleteMusic(id);
    }

    @Override
    public MusicApp findById(int id) {
        return iMusicRepository.findById(id);
    }
}
