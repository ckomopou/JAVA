import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {

// This filter eliminates the Dir3 because it forces only simple files to be shown and not directories
        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>(){
            public boolean accept(Path path) throws IOException{
                return (Files.isRegularFile(path));
            }

        };

        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
        try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)){
            for (Path file : contents){
                System.out.println(file.getFileName());
            }
        }catch(IOException | DirectoryIteratorException e){
            System.out.println(e.getMessage());
        }

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for(FileStore store: stores){
            System.out.println("Volume name file letter:   " + store);
            System.out.println("file store:    " + store.name());
        }

        System.out.println("----------Walking tree for Dir2---------------------");
        Path dir2Path = FileSystems.getDefault().getPath("File Tree" + File.separator + "Dir2");
        try{
            Files.walkFileTree(dir2Path, new PrintNames());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
