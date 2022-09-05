/*
 * XML Type:  CategorySchemeMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CategorySchemeMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CategorySchemeMapsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapsType {
    private static final long serialVersionUID = 1L;

    public CategorySchemeMapsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CategorySchemeMap"),
    };


    /**
     * Gets a List of "CategorySchemeMap" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType> getCategorySchemeMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategorySchemeMapArray,
                this::setCategorySchemeMapArray,
                this::insertNewCategorySchemeMap,
                this::removeCategorySchemeMap,
                this::sizeOfCategorySchemeMapArray
            );
        }
    }

    /**
     * Gets array of all "CategorySchemeMap" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType[] getCategorySchemeMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType[0]);
    }

    /**
     * Gets ith "CategorySchemeMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType getCategorySchemeMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "CategorySchemeMap" element
     */
    @Override
    public int sizeOfCategorySchemeMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "CategorySchemeMap" element
     */
    @Override
    public void setCategorySchemeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType categorySchemeMap) {
        generatedSetterHelperImpl(categorySchemeMap, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySchemeMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType insertNewCategorySchemeMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySchemeMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType addNewCategorySchemeMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorySchemeMapType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "CategorySchemeMap" element
     */
    @Override
    public void removeCategorySchemeMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
