package myPersons;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        MyPerson p1 = new MyPerson("Janko", 20);
        Employee p2 = new Employee("Janko",  22, "Job");
        MyPerson p3 = new MyPerson("Jurko", 21);
        MyPerson p4 = new MyPerson("Jarko", 23);

        long timeStart = System.currentTimeMillis();
        try {
            p2.save();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            MyPerson.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String s = "Citanie a zapis do konzoly.";
        BufferedReader br1 = new BufferedReader(new StringReader(s));
        String line = null;
        try {
            while ((line = br1.readLine()) != null) {
                System.out.printf("%s%n", line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br1 != null) {
                try {
                    br1.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        try {
            int characters = 1;
            char c;
            while ((c = (char) br2.read()) != 0) {
                System.out.printf("%d %s%n", characters++, c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(System.currentTimeMillis() - timeStart);
    }
}
