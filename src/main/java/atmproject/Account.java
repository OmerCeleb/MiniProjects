package atmproject;

import java.util.Scanner;

public class Account {

    private int accountNumber;
    private int pinNumber;

    private double checkingBalance; //vadesiz hesap bakiyesi
    private double savingBalance;//vadeli hesap bakiyesi

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }


    //para cekme

    private double calculateCheckingBalanceAfterWithdraw(double amount) {

        checkingBalance = checkingBalance - amount;

        return checkingBalance;
    }


    //parayatirma isleminden sonra kalan bakiyeyi hesapla

    private double calculateCheckingBalanceAfterDeposit(double amount) {

        checkingBalance = checkingBalance + amount;

        return checkingBalance;
    }

    //para cekme: saving hesabindan para cekildekten sonra kalan bakiye
    private double calculateSavingBalanceAfterWithdraw(double amount) {

        savingBalance = savingBalance - amount;

        return savingBalance;
    }


}
