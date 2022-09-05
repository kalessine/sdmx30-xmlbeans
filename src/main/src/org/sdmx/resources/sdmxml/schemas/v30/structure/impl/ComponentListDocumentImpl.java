/*
 * An XML document type.
 * Localname: ComponentList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ComponentList(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class ComponentListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListDocument {
    private static final long serialVersionUID = 1L;

    public ComponentListDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ComponentList"),
    };

    private static final QNameSet[] PROPERTY_QSET = {
    QNameSet.forArray( new QName[] { 
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ComponentList"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DimensionList"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "AttributeList"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataAttributeList"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Group"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MeasureList"),
    }),
    };

    /**
     * Gets the "ComponentList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType getComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ComponentList" element
     */
    @Override
    public void setComponentList(org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType componentList) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(componentList);
        }
    }

    /**
     * Appends and returns a new empty "ComponentList" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType addNewComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
