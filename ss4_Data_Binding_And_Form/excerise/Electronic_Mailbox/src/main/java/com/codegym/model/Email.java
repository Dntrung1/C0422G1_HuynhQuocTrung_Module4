package com.codegym.model;

import java.util.List;

public class Email {
    private String languages;
    private String pageSizes;
    private Boolean spamFilter;
    private String signature;

    public Email() {
    }

    public Email(String languages, String pageSizes, Boolean spamFilter, String signature) {
        this.languages = languages;
        this.pageSizes = pageSizes;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPageSizes() {
        return pageSizes;
    }

    public void setPageSizes(String pageSizes) {
        this.pageSizes = pageSizes;
    }

    public Boolean getSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(Boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
