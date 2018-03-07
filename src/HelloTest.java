public class HelloTest {
    public static void main(String[] args) {
        String s = "Hello world";
        Hello hello = new Hello();
        assert s.equals(hello.getHello());
    }
}
