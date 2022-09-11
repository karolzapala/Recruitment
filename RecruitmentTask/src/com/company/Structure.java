package com.company;

import java.util.List;
import java.util.Optional;

public interface Structure {
    Optional findBlockByColor(String color);
    List<BlockImpl> findBlocksByMaterial(String material);
    int count();
}
