public class PostgreSQLDatabase implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("connect");
    }

    @Override
    public void disconnect() {
        System.out.println("diconnect");
    }

    @Override
    public void executeconnect() {
        System.out.println("executeconnect");
    }
}
