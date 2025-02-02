package structural.composite;

public class Demo {
    public static void main(String[] args) {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        Folder folder1 = new Folder("folder1");

        folder1.addComponent(file1);

        Folder folder2 = new Folder("folder2");
        folder2.addComponent(file2);
        folder2.addComponent(file3);

        folder2.search("rose");
    }
}
