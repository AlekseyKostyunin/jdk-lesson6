package org.example;

public class Main {
    public static void main(String[] args) {
        MySQLDatabaseService myDB = new MySQLDatabaseService();
        myDB.saveData("key");
        System.out.println(myDB.getData("key"));
        myDB.deleteData("Database");
    }
}