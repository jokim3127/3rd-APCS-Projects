import kareltherobot.Directions;
import kareltherobot.Robot;
import kareltherobot.World;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setSize(15, 15);
    World.setDelay(0);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
  
		Robot f = new Robot(9,4,East,100);
    Robot r = new Robot(9,4,East,100);
    // examples of commands you can invoke on a Robot
    f.move();
    f.turnLeft();
    f.turnLeft();
    f.turnLeft();
    f.putBeeper();
    f.move();
    f.putBeeper();
    f.move();
    f.putBeeper();
    f.move();
    f.putBeeper();
    f.move();
    f.putBeeper();
    f.move();
    f.putBeeper();
    f.move();
    f.putBeeper();
    f.move();
    f.turnLeft();
    f.turnLeft();
    f.turnLeft();
    f.putBeeper();
    f.move();
    f.putBeeper();
    f.move();
    f.turnLeft();
    f.turnLeft();
    f.turnLeft();
    f.putBeeper();
    f.move();
    
    r.move();
    r.move();
    r.move();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();

    r.putBeeper();
    r.move();

    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();





	f.putBeeper();

  }
}