package com.crud.webapp.storage;

import com.crud.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */

public interface Storage {

    void clear();

    void update(Resume r);

    void save(Resume r);

    Resume get(String uuid);

    void delete(String uuid);

    Resume[] getAll();

    int size();
}
