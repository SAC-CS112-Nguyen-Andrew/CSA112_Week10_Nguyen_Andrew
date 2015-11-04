public class RandomNumber // Lab 4 of Week 10
{
    private int low;
    private int high;
    
    public void setLowNumber(int low)
    {
        this.low = low;
    }
    
    public void setHighNumber(int high)
    {
        this.high = high;
    }
    
    public int GetANumber()
    {
        int gameNum = low + (int)(Math.random()*high);
        return gameNum;
    }
    
    
    
    
    
}