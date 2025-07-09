package R_7_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SMPS16_b {
    public static void main(String[] args) {
        String filename = "jsndvuisnv_20250911_150000.png";
        Pattern pattern = Pattern.compile("(\\d{8}_\\d{6})");

        Matcher matcher = pattern.matcher(filename);

        if(matcher.find()) {
            String timestamp = matcher.group(1);
            System.out.println("Timestamp : " + timestamp);
        }else {
            System.out.println("No timestamp found");
        }
    }
}
