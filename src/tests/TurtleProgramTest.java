package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import turtle.Turtle;
import turtle.interpreterPattern.visitorPattern.CommandExecuteVisitor;
import turtle.interpreterPattern.visitorPattern.CommandTotalDistanceVisitor;

public class TurtleProgramTest {

	@Test
	public void testTurtleTotalDistanceExecution() {
		Turtle firstTurtle = new Turtle("turtleProgram.txt");
		firstTurtle.accept(new CommandTotalDistanceVisitor(), firstTurtle);
		assertEquals(firstTurtle.getLocation().getX(), 0.0, 0.0001);
		assertEquals(firstTurtle.getLocation().getY(), 20.0, 0.0001);
		
		Turtle secondTurtle = new Turtle("turtleProgram2.txt");
		secondTurtle.accept(new CommandTotalDistanceVisitor(), secondTurtle);
		assertEquals(secondTurtle.getLocation().getX(), 20.000000000000004, 0.0001);
		assertEquals(secondTurtle.getLocation().getY(), 20.000000000000004, 0.0001);
		
		Turtle thirdTurtle = new Turtle("turtleProgram3.txt");
		thirdTurtle.accept(new CommandTotalDistanceVisitor(), thirdTurtle);
		assertEquals(thirdTurtle.getLocation().getX(), 62.81088913245536, 0.0001);
		assertEquals(thirdTurtle.getLocation().getY(), 29.150635094610976, 0.0001);
		
	}
	
	@Test
	public void testTurtleExecution() {
		Turtle firstTurtle = new Turtle("turtleProgram.txt");
		firstTurtle.accept(new CommandExecuteVisitor(), firstTurtle);
		assertEquals(firstTurtle.getLocation().getX(), 1.2246467991473533E-15, 0.0001);
		assertEquals(firstTurtle.getLocation().getY(), 0.0, 0.0001);
		
		Turtle secondTurtle = new Turtle("turtleProgram2.txt");
		secondTurtle.accept(new CommandExecuteVisitor(), secondTurtle);
		assertEquals(secondTurtle.getLocation().getX(), 1.7763568394002505E-15, 0.0001);
		assertEquals(secondTurtle.getLocation().getY(), -1.8369701987210296E-15, 0.0001);
		
		Turtle thirdTurtle = new Turtle("turtleProgram3.txt");
		thirdTurtle.accept(new CommandExecuteVisitor(), thirdTurtle);
		assertEquals(thirdTurtle.getLocation().getX(), 27.5, 0.0001);
		assertEquals(thirdTurtle.getLocation().getY(), 22.99038105676658, 0.0001);
	}
	
	
	

}
