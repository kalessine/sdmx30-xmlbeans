/*
 * XML Type:  CodelistBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CodelistBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CodelistBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CodelistBaseType {
    private static final long serialVersionUID = 1L;

    public CodelistBaseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Code"),
    };

    private static final QNameSet[] PROPERTY_QSET = {
    QNameSet.forArray( new QName[] { 
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoFeatureSetCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoGridCode"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Code"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "GeoRefCode"),
    }),
    };

    /**
     * Gets a List of "Code" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType> getCodeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCodeArray,
                this::setCodeArray,
                this::insertNewCode,
                this::removeCode,
                this::sizeOfCodeArray
            );
        }
    }

    /**
     * Gets array of all "Code" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType[] getCodeArray() {
        return getXmlObjectArray(PROPERTY_QSET[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType[0]);
    }

    /**
     * Gets ith "Code" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType getCodeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Code" element
     */
    @Override
    public int sizeOfCodeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QSET[0]);
        }
    }

    /**
     * Sets ith "Code" element
     */
    @Override
    public void setCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType code) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType)get_store().find_element_user(PROPERTY_QSET[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(code);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Code" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType insertNewCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType)get_store().insert_element_user(PROPERTY_QSET[0], PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Code" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType addNewCode() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CodeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Code" element
     */
    @Override
    public void removeCode(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QSET[0], i);
        }
    }
}
