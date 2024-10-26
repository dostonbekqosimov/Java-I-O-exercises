package code.doston.Exercise1;

import java.io.*;

public class TransformingData {


    public void transformingData() throws IOException {
        String PATH1 = "src/main/java/code/doston/Exercise1/files/a.txt";
        String PATH2 = "src/main/java/code/doston/Exercise1/files/b.txt";
        String PATH3 = "src/main/java/code/doston/Exercise1/files/c.txt";


        File file = new File(PATH3);
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);


        writeIntoFiles(PATH1, printWriter);
        writeIntoFiles(PATH2, printWriter);

        printWriter.flush();
        printWriter.close();

    }

    public static void writeIntoFiles(String fileName, PrintWriter printWriter) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = bufferedReader.readLine()) != null) {

            printWriter.println(line);
        }
        bufferedReader.close();
    }

}
