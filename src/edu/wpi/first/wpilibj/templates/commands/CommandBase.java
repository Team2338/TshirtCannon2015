/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.templates.*;
import edu.wpi.first.wpilibj.templates.subsystems.*;

/**
 *
 * @author Derek Ho
 */
public abstract class CommandBase extends Command {
    
    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static Shooter shooter = new Shooter();

    public static void init() {
        oi = new OI();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
    
}
