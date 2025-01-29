package Behavioral.template.networks;

public class Facebook extends Network {
    public Facebook(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    boolean logIn(String username, String password) {
        System.out.println("Checking user's parameters");
        System.out.printf("Name: %s\n Password: %s\n", this.username, this.password);
        for (int i = 0; i < this.username.length(); i++) {
            System.out.print("*");
        }

        simulateNetworkLatency();

        System.out.println("LogIn success on Facebook");
        return true;
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Network latency simulated!");
    }

    @Override
    void logOut() {
        System.out.println("User: " + this.username + " has been logged out from Facebook");
    }

    @Override
    boolean sendData(byte[] bytes) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + new String(bytes) + "' was posted on Facebook");
            return true;
        }
        return false;
    }
}
