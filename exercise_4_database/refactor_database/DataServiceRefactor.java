package exercise_4_database.refactor_database;

public class DataServiceRefactor {

    private DataStorage dataStorage;

    public DataServiceRefactor(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }


    public String saveData(String data) {
         return dataStorage.save(data);
    }



}
