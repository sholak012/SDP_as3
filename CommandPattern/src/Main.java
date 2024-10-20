public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(); //это класс текстового редактора
        MenuOptions options = new MenuOptions(editor);//объект MenuOptions, передавая в него editor.

        options.clickOpen();
        options.clickSave();
        options.clickPaste();
    }
}