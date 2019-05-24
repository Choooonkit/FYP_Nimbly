package com.example.changchoonkit.myapplication;

public class Certificates {

    private String certIssuer;
    private String recevDate;
    private String certTitle;

    public Certificates(String certIssuer, String recevDate, String certTitle) {
        this.certIssuer = certIssuer;
        this.recevDate = recevDate;
        this.certTitle = certTitle;
    }

    public String getCertIssuer() {
        return certIssuer;
    }

    public String getRecevDate() {
        return recevDate;
    }

    public String getCertTitle() {
        return certTitle;
    }
}
