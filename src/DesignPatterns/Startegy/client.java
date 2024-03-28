package DesignPatterns.Startegy;

public class client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        String src = "home";
        String dest="Office";
        Mode mode= Mode.BIKE;
        googleMaps.findPath(src,dest,mode);
    }
}
