package practice23_24.parser_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ParserCSV {
    static final private String nameFile = "test.csv";
    public static void main(String[] args) {
        try{
            Reader reader = new BufferedReader(new FileReader(nameFile));
            reader.read();
        }catch (Exception e){

        }

    }
}
