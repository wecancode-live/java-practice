package in.balamt.practice.designpattern.behavioral.strategy.foa;

import in.balamt.practice.designpattern.behavioral.strategy.behavior.SaveBehavior;
import in.balamt.practice.util.JavaPracticeUtils;

public class SaveInInternalMemory implements SaveBehavior {
    @Override
    public void save() {
        JavaPracticeUtils.printLine("Saving photo in Internal Memory");
    }
}
