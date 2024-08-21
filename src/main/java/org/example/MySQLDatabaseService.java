package org.example;

public class MySQLDatabaseService implements DatabaseService {

    // Реализация методов интерфейса для работы с базой данных
    @Override
    public void saveData(String data) {
        // Код для сохранения данных в базе данных
        System.out.println("Сохранение данных в базе данных MySQL: " + data);
    }

    @Override
    public void deleteData(String data) {
        // Код для удаления данных из базы данных
        System.out.println("Удаление данных из базы данных MySQL: " + data);
    }

    @Override
    public String getData(String key) {
        // Код для получения данных из базы данных
        System.out.println("Получение данных из базы данных MySQL по ключу: " + key);
        return "Данные по ключу " + key + " из базы данных MySQL";
    }
}