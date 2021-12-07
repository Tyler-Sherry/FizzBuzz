import java.util.ArrayList;

public class FizzBuzz
{
    public static void main(String[] args)
    {
        ArrayList<String> fizzBuzzArrayList = new ArrayList<>();

        for (int i = 0; i <= 15; i++)
        {
            if (i % 3 == 0)
            {
                fizzBuzzArrayList.add("Fizz");
            }
            else if (i % 5 == 0)
                fizzBuzzArrayList.add("Buzz");
            else
            {
                String numberInString = String.valueOf(i);
                fizzBuzzArrayList.add(numberInString);
            }
        }

        for(int i = 0; i < fizzBuzzArrayList.size(); i++)
        {
            System.out.println(fizzBuzzArrayList.get(i));
        }
    }
}
