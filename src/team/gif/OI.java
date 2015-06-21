package team.gif;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import team.gif.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
        public Joystick leftJoystick = new Joystick(1);
    public Joystick rightJoystick = new Joystick(2);
    
    public Button leftTrigger;
    
    public OI(){
        leftTrigger = new JoystickButton(leftJoystick, 1);
        leftTrigger.whenPressed(new Fire());
    }
}

