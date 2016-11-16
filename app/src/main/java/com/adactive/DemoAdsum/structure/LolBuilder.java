package com.adactive.DemoAdsum.structure;

public class LolBuilder {
    private String bite;

    public LolBuilder setBite(String bite) {
        this.bite = bite;
        return this;
    }

    public Lol createLol() {
        return new Lol(bite);
    }
}

public class Foo{
    Foo{
        LolBuilder lb = new LolBuilder();
        lb.setBite("zegf")
                .createLol();

    }
}