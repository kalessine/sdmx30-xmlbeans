/*
 * An XML document type.
 * Localname: Attribute
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Attribute(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class AttributeDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeDocument {
    private static final long serialVersionUID = 1L;

    public AttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Attribute"),
    };


    /**
     * Gets the "Attribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType getAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Attribute" element
     */
    @Override
    public void setAttribute(org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType attribute) {
        generatedSetterHelperImpl(attribute, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Attribute" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType addNewAttribute() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.AttributeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
