package com.blessing.iofundamentals;

import java.io.File;

public class Store {
    private final String directory;

    public Store(String directory) {
        this.directory = directory;
    }

    public File getDatabaseFolder(String file) {
        return new File(directory + java.io.File.separator + file);
    }
}