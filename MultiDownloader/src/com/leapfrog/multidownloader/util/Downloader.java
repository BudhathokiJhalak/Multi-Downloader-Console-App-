/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.multidownloader.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author zak
 */
public class Downloader extends Thread {

    String link;

    public Downloader(String link) {
        this.link = link;
    }

    @Override
    public void run() {
        try {
            URL url = new URL(link);
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();
            String[] tokens = link.split("/");
            String fileName = tokens[tokens.length - 1];
            FileOutputStream os = new FileOutputStream(fileName);
            byte[] data = new byte[1024 * 5];
            int i = 0;
            while ((i = is.read(data)) != -1) {
                os.write(data, 0, i);
            }
            System.out.println(fileName + " 'downloaded Successfully.'.");
            is.close();
            os.close();

        } catch (IOException ioe) {
            ioe.getMessage();
        }

    }

}
