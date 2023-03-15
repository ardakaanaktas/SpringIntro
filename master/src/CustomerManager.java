public class CustomerManager implements ICustomerServices{

    private ICustomerDal customerDal;


    //Setter injection
    public void setCustomerDal(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }


    //Constructor Injection
    /**
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }
    */



    @Override
    public void add() {
        customerDal.add();
    }
}
