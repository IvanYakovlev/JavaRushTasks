package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class Solution {
    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://yastatic.net/morda-logo/i/citylogos/yandex19-logo-ru.png", Paths.get("D:/MyDownloads"));
        for (String line : Files.readAllLines(passwords, Charset.defaultCharset())) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        String fileName = urlString.substring(urlString.lastIndexOf("/") + 1);
        Path resultFile = Paths.get(downloadDirectory + "\\" + fileName);
        URL url = new URL(urlString);
        InputStream is = url.openStream();
        Path tempFile = Files.createTempFile("temp-", "");
        Files.copy(is, tempFile, StandardCopyOption.REPLACE_EXISTING);
        //StandardCopyOption.REPLACE_EXISTING - нужен, чтобы заменить файл в папке назначения
        is.close();
        Files.move(tempFile, resultFile, StandardCopyOption.REPLACE_EXISTING);
        //StandardCopyOption.REPLACE_EXISTING - нужен, чтобы заменить файл в папке назначения
        return resultFile;
    }
}