package patterns.state;

public class VendingMachineStateChoice extends VendingMachineState{
    private static final VendingMachineStateChoice VENDING_MACHINE_STATE_CHOICE = new VendingMachineStateChoice();
    public static VendingMachineStateChoice getInstance(){
        return VENDING_MACHINE_STATE_CHOICE;
    }
    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {

    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("Ok, Coffee");
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("Ok, Tea");
    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        return c.getCash();
    }
}
