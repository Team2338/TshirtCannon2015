//UNUSED

package team.gif.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import team.gif.*;

/**
 *
 * @author Nathan & Derek
 */
public class Reloader extends Subsystem {
    private static final Victor reloader = new Victor(RobotMap.reloadMotor);
    DigitalInput leftEnd = new DigitalInput(RobotMap.leftEnd);
    DigitalInput rightEnd = new DigitalInput(RobotMap.rightEnd);
    DigitalInput slowDown = new DigitalInput(RobotMap.slowDown);
    DigitalInput lock = new DigitalInput(RobotMap.lock);
    
   public void reload (double speed) {
       //To do
    }

    public void initDefaultCommand() {
        
    }
}
