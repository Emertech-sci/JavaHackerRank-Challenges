import java.io.*;


public class JavaLoops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //We declare de varibale N and save this value as a number to be multiplied
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        // Then we add a variable i that will be the factor that will operate the N value
        int i = 1;
        // We start a do loop thath will run the code if the content of the while is true
        do{
            // Inside the do loop we declare a variable resulto to save the operation between N and i
            int result = N * i;
            // We print the result of the variable result
            System.out.printf("%d x %d = %d\n", N, i, result);
            //After we printed the result, we add 1 to the original value of i to reach 10 in one moment of the ejecution
            i++;
        }while(i <= 10);
        //Finally we declare a condition to the do while loop that cheks for the value i to be less or equal to 10 to execute te loop again till "i" reach 10


        bufferedReader.close();
    }
}