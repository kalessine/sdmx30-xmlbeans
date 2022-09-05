/*
 * An XML document type.
 * Localname: DataProvider
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DataProvider(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class DataProviderDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.OrganisationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderDocument {
    private static final long serialVersionUID = 1L;

    public DataProviderDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataProvider"),
    };


    /**
     * Gets the "DataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType getDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DataProvider" element
     */
    @Override
    public void setDataProvider(org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType dataProvider) {
        generatedSetterHelperImpl(dataProvider, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataProvider" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType addNewDataProvider() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataProviderType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
