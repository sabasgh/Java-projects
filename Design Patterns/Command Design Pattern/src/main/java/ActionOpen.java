public class ActionOpen implements ActionListernerCommand {
    // ConcreteCommand This class extends the Command interface and implements the execute method.
    // This class creates a binding between the action and the receiver.
    private Document doc;

    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void executeCommand() {
        doc.open();
    }
}
