package com.company;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {

    private List<BlockImpl> blocks;

    public Wall(List<BlockImpl> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<BlockImpl> findBlockByColor(String color) {
        return  blocks.stream().filter(c -> c.getColor().equalsIgnoreCase(color)).findFirst();
    }

    @Override
    public List<BlockImpl> findBlocksByMaterial(String material) {
        if (material == null) {
            throw new IllegalArgumentException("Material can not be null");
        }
        return blocks.stream().filter(blockImpl -> blockImpl.getMaterial().equalsIgnoreCase(material)).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
