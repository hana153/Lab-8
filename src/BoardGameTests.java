import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
/**
 * lab 8 tests
 * 
 * @author Hana Stevenson
 * @version 2019-03-25
 */
public class BoardGameTests
{
    @Test
    public void AddPlayerTest()
    {
        BoardGame monopoly = new BoardGame();
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM); 
        Assert.assertEquals("addPlayer method incorrect", true, monopoly.addPlayer("Hana", GamePiece.BLUE_BOOT, Location.KITCHEN));
        Assert.assertEquals("addPlayer method incorrect", false, monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM));
    }
    
    @Test
    public void getPlayerGamePieceTest()
    {
        BoardGame monopoly = new BoardGame();
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM); 
        Assert.assertEquals("getPlayer method incorrect", GamePiece.MAGENTA_RACER, monopoly.getPlayerGamePiece("Jonathan"));
    }
    
    @Test
    public void getPlayerWithGamePieceTest()
    {
        BoardGame monopoly = new BoardGame();
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM); 
        Assert.assertEquals("getPlayerWithGamePiece method incorrect", "Jonathan", monopoly.getPlayerWithGamePiece(GamePiece.MAGENTA_RACER));
    }
    
    @Test
    public void movePlayerTest()
    {
        BoardGame monopoly = new BoardGame();
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM); 
        monopoly.movePlayer("Jonathan", Location.BILLIARD_ROOM);
        Assert.assertEquals("movePlayer method incorrect", Location.BILLIARD_ROOM, monopoly.getPlayersLocation("Jonathan"));
    }
    
    @Test
    public void moveTwoPlayersTest()
    {
        BoardGame monopoly = new BoardGame();
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM);
        monopoly.addPlayer("Hana", GamePiece.BLUE_BOOT, Location.KITCHEN);
        String[] playerNames = {"Jonathan", "Hana"};
        Location[] newLocations = {Location.BILLIARD_ROOM, Location.CONSERVATORY};
        monopoly.moveTwoPlayers(playerNames, newLocations);
        Assert.assertEquals("moveTwoPlayers method incorrect", Location.BILLIARD_ROOM, monopoly.getPlayersLocation("Jonathan"));
        Assert.assertEquals("moveTwoPlayers method incorrect", Location.CONSERVATORY, monopoly.getPlayersLocation("Hana"));
        
        monopoly.addPlayer("Katie", GamePiece.GREEN_BOOT, Location.BALLROOM);
        monopoly.addPlayer("Kathryn", GamePiece.RED_RACER, Location.KITCHEN);
        String[] playerNames2 = {"Katie", "Kathryn"};
        Location[] newLocations2 = {Location.HALL, Location.STUDY};
        Assert.assertEquals("moveTwoPlayers method incorrect", playerNames2[1], monopoly.moveTwoPlayers(playerNames2, newLocations2)[0]);
        
        monopoly.addPlayer("Crystal", GamePiece.YELLOW_BOOT, Location.BALLROOM);
        monopoly.addPlayer("Kelly", GamePiece.RED_THIMBLE, Location.KITCHEN);
        String[] playerNames3 = {"Crystal", "Kelly"};
        Location[] newLocations3 = {Location.HALL, Location.STUDY};
        Assert.assertEquals("moveTwoPlayers method incorrect", playerNames3[0], monopoly.moveTwoPlayers(playerNames3, newLocations3)[0]);
    }
    
    @Test
    public void getPlayersLocationTest()
    {
        BoardGame monopoly = new BoardGame();
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM); 
        Assert.assertEquals("getPlayersLocation method incorrect", Location.BALLROOM, monopoly.getPlayersLocation("Jonathan"));
    }
    
    @Test
    public void getPlayersAtLocationTest()
    {
        BoardGame monopoly = new BoardGame();
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM);
        monopoly.addPlayer("Kelly", GamePiece.RED_THIMBLE, Location.KITCHEN);
        Assert.assertEquals("gestPlayersAtLocation method incorrect", "Jonathan", monopoly.getPlayersAtLocation(Location.BALLROOM).get(0));
    }
    
    @Test
    public void getGamePiecesAtLocationTest()
    {
        BoardGame monopoly = new BoardGame();
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM); 
        monopoly.addPlayer("Kelly", GamePiece.RED_THIMBLE, Location.KITCHEN);
        Assert.assertEquals("getGamePiecesAtLocation method incorrect", GamePiece.RED_THIMBLE, monopoly.getGamePiecesAtLocation(Location.KITCHEN).get(0));
    }
    
    @Test
    public void getPlayersTest()
    {
        BoardGame monopoly = new BoardGame();
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM); 
        monopoly.addPlayer("Kelly", GamePiece.RED_THIMBLE, Location.KITCHEN);
        Assert.assertEquals("getPlayersTest method incorrect",true, (monopoly.getPlayers()).remove("Jonathan"));
    }
    
    @Test
    public void getPlayerLocationsTest()
    {
        BoardGame monopoly = new BoardGame();
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM); 
        monopoly.addPlayer("Kelly", GamePiece.RED_THIMBLE, Location.KITCHEN);
        Assert.assertEquals("getPlayerLocations method incorrect", true, (monopoly.getPlayerLocations()).remove(Location.BALLROOM));
    }
    
    @Test
    public void getPlayerPiecesTest()
    {
        BoardGame monopoly = new BoardGame();
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM); 
        monopoly.addPlayer("Kelly", GamePiece.RED_THIMBLE, Location.KITCHEN);
        Assert.assertEquals("getPlayerPieces method incorrect", true, (monopoly.getPlayerPieces()).remove(GamePiece.MAGENTA_RACER));
    }
}
