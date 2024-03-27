package DesignPatterns.Singleton.SyncronisedMethod;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection=null;

    private DatabaseConnection(){

    }

    public static synchronized DatabaseConnection getInstance(){
        if(databaseConnection==null){
            databaseConnection=new DatabaseConnection();
        }
        return databaseConnection;
    }
}
