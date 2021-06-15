package goldmine;

public class GoldMining {
    public static void main(String[] args) throws InterruptedException {
        Mine mine = new Mine();
            Worker worker1 = new Worker("Worker1", mine);
            Worker worker2 = new Worker("Worker2", mine);
            Worker worker3 = new Worker("Worker3", mine);
            worker1.start();
            worker2.start();
            worker3.start();
        Counter counter = new Counter(worker1, worker2, worker3, mine);
        counter.start();
    }
}