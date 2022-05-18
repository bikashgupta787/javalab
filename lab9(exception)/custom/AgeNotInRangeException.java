class AgeNotInRangeException extends Exception
{
    public String toString()
    {
        return("Age is not between 30 and 50,please reenter the age");
    }
}