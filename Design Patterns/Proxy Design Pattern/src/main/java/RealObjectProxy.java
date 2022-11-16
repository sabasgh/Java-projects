public class RealObjectProxy extends RealObjectImp {
    @Override
    public void doSth() {
        System.out.println("Delegating work on real object");
        super.doSth();
    }
}
