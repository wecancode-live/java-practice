package in.balamt.practice.designpattern.behavioral.strategy;

import in.balamt.practice.designpattern.behavioral.strategy.behavior.SaveBehavior;
import in.balamt.practice.designpattern.behavioral.strategy.behavior.ShareBehavior;
import in.balamt.practice.util.JavaPracticeUtils;

public abstract class PhoneCameraApp {

    SaveBehavior saveBehavior;
    ShareBehavior shareBehavior;
    PhoneCameraApp() {
    }

    public void performShare(){
        shareBehavior.share();
    }

    public void performSave(){
        saveBehavior.save();
    }

    abstract void edit();

    public void take() {
        JavaPracticeUtils.printLine("Taking photo");
    }

}
