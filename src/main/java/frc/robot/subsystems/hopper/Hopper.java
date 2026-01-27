package frc.robot.subsystems.hopper;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class Hopper extends SubsystemBase{
    private TalonFX agitatorMotor = new TalonFX(5); // Replace with correct CAN ID
    
    public Command setAgitatorSpeedCommand(double speed) {
      return new InstantCommand(
          () -> {
            agitatorMotor.set(speed);
          },
          this);
    }  
  public void periodic() {

    }
  }


