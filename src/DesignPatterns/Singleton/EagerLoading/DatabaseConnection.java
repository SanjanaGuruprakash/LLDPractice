package DesignPatterns.Singleton.EagerLoading;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection=new DatabaseConnection();

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        return databaseConnection;
    }
}
