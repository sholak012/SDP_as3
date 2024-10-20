public class SaveCommand implements Command { //Реализует Command определяет действие по сохранению
    private TextEditor editor;

    public SaveCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.save();
    }
}