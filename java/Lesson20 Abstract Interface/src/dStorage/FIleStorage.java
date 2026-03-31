package dStorage;

public class FIleStorage implements DataStorage{
    private String storage;
    @Override
    public void save(String data) {
        if (storage == null) {
            storage = "";
        }
        storage = storage.concat(data);
    }

    @Override
    public String load() {
        if (storage != null) {
            return storage;
        } else {
            System.out.println("File storage is empty");
            return "";
        }

    }

    @Override
    public void delete() {
        storage = "";
    }
}
