package in.balamt.practice.designpattern.behavioral.strategy;

import in.balamt.practice.designpattern.behavioral.strategy.behavior.SaveBehavior;
import in.balamt.practice.designpattern.behavioral.strategy.foa.SaveInInternalMemory;
import in.balamt.practice.designpattern.behavioral.strategy.foa.ShareByText;
import in.balamt.practice.util.JavaPracticeUtils;

public class BasicCameraApp extends PhoneCameraApp {

    public BasicCameraApp(){
        shareBehavior = new ShareByText();
        saveBehavior = new SaveInInternalMemory();
    }

    @Override
    void edit() {
        JavaPracticeUtils.printLine("Basic Camera App Editing Photo");
    }
}
