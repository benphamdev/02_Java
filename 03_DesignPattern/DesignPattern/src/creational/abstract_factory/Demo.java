package creational.abstract_factory;

import creational.abstract_factory.app.Application;

public class Demo {

    private static Application configureApplication() {
        Application application;// client code
        String osName = System.getProperty("os.name").toLowerCase();

        application =
                new Application(osName.contains("mac")
                                        ? new creational.abstract_factory.factories.MacOSFactory()
                                        : new creational.abstract_factory.factories.WindowsFactory());

        return application;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
