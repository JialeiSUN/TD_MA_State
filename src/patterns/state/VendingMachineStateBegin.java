package patterns.state;

public class VendingMachineStateBegin extends VendingMachineState{
    private static final VendingMachineStateBegin VENDING_MACHINE_STATE_BEGIN = new VendingMachineStateBegin();
    public static VendingMachineStateBegin getInstance(){
        return VENDING_MACHINE_STATE_BEGIN;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        c.setCash(money);
    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        if(c.getCash()<10){
            System.out.println("Pas possible");
        }
        if(c.getCash()>=10){
            c.setCash(c.getCash()-10);
        c.setState(VendingMachineStateChoice.getInstance());
        }
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        if(c.getCash()<10){
            System.out.println("Pas possible");
        }
        if(c.getCash()>=10){
            c.setCash(c.getCash()-10);
        c.setState(VendingMachineStateChoice.getInstance());
        }
    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
       return c.getCash();
    }
}
