package goldmine;

public class Counter extends Thread{
    
    private Worker worker1;
    private Worker worker2;
    private Worker worker3;
    private Mine mine;

    
    public Counter(Worker worker1, Worker worker2, Worker worker3, Mine mine) {
        this.worker1 = worker1;
        this.worker2 = worker2;
        this.worker3 = worker3;
        this.mine = mine;
    }
    
    @Override
    public void run() {
        long amountOfGoldMine = 50;
        long amountOfGoldWorker1 = 0;
        long amountOfGoldWorker2 = 0;
        long amountOfGoldWorker3 = 0;
        while(amountOfGoldMine >= 3){
            amountOfGoldMine = mine.getAmountOfGold();
            amountOfGoldWorker1 = worker1.getAmountOfGold();
            amountOfGoldWorker2 = worker2.getAmountOfGold();
            amountOfGoldWorker3 = worker3.getAmountOfGold();
            try{
                Thread.sleep(1000);
                System.out.println(   worker1.getWorkerName() + ": " + amountOfGoldWorker1 + " g; "
                                    + worker2.getWorkerName() + ": " + amountOfGoldWorker2 + " g; "
                                    + worker3.getWorkerName() + ": " + amountOfGoldWorker3 + " g; "
                                    + "left in mine: " + amountOfGoldMine + " g;"
                                  );
            }catch(InterruptedException e){
                System.out.println("Service Error");
            }
        }
    }

}
