public class Saba {
    private static Saba instance;

    private Saba() {
    }

    public static Saba getInstance(){
        if (instance == null){
           instance = new Saba();
        }
        return instance;
    }
}
