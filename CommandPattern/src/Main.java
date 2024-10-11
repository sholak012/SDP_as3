public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        MenuOptions options = new MenuOptions(editor);

        options.clickOpen();
        options.clickSave();
        options.clickPaste();
    }
}