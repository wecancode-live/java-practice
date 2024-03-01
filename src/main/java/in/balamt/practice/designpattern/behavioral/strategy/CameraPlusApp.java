package in.balamt.practice.designpattern.behavioral.strategy;

import in.balamt.practice.designpattern.behavioral.strategy.behavior.ShareBehavior;
import in.balamt.practice.designpattern.behavioral.strategy.foa.SaveInExternalMemory;
import in.balamt.practice.designpattern.behavioral.strategy.foa.ShareByEmail;
import in.balamt.practice.util.JavaPracticeUtils;

public class CameraPlusApp extends PhoneCameraApp {

    public CameraPlusApp(){
        saveBehavior = new SaveInExternalMemory();
        shareBehavior = new ShareByEmail();
    }

    public CameraPlusApp(ShareBehavior shareBehavior1){
        shareBehavior = shareBehavior1;
        saveBehavior = new SaveInExternalMemory();
    }

    @Override
    void edit() {
        JavaPracticeUtils.printLine("CameraPlus App Editing photo");
    }
}
