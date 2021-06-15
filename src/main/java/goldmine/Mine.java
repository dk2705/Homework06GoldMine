package goldmine;

public class Mine {
    
    private int amountOfGold = 50; //1000 - to long
    
    public synchronized void getPortionOfGold(Worker worker) throws InterruptedException {
        Thread.sleep(1000);
        amountOfGold -= 3;
        worker.increaseAmountOfGold(3);
    }
    
    public synchronized long getAmountOfGold() {
        return amountOfGold;
    }
}