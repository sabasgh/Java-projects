public class Main {
    // Client: This class creates the ConcreteCommand class and associates it with the receiver.
    public static void main(String[] args) {
        Document document = new Document();
        ActionListernerCommand clickOpen = new ActionOpen(document);
        ActionListernerCommand clickSave = new ActionSave(document);

        MenuOptions menu = new MenuOptions(clickOpen,clickSave);
        menu.clickOpen();
        menu.clickSave();
    }
}
