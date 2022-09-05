/*
 * XML Type:  CategorySchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CategorySchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CategorySchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemesType {
    private static final long serialVersionUID = 1L;

    public CategorySchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CategoryScheme"),
    };


    /**
     * Gets a List of "CategoryScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType> getCategorySchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategorySchemeArray,
                this::setCategorySchemeArray,
                this::insertNewCategoryScheme,
                this::removeCategoryScheme,
                this::sizeOfCategorySchemeArray
            );
        }
    }

    /**
     * Gets array of all "CategoryScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType[] getCategorySchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType[0]);
    }

    /**
     * Gets ith "CategoryScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType getCategorySchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CategoryScheme" element
     */
    @Override
    public int sizeOfCategorySchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "CategoryScheme" element
     */
    @Override
    public void setCategorySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType categoryScheme) {
        generatedSetterHelperImpl(categoryScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType insertNewCategoryScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType addNewCategoryScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "CategoryScheme" element
     */
    @Override
    public void removeCategoryScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
