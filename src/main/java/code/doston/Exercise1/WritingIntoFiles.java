package code.doston.Exercise1;

import java.io.*;

public class WritingIntoFiles {

    public void writeIntoFiles() throws IOException {
        String PATH1 = "src/main/java/code/doston/Exercise1/files/a.txt";
        String PATH2 = "src/main/java/code/doston/Exercise1/files/b.txt";

        File file1 = new File(PATH1);
        FileWriter fileWriter1 = new FileWriter(file1);
        PrintWriter printWriter1 = new PrintWriter(fileWriter1, true);

        printWriter1.println("Hello World!");
        printWriter1.println("I am Doston");
        printWriter1.println("I am 22 years old");
        printWriter1.println("I am 6 feet tall");
        printWriter1.println("I am from Uzbekistan");
        printWriter1.println("This is the end for a.txt");


        printWriter1.close();


        File file2 = new File(PATH2);
        FileWriter fileWriter2 = new FileWriter(file2);
        PrintWriter printWriter2 = new PrintWriter(fileWriter2, true);

        printWriter2.println("I am a programmer");
        printWriter2.println("I love programming");
        printWriter2.println("I am learning Java");
        printWriter2.println("It is very interesting");
        printWriter2.println("This is the end for b.txt");


        printWriter2.close();

    }

}
