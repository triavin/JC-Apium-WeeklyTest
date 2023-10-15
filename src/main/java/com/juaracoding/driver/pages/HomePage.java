package com.juaracoding.driver.pages;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.utils.AddTransaksiElement;
import com.juaracoding.utils.HomePageElement;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class HomePage {
    private MobileDriver driver;
    private MobileElement balanceInfo;
    private MobileElement incomeInfo;
    private MobileElement expenseInfo;

    private int saldo;
    private int pemasukan;
    private int pengeluaran;


//    @FindBy(id = AddTransaksiElement.ADDBUTTON)
//    private AndroidElement addBtn ;
//    @FindBy(id = AddTransaksiElement.INCOME)
//    private AndroidElement incomeBtn ;
//    @FindBy(id = AddTransaksiElement.EXPENSE)
//    private AndroidElement expenseBtn ;
//    @FindBy(id = AddTransaksiElement.CATEGORY)
//    private AndroidElement category ;
//    @FindBy(id = AddTransaksiElement.AMOUNT)
//    private AndroidElement amount ;
//    @FindBy(id = AddTransaksiElement.NOTE)
//    private AndroidElement note ;
//    @FindBy(id = AddTransaksiElement.SAVE)
//    private AndroidElement save ;

    public HomePage() throws MalformedURLException {
        this.driver = DriverSingleton.getDriver();
//        PageFactory.initElements(driver,this);
        DriverSingleton.delay(3);
    }

    public void getInfo(){
//        saldo = Integer.parseInt(balanceInfo.getText());
//        pemasukan = Integer.parseInt(incomeInfo.getText());
//        pengeluaran = Integer.parseInt(expenseInfo.getText());

        saldo = getSaldo();
        pemasukan = getPemasukan();
        pengeluaran = getPengeluaran();
    }

    public int getSaldo() {
        if (balanceInfo.getText().contains(".")){
            return saldo = Integer.parseInt(balanceInfo.getText().replaceAll("\\.",""));
        } else {
            return saldo = Integer.parseInt(balanceInfo.getText());
        }
    }

    public int getPemasukan() {
        if (incomeInfo.getText().contains(".")){
            return pemasukan = Integer.parseInt(incomeInfo.getText().replaceAll("\\.",""));
        } else {
            return pemasukan = Integer.parseInt(incomeInfo.getText());
        }
    }

    public int getPengeluaran() {
        if (expenseInfo.getText().contains(".")){
            return pengeluaran = Integer.parseInt(expenseInfo.getText().replaceAll("\\.",""));
        }
        return pengeluaran = Integer.parseInt(expenseInfo.getText());
    }

    public void getElement(){
        this.balanceInfo = (MobileElement) driver.findElement(By.id(HomePageElement.BALANCEINFO));
        this.incomeInfo = (MobileElement) driver.findElement(By.id(HomePageElement.INCOMEINFO));
        this.expenseInfo = (MobileElement) driver.findElement(By.id(HomePageElement.EXPENSEINFO));
    }

}
