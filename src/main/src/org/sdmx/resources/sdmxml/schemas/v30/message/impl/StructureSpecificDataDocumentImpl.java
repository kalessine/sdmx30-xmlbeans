/*
 * An XML document type.
 * Localname: StructureSpecificData
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one StructureSpecificData(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public class StructureSpecificDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataDocument {
    private static final long serialVersionUID = 1L;

    public StructureSpecificDataDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "StructureSpecificData"),
    };


    /**
     * Gets the "StructureSpecificData" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType getStructureSpecificData() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "StructureSpecificData" element
     */
    @Override
    public void setStructureSpecificData(org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType structureSpecificData) {
        generatedSetterHelperImpl(structureSpecificData, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "StructureSpecificData" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType addNewStructureSpecificData() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.StructureSpecificDataType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
