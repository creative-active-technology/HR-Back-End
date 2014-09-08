/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrbanckend.batch;

import com.inkubator.common.util.DateFormatter;
import com.inkubator.hrbanckend.batch.util.BackEndService;
import java.util.Date;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        // TODO
        System.out.println(" ahahhahahahsdhfhkhfjsjsakdjksajdskdj");
        System.out.println(BackEndService.getService("dateFormatter"));
        DateFormatter dateFormatter=(DateFormatter) BackEndService.getService("dateFormatter");
        System.out.println(dateFormatter.getTimeAsStringsDefaultLocale(new Date()));
    }

}
