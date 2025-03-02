package R_3_2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class SMPS15_4 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:M:S");
        String mydate = dt.format(df);
        System.out.println(mydate);
    }
}
