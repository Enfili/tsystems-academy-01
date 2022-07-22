package io;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ListDir {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Student\\IdeaProjects");
        listDir("C:\\Users\\Student\\IdeaProjects\\Kravy");
//        if (dir.isDirectory()) {
//            System.out.println("Listing of: " + dir.getAbsolutePath());
//
//            //List directory
//            for (String fileName : dir.list()) {
//                System.out.println("  " + fileName);
//            }
//        } else {
//            System.err.printf("File %s is not directory", dir);
//        }

//        Calendar cal = Calendar.getInstance();
//        cal.set(2022, 6, 10);
//        Date date = cal.getTime();
//        filter("C:\\Users\\jaros\\eclipse-workspace\\java", date);

        filter("C:\\Users\\jaros\\eclipse-workspace\\java\\wwww", "aaa").stream()
                .forEach(n -> System.out.println(n));

    }

    private static void listDir(String path) {
        System.out.println(path);
        File dir = new File(path);
        if (dir.isDirectory()) {
            for (String fileName : dir.list()) {
                listDir(path + "\\" + fileName);
            }
        }
    }

    private static void list(List<File> files) {
        files.stream().forEach(n -> System.out.println(n.getName()));
    }

    private static List<File> filter(String path, String name) {
        List<File> fileLst = new ArrayList<>();
        File dir = new File(path);
        filter(dir, fileLst, name);
        return fileLst;
    }

    private static void filter(File f, List<File> filtered, String name) {
        if (f.getName().startsWith(name))
            filtered.add(f);
        if (f.isDirectory()) {
            for (File file : f.listFiles())
                filter(file, filtered, name);
        }
    }

    private static List<File> filter(String path, Date minDate) {
        List<File> fileLst = new ArrayList<>();
        File dir = new File(path);
        filter(dir, fileLst, minDate);
        return null;
    }

    private static void filter(File f, List<File> filtered, Date minDate) {
        if (f.lastModified() - minDate.getTime() > 0)
            filtered.add(f);
        if (f.isDirectory()) {
            for (File file : f.listFiles())
                filter(file, filtered, minDate);
        }
    }
}
