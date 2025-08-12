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
  
		Robot f = new Robot(10,4,East,100);
    Robot r = new Robot(10,4,East,100);
    Robot g = new Robot(5,7,East,100);
    Robot t = new Robot(6,7,East,100);
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
    r.move();
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

    g.move();
    g.putBeeper();
    g.move();
    g.putBeeper();
    g.turnLeft();
    g.turnLeft();
    g.turnLeft();
    g.move();
    g.putBeeper();
    g.move();
    g.putBeeper();
    g.turnLeft();
    g.move();
    g.putBeeper();
    g.move();
    g.putBeeper();
    g.turnLeft();
    g.turnLeft();
    g.turnLeft();
    g.move();
    g.putBeeper();
    g.move();
    g.putBeeper();

    t.move();
    t.putBeeper();
    t.move();
    t.putBeeper();
    t.turnLeft();
    t.move();
    t.putBeeper();
    t.move();
    t.putBeeper();
    t.turnLeft();
    t.turnLeft();
    t.turnLeft();
    t.move();
    t.putBeeper();
    t.move();
    t.putBeeper();
    t.turnLeft();
    t.move();
    t.putBeeper();
    t.move();
    t.putBeeper();

	f.putBeeper();

  }
}
