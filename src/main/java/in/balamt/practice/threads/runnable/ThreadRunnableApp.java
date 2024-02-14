package in.balamt.practice.threads.runnable;

public class ThreadRunnableApp {

    public static void main(String[] args) {
        Party p1 = new Party(1L, "ABC");
        Party p2 = new Party(2L, "XYZ");

        VotingRunnable vp1 = new VotingRunnable(p1);
        PollCountRunnable pc1 = new PollCountRunnable(p1);

        VotingRunnable vp2 = new VotingRunnable(p2);
        PollCountRunnable pc2 = new PollCountRunnable(p2);

        Thread tv1 = new Thread(vp1);
        Thread tc1 = new Thread(pc1);

        Thread tv2 = new Thread(vp2);
        Thread tc2 = new Thread(pc2);

        tv1.start();
        tc1.start();

        tv2.start();
        tc2.start();

    }
}
