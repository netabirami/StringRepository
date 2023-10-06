import java.util.logging.SimpleFormatter;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Abi,";
        String str2 = "Vinoth";

        //string pooling
        String str3 = "Abi";
        String str4= "Vinoth";
        // Concatenating strings using the + operator
        String result = str1+str2;
        System.out.println("concatenation :"+ result);

        // Using the equals method to compare strings
        boolean areEqual = str1.equals(str3);
        System.out.println("Boolean : "+ areEqual);

        // Using StringBuilder
        StringBuilder builder = new StringBuilder("Hello Abi, ");
        builder .append(" How are you,");
        builder .append(" Have a good one");
        String result2 = builder.toString();// Converting StringBuilder to String

        System.out.println("String Builder : "+ result2);

        // Using StringBuffer (similar to StringBuilder but thread-safe
        StringBuilder buffer = new StringBuilder( "Hello, ");
        buffer .append("Dear, ");
        buffer .append("Good Morning");
        String result3 = buffer .toString();
        System.out.println("Buffer :"+ result3);

        //String Format
        String format = String.format("The salary for abi is % 3f", 10.235000);
        System.out.println("String Format "+format);



    }
}
