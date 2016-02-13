package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Atomic Gears on 11/9/2015.
 *
 * Whenever I heard Sodium, Bromine and Oxygen were friends again I was like NaBrO
 *
 * Iron Giants 4 lyfe
 */
public class Atomic extends OpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor tapeMotor;
    Servo servo;
    Servo servo2;
    Servo servo3;
    Servo servo4;
    Servo servo5;

    @Override
    public void init() {
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        tapeMotor = hardwareMap.dcMotor.get("tape_drive");
        servo = hardwareMap.servo.get("servo");
        servo2 = hardwareMap.servo.get("servo2");
        servo3 = hardwareMap.servo.get("servo3");
        servo4 = hardwareMap.servo.get("servo4");
        servo5 = hardwareMap.servo.get("servo5");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        tapeMotor.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {

        float leftY = -gamepad1.left_stick_y;
        float rightY = -gamepad1.right_stick_y;


        leftMotor.setPower(rightY);
        rightMotor.setPower(leftY);

        if (gamepad1.a) {
            tapeMotor.setPower(.4);
        } else if (gamepad1.b) {
            tapeMotor.setPower(-.4);
        }
        else {
            tapeMotor.setPower(0);
        }

        if (gamepad1.dpad_up){
            servo4.setPosition(.2);
        }
        if (gamepad1.dpad_down){
            servo4.setPosition(0);
        }
        if (gamepad1.dpad_right){
            servo4.setPosition(.1);
        }
        if (gamepad1.dpad_left){
            servo4.setPosition(.15);
        }
        if (gamepad2.dpad_up) {
            servo2.setPosition(1);
            servo3.setPosition(0);
        }
        if (gamepad2.dpad_down) {
            servo2.setPosition(0);
            servo3.setPosition(1);
        }

        if (gamepad2.x) {
            servo.setPosition(0);
        }

        if (gamepad2.a) {
            servo.setPosition(.5);
            servo5.setPosition(.5);
        }

        if (gamepad2.b) {
            servo5.setPosition(1);
        }

    }
}