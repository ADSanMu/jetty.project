//
//  ========================================================================
//  Copyright (c) 1995-2017 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.nosql.mongodb;

import org.eclipse.jetty.server.session.AbstractClusteredOrphanedSessionTest;
import org.eclipse.jetty.server.session.SessionDataStoreFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ClusteredOrphanedSessionTest
 */
public class ClusteredOrphanedSessionTest extends AbstractClusteredOrphanedSessionTest
{
    
    @BeforeClass
    public static void beforeClass() throws Exception
    {
        MongoTestHelper.dropCollection();
        MongoTestHelper.createCollection();
    }

    @AfterClass
    public static void afterClass() throws Exception
    {
        MongoTestHelper.dropCollection();
    }
    
    
    /** 
     * @see org.eclipse.jetty.server.session.AbstractTestBase#createSessionDataStoreFactory()
     */
    @Override
    public SessionDataStoreFactory createSessionDataStoreFactory()
    {
        return MongoTestHelper.newSessionDataStoreFactory();
    }


    @Test
    public void testOrphanedSession() throws Exception
    {
        super.testOrphanedSession();
    }
}
