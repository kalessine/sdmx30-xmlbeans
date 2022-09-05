/*
 * XML Type:  NamePersonalisationSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML NamePersonalisationSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class NamePersonalisationSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemesType {
    private static final long serialVersionUID = 1L;

    public NamePersonalisationSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "NamePersonalisationScheme"),
    };


    /**
     * Gets a List of "NamePersonalisationScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType> getNamePersonalisationSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNamePersonalisationSchemeArray,
                this::setNamePersonalisationSchemeArray,
                this::insertNewNamePersonalisationScheme,
                this::removeNamePersonalisationScheme,
                this::sizeOfNamePersonalisationSchemeArray
            );
        }
    }

    /**
     * Gets array of all "NamePersonalisationScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType[] getNamePersonalisationSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType[0]);
    }

    /**
     * Gets ith "NamePersonalisationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType getNamePersonalisationSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "NamePersonalisationScheme" element
     */
    @Override
    public int sizeOfNamePersonalisationSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "NamePersonalisationScheme" element
     */
    @Override
    public void setNamePersonalisationSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType namePersonalisationScheme) {
        generatedSetterHelperImpl(namePersonalisationScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NamePersonalisationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType insertNewNamePersonalisationScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "NamePersonalisationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType addNewNamePersonalisationScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "NamePersonalisationScheme" element
     */
    @Override
    public void removeNamePersonalisationScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
