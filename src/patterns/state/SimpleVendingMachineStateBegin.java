package patterns.state;

public class SimpleVendingMachineStateBegin extends SimpleVendingMachineState{
    private static final SimpleVendingMachineStateBegin SIMPLE_VENDING_MACHINE_STATE_BEGIN = new SimpleVendingMachineStateBegin();
    private int cash;
    public static SimpleVendingMachineStateBegin getInstance(){
        return SIMPLE_VENDING_MACHINE_STATE_BEGIN;
    }

    @Override
    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException {
        this.cash = money;
    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {
        if(this.cash<10) System.out.println("Pas possible");
        if(this.cash>=10) c.setState(SimpleVendingMachineStateChoice.getInstance());
    }

    @Override
    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {
        if(this.cash<10) System.out.println("Pas possible");
        if(this.cash>=10) c.setState(SimpleVendingMachineStateChoice.getInstance());
    }
}
