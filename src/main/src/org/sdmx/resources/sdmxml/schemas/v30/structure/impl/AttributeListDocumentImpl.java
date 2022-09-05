/*
 * An XML document type.
 * Localname: AttributeList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one AttributeList(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class AttributeListDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ComponentListDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListDocument {
    private static final long serialVersionUID = 1L;

    public AttributeListDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "AttributeList"),
    };


    /**
     * Gets the "AttributeList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType getAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "AttributeList" element
     */
    @Override
    public void setAttributeList(org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType attributeList) {
        generatedSetterHelperImpl(attributeList, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "AttributeList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType addNewAttributeList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeListType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
