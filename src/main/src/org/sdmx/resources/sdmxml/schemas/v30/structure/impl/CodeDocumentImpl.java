/*
 * An XML document type.
 * Localname: Code
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Code(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class CodeDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CodeDocument {
    private static final long serialVersionUID = 1L;

    public CodeDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Code"),
    };

    private static final QNameSet[] PROPERTY_QSET = {
    QNameSet.forArray( new QName[] { 
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoFeatureSetCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoGridCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Code"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoRefCode"),
    }),
    };

    /**
     * Gets the "Code" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType getCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Code" element
     */
    @Override
    public void setCode(org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType code) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(code);
        }
    }

    /**
     * Appends and returns a new empty "Code" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType addNewCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
