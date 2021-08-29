// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.limelight;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/** Add your docs here. */
public class LLmain {

  //Limelight Stud
  public static final String kDefaultAuto = "Default";
  public static final String kCustomAuto = "My Auto";

  public final static SendableChooser<String> m_chooser = new SendableChooser<>();


  public static boolean m_LimelightHasValidTarget = false;
  public static double m_LimelightDriveCommand = 0.0;
  public static double m_LimelightSteerCommand = 0.0;
  //End Limelight Stud Methods

  public void LL_Data(){

        //Limelight Studdddd

        m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
        m_chooser.addOption("My Auto", kCustomAuto);
        SmartDashboard.putData("Auto choices", m_chooser);
     
        //End Limelight Studdddddddd


  }
    

}
