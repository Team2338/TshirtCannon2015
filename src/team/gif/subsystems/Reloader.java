/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.gif.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.*;

/**
 *
 * @author Nathan
 */
public class Reloader extends Subsystem {
    private static final Victor reloader = new Victor(RobotMap.reloadMotor);
    
    public void reload(double speed) {
        reloader.set(speed);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
