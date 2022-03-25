package database.logs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
    public static void info(String message){
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/main/java/database/logs/logs.log", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(message);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
