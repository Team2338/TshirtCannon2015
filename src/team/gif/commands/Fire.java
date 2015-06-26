package team.gif.commands;

import team.gif.*;
/**
 *
 * @author Nathan
 */
public class Fire extends CommandBase {
    boolean slave;
    public Fire(boolean slave) {
        requires(shooter);
        this.slave = slave;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(slave = Globals.slaveOn){
            shooter.fire();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
