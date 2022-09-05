/*
 * An XML document type.
 * Localname: GenericMetadata
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one GenericMetadata(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public class GenericMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataDocument {
    private static final long serialVersionUID = 1L;

    public GenericMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "GenericMetadata"),
    };


    /**
     * Gets the "GenericMetadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType getGenericMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "GenericMetadata" element
     */
    @Override
    public void setGenericMetadata(org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType genericMetadata) {
        generatedSetterHelperImpl(genericMetadata, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "GenericMetadata" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType addNewGenericMetadata() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.GenericMetadataType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
