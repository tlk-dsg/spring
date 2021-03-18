package com.tlk.demo1;

public class Proxy implements Rent{

    private Host host;
    public Proxy(){

    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    //看房
    public void SeeHouse(){
        System.out.println("Take you to see house!");
    }


}
