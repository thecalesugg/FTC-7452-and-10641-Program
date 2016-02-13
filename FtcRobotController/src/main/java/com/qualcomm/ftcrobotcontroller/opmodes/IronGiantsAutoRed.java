package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Iron Giants on 2/10/2016.
 * Public Relations is the best :)
 * GitHub-ed as of 2-13-16
 * 
 * An proton goes to the doctor
 * "Doctor I think I am sick"
 * "Are you sure?"
 * "I'm positive"
 */
public class IronGiantsAutoRed extends LinearOpMode {

    DcMotor leftdrive;
    DcMotor rightdrive;
    DcMotor armbase;
    DcMotor armextension;

    @Override
    public void runOpMode() throws InterruptedException {
        leftdrive = hardwareMap.dcMotor.get("left_drive");
        rightdrive = hardwareMap.dcMotor.get("right_drive");
        armbase = hardwareMap.dcMotor.get("armbase");
        armextension = hardwareMap.dcMotor.get("armextend");

        rightdrive.setDirection(DcMotor.Direction.REVERSE);
        armbase.setDirection(DcMotor.Direction.REVERSE);

        for (int i = 0; i < 1; i++){

            armbase.setPower(1.0);
            sleep(1500);
            armbase.setPower(0);

            rightdrive.setPower(1.0);
            leftdrive.setPower(1.0);
            sleep(1500);
            rightdrive.setPower(0);
            leftdrive.setPower(0);

            rightdrive.setPower(-1);
            leftdrive.setPower(1);
            sleep(525);
            rightdrive.setPower(0);
            leftdrive.setPower(0);

            rightdrive.setPower(1);
            leftdrive.setPower(1);
            sleep(3350);
            rightdrive.setPower(0);
            leftdrive.setPower(0);

            rightdrive.setPower(-1);
            leftdrive.setPower(1);
            sleep(350);
            rightdrive.setPower(0);
            leftdrive.setPower(0);

            rightdrive.setPower(1);
            leftdrive.setPower(1);
            sleep(600);
            rightdrive.setPower(0);
            leftdrive.setPower(0);

            armextension.setPower(1);
            sleep(500);
            armextension.setPower(0);
            armbase.setPower(1);
            sleep(6000);
            armbase.setPower(0);
        }
    }
}


