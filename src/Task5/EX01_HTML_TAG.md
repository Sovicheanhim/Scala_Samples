import java.lang.reflect.Parameter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX01_HTML_TAG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines :");
        int testCases = input.nextInt();
        while(testCases-- > 0){
            String line = input.nextLine();
            boolean matchFound = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if (!matchFound) System.out.println("None");
        }
    }
}

Algorithm of the task:
    +The Regex: "<(.+)>([^<]+)</\\1>"
        1. Group1: <(.+)>
            The regex starts matching with the opening tag format that starts and closes with the arrow brackets. 
            The "." matches any single character except the new line. It's tp ensure that there'll be no newline after the opening arrow bracket
            The "+" matches 1 or more of whatever it comes after.
            The parenthesis is for saving the content inside it to group 1
        2. Group2: ([^<]+)
            This will match anything inside the opening and closing tag
            The "[^<]" is to cut off any "<" that comes again after the first opening tag (in case of one tag inside another tag, so it will pick the inside tag).
            The "+" matches 1 or more of whatever it comes after.
            The parenthesis is for saving the content inside it to group 2