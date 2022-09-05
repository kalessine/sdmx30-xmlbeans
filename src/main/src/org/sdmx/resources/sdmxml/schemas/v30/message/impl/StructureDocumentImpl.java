/*
 * An XML document type.
 * Localname: Structure
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.StructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Structure(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message) element.
 *
 * This is a complex type.
 */
public class StructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.StructureDocument {
    private static final long serialVersionUID = 1L;

    public StructureDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message", "Structure"),
    };


    /**
     * Gets the "Structure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.StructureType getStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.StructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.StructureType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Structure" element
     */
    @Override
    public void setStructure(org.sdmx.resources.sdmxml.schemas.v30.message.StructureType structure) {
        generatedSetterHelperImpl(structure, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Structure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.message.StructureType addNewStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.message.StructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.message.StructureType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
