package in.balamt.practice.designpattern.behavioral.strategy;

import in.balamt.practice.designpattern.behavioral.strategy.foa.ShareBySocialMedia;

public class StrategyApp {

    public static void main(String[] args) {
        PhoneCameraApp cameraApp1 = new BasicCameraApp();

        cameraApp1.take();
        cameraApp1.performSave();
        cameraApp1.performShare();

        PhoneCameraApp cameraApp2 = new CameraPlusApp();
        cameraApp2.take();
        cameraApp2.performSave();
        cameraApp2.performShare();

        PhoneCameraApp cameraApp3 = new CameraPlusApp(new ShareBySocialMedia());
        cameraApp3.take();
        cameraApp3.performSave();
        cameraApp3.performShare();

    }
}
