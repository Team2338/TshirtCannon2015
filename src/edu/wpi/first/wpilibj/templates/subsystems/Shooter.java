/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.templates.*;

/**
 *
 * @author Derek Ho
 */

public class Shooter extends Subsystem {
    
    private static final Victor shooter = new Victor(RobotMap.shooter);
    
    public void reload(double speed) {
        shooter.set(speed);
    }

    public void initDefaultCommand() {
        
    }
}
