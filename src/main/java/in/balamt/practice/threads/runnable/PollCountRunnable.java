package in.balamt.practice.threads.runnable;

import in.balamt.practice.util.JavaPracticeUtils;

public class PollCountRunnable implements Runnable {

    private Party p;
    boolean doStop = false;

    public PollCountRunnable(Party p) {
        this.p = p;
    }



    @Override
    public void run() {
        JavaPracticeUtils.print("Counting for Party Name " + p.getPartyName());
        p.getVotes().add(1L);
        JavaPracticeUtils.print("Votes so far for Party " + p.getPartyName() + " is " + p.getVotes().size());
    }
}
