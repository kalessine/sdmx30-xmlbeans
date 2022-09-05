/*
 * XML Type:  ComponentListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ComponentListType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ComponentListTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.IdentifiableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentListType {
    private static final long serialVersionUID = 1L;

    public ComponentListTypeImpl(org.apache.xmlbeans.SchemaType sType) {
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
     * Gets a List of "Component" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType> getComponentList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getComponentArray,
                this::setComponentArray,
                this::insertNewComponent,
                this::removeComponent,
                this::sizeOfComponentArray
            );
        }
    }

    /**
     * Gets array of all "Component" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType[] getComponentArray() {
        return getXmlObjectArray(PROPERTY_QSET[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType[0]);
    }

    /**
     * Gets ith "Component" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType getComponentArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Component" element
     */
    @Override
    public int sizeOfComponentArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QSET[0]);
        }
    }

    /**
     * Sets ith "Component" element
     */
    @Override
    public void setComponentArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType component) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(component);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Component" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType insertNewComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType)get_store().insert_element_user(PROPERTY_QSET[0], PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Component" element
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

    /**
     * Removes the ith "Component" element
     */
    @Override
    public void removeComponent(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QSET[0], i);
        }
    }
}
