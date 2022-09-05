/*
 * XML Type:  StructureUsageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.StructureUsageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StructureUsageType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class StructureUsageTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.MaintainableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.StructureUsageType {
    private static final long serialVersionUID = 1L;

    public StructureUsageTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Structure"),
    };


    /**
     * Gets the "Structure" element
     */
    @Override
    public java.lang.String getStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Structure" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType xgetStructure() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "Structure" element
     */
    @Override
    public boolean isSetStructure() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Structure" element
     */
    @Override
    public void setStructure(java.lang.String structure) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(structure);
        }
    }

    /**
     * Sets (as xml) the "Structure" element
     */
    @Override
    public void xsetStructure(org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType structure) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.StructureReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(structure);
        }
    }

    /**
     * Unsets the "Structure" element
     */
    @Override
    public void unsetStructure() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }
}
