package discordBot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DiscordToken {
    private static String token = null;

    static {
        File configFile = new File("MTGRotisserieDraftDiscordbotMaven/config.properties");
        try {
            FileReader reader = new FileReader(configFile);
            Properties props = new Properties();
            props.load(reader);
            token =  props.getProperty("token");
            System.out.println(token + "instide " );
            reader.close();
        } catch (FileNotFoundException ex) {
                // file does not exist
        } catch (IOException ex) {
                // I/O error
        }
     }


    public static String getToken() {
        return token;
    }
}
