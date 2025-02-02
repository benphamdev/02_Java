package structural.composite;

public class File implements Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String search(String name) {
        System.out.printf("Search for %s in file %s\n", name, this.name);
        if (this.name.equals(name)) {
            return this.name;
        }

        return null;
    }

    public File getName() {
        return this;
    }
}
