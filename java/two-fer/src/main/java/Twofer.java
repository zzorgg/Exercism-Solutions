public class Twofer {
    public String twofer(String name) {
        return (name == "" || name == null) ? "One for you, one for me." : "One for " + name + ", one for me.";
    }
}
