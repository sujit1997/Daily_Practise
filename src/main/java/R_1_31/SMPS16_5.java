package R_1_31;

import java.io.FileWriter;
import java.io.IOException;

public class SMPS16_5 {
    public static void main(String[] args) {
       int num = 5;
       String table = "";
        for(int i=1;i<10;i++){
            table += num + "*"+(i+1)+"="+i*(i+1);
            table +="\n";
        }
        try{
            FileWriter fileWriter = new FileWriter("newmulti.txt");
            fileWriter.write(table);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}