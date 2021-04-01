import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class csvWriter {
    public static void csvWriterOneByOne(List<String[]> stringArray) throws Exception {
        File file = new File("csvfile.csv");
        FileWriter outputfile = new FileWriter(file, true);
        CSVWriter writer = new CSVWriter(outputfile);

        writer.writeAll(stringArray);
        writer.close();
    }
}