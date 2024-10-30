package code.doston.Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExerciseFiveSolution {
    public static void main(String[] args) throws FileNotFoundException {
        String PATH1 = "src/main/java/code/doston/test/";

        File file = new File(PATH1);

        PrintWriter printWriter = new PrintWriter("result.txt");
        makeTree(file, 0, printWriter);

        printWriter.flush();
        printWriter.close();

    }

    public static void makeTree(File parent, int space, PrintWriter printWriter) {

        String[] list = parent.list();

        for (String s : list) {

            for (int i = 0; i < space; i++) {
                System.out.print("  ");
                printWriter.print("  ");
            }

            System.out.println(s);
            printWriter.println(s);
            File subfile = new File(parent, s);
            if (subfile.isDirectory()) {
                makeTree(subfile, space + 1, printWriter);
            }
        }

    }
}
