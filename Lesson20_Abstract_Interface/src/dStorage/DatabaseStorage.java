package dStorage;

public class DatabaseStorage implements DataStorage{
    @Override
    public void save(String data) {
        System.out.println("All data saved to DB");
    }

    @Override
    public String load() {
        return "DataBase :users [userName :Tom], [userAge :37]";
    }

    @Override
    public void delete() {
        System.out.println("DataBase empty now");
    }
}
