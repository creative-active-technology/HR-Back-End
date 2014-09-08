/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inkubator.hrbanckend.batch.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Deni Husni FR
 */
public class BackEndService {
      private static ApplicationContext appContext;

    public static ApplicationContext getApplicationContext() {
        if (appContext == null) {
            appContext = new ClassPathXmlApplicationContext("spring/config/app-context-config.xml");
        }
        return appContext;
    }

    
    /**
     * Methode untuk mendapatkan object service dari setiap Class atau Interface yang di manage sama Spring.
     * <p><b>Contoh Code:</b>
     * <br/>SpringIO springIO=(SpringIO) ServiceUtil.getService("springIO");
     * <br/>springIO.getSomeThing();
     * 
     * 
     * @param beansName nama dari interface atau class yang akan di ambil object nya
     * @return berupa Object sesuai dengan nama class atau interface yang di panggil.
     */
    public static Object getService(String beansName) {
        return getApplicationContext().getAutowireCapableBeanFactory().getBean(beansName);

    }
}
