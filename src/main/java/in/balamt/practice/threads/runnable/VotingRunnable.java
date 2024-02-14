package in.balamt.practice.threads.runnable;

import in.balamt.practice.util.JavaPracticeUtils;

public class VotingRunnable implements Runnable {

    private Party p;
    protected boolean doStop = false;

    public VotingRunnable(Party p){
        this.p = p;
    }

    @Override
    public void run() {
        JavaPracticeUtils.print("Voting Started for " + p.getPartyName());
    }
}
