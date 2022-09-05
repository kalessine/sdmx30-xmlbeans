/*
 * An XML document type.
 * Localname: Component
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Component(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class ComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentDocument {
    private static final long serialVersionUID = 1L;

    public ComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Component"),
    };

    private static final QNameSet[] PROPERTY_QSET = {
    QNameSet.forArray( new QName[] { 
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Component"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Dimension"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TimeDimension"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataAttribute"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataAttributeUsage"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Measure"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Attribute"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GroupDimension"),
    }),
    };

    /**
     * Gets the "Component" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType getComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Component" element
     */
    @Override
    public void setComponent(org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType component) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType)get_store().find_element_user(PROPERTY_QSET[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(component);
        }
    }

    /**
     * Appends and returns a new empty "Component" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType addNewComponent() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
