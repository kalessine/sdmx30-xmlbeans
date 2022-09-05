/*
 * An XML document type.
 * Localname: Structures
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Structures(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class StructuresDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresDocument {
    private static final long serialVersionUID = 1L;

    public StructuresDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Structures"),
    };


    /**
     * Gets the "Structures" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType getStructures() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Structures" element
     */
    @Override
    public void setStructures(org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType structures) {
        generatedSetterHelperImpl(structures, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Structures" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType addNewStructures() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.StructuresType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
