package com.soap.IPLocationFinder;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by rbiswas on 4/12/2015.
 * Input spec:
 * No of IP addresses to be processed (N)
 * N lines of IP addresses
 */
public class IPLocationFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of IP addresses to process:");
        int n = Integer.valueOf(br.readLine());
        String[] ipAddresses = new String[n];
        System.out.println("Enter " + n + " IP address, 1 in each line:");
        for (int i=0; i<n; i++) {
            ipAddresses[i] =br.readLine();
        }
        GeoIPService ipService = new GeoIPService();
        GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();

        for (String ipAddress : ipAddresses) {
            GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
            String countryName = geoIP.getCountryName();
            System.out.println(ipAddress + " -> " + countryName);
        }
    }
}
