import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Logger {
    String contact = "Smith";
    File file;

    public Logger(){

        File dir = new File("PhoneBook/src/contacts/");  // от корня проекта
        dir.mkdirs();

        file = new File(dir, contact + ".txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Файл уже существует");
            }
        }catch (IOException e) {
            System.err.println("Ошибка создания файла: " + e.getMessage());
        }


    }

    public void makeLog(String message) {
        String timenow = LocalDateTime.now().toString();
        System.out.println(timenow);
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(timenow + " " + message);
            System.out.println("Записано: " + message);
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }
    }

    public void register() {

    }

    public void setContact(String contact) {
        this.contact = contact;
    }




}
