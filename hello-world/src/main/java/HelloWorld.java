public class HelloWorld {
    public static String hello(String str) {
        if (str != null && str != "") {
            return "Hello, " + str + "!";
        } else {
            return "Hello, World!";
        }
    }
}
