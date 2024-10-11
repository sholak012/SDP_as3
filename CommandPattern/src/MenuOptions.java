public class MenuOptions {
    private Command openCommand;
    private Command saveCommand;
    private Command pasteCommand;

    public MenuOptions(TextEditor editor) {
        this.openCommand = new OpenCommand(editor);
        this.saveCommand = new SaveCommand(editor);
        this.pasteCommand = new PasteCommand(editor);
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }

    public void clickPaste() {
        pasteCommand.execute();
    }
}