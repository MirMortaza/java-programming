package day22_String_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html , css , selenium , cucumber";
        System.out.println(technologies.indexOf(",")); //4
        System.out.println(technologies.lastIndexOf(","));


        int indexofjava = technologies.indexOf("java");
        System.out.println("java is fun " + indexofjava);

        int idexofcss = technologies.indexOf("css");
        System.out.println("css is at index " +idexofcss);

        int indexofsql = technologies.indexOf("sql");
        System.out.println("sql is at index " + indexofsql);
    }
}
