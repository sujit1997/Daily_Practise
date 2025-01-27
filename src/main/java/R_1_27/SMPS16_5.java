package R_1_27;

import java.io.FileWriter;
import java.io.IOException;

public class SMPS16_5 {
    public static void main(String[] args) {
        int i=5;
        String table = "";
        for (int j=0; j<10;j++){
            table +=i+"*"+(j+1)+"=" +i*(j+1);
            table += "\n";
        }
          try {
              FileWriter fileWriter = new FileWriter("multiplicationtable.txt");
              fileWriter.write(table);
              fileWriter.close();
          }
          catch (IOException e){
              e.printStackTrace();
          }
    }
}
