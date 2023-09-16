public class Game {
    private Button button;
    private Window window;
    private TextBox textBox;

    public Game(GUIFactory factory) {
        button = factory.createButton();
        window = factory.createWindow();
        textBox = factory.createTextBox();
    }

    public void renderUI() {
        button.render();
        window.render();
        textBox.render();
    }
}

