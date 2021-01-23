package myUtilities;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    // This method will read data from CSV file and return a list
    public static List<String[]> read(String file) throws IOException {
        var data = new LinkedList<String[]>();
        String dataRaw;

        try {
            var br = new BufferedReader(new FileReader(file));

            while ((dataRaw = br.readLine()) != null) {
                var dataRecords = dataRaw.split(",");
                data.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            System.out.println("COULD NOT FIND FILE");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }

        return data;
    }
}
