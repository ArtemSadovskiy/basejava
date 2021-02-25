package com.crud.webapp.storage;

import com.crud.webapp.Config;

public class SqlStorageTest extends AbstractStorageTest{
    public SqlStorageTest() {
        super(Config.get().getStorage());
    }
}
