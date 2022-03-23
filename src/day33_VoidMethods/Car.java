package day33_VoidMethods;

public class Car {
    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }

    public static void OpenTheDoor(){
        System.out.println("Opening the door");
    }
    public static void SitInCar(){
        System.out.println("siting in the car");
        System.out.println("closing the door");
    }
    public static void GetReadyToGo(){
        System.out.println("puting on seatbelt");
        System.out.println("check the mirrors");
        System.out.println("put the music");
    }
    public static void StartTheCar(){
        System.out.println("starting car");
    }
    public static void DriveAndGo(){
        System.out.println("Putting car in to drive");
    }

    public static void goInHurry(){
        unlockCar();
        SitInCar();
        StartTheCar();
        DriveAndGo();
    }

    public static void main(String[] args) {
        unlockCar();
        unlockCar();
        OpenTheDoor();
        SitInCar();
        GetReadyToGo();
        StartTheCar();
        DriveAndGo();

        System.out.println();
        goInHurry();
        System.out.println("hear police siren");
        GetReadyToGo();
    }
}
