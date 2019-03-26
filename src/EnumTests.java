import org.junit.Assert;
import org.junit.Test;

/**
 * lab 8 tests
 * 
 * @author Hana Stevenson
 * @version 2019-03-25
 */

public class EnumTests
{
    @Test
    public void LocationTest()
    {
        Assert.assertEquals("location method incorrect", "KITCHEN", Location.KITCHEN.name());
    }

    @Test
    public void ColorTest()
    {
        Assert.assertEquals("Color method incorrect", "BLUE", Color.BLUE.name());
        Assert.assertEquals("Color method incorrect", 255, Color.YELLOW.getR());
        Assert.assertEquals("Color method incorrect", 255, Color.YELLOW.getG());
        Assert.assertEquals("Color method incorrect", 0, Color.YELLOW.getB());
    }

    @Test
    public void ShapeTest()
    {
        Assert.assertEquals("shape method incorrect", "RACECAR", Shape.RACECAR.name());
        Assert.assertEquals("shape method incorrect", "thimble", Shape.THIMBLE.toString());
    }

    @Test
    public void GamePieceTest()
    {
        Assert.assertEquals("toString method incorrect", "GREEN_BOOT: a GREEN boot with priority 8",
                GamePiece.GREEN_BOOT.toString());
    }
}
