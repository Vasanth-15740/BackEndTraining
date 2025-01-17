package Day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingANdWritingName {
    public void FileWriting(){
        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter("D:/BackEndTraining/Vasanth.txt"));
            String temp = "VasanthKumarS-It";
            bf.write(temp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        finally {
            try {
                if (bf != null) {
                    bf.close();
                }
            }
            catch (IOException e){
                throw  new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        CreatingANdWritingName cf = new CreatingANdWritingName();
        cf.FileWriting();
    }
}
