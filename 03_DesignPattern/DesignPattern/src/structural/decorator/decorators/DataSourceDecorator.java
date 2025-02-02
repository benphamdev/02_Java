package structural.decorator.decorators;

/**
 * Abstract base decorator class.
 */
public class DataSourceDecorator implements DataSource {
    private final DataSource wrappee;

    public DataSourceDecorator(DataSource dataSource) {
        this.wrappee = dataSource;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("test");
        return wrappee.readData();
    }
}
