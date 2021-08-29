// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.limelight;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.subsystems.DriveTrain;

/** Add your docs here. */
public class LLdriveControl {

    //Limelight Speed Controller
    public static SpeedControllerGroup m_LeftMotors = new SpeedControllerGroup(DriveTrain.leftBackDriveMotor,
            DriveTrain.leftFrontDriveMotor);
    public static SpeedControllerGroup m_RightMotors = new SpeedControllerGroup(DriveTrain.rightBackDriveMotor,
            DriveTrain.rightFrontDriveMotor);

    public static DifferentialDrive m_Drive = new DifferentialDrive(m_LeftMotors, m_RightMotors);
    //END limelight speed controller

}
