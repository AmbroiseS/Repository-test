package com.adactive.DemoAdsum.structure;

/**
 * Created by Ambroise on 16/11/2016.
 */

public class Lol {
    public final static String BITE = "21";

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {


         this.email = email;
    }

    private String email;

    public static class Foo {
        public String squeg;
    }

    String bite;
    private String truc;

    Lol(String bite) {
        this.bite = bite;
    }

}
