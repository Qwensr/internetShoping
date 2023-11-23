public abstract class BaseLogger implements Logger {

    @Override
    public void logError() {
        System.out.println("Error");

    }

    @Override
    public void loginInfo() {
        System.out.println("Info");

    }

    @Override
    public void logWarning() {
        System.out.println("Warning");
    }

}