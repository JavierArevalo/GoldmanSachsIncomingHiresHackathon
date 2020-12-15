package com.mkyong.hashing;

import java.util.Arrays;

public class Entitlements {

    private String[] view;
    private String[] edit;
    private String[] admin;

    public Entitlements(
            String[] edit,
            String[] admin,
            String[] view
    ) {
        this.view = view;
        this.edit = edit;
        this.admin = admin;
    }

    public String[] getAdmin() {
        return admin;
    }

    public String[] getEdit() {
        return edit;
    }

    public String[] getView() {
        return view;
    }

    public void print() {
        System.out.println();
        System.out.println("Entitlements: ");
        System.out.println();
        System.out.println("View: " + Arrays.toString(this.getView()));
        System.out.println("Admin: " + Arrays.toString(this.getAdmin()));
        System.out.println("Edit: " + Arrays.toString(this.getEdit()));
        System.out.println();
        System.out.println();
    }
}
