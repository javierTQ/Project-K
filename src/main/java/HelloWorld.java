import static spark.Spark.get;

public class HelloWorld {
    public static void main(String[] args) {
        MyText myText = new MyText();
        get("/hello", (req, res) -> myText.getText());
    }
}
