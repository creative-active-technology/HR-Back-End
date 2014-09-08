/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrbanckend.login;

import com.inkubator.common.util.HashingUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.LifecycleManager;
import org.openide.modules.ModuleInstall;
import org.openide.util.Exceptions;

public class Installer extends ModuleInstall implements ActionListener {

    private final LoginForm loginForm = new LoginForm();
    private DialogDescriptor dd = null;

    @Override
    public void restored() {
        try {
//            System.out.println(HashingUtils.getHashSHA256("Inkuba@123Bandung"));
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
            dd = new DialogDescriptor(loginForm, "Login Form", true, this);
            dd.setClosingOptions(new Object[]{});
            dd.addPropertyChangeListener(new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent event) {
                    if (event.getPropertyName().equals(DialogDescriptor.PROP_VALUE)
                            && event.getNewValue() == DialogDescriptor.CLOSED_OPTION) {
                        LifecycleManager.getDefault().exit();
                    }
                }
            });

            DialogDisplayer.getDefault().notifyLater(dd);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == DialogDescriptor.CANCEL_OPTION) {
            LifecycleManager.getDefault().exit();
        } else {
            if (loginForm.getUserId().isEmpty() || loginForm.getPassword().isEmpty()) {
                loginForm.setInfo("Please inoput User Id and Password!");
            } else {
//                if (!SecurityManager.login(loginForm.getUserId(), loginForm.getPassword())) {
//                    loginForm.setInfo("User Name and Passwored no Match!");
//                } else {
                    dd.setClosingOptions(null);
//                }
            }

        }
    }
}
