/**
 * Array based storage for Resumes
 */

public class ArrayStorage {

    Resume[] storage = new Resume[10000];
    static int size = 0;

    void clear() {
        for (int i = 0; i < 10000; i++) {
            if (storage[i] != null)
                storage[i] = null;
            else
                break;
        }
        size = 0;
    }

    void save(Resume r) {
        for (int i = 0; i < 10000; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                size++;
                break;
            }

        }
    }

    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].toString())) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < 10000; i++) {
            if (uuid.equals(storage[i].toString())) {
                storage[i] = storage[size - 1];
                storage[size - 1] = null;
                size--;
                break;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] s = new Resume[size];
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                s[i] = storage[i];
            } else
                break;
        }
        return s;
    }

    int size() {
        return size;
    }
}
