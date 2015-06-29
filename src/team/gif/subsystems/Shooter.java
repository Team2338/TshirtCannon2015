package team.gif.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;
import team.gif.*;
import team.gif.commands.shooterDefault;

/**
 *
 * @authors Nathan & Derek
 */

public class Shooter extends Subsystem {
    
    private static final Victor angleMotor = new Victor(RobotMap.angleMotor);
    private static final DigitalOutput barrel1 = new DigitalOutput(RobotMap.barrel1);
    private static final DigitalOutput barrel2 = new DigitalOutput(RobotMap.barrel2);
    private static final DigitalOutput barrel3 = new DigitalOutput(RobotMap.barrel3);
    DigitalInput minAngle = new DigitalInput(RobotMap.minAngle);
    DigitalInput maxAngle = new DigitalInput(RobotMap.maxAngle);
    
    public void fire(){
        switch(Globals.barrelNum){
            case 1:
                barrel1.set(true);
                barrel2.set(false);
                barrel3.set(false);
                Globals.barrelNum = 2;
                break;
            case 2:
                barrel1.set(false);
                barrel2.set(true);
                barrel3.set(false);
                Globals.barrelNum = 3;
                break;
            case 3:
                barrel1.set(false);
                barrel2.set(false);
                barrel3.set(true);
                Globals.barrelNum = 1;
                break;
        }
    }
    
    public void changeAngle(double speed){
        if(maxAngle.get() && speed > 0){
            angleMotor.set(0);
        }else{
            angleMotor.set(speed);
        }
            
        if(minAngle.get() && speed < 0){
            angleMotor.set(0);
        }else{
            angleMotor.set(speed);
      }
    }
    public void shooterDefault(){
        barrel1.set(false);
        barrel2.set(false);
        barrel3.set(false);
        angleMotor.set(0);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new shooterDefault());
    }
}
