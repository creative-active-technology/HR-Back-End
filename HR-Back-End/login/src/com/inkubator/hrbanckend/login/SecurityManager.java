/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inkubator.hrbanckend.login;

/**
 *
 * @author Deni Husni FR
 */
public class SecurityManager {
     public static boolean login(String username, String password) {
      if(username.equals("super.admin") && password.equals("706cda85671cc8c0501aea304eb7cb1518b1bf4171a801bf8b7d035c0749b107")) {
         return true;
      } else {
         return false;
      }
   }
}
