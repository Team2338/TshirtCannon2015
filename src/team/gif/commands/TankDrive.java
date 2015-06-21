package team.gif.commands;

import team.gif.*;
/**
 *
 * @oauth Nathan
 */
public class TankDrive extends CommandBase {
    
    public TankDrive() {
        requires(drivetrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (Math.abs(OI.leftStick.getY()) > Globals.deadzone) {
    		drivetrain.driveLeft(OI.leftStick.getY());
    	} else {
    		drivetrain.driveLeft(0);
    	}
    	
    	if (Math.abs(OI.rightStick.getY()) > Globals.deadzone) {
    		drivetrain.driveRight(OI.rightStick.getY());
    	} else {
    		drivetrain.driveRight(0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
