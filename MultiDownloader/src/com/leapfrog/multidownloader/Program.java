/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.multidownloader;

import com.leapfrog.multidownloader.util.Downloader;
import java.util.Scanner;

/**
 *
 * @author zak
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter URL to download");
            String link = input.next();
            System.out.println("Downloading from " + link);
            Downloader downloader = new Downloader(link);
            downloader.start();
        }
    }

}
