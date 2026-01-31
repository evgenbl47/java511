package homeWork;

import java.io.File;
import java.util.Scanner;

public class HomeWork {

    public void runHomeWork() {
        String homePath = "C:\\Users\\Мой дом\\IdeaProjects\\java511\\git\\homeWork";
        File folder = new File(homePath);

        String path = homePath;
        String getConsoleInput;

        System.out.println("homePath : " + homePath);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    list()  -> печатает все папки и файлы
                    files()  -> печатает все файлы
                    folders() -> печатает все папки
                    cd path  -> переходить в указанный путь
                    cd ..   -> переходить на шаг назад""");
            System.out.print(path + ": ");
            getConsoleInput = setConsoleInput();

            if (getConsoleInput.equals("list()")) {
                //печатает все папки и файлы
                if (null == folder.listFiles()) {
                    return;
                }
                for (File file : folder.listFiles()) {
                    if (file.isDirectory()) {
                        System.out.println("📁" + file.getName());
                    }
                    if (file.isFile()) {
                        System.out.println("📝" + file.getName());
                    }
                }
            }
            if (getConsoleInput.equals("files()")) {
                if (null == folder.listFiles()) {
                    return;
                }
                for (File file : folder.listFiles()) {
                    if (file.isFile()) {
                        System.out.println("📝" + file.getName());

                    }
                }
                //печатает все файлы
            }
            if (getConsoleInput.equals("folders()")) {
                //печатает все папки
                if (null == folder.listFiles()) {
                    return;
                }
                for (File file : folder.listFiles()) {
                    if (file.isDirectory()) {
                        System.out.println("📁" + file.getName());
                    }
                }
            }
            if (getConsoleInput.equals("cd ..")) {
                String directory = new File(path).getParent();
                if (directory != null) {
                    path = directory.toString();
                }
                folder = new File(path);
            }
            if (getConsoleInput.equals("cd home")) {
                path = homePath;
            }
            if (getConsoleInput.startsWith("cd ")) {
                String newPath = getConsoleInput.substring(3);
                File[] file = folder.listFiles();
                for (int i = 0; i < file.length; i++) {
                    if (file[i].getName().equals(getConsoleInput.substring(3))) {
                        folder = new File(path += "\\" + newPath);
                        break;
                    }
                }


//                    File newFile = new File(path + newPath);
//                if (newFile.exists() && newFile.isDirectory()) {
//                    path += newPath;
//                    folder = new File(path);
//                }

/*
                File newFolder = new File(folder, newPath);
                if (newFolder.exists() && newFolder.isDirectory()) {
                    System.out.println(newPath);
                    folder = newFolder;
                    path = folder.getPath();
                }
                System.out.println(folder.getAbsolutePath());
                //переходить в указанный путь

 */
            }
        }
    }

    private static String setConsoleInput() {
        String consoleInput = new Scanner(System.in).nextLine();
        return consoleInput;
    }
}


//list    -> печатает все папки и файлы
//files   -> печатает все файлы
//folders -> печатает все папки
//cd path -> переходить в указанный путь
//cd ..   -> переходить на шаг назад

//Scanner input = new Scanner(System.in);
//String currentPath = "C:\\Users\\f-abd";
//
//while (true) {
//        System.out.println("......");
//    System.out.println("......");
//    System.out.println("......");
//
//    System.out.print(currentPath +" : ");
//    String path = input.next();
//    }
