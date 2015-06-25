package team.gif.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;
import team.gif.*;

/**
 *
 * @author Nathan & Derek
 */

public class Shooter extends Subsystem {
    
    private static final Victor angleMotor = new Victor(RobotMap.angleMotor);
    private static final Solenoid shootTop = new Solenoid(RobotMap.shootTop);
    private static final Solenoid shootBottom = new Solenoid(RobotMap.shootBottom);
    DigitalInput minAngle = new DigitalInput(RobotMap.minAngle);
    DigitalInput maxAngle = new DigitalInput(RobotMap.maxAngle);
    
    public void fire(){
        if(Globals.shootTop){
            shootTop.set(true);
        }else{
            shootBottom.set(true);
        }
        Globals.shootTop = !Globals.shootTop;
        Globals.shotCount++;
    }
    
    public void changeAngle(double speed){
        // Minimum and maximum for angleMotor
        if (maxAngle.get() && speed > 0){
            angleMotor.set(0);
        } else {
            angleMotor.set(speed);
        }
            
        if (minAngle.get() && speed < 0) {
            angleMotor.set(0);
        } else {
            angleMotor.set(speed);
      }
    }
    
    public void initDefaultCommand() {
        
    }
}
