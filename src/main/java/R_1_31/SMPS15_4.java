package R_1_31;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SMPS15_4 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate = dt.format(df);
        System.out.println(mydate);


    }
}
