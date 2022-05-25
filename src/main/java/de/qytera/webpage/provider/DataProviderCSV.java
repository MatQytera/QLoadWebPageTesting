package de.qytera.webpage.provider;

/*import org.bouncycastle.util.Strings;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DataProviderCSV {


    @DataProvider(name = "dp")
    public static Object[][] getData() throws IOException {

        List<String> lines = Files.lines(Path.of("C:\\Users\\mdabrowski\\IdeaProjects\\DataDrivenDemoV1\\src\\main\\resources\\example.csv")).skip(1).toList();
        Object[][] content = new Object[lines.size()][];
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] columns = Strings.split(line, ';');
            content[i] = new String[columns.length];
            System.arraycopy(columns, 0, content[i], 0, columns.length);
        }
        return content;
    }

}*/
