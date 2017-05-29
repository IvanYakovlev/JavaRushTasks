
package com.javarush.task.task18.task1814;

import java.io.*;
import java.nio.channels.FileChannel;


/*
UnsupportedFileName
*/


public class TxtInputStream extends FileInputStream {
    FileInputStream component;
    public static String fileName = "C:/1.rtf";
    public TxtInputStream(FileInputStream component) throws FileNotFoundException{
        super(fileName);
        this.component=component;
    }

    @Override
    public int read() throws IOException {
        return component.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return component.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return component.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return component.skip(n);
    }

    @Override
    public int available() throws IOException {
        return component.available();
    }

    @Override
    public void close() throws IOException {
        component.close();
    }

    @Override
    public FileChannel getChannel() {
        return component.getChannel();
    }


    @Override
    public void mark(int readlimit) {
        component.mark(readlimit);
    }

    @Override
    public void reset() throws IOException {
        component.reset();
    }

    @Override
    public boolean markSupported() {
        return component.markSupported();
    }

    public static void main(String[] args) throws UnsupportedFileNameException {
        if (!fileName.endsWith(".txt"))
            throw new UnsupportedFileNameException();

    }
}


