import org.apache.commons.io.FilenameUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String concat = FilenameUtils.concat("base", "child");
        System.out.println("FileNameUtils: Contcat = " + concat);
    }
}