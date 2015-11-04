public class RandomNumber2 //Lab 5 of week 10
{
    private int high;
    
    public RandomNumber2 (int high)
    {
        this.high = high;
    }
    
    public int GetANumber()
    {
        int gameNum = 0 + (int)(Math.random()*high);
        return gameNum;
    }
}
