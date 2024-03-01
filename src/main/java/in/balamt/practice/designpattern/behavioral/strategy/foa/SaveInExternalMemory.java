package in.balamt.practice.designpattern.behavioral.strategy.foa;

import in.balamt.practice.designpattern.behavioral.strategy.behavior.SaveBehavior;
import in.balamt.practice.util.JavaPracticeUtils;

public class SaveInExternalMemory implements SaveBehavior {
    @Override
    public void save() {
        JavaPracticeUtils.printLine("Saving photo in External Memory");
    }
}
