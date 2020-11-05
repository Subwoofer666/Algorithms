import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchByFolder {


    public static void main(String[] args) {
        ArrayList<File> list = new ArrayList<File>();
        searchFiles(new File("C:\\"), list);
        for (File x : list) {
            System.out.println(x);
        }
    }
    //search for files in folders and subfolders
    private static void searchFiles(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            System.out.println("search at: " + rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles(); //collects all files
            if (directoryFiles != null) {
                for (File x : directoryFiles) {
                    if (x.isDirectory()) {
                        searchFiles(x, fileList);
                    } else {
                        if (rootFile.getName().toLowerCase().endsWith(".jpg")) {
                            fileList.add(x);
                        } } } } } }
}
