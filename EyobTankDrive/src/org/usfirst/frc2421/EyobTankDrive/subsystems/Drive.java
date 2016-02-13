// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2421.EyobTankDrive.subsystems;

import org.usfirst.frc2421.EyobTankDrive.RobotMap;
import org.usfirst.frc2421.EyobTankDrive.commands.*;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drive extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftMotor = RobotMap.driveleftMotor1;
    private final SpeedController rightMotor = RobotMap.driverightMotor1;
    private final SpeedController leftMotor2 = RobotMap.driveleftMotor2;
    private final SpeedController rightMotor2 = RobotMap.driverightMotor2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void setLeftSpeed(double speed){
    	if(speed > 1)
    		speed = 1;
    	else if (speed < -1)
    		speed = -1;
    	leftMotor.set(speed);
    	leftMotor2.set(speed);
    }
    
    public void setRightSpeed(double speed){
    	if(speed > 1)
    		speed = 1;
    	else if (speed < -1)
    		speed = -1;
    	rightMotor.set(speed);
    	rightMotor2.set(speed);
    }

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
}

