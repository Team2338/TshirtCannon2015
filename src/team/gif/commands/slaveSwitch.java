/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.gif.commands;

import team.gif.Globals;

/**
 *
 * @author Nathan
 */
public class SlaveSwitch extends CommandBase {
    
    public SlaveSwitch() {
        requires(drivetrain);
        requires(shooter);
    }

    protected void initialize() {
    }
    
    protected void execute() {
        drivetrain.driveLeft(0);
        drivetrain.driveRight(0);
        Globals.slaveOn = !Globals.slaveOn;
        
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
