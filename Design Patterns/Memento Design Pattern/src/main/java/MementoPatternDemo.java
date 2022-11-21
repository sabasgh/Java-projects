public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("#State1");
        careTaker.addMemento(originator.saveStateToMemento());

        //state is changing ......

        originator.setState("#State2");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("#State3");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("#State4");
        careTaker.addMemento(originator.saveStateToMemento());

        System.out.println("The current state is: " + originator.getState());
        // setting the first state to originator:
        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("First saved state is : " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println("Second saved state is : " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(2));
        System.out.println("Third saved state is : " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(3));
        System.out.println("Fourth saved state is :" + originator.getState());
    }
}
