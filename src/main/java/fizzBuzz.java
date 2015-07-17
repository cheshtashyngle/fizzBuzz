public class fizzBuzz {
    String printString(int number)
    {
        if(isMultipleOf3(number))
        {
            return "Fizz";
        }
        else
            return "Buzz";

    }
    boolean isMultipleOf3(int number)
    {
        if(number%3==0)
            return true;
        else
            return false;
    }

}
