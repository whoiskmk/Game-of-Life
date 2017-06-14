package gameoflife;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeBoardTest {

	@Test
	public void toStringTest() {
		GameOfLifeBoard testData = new GameOfLifeBoard(5);
		String expectedValue = "| | | | | |\n| | | | | |\n| | | | | |\n| | | | | |\n| | | | | |";
		String testValue = testData.toString();
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void isAliveTest() {
		GameOfLifeBoard testData = new GameOfLifeBoard(5);
		boolean expectedValue = false;
		boolean testValue = testData.isAlive(0, 0);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void getSizeTest() {
		GameOfLifeBoard testData = new GameOfLifeBoard(5);
		int expectedValue = 5;
		int testValue = testData.getSize();
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void changeStateTest() {
		GameOfLifeBoard testData = new GameOfLifeBoard(5);
		boolean expectedValue = false;
		testData.changeState(0, 0);
		boolean testValue = testData.isAlive(0, 0);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void toArrayTest() {
		GameOfLifeBoard testData = new GameOfLifeBoard(5);
		boolean [][] expectedValue = {
				{true, false, false, false, false},
				{false, false, false, false, false},
				{false, false, false, false, false},
				{false, false, false, false, false},
				{false, false, false, false, false},
				};
		boolean [][] testValue = testData.toArray();
		assertEquals(expectedValue, testValue);
	}

}
