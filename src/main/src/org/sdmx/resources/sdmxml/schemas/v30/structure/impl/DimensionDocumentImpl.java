/*
 * An XML document type.
 * Localname: Dimension
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Dimension(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class DimensionDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionDocument {
    private static final long serialVersionUID = 1L;

    public DimensionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Dimension"),
    };


    /**
     * Gets the "Dimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType getDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Dimension" element
     */
    @Override
    public void setDimension(org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType dimension) {
        generatedSetterHelperImpl(dimension, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Dimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType addNewDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.DimensionType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
