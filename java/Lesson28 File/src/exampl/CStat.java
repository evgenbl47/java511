package exampl;

import java.io.File;

public class CStat {
    public CStat() {
        run();
    }

    public void run() {
        String root = "F:\\";

        File rootFile = new File(root);

        int count = 0;
        for (File file : rootFile.listFiles()) {
            try {
                if (file.isFile()) {
                    System.out.println("📝" + file.getName());
                }
                if (file.isDirectory()) {
                    System.out.println("📁" + file.getName());

                    for (File subFile : file.listFiles()) {
                        System.out.print("-");
                        if (file.isFile()) {
                            System.out.println("📝" + file.getName());
                        }
                        if (file.isDirectory()) {
                            System.out.println("📁" + subFile.getName());

                            for (File subSubFile : subFile.listFiles()) {
                                System.out.print("--");
                                if (subSubFile.isFile()) {
                                    System.out.println("📝" + subSubFile.getName());
                                }
                                if (subSubFile.isDirectory()) {
                                    System.out.println("📁" + subSubFile.getName());

                                    for (File subSubSubFile : subSubFile.listFiles()) {
                                        System.out.print("---");
                                        if (subSubSubFile.isFile()) {
                                            System.out.println("📝" + subSubSubFile.getName());
                                        }
                                        if (subSubSubFile.isDirectory()) {
                                            System.out.println("📁" + subSubSubFile.getName());
                                        }
                                    }
                                }
                            }
                        }
                    }


                }
            } catch (Exception e) {

            }
        }
    }
}
