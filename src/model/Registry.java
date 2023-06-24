/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author NUWAA
 */
public class Registry {

    private Map<SmartPhoneType, Smartphone> smartPhones = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public Smartphone getSmartPhone(SmartPhoneType phoneType) {
        Smartphone smartPhone = null;
        try {
            smartPhone = (Smartphone) smartPhones.get(phoneType).clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return smartPhone;
    }

    private void initialize() {
        
        AndroidPhone androidPhone = new AndroidPhone();
        androidPhone.setBrand("Samsung");
        androidPhone.setModel("A20s");
        androidPhone.setColor(Color.BLUE);
        androidPhone.setStorage(64);
        androidPhone.setRam(2);
        androidPhone.setDisplaySize(6.5);
        androidPhone.setCamera(13.0);
        androidPhone.setWaterProof(true);
        androidPhone.setPrice(40000);
        smartPhones.put(SmartPhoneType.ANDROID_PHONE, androidPhone);

        
        IPhone iPhone = new IPhone();
        iPhone.setBrand("Apple");
        iPhone.setModel("12");
        iPhone.setColor(Color.BLACK);
        iPhone.setStorage(256);
        iPhone.setRam(4);
        iPhone.setDisplaySize(6.1);
        iPhone.setCamera(12.0);
        iPhone.setWaterProof(true);
        iPhone.setPrice(200000);
        smartPhones.put(SmartPhoneType.I_PHONE, iPhone);

    }

}
