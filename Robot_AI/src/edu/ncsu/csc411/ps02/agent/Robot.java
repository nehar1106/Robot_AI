package edu.ncsu.csc411.ps02.agent;

import java.util.Map;

import edu.ncsu.csc411.ps02.environment.Tile;
import edu.ncsu.csc411.ps02.environment.Action;
import edu.ncsu.csc411.ps02.environment.Environment;
import edu.ncsu.csc411.ps02.environment.Position;

/**
	Represents an intelligent agent moving through a particular room.	
	The robot only has two sensors - the ability to retrieve the 
	the status of all its neighboring tiles, including itself, and the
	ability to retrieve to location of the TARGET tile.
	
	Your task is to modify the getAction method below so that it reaches
	TARGET with a minimal number of steps.
*/

public class Robot {
	private Environment env;
	
	/** Initializes a Robot on a specific tile in the environment. */
	public Robot (Environment env) { this.env = env; }
	
	/**
    Problem Set 02 - Modify the getAction method below in order to simulate
    the passage of a single time-step. At each time-step, the Robot decides
    which tile to move to.
    
    Your task for this Problem Set is to modify the method below such that
    the Robot agent is able to reach the TARGET tile on a given Environment. 
    5 out of the 10 graded test cases, with explanations on how to create new
    Environments, are available under the test package.
    
    This method should return a single Action from the Action class.
    	- Action.DO_NOTHING
    	- Action.MOVE_UP
    	- Action.MOVE_DOWN
    	- Action.MOVE_LEFT
    	- Action.MOVE_RIGHT
	 */

	/**
		Replace this docstring comment with an explanation of your implementation.
	 */
	public Action getAction () {
		// This example code demonstrates the available methods and actions,
		// such as retrieving its senses (neighbor positions), getting the status of
		// those tiles, and returning the different available Actions
		
		Position selfPos = env.getRobotPosition(this);
		// For this problem set, the Environment class allows for complete
		// observability. You are able to find all neighbor positions for 
		// any given Position object by passing a Position object to
		// getNeighborPositions
		Map<String, Position> neighbors = env.getNeighborPositions(selfPos);
		Position abovePos = neighbors.get("above"); // Either a Tile or null
		Position belowPos = neighbors.get("below"); // Either a Tile or null
		Position leftPos = neighbors.get("left");   // Either a Tile or null
		Position rightPos = neighbors.get("right"); // Either a Tile or null
		
		// You are able to get their tile using the getTiles method
		Map<Position, Tile> positions = env.getTiles();
		Tile selfTile = positions.get(selfPos);
		
		// The Environment now has a getTarget() method which will return
		// the Position of the Target node.
		Position targetPos = env.getTarget();
		
		// The Position class has also been updated to include an equals method
		if (selfPos.equals(targetPos)) {
			return Action.DO_NOTHING;
		} else {
			// You are STRONGLY encouraged to design a search tree.
			// NOTE: There are Java.util implementations for many of the data
			// structures taught in 316. You should create Nodes and utilize
			// these data structures.
			return Action.DO_NOTHING;
		}
	}
}