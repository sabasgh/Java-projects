public class Client {
    public static void main(String[] args) {
        RealObject proxy = new RealObjectProxy();
        //********* here is the point ******
        proxy.doSth();
    }
}
