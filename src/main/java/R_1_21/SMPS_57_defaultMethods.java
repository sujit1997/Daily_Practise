package R_1_21;
interface camera{
    void takesnap();
    void recordVideo();
    default void recordIn4k(){
        System.out.println("Record in 4k...");
    }
}
interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class cellphone{
    void callNUmber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting" );
    }

    static class mySmartPhone extends cellphone implements wifi,camera{
        public void takesnap(){
            System.out.println("Taking snap");
        }

        @Override
        public void recordVideo() {
            System.out.println("Taking snap");
        }

        public void recordvideo(){
            System.out.println("Recording video");
        }
        public String[] getNetworks(){
            System.out.println("Getting list of networks");
            String[] networkList = {"Sujit","ajit","neel"};
            return  networkList;
        }

        @Override
        public void connectToNetwork(String network) {
            System.out.println("connecting to" + network);
        }
    }
}
public class SMPS_57_defaultMethods {
    public static void main(String[] args)  {
    cellphone.mySmartPhone ms = new cellphone.mySmartPhone();
    String[] ar = ms.getNetworks();
    for(String item: ar){
        System.out.println(item);
    }
    }
}
