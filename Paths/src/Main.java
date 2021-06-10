import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {
        try{
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);
//
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.createDirectory(dirToCreate);
//            Path newDir = FileSystems.getDefault().getPath("Examples/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
//            Files.createDirectories(newDir);

            Path filePath = FileSystems.getDefault().getPath("Examples/Dir1/file1.txt");
            long size  = Files.size(filePath);
            System.out.println("Size= " + size);
            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last modified= " + attrs.lastModifiedTime());
            System.out.println("Created= " + attrs.creationTime());
            System.out.println("Is directory" + attrs.isDirectory());
            System.out.println("Is regular file" + attrs.isRegularFile());


//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }

//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//
////        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        Path filePath = Paths.get(".","files","SubdirectoryFile.txt");
//        printFile(filePath);
//
//        filePath = Paths.get("/home/ckomopou/Development/Git/JavaMasterclass/OutThere.txt");
//        printFile(filePath);
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path3 = FileSystems.getDefault().getPath("thisFileDoesNotExist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//
//        Path path4 = Paths.get("/home/ckomopou/Development/Git/JavaMasterclass/", "abcdf.txt");
//        System.out.println(path4.toAbsolutePath());
//
//
////Check the existence of the filepath before moving on
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
//
//        System.out.println("Exists = " + Files.exists(path4));
//
//    }
//
//    private static void printFile(Path path){
//        try(BufferedReader fileReader = Files.newBufferedReader(path)){
//            String line;
//            while((line = fileReader.readLine()) != null){
//                System.out.println(line);
//            }
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
