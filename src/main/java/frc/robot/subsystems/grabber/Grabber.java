// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.grabber;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Grabber extends SubsystemBase {
  /** Creates a new Grabber. */
  private TalonFX grabberMotorOne = new TalonFX(); //insert can id here
  private TalonFX grabberMotorTwo = new TalonFX(); //insert can id here


  public Grabber() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setIntakeSpeed(int speed){
    grabberMotorOne.Set(speed);
    grabberMotorTwo.Set(-speed);//may have to reverse
  }
}
