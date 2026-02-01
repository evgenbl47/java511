package homeWork;

import java.io.File;
import java.util.Scanner;

public class HomeWork {

    public void runHomeWork() {
        String homePath = "C:\\Users\\Мой дом\\IdeaProjects\\java511\\git\\homeWork";
        String path = homePath;
        File folder = new File(homePath);

        String getConsoleInput;

        System.out.println("homePath " + homePath );
        while (true) {
            System.out.println("""
                    list   -> печатает все папки и файлы
                    files   -> печатает все файлы
                    folders  -> печатает все папки
                    cd path  -> переходить в указанный путь
                    cd ..   -> переходить на шаг назад""");
            System.out.print(path  + " ");
            getConsoleInput = setConsoleInput();

            if (getConsoleInput.equals("list")) {
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
            if (getConsoleInput.equals("files")) {
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
            if (getConsoleInput.equals("folders")) {
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
                getConsoleInput = "";
            }
            if (getConsoleInput.equals("cd home")) {
                folder = new File(homePath);
                path = homePath;
                getConsoleInput = "";
            }
              //переход по 1 папке
//            if (getConsoleInput.startsWith("cd ")) {
//                String newPath = (path + "\\") + (getConsoleInput.substring(3));
//                File newFile = new File(newPath);
//                if (newFile.exists() && newFile.isDirectory()) {
//                    path = newPath;
//                    folder = new File(path);
//                }
//                getConsoleInput = "list";
//            }

            //переход по путю каталога
            if (getConsoleInput.startsWith("cd ")) {
                String newPath = getConsoleInput.substring(3);
                File newFile = new File(newPath);
                if (newFile.exists() && newFile.isDirectory()) {
                    path = newPath;
                    folder = new File(path);
                }
                getConsoleInput = "list";
            }
        }
    }

    private String setConsoleInput() {
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
