public class OpenCommand implements Command {
    private TextEditor editor;

    public OpenCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.open();
    }
}