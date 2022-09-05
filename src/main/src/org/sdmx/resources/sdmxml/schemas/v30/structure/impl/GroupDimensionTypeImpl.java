/*
 * XML Type:  GroupDimensionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GroupDimensionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class GroupDimensionTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.GroupDimensionBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GroupDimensionType {
    private static final long serialVersionUID = 1L;

    public GroupDimensionTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DimensionReference"),
    };


    /**
     * Gets the "DimensionReference" element
     */
    @Override
    public java.lang.String getDimensionReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DimensionReference" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType xgetDimensionReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "DimensionReference" element
     */
    @Override
    public void setDimensionReference(java.lang.String dimensionReference) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(dimensionReference);
        }
    }

    /**
     * Sets (as xml) the "DimensionReference" element
     */
    @Override
    public void xsetDimensionReference(org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType dimensionReference) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.NCNameIDType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(dimensionReference);
        }
    }
}
