public class Main {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Game windowsGame = new Game(windowsFactory);
        windowsGame.renderUI();

        GUIFactory macFactory = new MacFactory();
        Game macGame = new Game(macFactory);
        macGame.renderUI();

        GUIFactory linuxFactory = new LinuxFactory();
        Game linuxGame = new Game(linuxFactory);
        linuxGame.renderUI();
    }
}
