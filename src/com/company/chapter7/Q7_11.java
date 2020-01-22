package com.company.chapter7;

public class Q7_11 {

    abstract class FileSystem{
        abstract Directory createDirectory(String name);
    }

    abstract class Entry{
        abstract boolean delete();
        abstract long getSize();
        abstract long getLastModified();
        abstract long getCreatedDateTime();
        abstract boolean isExist();
        abstract String getPath();
    }

    abstract class File extends Entry{
        abstract Directory getDirectory();
    }

    abstract class Directory extends Entry{
        abstract boolean isEmpty();
        abstract Entry[] listAll();
        abstract File[] listAllFiles();
        abstract Directory[] listAllDirectories();
    }
}
