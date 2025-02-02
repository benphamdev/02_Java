package structural.decorator;

import structural.decorator.decorators.CompressionDecorator;
import structural.decorator.decorators.DataSource;
import structural.decorator.decorators.DataSourceDecorator;
import structural.decorator.decorators.EncryptionDecorator;
import structural.decorator.decorators.FileDataSource;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        // Create a simple file
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);

        // Check the output file contents
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        // Display the plain text
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
