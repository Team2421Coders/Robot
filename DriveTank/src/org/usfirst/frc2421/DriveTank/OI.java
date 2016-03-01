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

import org.usfirst.frc2421.DriveTank.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc2421.DriveTank.subsystems.*;
import org.usfirst.frc2421.DriveTank.commands.ballIn;
import org.usfirst.frc2421.DriveTank.commands.ballOut;
import org.usfirst.frc2421.DriveTank.commands.breachDown;
import org.usfirst.frc2421.DriveTank.commands.breachUp;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static Joystick stickDrive;
    public static Joystick stickOther;
    JoystickButton outBtn;
    JoystickButton inBtn;
    JoystickButton solReverse;
    JoystickButton solOff;
    JoystickButton solForward;
    JoystickButton cdfOpen;
    JoystickButton cdfClose;
    JoystickButton upArm;
    JoystickButton downArm;

    public OI() {
    	/**Drive - Joystick 0
    	 * 
    	 * Ball Intake:
    	 * Launch Ball - Joystick 1 button 1
    	 * Bring in - Joystick 1 button 2
    	 * 
    	 * Pneumatics:
    	 * Solenoid Toggle - Joystick 1 button 8
    	 * Solenoid stop - Joystick 1 button 9
    	 * 
    	 * CDF(Cheval de Frise) Actuator:
    	 * Open? - Joystick 0 button 1
    	 * Close? - Joystick 0 button 2
    	 */
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	
        stickDrive = new Joystick(0);
        stickOther = new Joystick(1);
        
        //ball intake
        outBtn = new JoystickButton(stickOther, 1);
        outBtn.whileHeld(new ballOut());
        inBtn = new JoystickButton(stickOther, 2);
        inBtn.whileHeld(new ballIn());
        
        //pneumatics
        solReverse = new JoystickButton(stickOther, 8);
        solReverse.whenPressed(new SolenoidToggle());
        solOff = new JoystickButton(stickOther, 9);
        solOff.whenPressed(new SolenoidOff());
        
        //arm window motor
        upArm = new JoystickButton(stickOther, 4);
        upArm.whileHeld(new armUp());
        downArm = new JoystickButton(stickOther, 5);
        downArm.whileHeld(new armDown());
        
        //CDF
        cdfOpen = new JoystickButton(stickDrive, 1);
        cdfOpen.whileHeld(new breachDown());
        cdfClose = new JoystickButton(stickDrive, 2);
        cdfClose.whileHeld(new breachUp());
        
        
        // SmartDashboard Buttons
       // SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        //SmartDashboard.putData("Drive", new Drive());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getStickDrive() {
        return stickDrive;
    }
    
    public Joystick getStickOther() {
    	return stickOther;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

