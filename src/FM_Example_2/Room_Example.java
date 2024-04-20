/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FM_Example_2;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author malik
 */

abstract class Room {
    abstract void connect(Room room);
}

class MagicRoom extends Room {
    @Override
    public void connect(Room room) {}
}

class OrdinaryRoom extends Room {
    @Override
    public void connect(Room room) {}
}

abstract class MazeGame {
     private final List<Room> rooms = new ArrayList<>();

     public MazeGame() {
          Room room1 = makeRoom();
          Room room2 = makeRoom();
          room1.connect(room2);
          rooms.add(room1);
          rooms.add(room2);
     }

     abstract protected Room makeRoom();
}

class MagicMazeGame extends MazeGame {
    @Override
    protected MagicRoom makeRoom() {
        return new MagicRoom();
    }
}

class OrdinaryMazeGame extends MazeGame {
    @Override
    protected OrdinaryRoom makeRoom() {
        return new OrdinaryRoom();
    }
}


public class Room_Example{
    public static void main(String[] args) {
        MazeGame ordinaryGame = new OrdinaryMazeGame();
        MazeGame magicGame = new MagicMazeGame();
        System.out.println(ordinaryGame.makeRoom());
        System.out.println(magicGame.makeRoom());
    }
    
    
}
