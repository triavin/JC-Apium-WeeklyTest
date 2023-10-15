package com.juaracoding.driver.pages;

import com.juaracoding.driver.DriverSingleton;
import com.juaracoding.utils.AddTransaksiElement;
import com.juaracoding.utils.Constants;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class AddTransaksi {
    private AndroidDriver driver;
    private MobileElement addBtn;
    private MobileElement incomeBtn;
    private MobileElement expenseBtn;
    private MobileElement category;
    private MobileElement amount;
    private MobileElement note;
    private MobileElement save;


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





    public AddTransaksi() throws MalformedURLException {
        this.driver = DriverSingleton.getDriver();
//        PageFactory.initElements(driver,this);
        DriverSingleton.delay(3);
        this.addBtn = (MobileElement) driver.findElement(By.id(AddTransaksiElement.ADDBUTTON));
    }

    public void AddIncome(String amount, String note){
        this.incomeBtn.click();
        this.amount.sendKeys(amount);
        this.note.sendKeys(note);
        this.save.click();
    }

    public void addData() {
        this.addBtn.click();
    }

    public void getElement(){
        this.incomeBtn = (MobileElement) driver.findElement(By.id(AddTransaksiElement.INCOME));
        this.expenseBtn = (MobileElement) driver.findElement(By.id(AddTransaksiElement.EXPENSE));
        this.category = (MobileElement) driver.findElement(By.id(AddTransaksiElement.CATEGORY));
        this.amount = (MobileElement) driver.findElement(By.id(AddTransaksiElement.AMOUNT));
        this.note = (MobileElement) driver.findElement(By.id(AddTransaksiElement.NOTE));
        this.save = (MobileElement) driver.findElement(By.id(AddTransaksiElement.SAVE));
    }


}
