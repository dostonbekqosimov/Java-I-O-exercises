package code.doston.Exercise3;

import java.io.*;
import java.util.Arrays;

public class ExerciseThreeSolution {

    public static void main(String[] args) throws IOException {

        String PATH1 = "src/main/java/code/doston/test/";
        PrintWriter printWriter = new PrintWriter("src/main/java/code/doston/Exercise3/output.txt");

        File folder = new File(PATH1);


        File[] listOfFiles = folder.listFiles();

//        BufferedReader bufferedReader = new BufferedReader(fileReader);

        if (listOfFiles != null) {
            for (File file : listOfFiles) {

                if (file.isFile()) {

                    String filePath = PATH1 + file.getName();
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

                    String line;

                    while ((line = bufferedReader.readLine()) != null) {
                        printWriter.println(line);

                    }
                    printWriter.println();

                    bufferedReader.close();

                }
            }


        }

        printWriter.flush();
        printWriter.close();
    }
}
