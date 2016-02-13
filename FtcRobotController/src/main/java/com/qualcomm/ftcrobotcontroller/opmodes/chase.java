package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
/**
 * Created by FirstUser_2 on 2/9/2016.
 */
public class chase extends LinearOpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;

    @Override
    public void runOpMode() throws InterruptedException {

        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");


        rightMotor.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        for (int i = 0; i < 1; i++) {

            leftMotor.setPower(1);
            rightMotor.setPower(1);

            sleep(1500);
        }
    }
}

