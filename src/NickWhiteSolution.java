import java.util.ArrayList;
import java.util.List;

class Solution{
    public List<String> fizzBuzz(int n){
        List<String> output_arr = new ArrayList<>();
        for (int i = 1, fizz = 0, buzz = 0; i <= n; i++){
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5) {
                fizz = 0;
                buzz = 0;
                output_arr.add("FizzBuzz");
            } else if (fizz == 3){
                output_arr.add("Fizz");
                fizz = 0;
            } else if (buzz == 5){
                output_arr.add("Buzz");
                buzz = 0;
            } else {
                output_arr.add(Integer.toString(i));
            }
        }
        return output_arr;
    }
}

public class NickWhiteSolution
{
    public static void main(String[] args)
    {
        Solution solutionToProblem = new Solution();
        List<String> solutionArray = solutionToProblem.fizzBuzz(15);
        for (int i = 0; i < solutionArray.size(); i++)
        {
            System.out.println(solutionArray.get(i));
        }
    }
}
