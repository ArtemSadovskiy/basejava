package com.crud.webapp.storage;

import com.crud.webapp.storage.serializer.ObjectStreamSerializer;
import com.crud.webapp.storage.serializer.XmlStreamSerializer;

public class XmlPathStorageTest extends AbstractStorageTest {
    public XmlPathStorageTest() {
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(), new XmlStreamSerializer()));
    }
}
