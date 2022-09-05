/*
 * An XML document type.
 * Localname: RegistryInterface
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one RegistryInterface(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public class RegistryInterfaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceDocument {
    private static final long serialVersionUID = 1L;

    public RegistryInterfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "RegistryInterface"),
    };


    /**
     * Gets the "RegistryInterface" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType getRegistryInterface() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "RegistryInterface" element
     */
    @Override
    public void setRegistryInterface(org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType registryInterface) {
        generatedSetterHelperImpl(registryInterface, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RegistryInterface" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType addNewRegistryInterface() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.RegistryInterfaceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
