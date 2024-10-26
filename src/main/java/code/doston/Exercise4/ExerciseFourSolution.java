package code.doston.Exercise4;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ExerciseFourSolution {
    public static void main(String[] args) throws IOException {
        String PATH1 = "src/main/java/code/doston/test/";
        PrintWriter printWriter = new PrintWriter("src/main/java/code/doston/test/output.txt");

        Set<String> linesFromFileA = new HashSet<>();
        Set<String> linesFromFileB = new HashSet<>();


        File file1 = new File(PATH1);
        File[] listOfFiles = file1.listFiles();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {

                if (file.isFile()) {

                    String filePath = PATH1 + file.getName();
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

                    String line;


                    while ((line = bufferedReader.readLine()) != null) {
                        if (file.getName().equals("a.txt")){
                            linesFromFileA.add(line);
                        }
                        if (file.getName().equals("b.txt")){
                            linesFromFileB.add(line);
                        }
                    }
                    bufferedReader.close();

                }
            }
        }

        Set<String> uniqueLines = new HashSet<>(linesFromFileA);
        uniqueLines.addAll(linesFromFileB);  // Now contains all lines

        Set<String> commonLines = new HashSet<>(linesFromFileA);
        commonLines.retainAll(linesFromFileB);  // Now contains only common lines

        uniqueLines.removeAll(commonLines);

        for (String item : uniqueLines) {
            printWriter.println(item);
        }
        printWriter.flush();
        printWriter.close();
    }
}


// Ustozni yechim
/*
package codeuz.lesson_4;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        // Exercise 4: a.txt fayldan b.txt da bor bo'lgan qatorlatni o'chiring.


        // b.txt
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test/b.txt"));

        String line;
        Set<String> containerSet = new HashSet<>();

        while ((line = bufferedReader.readLine()) != null) {
            containerSet.add(line);
        }
        bufferedReader.close();

        //a.txt
        File file = new File("test/a.txt");

        Set<String> resultSet = new HashSet<>();
        bufferedReader = new BufferedReader(new FileReader(file));

        while ((line = bufferedReader.readLine()) != null) {
            if (!containerSet.contains(line)) {
                resultSet.add(line);
            }
        }

        bufferedReader.close();


        PrintWriter printWriter = new PrintWriter(file);
        for (String s : resultSet) {
            printWriter.println(s);
        }

        printWriter.flush();
        printWriter.close();

    }
}
 */
