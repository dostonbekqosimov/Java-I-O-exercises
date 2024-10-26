package code.doston.Exercise1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

// Misol Sharti :  a.txt va b.txt dagi malumotlarni c.txt ga ko'chirib yozing.
public class ExerciseOneSolution  {
    public static void main(String[] args) throws IOException {

        CreatingFiles creatingFiles = new CreatingFiles();
        creatingFiles.createFiles();


//        WritingIntoFiles writingIntoFiles = new WritingIntoFiles();
//        writingIntoFiles.writeIntoFiles();

        TransformingData transformingData = new TransformingData();
        transformingData.transformingData();



    }


}
