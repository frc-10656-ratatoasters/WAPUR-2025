package frc.robot.subsystems.drive.limelight;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.LimelightHelpers;

public class limelight {

  public static void periodic() {
   // String IdsOne = "";
  //  String IdsTwo = "";
   System.out.println("Limelight Periodic Ran");
    LimelightHelpers.RawFiducial[] fiducialsOne = LimelightHelpers.getRawFiducials("limelight-one");
    //LimelightHelpers.RawFiducial[] fiducialsTwo = LimelightHelpers.getRawFiducials("limelight-two");
/*     for (LimelightHelpers.RawFiducial f : fiducialsOne) {
     IdsOne = IdsOne + " " + f.id;
    }
     for (LimelightHelpers.RawFiducial f : fiducialsTwo) {
      IdsTwo = IdsTwo + " " + f.id;
    }
    SmartDashboard.putString("Ids", IdsOne + IdsTwo);
*/
    
  }
   
}
