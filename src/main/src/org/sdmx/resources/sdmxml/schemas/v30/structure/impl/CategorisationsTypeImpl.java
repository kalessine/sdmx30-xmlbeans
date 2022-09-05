/*
 * XML Type:  CategorisationsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CategorisationsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CategorisationsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationsType {
    private static final long serialVersionUID = 1L;

    public CategorisationsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Categorisation"),
    };


    /**
     * Gets a List of "Categorisation" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType> getCategorisationList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getCategorisationArray,
                this::setCategorisationArray,
                this::insertNewCategorisation,
                this::removeCategorisation,
                this::sizeOfCategorisationArray
            );
        }
    }

    /**
     * Gets array of all "Categorisation" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType[] getCategorisationArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType[0]);
    }

    /**
     * Gets ith "Categorisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType getCategorisationArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Categorisation" element
     */
    @Override
    public int sizeOfCategorisationArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Categorisation" element
     */
    @Override
    public void setCategorisationArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType categorisation) {
        generatedSetterHelperImpl(categorisation, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Categorisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType insertNewCategorisation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Categorisation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType addNewCategorisation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CategorisationType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Categorisation" element
     */
    @Override
    public void removeCategorisation(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
