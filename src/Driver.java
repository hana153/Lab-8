
public class Driver
{

    public static void main(String[] args)
    {
        // creates new board game
        BoardGame monopoly = new BoardGame();

        // adds two players to the game
        monopoly.addPlayer("Hana", GamePiece.BLUE_BOOT, Location.KITCHEN);
        monopoly.addPlayer("Jonathan", GamePiece.MAGENTA_RACER, Location.BALLROOM);

        // prints the game piece and name of player
        System.out.println(monopoly.getPlayerGamePiece("Jonathan"));
        System.out.println(monopoly.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));

        // moving one player
        monopoly.movePlayer("Hana", Location.BILLIARD_ROOM);

        // moving two players
        String[] players = { "Hana", "Jonathan" };
        Location[] locations = { Location.CONSERVATORY, Location.HALL };
        monopoly.moveTwoPlayers(players, locations);

        // prints the other method results within the BoardGame class
        System.out.println(monopoly.getPlayersLocation("Jonathan"));
        System.out.println(monopoly.getPlayersAtLocation(Location.CONSERVATORY));
        System.out.println(monopoly.getGamePiecesAtLocation(Location.HALL));
        System.out.println(monopoly.getPlayers());
        System.out.println(monopoly.getPlayerLocations());
        System.out.println(monopoly.getPlayerPieces());

    }

}
