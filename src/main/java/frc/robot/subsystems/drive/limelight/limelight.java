package frc.robot.subsystems.drive.limelight;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.LimelightHelpers;

public class limelight {

  public static void periodic() {
    String Ids = "";

    LimelightHelpers.RawFiducial[] fiducials = LimelightHelpers.getRawFiducials("");

    for (LimelightHelpers.RawFiducial f : fiducials) {
      Ids = Ids + " " + f.id;
    }
    SmartDashboard.putString("IdList", Ids);
  }
}
