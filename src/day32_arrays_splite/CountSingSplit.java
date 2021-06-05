package day32_arrays_splite;

public class CountSingSplit {
    public static void main(String[] args) {
        String cats="bengal cat tabby cat persian cat not cat here";
        String[] catsArrays=cats.split("cat");
        System.out.println("counts of 'cat' = " + (catsArrays.length-1));

        for(String type: catsArrays){
            System.out.println(type);
        }
    }
}
