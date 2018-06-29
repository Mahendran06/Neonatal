package in.raster.cucumber.utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PropertyWriter {

    public void loadWriter(byte[] data) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/config.properties", true);
            String S = data.toString();
            if (S.contains("M")) {
                fileOutputStream.write("Mother'sMRNO = ".getBytes());
                fileOutputStream.write(data);
                fileOutputStream.write("\n".getBytes());
                fileOutputStream.close();
            } else if (S.contains("B")) {
                fileOutputStream.write("Baby'sMRNO = ".getBytes());
                fileOutputStream.write(data);
                fileOutputStream.write("\n".getBytes());
                fileOutputStream.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
