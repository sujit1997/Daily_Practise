package R_1_21;
interface camera2{
    void takesnap();
    void recordVideo();
    default void recordIn4k(){
        System.out.println("Record in 4k...");
    }
}
interface wifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class cellphone2 {
    void callNUmber(int phoneNumber) {
        System.out.println("calling" + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting");
    }

    static class mySmartPhone extends cellphone2 implements wifi2, camera2 {
        public void takesnap() {
            System.out.println("Taking snap");
        }

        @Override
        public void recordVideo() {
            System.out.println("Taking snap");
        }

        public void recordvideo() {
            System.out.println("Recording video");
        }

        public String[] getNetworks() {
            System.out.println("Getting list of networks");
            String[] networkList = {"Sujit", "ajit", "neel"};
            return networkList;
        }

        @Override
        public void connectToNetwork(String network) {
            System.out.println("connecting to" + network);
        }
    }
}
public class SMPS_59_Polymorphism {
    public static void main(String[] args) {
    camera2 cam1 = new cellphone2.mySmartPhone();
    cam1.recordIn4k();
    }
}
