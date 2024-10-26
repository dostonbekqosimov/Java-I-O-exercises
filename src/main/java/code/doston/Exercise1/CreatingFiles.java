package code.doston.Exercise1;

import java.io.File;
import java.io.IOException;

public class CreatingFiles {
    public void createFiles() throws IOException {

        String PATH1 = "src/main/java/code/doston/Exercise1/files/a.txt";
        String PATH2 = "src/main/java/code/doston/Exercise1/files/b.txt";
        String PATH3 = "src/main/java/code/doston/Exercise1/files/c.txt";


        File file1 = new File(PATH1);
        boolean result1 = file1.createNewFile();
        System.out.println(result1);

        File file2 = new File(PATH2);
        boolean result2 = file2.createNewFile();
        System.out.println(result2);

        File file3 = new File(PATH3);
        boolean result3 = file3.createNewFile();
        System.out.println(result3);
    }
}
