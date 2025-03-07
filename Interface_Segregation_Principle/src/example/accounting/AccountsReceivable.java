package example.accounting;

public class AccountsReceivable {

    private Accounting transactionObject;

    public AccountsReceivable(CustomerTransaction transaction){
        transactionObject = transaction;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
    }

}
