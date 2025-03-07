package example.domain;

import example.accounting.Accounting;
import example.reporting.Reporting;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> products;

    private Customer customer;

    public CustomerTransaction(Customer customer, List<Product> products){

        this.products = products;
        this.customer = customer;

    }

    @Override
    public String getName(){
        return customer.getName();
    }

    @Override
    public Date getDate(){
        return new Date();
    }

    @Override
    public String productBreakDown(){

        String reportList = null;

        for (Product product : products)
            reportList += product.getProductName();

        return reportList;

    }

    @Override
    public void prepareInvoice(){
        System.out.println("invoice prepared...");
    }

    @Override
    public void chargeCustomer(){
        System.out.println("charged the customer");
    }

}
