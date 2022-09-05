/*
 * XML Type:  CategorySchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CategorySchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CategorySchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType {
    private static final long serialVersionUID = 1L;

    public CategorySchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Category"),
    };


    /**
     * Gets a List of "Category" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType> getCategoryList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategoryArray,
                this::setCategoryArray,
                this::insertNewCategory,
                this::removeCategory,
                this::sizeOfCategoryArray
            );
        }
    }

    /**
     * Gets array of all "Category" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType[] getCategoryArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType[0]);
    }

    /**
     * Gets ith "Category" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType getCategoryArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Category" element
     */
    @Override
    public int sizeOfCategoryArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Category" element
     */
    @Override
    public void setCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType category) {
        generatedSetterHelperImpl(category, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType insertNewCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType addNewCategory() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategoryType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Category" element
     */
    @Override
    public void removeCategory(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
