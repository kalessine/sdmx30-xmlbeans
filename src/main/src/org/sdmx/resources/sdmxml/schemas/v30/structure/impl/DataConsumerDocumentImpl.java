/*
 * An XML document type.
 * Localname: DataConsumer
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one DataConsumer(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class DataConsumerDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.OrganisationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerDocument {
    private static final long serialVersionUID = 1L;

    public DataConsumerDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataConsumer"),
    };


    /**
     * Gets the "DataConsumer" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType getDataConsumer() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "DataConsumer" element
     */
    @Override
    public void setDataConsumer(org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType dataConsumer) {
        generatedSetterHelperImpl(dataConsumer, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "DataConsumer" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType addNewDataConsumer() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DataConsumerType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
