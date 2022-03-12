package com.epam.training.testautomation.collections;

public enum CountryCodes {
    HUNGARY(36), NORWAY(44);

    public final int code;

    CountryCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "CountryCodes{" +
                "code=" + code +
                '}';
    }
}
