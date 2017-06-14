package gameoflife;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeCellTest {

	@Test
	public void testChangeState() {
		
		GameOfLifeCell testData = new GameOfLifeCell(0, 0);
		boolean expectedValue = false;
		boolean testValue = testData.isAlive();
		assertEquals(expectedValue, testValue);
		
	}
	@Test
	public void testIsAlive() {
		GameOfLifeCell testData = new GameOfLifeCell(0, 0);
		boolean expectedValue = false;
		boolean testValue = testData.isAlive();
		assertEquals(expectedValue, testValue);
	}
	
	
		

}
