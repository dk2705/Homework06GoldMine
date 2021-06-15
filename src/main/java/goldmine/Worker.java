package goldmine;

public class Worker extends Thread {
    
    private String name;
    private Mine mine;
    private int amountOfGold = 0;
    
    public Worker(String name, Mine mine) {
        this.name = name;
        this.mine = mine;
    }
    
    public int getAmountOfGold(){
        return this.amountOfGold;
    }

    public synchronized void increaseAmountOfGold(int amountOfGold){
        this.amountOfGold += amountOfGold;
    }

    public String getWorkerName(){
        return this.name;
    }
    
    @Override
    public void run() {
        while(mine.getAmountOfGold() >= 3){
            try{
               mine.getPortionOfGold(this);
               Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println("Service Error");
            }
        }
    }
}