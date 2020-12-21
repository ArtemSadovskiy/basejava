package com.crud.webapp.storage;

import com.crud.webapp.model.Resume;

import static java.util.Arrays.copyOf;

/**
 * Array based storage for Resumes
 */

public class ArrayStorage {

    private Resume[] storage = new Resume[10000];
    private static int size = 0;

    public void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;
        System.out.println("Удаление всех резюме");
    }

    public void update(Resume r) {
        if (presenceResume(r.getUuid()) >= 0) {
            storage[presenceResume(r.getUuid())] = r;
        }
    }

    public void save(Resume r) {
        if (absenceResume(r)) {
            storage[size] = r;
            size++;
        }
        else System.out.println("Данное резюме уже имеется!");
    }

    public Resume get(String uuid) {
        if (presenceResume(uuid) >= 0) {
            return storage[presenceResume(uuid)];
        }
        return null;
    }

    public void delete(String uuid) {
        if (presenceResume(uuid) >= 0) {
            storage[presenceResume(uuid)] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        return copyOf(storage, size, storage.getClass());
    }

    public int size() {
        return size;
    }

    public boolean absenceResume(Resume r){
        int x = 0;
        for (int i = 0; i < size; i++) {
            if (storage[i] == r) {
                x++;
            }
        }
        return x==0;
    }

    public int presenceResume(String uuid){
        int a = 0;
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].toString())) {
               a = i;
            }
        }
        return a;
    }
}
