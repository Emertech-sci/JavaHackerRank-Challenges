import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println
("================================");
        for(int i =0; i<3; i++){
            //Compile this line
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);

            // The last line of code is similar to the System.out.println(f"This is a formated string %s %d%n",stringVar, intVar);
            //the %s admits a string variable
            //%-15s left justify the string (that fill the remainning characters with empty spaces to complete 15 char lenght for the string on the right side)
            //15 This specifies the minimum width of the field. In this case, the string will occupy at least 15 characters.
            //the %d admits an integer variable
            //0: The 0 means that the number will be padded with zeros if it's less than the specified width.
            //3: This specifies the minimum width of the field. In this case, the integer will be padded to ensure it has at least 3 digits.

            //%n is for new line
            //https://xperti.io/blogs/formatting-with-printf-in-java/#:~:text=The%20printf%20method%20in%20Java,of%20the%20format()%20method


        }
        System.out.println
                ("================================");
        
    }
}
