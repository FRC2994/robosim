package frc.robot;


public class TimedRoboSim {
	// the period at which the robot implementations are called
	public static final double kDefaultPeriod = 1.0;
	private double m_period;

	/**
	 * Constructor for TimedRobot.
	 */
	protected TimedRoboSim() {
		this(kDefaultPeriod);
	}

	/**
	 * Constructor for TimedRoboSim.
	 *
	 * @param period Period in seconds.
	 */
	protected TimedRoboSim(double period) {
		this.m_period = period;
	}

	public void startCompetition() {
		this.robotInit();
		this.autonomousInit();

		this.run_auto_loop();
	}

	private void run_auto_loop() {
		boolean should_cancel = false;

		while (!should_cancel) {
			this.autonomousPeriodic();

			try {
				Thread.sleep((long)this.m_period);
			} catch(InterruptedException e) {
				System.out.println("got interrupted!");
			}
		}
	}

	/**
   * Robot-wide initialization code should go here.
   *
   * <p>Users should override this method for default Robot-wide initialization which will be called
   * when the robot is first powered on. It will be called exactly one time.
   *
   * <p>Warning: the Driver Station "Robot Code" light and FMS "Robot Ready" indicators will be off
   * until RobotInit() exits. Code in RobotInit() that waits for enable will cause the robot to
   * never indicate that the code is ready, causing the robot to be bypassed in a match.
   */
	public void robotInit() {
		System.out.println("Default robotInit() method... Override me!");
	}

	/**
	 * Initialization code for autonomous mode should go here.
	 *
	 * <p>Users should override this method for initialization code which will be called each time the
	 * robot enters autonomous mode.
	 */
	public void autonomousInit() {
		System.out.println("Default autonomousInit() method... Override me!");
	}

	/**
	 * Override me to be called during autonomous operation!
	 */
	public void autonomousPeriodic() {
		System.out.println("Default autonomousPeriodic() method... Override me!");
	}

	/**
	 * Initialization code for teleop mode should go here.
	 *
	 * <p>Users should override this method for initialization code which will be called each time the
	 * robot enters teleop mode.
	 */
	public void teleopInit() {
		System.out.println("Default teleopInit() method... Override me!");
	}

	/**
	 * This function is called periodically during operator control.
	 */
	public void teleopPeriodic() { 
		System.out.println("Default teleopPeriodic() method... Override me!");
	}
}