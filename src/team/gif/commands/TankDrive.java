package team.gif.commands;

import team.gif.*;
/**
 *
 * @oauth Nathan
 */
public class TankDrive extends CommandBase {
    
    public TankDrive() {
        requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(Globals.slaveOn){
            if (Math.abs(OI.slave.getRawAxis(2)) > Globals.deadzone) {
                    drivetrain.driveLeft(OI.slave.getRawAxis(2));
            } else {
                    drivetrain.driveLeft(0);
            }

            if (Math.abs(OI.slave.getRawAxis(6)) > Globals.deadzone) {
                    drivetrain.driveRight(OI.slave.getRawAxis(6));
            } else {
                    drivetrain.driveRight(0);
            }
        }else{
            if (Math.abs(OI.controller.getRawAxis(2)) > Globals.deadzone) {
                    drivetrain.driveLeft(OI.controller.getRawAxis(2));
            } else {
                    drivetrain.driveLeft(0);
            }

            if (Math.abs(OI.controller.getRawAxis(6)) > Globals.deadzone) {
                    drivetrain.driveRight(OI.controller.getRawAxis(6));
            } else {
                    drivetrain.driveRight(0);
            }
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
