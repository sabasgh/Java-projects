import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    // class that will responsible for keeping the Memento.

    public List<Memento> mementoList = new ArrayList<Memento>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int i) {
        return mementoList.get(i);
    }
}
