// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2421.DriveTank;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveleftMotor;
    public static CANTalon driverightMotor;
    public static CANTalon driveleftMotor2;
    public static CANTalon driverightMotor2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveleftMotor = new CANTalon(2);
        LiveWindow.addActuator("Drive", "leftMotor", driveleftMotor);
        
        driverightMotor = new CANTalon(1);
        LiveWindow.addActuator("Drive", "rightMotor", driverightMotor);
        
        driveleftMotor2 = new CANTalon(4);
        LiveWindow.addActuator("Drive", "leftMotor2", driveleftMotor2);
        
        driverightMotor2 = new CANTalon(3);
        LiveWindow.addActuator("Drive", "rightMotor2", driverightMotor2);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
