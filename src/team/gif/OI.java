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
    public static final Joystick controller = new Joystick(1);
    
    private static Button rightBump;
    
    public OI(){
        rightBump = new JoystickButton(controller, 6);
        rightBump.whenPressed(new Fire());
    }
}
