package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Atomic Gears on 2/3/2016.
 *
 * Which came first the chicken or the egg?
 *
 */
public class left extends LinearOpMode {


    DcMotor leftMotor;
    DcMotor rightMotor;
    Servo servo;
    Servo servo2;
    Servo servo3;
    Servo servo5;

    @Override
    public void runOpMode () throws InterruptedException {

        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        servo = hardwareMap.servo.get("servo");
        servo2 = hardwareMap.servo.get("servo2");
        servo3 = hardwareMap.servo.get("servo3");
        servo5 = hardwareMap.servo.get("servo5");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        for (int i = 0; i < 1; i++) {
            sleep(15000);

            leftMotor.setPower(1.0);
            rightMotor.setPower(1.0);
            servo.setPosition(.5);
            servo2.setPosition(0);
            servo3.setPosition(1);
            servo5.setPosition(0);
            sleep(3800);

            leftMotor.setPower(1.0);
            rightMotor.setPower(-1.0);
            sleep(800);

            leftMotor.setPower(1);
            rightMotor.setPower(1);
            sleep(3500);

            servo2.setPosition(0);
            sleep(500);

            leftMotor.setPower(0);
            rightMotor.setPower(0);
            sleep(65);



        }


    }
}
