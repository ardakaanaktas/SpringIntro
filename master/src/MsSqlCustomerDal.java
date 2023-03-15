public class MsSqlCustomerDal implements ICustomerDal{

    private String connectionString;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void add() {
        System.out.println("Connecting Adress: "+connectionString);
        System.out.println("MsSql Database added.");
        System.out.println("Author :"+email);
    }
}
