import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
        printFile(path);

//        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
        Path filePath = Paths.get(".","files","SubdirectoryFile.txt");
        printFile(filePath);

        filePath = Paths.get("/home/ckomopou/Development/Git/JavaMasterclass/OutThere.txt");
        printFile(filePath);
        filePath = Paths.get(".");
        System.out.println(filePath.toAbsolutePath());

        Path path3 = FileSystems.getDefault().getPath("thisFileDoesNotExist.txt");
        System.out.println(path3.toAbsolutePath());


        Path path4 = Paths.get("/home/ckomopou/Development/Git/JavaMasterclass/", "abcdf.txt");
        System.out.println(path4.toAbsolutePath());


//Check the existence of the filepath before moving on
        filePath = FileSystems.getDefault().getPath("files");
        System.out.println("Exists = " + Files.exists(filePath));

        System.out.println("Exists = " + Files.exists(path4));

    }

    private static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)){
            String line;
            while((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
