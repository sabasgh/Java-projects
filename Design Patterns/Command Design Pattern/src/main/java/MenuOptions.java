public class MenuOptions {
    // Invoker: This class asks the command to carry out the request.

    private ActionListernerCommand openCommand;
    private ActionListernerCommand saveCommand;

    public MenuOptions(ActionListernerCommand openCommand, ActionListernerCommand saveCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }

    public void clickOpen() {
        openCommand.executeCommand();
    }

    public void clickSave() {
        saveCommand.executeCommand();
    }
}
