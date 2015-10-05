package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.commands.ReportAccel;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Accel extends Subsystem {
    private BuiltInAccelerometer accel;
    
    public Accel()
    {
    	accel = new BuiltInAccelerometer();
    }

    public void initDefaultCommand() {
        setDefaultCommand(new ReportAccel());
    }
    
    public double valueX()
    {
    	return accel.getX();
    }
    
    public double valueY()
    {
    	return accel.getY();
    }
    
    public double valueZ()
    {
    	return accel.getZ();
    }
}

