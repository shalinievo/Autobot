package Autobot;

import java.io.IOException;

public class nordvpn {
	public static void vpn(String[] args) {
        int timeout = 1200;

        try {
            Runtime.getRuntime().exec("cmd /c cd C: && \"C:\\Program Files\\NordVPN\\NordVPN.exe\"");
            
            String[] countries = {"United States", "United Kingdom", "Buffalo"};
            for (String country : countries) {
                Runtime.getRuntime().exec("cmd /c nordvpn -c -g \"" + country + "\"");
                Thread.sleep(timeout * 1000);
            }
            
            Runtime.getRuntime().exec("cmd /c nordvpn -c --server-name \"Edinburgh\"");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
