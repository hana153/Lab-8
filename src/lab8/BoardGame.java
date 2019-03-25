package lab8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame
{
    protected LinkedHashMap<String, Location> playerLocations;
    
    protected LinkedHashMap<String, GamePiece> playerPieces;
    
    // constructor for a new board game
    public BoardGame()
    {
        playerLocations = new LinkedHashMap<String, Location>();
        
        playerPieces = new LinkedHashMap<String, GamePiece>();
    }
    
    public boolean addPlayer(String name, GamePiece gamePiece, Location initalLocation)
    {
        if (playerPieces.containsValue(gamePiece))
        {
            return false;
        }
        playerPieces.put(name, gamePiece);
        playerLocations.put(name, initalLocation);
        return true;
    }
    
    public GamePiece getPlayerGamePiece(String name)
    {
        return playerPieces.get(name);
    }
    
    public String getPlayerWithGamePiece(GamePiece gamePiece)
    {
        Set<String> players = playerPieces.keySet();
        for (String i: players)
        {
            if(playerPieces.get(i).equals(gamePiece))
            {
                return i;
            }
        }
        return null;
    }
    
    public void movePlayer(String playerName, Location newLocation) 
    {
        playerLocations.put(playerName, newLocation);
    }
    
    public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
    {
        GamePiece firstMove = GamePiece.movesFirst(getPlayerGamePiece(playerNames[0]), getPlayerGamePiece(playerNames[1]));
        
        String firstPlayer = getPlayerWithGamePiece(firstMove);
        
        if(firstPlayer.equals(playerNames[0])) 
        {
            playerLocations.put(firstPlayer, newLocations[0]); 
            
            playerLocations.put(playerNames[1], newLocations[1]);
            
            return playerNames;
        }
        else 
        {
            playerLocations.put(firstPlayer, newLocations[1]); 
            
            playerLocations.put(playerNames[1], newLocations[0]);
            
            String[] result = {firstPlayer, playerNames[0]};
            return result;
        }
    }
    
    public Location getPlayersLocation(String player)
    {
        return playerLocations.get(player);
    }
    
    public ArrayList<String> getPlayersAtLocation(Location loc)
    {
        ArrayList<String> players = new ArrayList<String>();
        Set<String> playerList = playerLocations.keySet();
        for (String i: playerList)
        {
            if((playerLocations.get(i)).equals(loc))
            {
                players.add(i);
            }
        }
        return players;
    }
    
    public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
    {
        ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
        Set<String> playerList = playerLocations.keySet();
        for (String i: playerList)
        {
            if((playerLocations.get(i)).equals(loc))
            {
                pieces.add(getPlayerGamePiece(i));
            }
        }
        return pieces;
    }
    
    public Set<String> getPlayers()
    {
        return playerPieces.keySet();
    }
    
    public Set<Location> getPlayerLocations()
    {
        return new HashSet<Location>(playerLocations.values());
    }
    
    public Set<GamePiece> getPlayerPieces()
    {
        return new HashSet<GamePiece>(playerPieces.values());
    }
}
