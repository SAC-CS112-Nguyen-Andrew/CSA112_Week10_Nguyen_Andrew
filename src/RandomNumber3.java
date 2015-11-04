public class RandomNumber3
{

private int lo;
private int hi;

public RandomNumber3(int lo, int hi)
{
    this.lo = lo;
    this.hi = hi;
}

public int GetLowNumber()
{
 return lo;
}

public int GetHighNumber()
{
return hi;
}

public int GetANumber()
{
 int gameNum = lo + (int)(Math.random()*hi);
 return gameNum;
}

//Good job

}
