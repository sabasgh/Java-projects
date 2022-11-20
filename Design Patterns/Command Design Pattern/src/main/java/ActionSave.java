public class ActionSave implements ActionListernerCommand {
    private Document document;

    public ActionSave(Document document) {
        this.document = document;
    }

    @Override
    public void executeCommand() {
        document.save();
    }
}
