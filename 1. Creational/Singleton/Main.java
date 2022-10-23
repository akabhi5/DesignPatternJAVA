package Singleton;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Abhi");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
