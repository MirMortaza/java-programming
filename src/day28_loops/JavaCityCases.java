package day28_loops;

public class JavaCityCases {
    public static void main(String[] args){
      int totalcases= 0;
      for(int day =1;day<=30;day++){
          if(day%7==0){
              totalcases+=500;
          }else {
              totalcases+=200;
          }
          System.out.println("day " +day+ " total cases: " +totalcases);
      }

    }
}
