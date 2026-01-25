package dStorage;

public class CloudStorage implements DataStorage{
    @Override
    public void save(String data) {
        System.out.println("Save file to CloudStorage");
    }

    @Override
    public String load() {
        return "File [Hello.java] load";
    }

    @Override
    public void delete() {
        System.out.println("CloudStorage is empty now");
    }
}
