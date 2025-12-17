package dStorage;

public interface DataStorage {
    void save(String data);
    String load();
    void delete();

    static String getStorageType() {
        return "Data Storage System";
    }

    default void backup() {
        System.out.println("Create backup");
    }

}


