package com.codegym.repository.impl;

import com.codegym.model.MusicApp;
import com.codegym.repository.DataBase;
import com.codegym.repository.IMusicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class MusicRepository implements IMusicRepository {
    @Override
    public List<MusicApp> findAll() {
        TypedQuery<MusicApp> musicAppTypedQuery =
                DataBase.entityManager.createQuery("select m from MusicApp m", MusicApp.class);
        return musicAppTypedQuery.getResultList();
    }

    @Override
    public void saveMusic(MusicApp musicApp) {
        EntityTransaction entityTransaction = DataBase.entityManager.getTransaction();
        entityTransaction.begin();
        DataBase.entityManager.persist(musicApp);
        entityTransaction.commit();
    }

    @Override
    public void updateMusic(MusicApp musicApp) {
        EntityTransaction entityTransaction = DataBase.entityManager.getTransaction();
        entityTransaction.begin();
        DataBase.entityManager.merge(musicApp);
        entityTransaction.commit();
    }

    @Override
    public void deleteMusic(int id) {
        MusicApp musicApp = findById(id);
        EntityTransaction entityTransaction = DataBase.entityManager.getTransaction();
        entityTransaction.begin();
        DataBase.entityManager.remove(musicApp);
        entityTransaction.commit();
    }

    @Override
    public MusicApp findById(int id) {
        return DataBase.entityManager.find(MusicApp.class, id);
    }
}
