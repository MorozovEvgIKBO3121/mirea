package Lab21;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number4 {

    public static void main(String[] args) {
        String directoryPath = "путь к каталогу"; //написать путь к каталогу
        List<File> fileList = getDirectoryContents(directoryPath);
        printFirstFiveElements(fileList);
    }

    public static List<File> getDirectoryContents(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException(directoryPath + " is not a directory");
        }
        File[] files = directory.listFiles();
        if (files == null) {
            throw new IllegalArgumentException("Could not read directory contents: " + directoryPath);
        }
        return new ArrayList<>(Arrays.asList(files));
    }

    public static void printFirstFiveElements(List<File> fileList) {
        int numElementsToPrint = Math.min(5, fileList.size());
        for (int i = 0; i < numElementsToPrint; i++) {
            System.out.println(fileList.get(i));
        }
    }

}
