package in.balamt.practice.designpattern.behavioral.strategy.foa;

import in.balamt.practice.designpattern.behavioral.strategy.behavior.ShareBehavior;
import in.balamt.practice.util.JavaPracticeUtils;

public class ShareByText implements ShareBehavior {
    @Override
    public void share() {
        JavaPracticeUtils.printLine("Sharing photo via Text");
    }
}
