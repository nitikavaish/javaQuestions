package com.company;

interface myCamera {
    void takeSnap();

    void recerdVideo();

    default void recording4KVideo() {
        System.out.println(" recording in 4K...");
    }
}
// method default karne se use class me implement karne ki need nahi hoti hai
// agar implement kar diya ho to implement wala method run hota hai
interface myWifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class myCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("calling" + phoneNumber);
    }

    void pickCall() {
        System.out.println("connecting");
    }

}

class mySmartPhone extends myCellPhone implements myWifi, myCamera {

    public String[] getNetworks() {
        System.out.println(" getting list of network");
        String[] networkList = {"Harrry", "Prashant", "anjali5g"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("connecting to " + network);
    }

    public void takeSnap() {
        System.out.println(" taking snap ");
    }

    public void recerdVideo() {
        System.out.println("record video");
    }

//    public void recording4KVideo() {
//        System.out.println(" recording in 4K...");
//    }
}

public class CWH_57_default_methods {
    public static void main(String[] args) {
        mySmartPhone samsung = new mySmartPhone();
        samsung.recording4KVideo();
        String[] ar = samsung.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }

    }
}
