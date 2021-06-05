package day31_arrays;

public class CharArrays {
    public static void main(String[] args){
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ', 'f', 'u', 'n'};
        for(char each : letters){
            System.out.print(each + " ");
            //when we have char array,  we can create a String out of it.
        }
        String sentence = new String(letters);
        System.out.println("\nsentence = "+sentence);

        //convert char array into string just create a new string with char array in constructor.
        //*******cheap way easy way
        String item="wooden spoon";
        char [] itemarray=item.toCharArray();
        System.out.println("itemarray.lenght = "+itemarray.length);
        System.out.println("item.length() = "+item.length());

        String[] fruits = {"bananas" , "apples" , "kiwi" , "mango" ,"strawberry"};
        for(String each:fruits){
            System.out.print(each+"_");
        }
        String[] language ={"java" , "python" , "c++" , "sql" , "ruby"};

        System.out.println(String.join("",language));
        System.out.println(String.join("##",language));
        String joindedlanguage = String.join(" <> ",language);
        System.out.println("joindedlanguage = " + joindedlanguage);


        String str ="git";
        char[] word = str.toCharArray();

    }
}
