package com.company;

public enum Sign {
    ADD("\\+"),
    SUB("-"),
    MUL("\\*"),
    DIV("/");

    public final String pattern;

    Sign(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
