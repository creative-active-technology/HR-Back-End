/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkubator.hrbanckend.batch.dao.impl;

import com.inkubator.datacore.dao.impl.IDAOImpl;
import com.inkubator.hrbanckend.batch.dao.PasswordHistoryDao;
import com.inkubator.hrbanckend.batch.entity.PasswordHistory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Deni Husni FR
 */
@Repository(value = "passwordHistoryDao")
@Lazy
public class PasswordHistoryDaoImpl extends IDAOImpl<PasswordHistory> implements PasswordHistoryDao {

    @Override
    public Class<PasswordHistory> getEntityClass() {
        return PasswordHistory.class;
    }

}
