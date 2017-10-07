package main;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.TalonSRX;

public class Robot extends IterativeRobot{
	
	@Override
	public void robotInit() {
		Encoder e1 = new Encoder(0, 1, false);
		Encoder e2 = new Encoder(2, 3, true);
		TalonSRX t1 = new TalonSRX(4);
		TalonSRX t2 = new TalonSRX(5);

	}	
	
	@Override
	public void autonomousInit() {
		
	}	
	
	@Override
	public void autonomousPeriodic() {
		
	}	
	
	@Override
	public void teleopInit() {
		
	}	
	
	@Override
	public void teleopPeriodic() {
		
	}
	
	@Override
	public void disabledInit() {
		
	}
	
	@Override
	public void disabledPeriodic() {
		
	}
	
}
