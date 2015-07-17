public class fizzBuzz {
    String printString(int number)
    {
        if(isMultipleOf15(number))
            return "FizzBuzz";
        else if(isMultipleOf5(number))
            return "Buzz";
        else if(isMultipleOf3(number))
            return "Fizz";
        else
            return "Blah";
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
    boolean isMultipleOf3(int number)
    {
        if(number%3==0)
            return true;
        else
            return false;
    }

}
