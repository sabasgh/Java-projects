public interface RealObject {
    // In given example, we have a RealObject which client need to access to do something. It will ask the framework to provide an instance of RealObject. But as the access to this object needs to be guarded, framework returns the reference to RealObjectProxy.
    public void doSth();
}
