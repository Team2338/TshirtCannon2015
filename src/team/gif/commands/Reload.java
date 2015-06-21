package team.gif.commands;

import edu.wpi.first.wpilibj.templates.*;
import team.gif.subsystems.Reloader;

/**
 *
 * @oauth Derek Ho
 */
public class Reload extends CommandBase {
    
    public Reload() {
        requires(reloader);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        reloader.reload(Globals.reloadSpeed);
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
