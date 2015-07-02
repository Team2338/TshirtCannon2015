package team.gif.commands;

import edu.wpi.first.wpilibj.command.Command;
import team.gif.OI;
import team.gif.subsystems.*;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Nathan & Derek
 */
public abstract class CommandBase extends Command {

    public static Shooter shooter = new Shooter();
    public static DriveTrain drivetrain = new DriveTrain();
    
    public static OI oi;

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
