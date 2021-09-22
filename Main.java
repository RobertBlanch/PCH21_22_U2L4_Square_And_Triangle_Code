import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
      World world = new World(300,300);
      Turtle yertle = new Turtle(125, 125, world);
      Turtle triYertle = new Turtle(150, 150, world);

      // draw square with yertle
      yertle.setPenWidth(2);
      yertle.setColor(Color.red);
      yertle.forward(100);
      yertle.turnLeft();
      yertle.setColor(Color.blue);
      yertle.forward(100);
      yertle.turnLeft();
      yertle.setColor(Color.yellow);
      yertle.forward(100);
      yertle.turnLeft();
      yertle.setColor(Color.cyan);
      yertle.forward(100);
      yertle.turnLeft();
      
      // draw triangle with triYertle turtle
      triYertle.setPenWidth(6);
      triYertle.setColor(Color.magenta);
      triYertle.turn(120);
      triYertle.forward(75);
      triYertle.setColor(Color.black);
      triYertle.turn(120);
      triYertle.forward(75);
      triYertle.setColor(Color.orange);
      triYertle.turn(120);
      triYertle.forward(75);

      world.show(true);
  }
}
