package com.example.bmi_ftoc_ctof_fall2020;

public class Upload {
    private String id;
    private String result;

    public Upload(String id, String result) {
        this.id = id;
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Upload() {
    }
}
