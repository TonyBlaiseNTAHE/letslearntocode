public class JavaInstalledCheck {
    public static void main(String[] args) {
        System.out.println("Checking if Java is installed...");
        String javaVersion = System.getProperty("java.version");
        
        if (javaVersion != null) {
            System.out.println("Java is installed. Version: " + javaVersion);
        } else {
            System.out.println("Java is not installed.");
        }
    }
}
