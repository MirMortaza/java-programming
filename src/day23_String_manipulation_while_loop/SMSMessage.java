package day23_String_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [mir] from number <(571)-344-4444> Message: {Hello, lets code some java";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1, end));
        String sender = message.substring(start+1 , end);
        System.out.println("sender = " + sender);
        
        
        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobile = " + mobile);
    }
}
