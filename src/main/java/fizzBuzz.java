public class fizzBuzz {
    String printString(int number)
    {
        if(isMultipleOf15(number))
            return "FizzBuzz";
        else if(isMultipleOf5(number))
            return "Buzz";
        else
            return "Fizz";
    }
    boolean isMultipleOf15(int number)
    {
        if(number%15==0)
            return true;
        else
            return false;
    }
    boolean isMultipleOf5(int number)
    {
        if(number%5==0)
            return true;
        else
            return false;
    }

}
