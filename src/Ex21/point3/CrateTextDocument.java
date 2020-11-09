package Ex21.point3;

public class CrateTextDocument implements Factory{
    @Override
    public TextDocument CrateText() {
        return new TextDocument();
    }
}
