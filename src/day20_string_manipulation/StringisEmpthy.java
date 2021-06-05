package day20_string_manipulation;

public class StringisEmpthy {
    public static void main(String[] args) {
        String jobtitle="";
        System.out.println(jobtitle.isEmpty());
        System.out.println(jobtitle.length());
        System.out.println(jobtitle.length()==0);

        if(jobtitle.isEmpty()){
            System.out.println("job title is missing please send it again");
        }else {
            System.out.println("job title is good");
        }
        if(jobtitle.length()==0){
            System.out.println("job title is empty ");
        }else {
            System.out.println("job title is not empty");
        }
        if("".equals(jobtitle)){
            System.out.println("job title is empty");
        }else {
            System.out.println("job title is not empty");
        }
        String veggie = "carrots";
        System.out.println(veggie.isEmpty());
        if(!veggie.isEmpty()){
            System.out.println("we have " + veggie);
        }
        String word2;
       // System.out.println(word2.isEmpty()); ***** it will show error it is not initialize it means no value no assigned
    }
}