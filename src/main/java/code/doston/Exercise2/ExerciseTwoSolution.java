package code.doston.Exercise2;


import java.io.*;

//Misol Sharti :  a.txt va b.txt   dan malumotlar bitta  qatordan o'qib olinsin va c.txt ga yozilsin.
// Shu jarayot a va b fayllar tugagunigacha davom etsin.
public class ExerciseTwoSolution {

    public static void main(String[] args) throws IOException {
        String PATH1 = "src/main/java/code/doston/Exercise1/files/a.txt";
        String PATH2 = "src/main/java/code/doston/Exercise1/files/b.txt";
        String PATH3 = "src/main/java/code/doston/Exercise1/files/c.txt";

        FileReader file1 = new FileReader(PATH1);
        FileReader file2 = new FileReader(PATH2);

        File file3 = new File(PATH3);

        BufferedReader bufferedReader1 = new BufferedReader(file1);
        BufferedReader bufferedReader2 = new BufferedReader(file2);

        String line1 = bufferedReader1.readLine();
        String line2 = bufferedReader2.readLine();
        PrintWriter printWriter = new PrintWriter(new FileWriter(file3), true);


        while (line1 != null || line2 != null) {


            // Check if line1 is not null, then write it
            if (line1 != null) {
                printWriter.println(line1);
                line1 = bufferedReader1.readLine();
            }

            // Check if line2 is not null, then write it
            if (line2 != null) {
                printWriter.println(line2);
                line2 = bufferedReader2.readLine();
                
            }

        }
        printWriter.close();
        bufferedReader1.close();
        bufferedReader2.close();

    }
}
