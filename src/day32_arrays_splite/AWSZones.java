package day32_arrays_splite;

public class AWSZones {
    public static void main(String[] args) {
        String app ="etsy";
        String zone="us_east_1,us_west_2,us_west_1";
        System.out.println("-----Starting deployment of etsy app to AWS zone......");
        String[] zonesTODeploy = zone.split(",");
        for(String eachzone :zonesTODeploy){
            System.out.println("Deploying ["+app+"] to "+eachzone+".....");
        }
    }
}
