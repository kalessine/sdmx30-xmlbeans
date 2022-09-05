/*
 * An XML document type.
 * Localname: Grouping
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Grouping(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class GroupingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.GroupingDocument {
    private static final long serialVersionUID = 1L;

    public GroupingDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
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
}
