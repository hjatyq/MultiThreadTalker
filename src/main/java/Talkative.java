public class Talkative implements Runnable{

    private int nb;

    public Talkative(int nb) {
        this.nb = nb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+ " :"+" Thread "+nb);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Talkative talker = new Talkative(i);
            new Thread(talker).start();
        }
    }
}
