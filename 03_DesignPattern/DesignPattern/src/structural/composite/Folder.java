package structural.composite;

public class Folder {
    private final String name;
    private Component[] components;

    public Folder(String name) {
        this.name = name;
    }

    public Folder search(String name) {
        System.out.printf("Search recursively for %s in folder %s\n", name, this.name);

        for (Component component : components) {
            component.search(name);
        }

        return null;
    }

    public Folder addComponent(Component component) {
        if (components == null) {
            components = new Component[]{component};
        } else {
            Component[] newComponents = new Component[components.length + 1];
            System.arraycopy(components, 0, newComponents, 0, components.length);
            newComponents[components.length] = component;
            components = newComponents;
        }

        return this;
    }
}
