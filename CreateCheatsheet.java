import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateCheatsheet {
    public static String[] folders = {
        "bases",
        "math",
        "primitives",
        "strings"
    };

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("cheatsheet.md");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print("# Global Cheatsheet\n\n");
        for (String folder : folders) {
            String filePath = folder + "/cheatsheet.md";

            File file = new File(filePath);
            Scanner sc = new Scanner(file).useDelimiter("\\Z");
            String content = sc.next();
            content = content.replaceAll("(#+)(.+)", "#$1$2");
            content = content.replaceAll(".*- \\[.*\\]\\(#+.*\\)", "");
            System.out.println(content);
            
            printWriter.print(content + "\n\n");

            sc.close();
        }
        printWriter.close();
    }
}