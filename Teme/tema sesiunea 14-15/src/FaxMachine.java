import Interfaces.IFax;

public class FaxMachine implements IFax {
    @Override
    public void fax() {
        System.out.println("Faxing...");
    }
}
