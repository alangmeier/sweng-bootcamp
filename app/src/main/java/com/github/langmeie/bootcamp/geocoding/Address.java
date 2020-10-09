package com.github.langmeie.bootcamp.geocoding;

import androidx.annotation.NonNull;

import java.util.List;

/*
This class represents a real-world address
 */

public final class Address {
    private final List<String> addressLines;

    public Address(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    @NonNull
    public String toString(String separator) {
        StringBuilder buffer = new StringBuilder();
        for (String line : addressLines) buffer.append(line).append(separator);

        return buffer.toString();
    }

    @NonNull
    public String toString() {
        return this.toString("\n");
    }
}
