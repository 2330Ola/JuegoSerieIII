public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }

    @Override
    public TextBox createTextBox() {
        return new LinuxTextBox();
    }
}
