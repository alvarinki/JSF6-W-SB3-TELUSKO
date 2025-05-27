enum EnumObject {
    MacOS("Mac OS X", "10.15"),
    Windows("Windows", "10"),
    Linux("Linux", "5.4");

    private String name;
    private String version;

    //getters and setters
    public String getName() {
        return name;
    }
    public String getVersion() {
        return version;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    EnumObject(String name, String version) {
        this.name = name;
        this.version = version;
    }   
}


public class EnumObjectDemo {
    public static void main(String[] args) {
        for (EnumObject os : EnumObject.values()) {
            System.out.println("Operating System: " + os.getName() + ", Version: " + os.getVersion());
        }
    }
}



