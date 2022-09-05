/*
 * XML Type:  ItemType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ItemType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ItemTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType {
    private static final long serialVersionUID = 1L;

    public ItemTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Parent"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Item"),
    };

    private static final QNameSet[] PROPERTY_QSET = {
    QNameSet.forArray( new QName[] { 
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoFeatureSetCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoGridCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoRefCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "MetadataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ReportingCategory"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Item"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlMapping"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataProvider"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataConsumer"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "UserDefinedOperator"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Code"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "NamePersonalisation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Organisation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Category"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Agency"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Transformation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "OrganisationUnit"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Ruleset"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Concept"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CustomType"),
    }),
    };

    /**
     * Gets the "Parent" element
     */
    @Override
    public java.lang.String getParent() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Parent" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType xgetParent() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "Parent" element
     */
    @Override
    public boolean isSetParent() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "Parent" element
     */
    @Override
    public void setParent(java.lang.String parent) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(parent);
        }
    }

    /**
     * Sets (as xml) the "Parent" element
     */
    @Override
    public void xsetParent(org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType parent) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(parent);
        }
    }

    /**
     * Unsets the "Parent" element
     */
    @Override
    public void unsetParent() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "Item" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType> getItemList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getItemArray,
                this::setItemArray,
                this::insertNewItem,
                this::removeItem,
                this::sizeOfItemArray
            );
        }
    }

    /**
     * Gets array of all "Item" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType[] getItemArray() {
        return getXmlObjectArray(PROPERTY_QSET[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType[0]);
    }

    /**
     * Gets ith "Item" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType getItemArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Item" element
     */
    @Override
    public int sizeOfItemArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QSET[0]);
        }
    }

    /**
     * Sets ith "Item" element
     */
    @Override
    public void setItemArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType item) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(item);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Item" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType insertNewItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType)get_store().insert_element_user(PROPERTY_QSET[0], PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Item" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType addNewItem() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ItemType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Item" element
     */
    @Override
    public void removeItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QSET[0], i);
        }
    }
}
