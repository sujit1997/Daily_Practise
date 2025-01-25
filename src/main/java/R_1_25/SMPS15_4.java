package R_1_25;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SMPS15_4 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String mydate = dt.format(df);
        System.out.println(mydate);
    }
}
