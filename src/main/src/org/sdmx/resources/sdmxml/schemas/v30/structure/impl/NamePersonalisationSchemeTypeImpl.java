/*
 * XML Type:  NamePersonalisationSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML NamePersonalisationSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class NamePersonalisationSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.VtlDefinitionSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationSchemeType {
    private static final long serialVersionUID = 1L;

    public NamePersonalisationSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "NamePersonalisation"),
    };


    /**
     * Gets a List of "NamePersonalisation" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType> getNamePersonalisationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getNamePersonalisationArray,
                this::setNamePersonalisationArray,
                this::insertNewNamePersonalisation,
                this::removeNamePersonalisation,
                this::sizeOfNamePersonalisationArray
            );
        }
    }

    /**
     * Gets array of all "NamePersonalisation" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType[] getNamePersonalisationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType[0]);
    }

    /**
     * Gets ith "NamePersonalisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType getNamePersonalisationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "NamePersonalisation" element
     */
    @Override
    public int sizeOfNamePersonalisationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "NamePersonalisation" element
     */
    @Override
    public void setNamePersonalisationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType namePersonalisation) {
        generatedSetterHelperImpl(namePersonalisation, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "NamePersonalisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType insertNewNamePersonalisation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "NamePersonalisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType addNewNamePersonalisation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "NamePersonalisation" element
     */
    @Override
    public void removeNamePersonalisation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
