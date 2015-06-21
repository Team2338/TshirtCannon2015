package team.gif.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.commands.*;
import team.gif.*;

/**
 *
 * @oauth Nathan
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
private static final Victor frontLeft = new Victor(RobotMap.leftMotor);
    private static final Victor frontRight = new Victor(RobotMap.rightMotor);
    
    public void driveLeft(double speed) {
        frontLeft.set(-speed);
    }
    
    public void driveRight(double speed) {
        frontRight.set(speed);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new TankDrive());
    }

}
