package edu.ncsu.csc411.public_test_cases;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.Before;
import org.junit.Test;

import edu.ncsu.csc411.ps02.simulation.RunSimulation;

/**
 * This JUnit test suite uses JUnit5. In order to run these 
 * test cases, you will need to have JUnit5 installed on your
 * local machines. You can set your Project to use JUnit5 by
 * right-clicking on the project and selecting "Properties", then
 * selecting "Java Build Path". Finally, selecting "Add Library..."
 * will allow you to select "JUnit" and specify the version.
 * DO NOT MODIFY.
 * @author Adam Gaweda
 */ 
public class PS02_TestCase {
	private final int NUM_TRIALS = 100;
	private final int ITERATIONS = 200;
	private int successfulTrials = 0;
	private boolean displayExceptions = false;
	private int DURATION = 5000;
	private String line = "Test %02d success rate: %.2f after %d trials";
	private String error = "Error on iteration %02d: %s";

	@Before
	public void setUp() {
		successfulTrials = 0;
	}

	@Test
	public void testEnvironment01() {
		String map = "maps/public/map01.txt";

		for (int trial = 0; trial < NUM_TRIALS; trial++) {
			RunSimulation sim = new RunSimulation(map, ITERATIONS);
			try {
				// CompletableFuture will run an iteration's simulation
				// asynchronously for 5000 milliseconds (5 seconds) before timing out.
				// This is to prevent infinite loops or inefficient implementations
				// that are brute forcing solutions.
				Runnable simulation = () -> sim.run();
				CompletableFuture.runAsync(simulation).get(DURATION, TimeUnit.MILLISECONDS);
				if(sim.goalConditionMet()) {
					successfulTrials++;
				}
			} catch (InterruptedException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			} catch (ExecutionException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			} catch (TimeoutException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			}
		}

		String msg = String.format(line, 1, successfulTrials/(NUM_TRIALS*1.0)*100, NUM_TRIALS);
		System.out.println(msg);
		assertTrue(successfulTrials/(NUM_TRIALS*1.0) >= 0.7, msg);
	}

	@Test
	public void testEnvironment02() {
		String map = "maps/public/map02.txt";

		for (int trial = 0; trial < NUM_TRIALS; trial++) {
			RunSimulation sim = new RunSimulation(map, ITERATIONS);
			try {
				// CompletableFuture will run an iteration's simulation
				// asynchronously for 5000 milliseconds (5 seconds) before timing out.
				// This is to prevent infinite loops or inefficient implementations
				// that are brute forcing solutions.
				Runnable simulation = () -> sim.run();
				CompletableFuture.runAsync(simulation).get(DURATION, TimeUnit.MILLISECONDS);
				if(sim.goalConditionMet()) {
					successfulTrials++;
				}
			} catch (InterruptedException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			} catch (ExecutionException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			} catch (TimeoutException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			}
		}

		String msg = String.format(line, 2, successfulTrials/(NUM_TRIALS*1.0)*100, NUM_TRIALS);
		System.out.println(msg);
		assertTrue(successfulTrials/(NUM_TRIALS*1.0) >= 0.7, msg);
	}

	@Test
	public void testEnvironment03() {
		String map = "maps/public/map03.txt";

		for (int trial = 0; trial < NUM_TRIALS; trial++) {
			RunSimulation sim = new RunSimulation(map, ITERATIONS);
			try {
				// CompletableFuture will run an iteration's simulation
				// asynchronously for 5000 milliseconds (5 seconds) before timing out.
				// This is to prevent infinite loops or inefficient implementations
				// that are brute forcing solutions.
				Runnable simulation = () -> sim.run();
				CompletableFuture.runAsync(simulation).get(DURATION, TimeUnit.MILLISECONDS);
				if(sim.goalConditionMet()) {
					successfulTrials++;
				}
			} catch (InterruptedException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			} catch (ExecutionException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			} catch (TimeoutException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			}
		}

		String msg = String.format(line, 3, successfulTrials/(NUM_TRIALS*1.0)*100, NUM_TRIALS);
		System.out.println(msg);
		assertTrue(successfulTrials/(NUM_TRIALS*1.0) >= 0.7, msg);
	}

	@Test
	public void testEnvironment04() {
		String map = "maps/public/map04.txt";

		for (int trial = 0; trial < NUM_TRIALS; trial++) {
			RunSimulation sim = new RunSimulation(map, ITERATIONS);
			try {
				// CompletableFuture will run an iteration's simulation
				// asynchronously for 5000 milliseconds (5 seconds) before timing out.
				// This is to prevent infinite loops or inefficient implementations
				// that are brute forcing solutions.
				Runnable simulation = () -> sim.run();
				CompletableFuture.runAsync(simulation).get(DURATION, TimeUnit.MILLISECONDS);
				if(sim.goalConditionMet()) {
					successfulTrials++;
				}
			} catch (InterruptedException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			} catch (ExecutionException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			} catch (TimeoutException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			}
		}

		String msg = String.format(line, 4, successfulTrials/(NUM_TRIALS*1.0)*100, NUM_TRIALS);
		System.out.println(msg);
		assertTrue(successfulTrials/(NUM_TRIALS*1.0) >= 0.7, msg);
	}

	@Test
	public void testEnvironment05() {
		String map = "maps/public/map05.txt";

		for (int trial = 0; trial < NUM_TRIALS; trial++) {
			RunSimulation sim = new RunSimulation(map, ITERATIONS);
			try {
				// CompletableFuture will run an iteration's simulation
				// asynchronously for 5000 milliseconds (5 seconds) before timing out.
				// This is to prevent infinite loops or inefficient implementations
				// that are brute forcing solutions.
				Runnable simulation = () -> sim.run();
				CompletableFuture.runAsync(simulation).get(DURATION, TimeUnit.MILLISECONDS);
				if(sim.goalConditionMet()) {
					successfulTrials++;
				}
			} catch (InterruptedException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			} catch (ExecutionException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			} catch (TimeoutException e) {
				if (displayExceptions)
					System.out.printf(error, trial, e.getClass());
			}
		}

		String msg = String.format(line, 5, successfulTrials/(NUM_TRIALS*1.0)*100, NUM_TRIALS);
		System.out.println(msg);
		assertTrue(successfulTrials/(NUM_TRIALS*1.0) >= 0.7, msg);
	}
}
