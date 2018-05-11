package in.raster.cucumber.utilities;

import gherkin.lexer.Fi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyWriter {

    private Properties properties = new Properties();

    private OutputStream outputStream = null;

    public PropertyWriter(){ loadWriter();}

    public void loadWriter(){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/sample.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
