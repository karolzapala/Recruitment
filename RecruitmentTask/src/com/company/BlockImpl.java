package com.company;

public class BlockImpl implements Block {
    private String color;
    private String material;

    public BlockImpl(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() { return this.color; }
    public String getMaterial() { return this.material; }
}
