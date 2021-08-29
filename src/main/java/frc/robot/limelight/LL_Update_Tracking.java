// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.limelight;

import edu.wpi.first.networktables.NetworkTableInstance;

/** Add your docs here. */
public class LL_Update_Tracking {

    public static void Tracking() {

         // These numbers must be tuned for your Robot!  Be careful!
         final double STEER_K = 0.03;                    // how hard to turn toward the target
         final double DRIVE_K = 0.26;                    // how hard to drive fwd toward the target
         final double DESIRED_TARGET_AREA = 13.0;        // Area of the target when the robot reaches the wall
         final double MAX_DRIVE = 0.7;                   // Simple speed limit so we don't drive too fast
 
         double tv = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tv").getDouble(0);
         double tx = NetworkTableInstance.getDefault().getTable("limelight").getEntry("tx").getDouble(0);
         //double ty = NetworkTableInstance.getDefault().getTable("limelight").getEntry("ty").getDouble(0);
         double ta = NetworkTableInstance.getDefault().getTable("limelight").getEntry("ta").getDouble(0);
 
         if (tv < 1.0)
         {
           LLmain.m_LimelightHasValidTarget = false;
           LLmain.m_LimelightDriveCommand = 0.0;
           LLmain.m_LimelightSteerCommand = 0.0;
           return;
         }
 
         LLmain.m_LimelightHasValidTarget = true;
 
         // Start with proportional steering
         double steer_cmd = tx * STEER_K;
         LLmain.m_LimelightSteerCommand = steer_cmd;
 
         // try to drive forward until the target area reaches our desired area
         double drive_cmd = (DESIRED_TARGET_AREA - ta) * DRIVE_K;
 
         // don't let the robot drive too fast into the goal
         if (drive_cmd > MAX_DRIVE)
         {
           drive_cmd = MAX_DRIVE;
         }
         LLmain.m_LimelightDriveCommand = drive_cmd;
        
    }




}

