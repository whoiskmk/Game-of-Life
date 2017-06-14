package gameoflife;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void getMaxGenerationsTest() {
		GameOfLife testData = new GameOfLife();
		int expectedValue = 5;
		int testValue = testData.getMaxGenerations();
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void setMaxGenerationsTest() {
		GameOfLife testData = new GameOfLife();
		int expectedValue = 10;
		testData.setMaxGenerations(10);
		int testValue = testData.getMaxGenerations();
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void getCurrentGenerationTest() {
		GameOfLife testData = new GameOfLife();
		int expectedValue = 0;
		int testValue = testData.getCurrentGeneration();
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void updateBoardTest() {
		GameOfLife testData = new GameOfLife();
		int expectedValue = 1;
		testData.updateBoard();
		int testValue = testData.getCurrentGeneration();
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void getInitialProbablityTest() {
		GameOfLife testData = new GameOfLife();
		double expectedValue = 0.0;
		double testValue = testData.getInitialProbability();
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void setInitialProbabilityTest() {
		GameOfLife testData = new GameOfLife();
		double expectedValue = 0.25;
		testData.setInitialProbability(0.25);
		double testValue = testData.getInitialProbability();
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void getBoardSizeTest() {
		GameOfLife testData = new GameOfLife();
		int expectedValue = 15;
		int testValue = testData.getBoardSize();
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void setBoardSizeTest() {
		GameOfLife testData = new GameOfLife();
		int expectedValue = 5;
		testData.setBoardSize(5);
		int testValue = testData.getBoardSize();
		assertEquals(expectedValue, testValue);
	}
	
	
	
	@Test
	public void extendGameTest() {
		GameOfLife testData = new GameOfLife();
		int expectedValue = 5;
		testData.extendGame(5);
		int testValue = testData.getMaxGenerations();
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void finishedTest() {
		GameOfLife testData = new GameOfLife();
		boolean expectedValue = false;
		boolean testValue = testData.finished();
		assertEquals(expectedValue, testValue);
		
	}
	@Test
	public void reinitializeTest() {
		GameOfLife testData = new GameOfLife();
		int expectedValue = 0;
		testData.reinitialize();
		int testValue = testData.getCurrentGeneration();
		assertEquals(expectedValue, testValue);
	}
	
	

}
