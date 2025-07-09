package R_7_9;

public class SMPS2_16_a {
    public static void main(String[] args) {
        String filename = "jbubvulidsnv_20250711_143800.png";

        String nameWithoutExt = filename.replace(".png", "");
        int lastUnderScoreIndex =nameWithoutExt.lastIndexOf("_");

        String timestamp = nameWithoutExt.substring(lastUnderScoreIndex -9 +1);

        System.out.println(timestamp);

    }
}
