package com.tlk.demo2;

//房东
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("Needed rented！");
    }
}
