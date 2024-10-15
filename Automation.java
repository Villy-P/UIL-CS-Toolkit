import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Automation {
    public static String[] folders = {
        "bases",
        "math",
        "primitives",
        "strings"
    };

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("cheatsheet.md"));
        for (String folder : folders) {
            String filePath = folder + "/cheatsheet.md";

            File file = new File(filePath);
            Scanner sc = new Scanner(file).useDelimiter("\\Z");
            String content = sc.next();
            content = content.replaceAll("(#+)(.+)", "#$1$2");
            System.out.println(content);
            
            writer.write(content);

            sc.close();
        }
    }
}