package org.example;

public interface DatabaseService {
    void saveData(String data);
    void deleteData(String data);
    String getData(String key);
}
