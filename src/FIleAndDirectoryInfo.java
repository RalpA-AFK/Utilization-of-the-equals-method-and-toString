import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.DirectoryStream;

public class FIleAndDirectoryInfo {
    public static void main(String[] args) throws IOException{
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter file or directory name: ");

        Path path = Paths.get(scnr.nextLine());
        if(Files.exists(path)){
            System.out.printf("%n%s exists%n", path.getFileName());
            System.out.printf("%s a directory%n", path.isAbsolute() ? "Is not": "Is");

            if(Files.isDirectory(path)){

                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                for(Path p : directoryStream){
                    System.out.println(p);
                }
            }
        }
        else{
            System.out.printf("%s does not exist%n",path);
        }
    }
}
