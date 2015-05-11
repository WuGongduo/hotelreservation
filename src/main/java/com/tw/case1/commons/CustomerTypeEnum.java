package com.tw.case1.commons;

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
