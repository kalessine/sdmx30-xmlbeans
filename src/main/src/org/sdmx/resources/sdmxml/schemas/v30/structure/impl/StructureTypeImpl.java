/*
 * XML Type:  StructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.StructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class StructureTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.MaintainableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.StructureType {
    private static final long serialVersionUID = 1L;

    public StructureTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Grouping"),
    };

    private static final QNameSet[] PROPERTY_QSET = {
    QNameSet.forArray( new QName[] { 
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataStructureComponents"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Grouping"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataStructureComponents"),
    }),
    };

    /**
     * Gets the "Grouping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType getGrouping() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "Grouping" element
     */
    @Override
    public boolean isSetGrouping() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QSET[0]) != 0;
        }
    }

    /**
     * Sets the "Grouping" element
     */
    @Override
    public void setGrouping(org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType grouping) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(grouping);
        }
    }

    /**
     * Appends and returns a new empty "Grouping" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType addNewGrouping() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "Grouping" element
     */
    @Override
    public void unsetGrouping() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QSET[0], 0);
        }
    }
}
