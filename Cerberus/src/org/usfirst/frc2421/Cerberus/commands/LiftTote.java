package org.usfirst.frc2421.Cerberus.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2421.Cerberus.Robot;

/**
 *
 */
public class  LiftTote extends Command {

	static boolean isFinished = false;
	
    public LiftTote() {
    	isFinished = false;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.lifter);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	isFinished = false;
    	double speed = Robot.lifter.toteSpeed;
    	Robot.lifter.setToteLifter(speed);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(isFinished)
    		end();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isFinished;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lifter.setToteLifter(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	isFinished = false;
    }
}

