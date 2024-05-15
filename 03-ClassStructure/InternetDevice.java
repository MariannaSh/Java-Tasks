public class InternetDevice {
    private String deviceName;
    private boolean connected;
    static int connectedDevices = 0;

    

    public InternetDevice(String deviceName) {
        this.deviceName = deviceName;
        this.connected=false;
    }


    public void connect(){
        if (!connected){
            connected =true;
            connectedDevices++;
        }
    }
    
    public void disconnect(){
        if(!connected){
            connected=false;
            connectedDevices--;
        }
    }

    public boolean isConnected(){
        return connected;
    }

    public void displayStatus(){
        System.out.println("Name: "+deviceName+"\nConnect to Internet: "+connected);
    }

    public void displayConnections(){
        System.out.println("Number of connected devices: "+connectedDevices);
    }

    public static void main(String[] args) {
        InternetDevice n1=new InternetDevice("personal computer");
        n1.connect();
        n1.isConnected();
        n1.displayStatus();

        System.out.println();

        InternetDevice n2=new InternetDevice("laptop");
        n2.disconnect();
        n2.isConnected();
        n2.displayStatus();
        n2.displayConnections();

        System.out.println();

        InternetDevice n3=new InternetDevice("tablet");
        n3.disconnect();
        n3.isConnected();
        n3.displayStatus();

        InternetDevice n4=new InternetDevice("smartphone");
        n4.connect();
        n4.isConnected();
        n4.displayStatus();

        System.out.println();

        InternetDevice n5=new InternetDevice("TV");
        n5.disconnect();
        n5.isConnected();
        n5.displayStatus();

        n5.displayConnections();
    }
}
