package c;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadHistory {

    private String path;

    public ReadHistory(String path) {
        this.path = path;
    }

    public String getHistory() {

        BufferedReader br = null;

        StringBuilder sb = new StringBuilder();

        File file = new File(this.path);

        try {
            br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null) {
                sb.append(st);
                sb.append(" ");
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Couldn't close filereade");
        }

        return sb.toString().trim();
    }

}
