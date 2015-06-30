package team.gif.commands;

import team.gif.*;

/**
 *
 * @author Derek
 */
public class changeAngle extends CommandBase {
    
    public changeAngle() {
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(Globals.slaveOn){
            if(OI.slave.getRawAxis(3) > Globals.deadzone && OI.slave.getRawAxis(4) > Globals.deadzone){
                shooter.changeAngle(0);
            }else if(OI.slave.getRawAxis(3) > Globals.deadzone){
                shooter.changeAngle(-OI.slave.getRawAxis(3));
            }else if(OI.slave.getRawAxis(4) > Globals.deadzone){
                shooter.changeAngle(OI.slave.getRawAxis(4));
            }else{
                shooter.changeAngle(0);
            }
        }else{
            if(OI.controller.getRawAxis(3) > Globals.deadzone && OI.controller.getRawAxis(4) > Globals.deadzone){
                shooter.changeAngle(0);
            }else if(OI.controller.getRawAxis(3) > Globals.deadzone){
                shooter.changeAngle(-OI.controller.getRawAxis(3));
            }else if(OI.controller.getRawAxis(4) > Globals.deadzone){
                shooter.changeAngle(OI.controller.getRawAxis(4));
            }else{
                shooter.changeAngle(0);
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
