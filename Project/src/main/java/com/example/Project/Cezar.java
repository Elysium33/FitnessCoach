package com.example.Project;

import java.sql.Date;
import java.time.LocalDate;

public class Cezar {

    private String password;
    private int n;

    public Cezar(String password){
        this.password = password;
    }

    public String computePassword(String passLevel) {
        if (passLevel.equals("Medium")) {
            this.n = 4;
        } else if (passLevel.equals("Easy")) {
            this.n = 1;
        } else {
            this.n = Date.valueOf(LocalDate.now()).getDay();
        }
        StringBuilder newPassword = new StringBuilder();
        for (int i = 0; i < this.password.length(); i++) {
            char currentChar = this.password.charAt(i);
            char encryptedChar = (char) (currentChar + this.n);

            if (Character.isDigit(encryptedChar) || (encryptedChar >= 'a' && encryptedChar <= 'z')) {
                newPassword.append(encryptedChar);
            } else {
                char adjustedChar;
                if (Character.isDigit(currentChar)) {
                    adjustedChar = (char) ('0' + (encryptedChar - '0') % 10);
                } else if (Character.isUpperCase(currentChar)) {
                    adjustedChar = (char) ('A' + (encryptedChar - 'A') % 26);
                } else {
                    adjustedChar = (char) ('a' + (encryptedChar - 'a') % 26);
                }
                newPassword.append(adjustedChar);
            }
        }
        return newPassword.toString();
    }


    public static void main(String[] args) {
        // Example usage:
        Cezar cezar = new Cezar("ABC");
        String newPassword = cezar.computePassword("Medium");
        System.out.println("Encrypted password: " + newPassword);
    }
}
