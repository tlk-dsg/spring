package com.tlk.demo2;

public class Client {
    public static void main(String[] args){
        Rent rent = new Host();

        ProxyInvocationHandler proxy = new ProxyInvocationHandler();

        proxy.setRent(rent);

        Rent result = (Rent) proxy.getProxy();

        result.rent();

    }
}

