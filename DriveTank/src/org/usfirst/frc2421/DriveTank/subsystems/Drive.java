// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2421.DriveTank.subsystems;

import org.usfirst.frc2421.DriveTank.RobotMap;
import org.usfirst.frc2421.DriveTank.commands.*;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drive extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private static final CANTalon leftMotor = RobotMap.driveleftMotor;
    private static final CANTalon rightMotor = RobotMap.driverightMotor;
    private static final CANTalon leftMotor2 = RobotMap.driveleftMotor2;
    private static final CANTalon rightMotor2 = RobotMap.driverightMotor2;

     // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private static final Spark breachMotor = RobotMap.breachMotor;
    public static AnalogInput ultrasonic = new AnalogInput(0);
    static double speedMult = .75;
	public static double breachSpeed = .5;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new driveCommand());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public static void setLeft(double x){
    	leftMotor.set(x*speedMult);
    	leftMotor2.set(x*speedMult);
    }
    public static void setRight(double x){
    	rightMotor.set(-x*speedMult);
    	rightMotor2.set(-x*speedMult);
    }
    public static void setBreach(double x){
    	breachMotor.set(x);
    }
}

