/*
 * XML Type:  ValueListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ValueListType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ValueListTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ValueListBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ValueListType {
    private static final long serialVersionUID = 1L;

    public ValueListTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ValueItem"),
    };


    /**
     * Gets a List of "ValueItem" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType> getValueItemList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getValueItemArray,
                this::setValueItemArray,
                this::insertNewValueItem,
                this::removeValueItem,
                this::sizeOfValueItemArray
            );
        }
    }

    /**
     * Gets array of all "ValueItem" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType[] getValueItemArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType[0]);
    }

    /**
     * Gets ith "ValueItem" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType getValueItemArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ValueItem" element
     */
    @Override
    public int sizeOfValueItemArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ValueItem" element
     */
    @Override
    public void setValueItemArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType valueItem) {
        generatedSetterHelperImpl(valueItem, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueItem" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType insertNewValueItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ValueItem" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType addNewValueItem() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ValueItemType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ValueItem" element
     */
    @Override
    public void removeValueItem(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
