public class Scanner implements IMachine{
    @Override
    public void print() {
        throw new UnsupportedOperationException("Scanner can't print");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Scanner can't fax");
    }
}
