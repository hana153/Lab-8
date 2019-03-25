package lab8;

public enum Shape
{
    THIMBLE(), BOOT(), RACECAR();
    
    public String toString()
    {
        return name().toLowerCase();
        
    }
    
}
