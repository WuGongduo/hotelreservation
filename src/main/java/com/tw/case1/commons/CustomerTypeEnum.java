package com.tw.case1.commons;

/**
 * Created by gdwu on 4/29/15.
 */
public enum CustomerTypeEnum {

    REWARDS("Rewards"), REGULAR("Regular");

    private String customerType;

    CustomerTypeEnum(String customerType) {
        this.customerType = customerType;
    }

    public Boolean equals(String customerType){
        return this.customerType.equals(customerType);
    }
}
