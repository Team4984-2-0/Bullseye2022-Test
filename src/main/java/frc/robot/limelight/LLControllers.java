// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.limelight;

import frc.robot.Constants;
import frc.robot.RobotContainer;

/** Add your docs here. */
public class LLControllers {

    public void controllers(){

        double steer = RobotContainer.driverJoystickRight.getX();
        double drive = -RobotContainer.driverJoystickRight.getY();
        boolean auto = RobotContainer.driverJoystickLeft.getRawButton(Constants.DRIVER_AUTO_BUTTON);

        steer *= 0.70;
        drive *= 0.70;

        if (auto)
        {
        if (LLmain.m_LimelightHasValidTarget)
        {
            LLdriveControl.m_Drive.arcadeDrive(LLmain.m_LimelightDriveCommand, LLmain.m_LimelightSteerCommand);
        }
        else
        {
            LLdriveControl.m_Drive.arcadeDrive(0.0, 0.0);
        }
        }
        else
        {
            LLdriveControl.m_Drive.arcadeDrive(drive, steer);
        }
        
    }

}