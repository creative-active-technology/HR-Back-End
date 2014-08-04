/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrbanckend.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall implements ActionListener{

    private LoginForm loginForm=new LoginForm();
    private DialogDescriptor dd=null;

    @Override
    public void restored() {
        dd=new DialogDescriptor(loginForm, "Login", true, this);
//        dd.set
        DialogDisplayer.getDefault().notifyLater(dd);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
