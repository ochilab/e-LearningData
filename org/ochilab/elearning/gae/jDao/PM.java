/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ochilab.elearning.gae.jDao;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public final class PM {
    private static final PersistenceManagerFactory pmfInstance =
        JDOHelper.getPersistenceManagerFactory("transactions-optional");

    private PM() {}

    public static PersistenceManagerFactory get() {
        return pmfInstance;
    }
}
