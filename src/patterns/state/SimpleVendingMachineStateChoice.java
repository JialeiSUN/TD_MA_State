package patterns.state;

public class SimpleVendingMachineStateChoice extends SimpleVendingMachineState{
    private static final SimpleVendingMachineStateChoice SIMPLE_VENDING_MACHINE_STATE_CHOICE = new SimpleVendingMachineStateChoice();
    public static SimpleVendingMachineStateChoice getInstance(){
        return SIMPLE_VENDING_MACHINE_STATE_CHOICE;
    }

    @Override
    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException {

    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {
        System.out.println("Ok, coffe");
    }

    @Override
    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {
        System.out.println("Ok, tea");
    }
}
