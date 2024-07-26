package org.example.pastebox.repository;

import org.example.pastebox.entity.PasteboxEntity;

import java.util.List;

public interface PasteboxRepository {
    PasteboxEntity getByHash(String hash);
    List<PasteboxEntity> getListOfPublicAndAlive(int amount);
    void add(PasteboxEntity pasteboxEntity);

}
