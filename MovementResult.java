public class MovementResult
{	
	public boolean endpoint;
	public double duration;
	public boolean wall;

	// Keeps track of time travelled using the moveForward() method in RobotRover.java
	public MovementResult(boolean endpoint, boolean wall, double duration)
	{
		this.endpoint = endpoint;
		this.duration = duration;
		this.wall = wall;
	}
}