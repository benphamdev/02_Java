package behavioral.template.networks;

public abstract class Network {
    String username;
    String password;

    Network() {}

    // not implemented
    public boolean post(String message) {
        if (logIn(this.username, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    // implemented in subclasses
    abstract boolean logIn(String username, String password);

    abstract void logOut();

    abstract boolean sendData(byte[] bytes);
}
