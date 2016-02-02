// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2421.DankMemes;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc2421.DankMemes.commands.*;
import org.usfirst.frc2421.DankMemes.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    Command autonomousCommand;
    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DankSubsystem dankSubsystem;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        dankSubsystem = new DankSubsystem();

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();

        // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

        autonomousCommand = new AutonomousCommand();

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        System.out.println("SETTING UP DANK ENCODER");
        double maxPeriod = 0.1;
        RobotMap.dankSubsystemswagEncoder.setMaxPeriod(maxPeriod);
        System.out.println("ENCODER MAX PERIOD: " + maxPeriod);
        
        double minRate = 10;
        RobotMap.dankSubsystemswagEncoder.setMinRate(minRate);
        System.out.println("ENCODER MIN RATE: " + minRate);
        
        double distancePerPulse = 1.0;
        RobotMap.dankSubsystemswagEncoder.setDistancePerPulse(distancePerPulse);
        System.out.println("ENCODER DISTANCE PER PULSE: " + distancePerPulse);
        
        boolean reverseDirection = false;
        RobotMap.dankSubsystemswagEncoder.setReverseDirection(reverseDirection);
        System.out.println("ENCODER REVERSE DIRECTION: " + reverseDirection);
        
        int samplesToAverage = 7;
        RobotMap.dankSubsystemswagEncoder.setSamplesToAverage(samplesToAverage);
        System.out.println("ENCODER SAMPLES TO AVERAGE: " + samplesToAverage);
        
        RobotMap.dankSubsystemswagEncoder.startLiveWindowMode();

        System.out.println("DANK ENCODER SET UP");
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        System.out.println();
        System.out.println("ENCODER COUNT: " + RobotMap.dankSubsystemswagEncoder.get());
        System.out.println("ENCODER DIRECTION: " + RobotMap.dankSubsystemswagEncoder.getDirection());
        System.out.println("ENCODER DISTANCE: " + RobotMap.dankSubsystemswagEncoder.getDistance());
        System.out.println("ENCODER RATE: " + RobotMap.dankSubsystemswagEncoder.getRate());
        System.out.println("ENCODER RAW: " + RobotMap.dankSubsystemswagEncoder.getRaw());
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
