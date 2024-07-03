package exercise_4_database.refactor_database;

public class DatabaseRefactor implements DataStorage {

    @Override
    public String save(String data) {
        return "database save \nData: " + data ;
    }

}
