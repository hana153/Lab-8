

public class Driver
{

    public static void main(String[] args)
    {
        
        BoardGame monopoly = new BoardGame();
        
        monopoly.addPlayer("Hana", GamePiece.BLUE_BOOT, Location.KITCHEN);
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM);
        
        System.out.println(monopoly.getPlayerGamePiece("Jonathan"));
        System.out.println(monopoly.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
        
        monopoly.movePlayer("Hana", Location.BILLIARD_ROOM);
        
        String[] players = {"Hana", "Jonathan"};
        Location[] locations = {Location.CONSERVATORY, Location.HALL};
        monopoly.moveTwoPlayers(players, locations);
        
        System.out.println(monopoly.getPlayersLocation("Jonathan"));
        System.out.println(monopoly.getPlayersAtLocation(Location.CONSERVATORY));
        System.out.println(monopoly.getGamePiecesAtLocation(Location.HALL));
        System.out.println(monopoly.getPlayers());
        System.out.println(monopoly.getPlayerLocations());
        System.out.println(monopoly.getPlayerPieces());

    }

}
