/*
 * XML Type:  ConceptSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ConceptSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ConceptSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemesType {
    private static final long serialVersionUID = 1L;

    public ConceptSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ConceptScheme"),
    };


    /**
     * Gets a List of "ConceptScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType> getConceptSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptSchemeArray,
                this::setConceptSchemeArray,
                this::insertNewConceptScheme,
                this::removeConceptScheme,
                this::sizeOfConceptSchemeArray
            );
        }
    }

    /**
     * Gets array of all "ConceptScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType[] getConceptSchemeArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType[0]);
    }

    /**
     * Gets ith "ConceptScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType getConceptSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptScheme" element
     */
    @Override
    public int sizeOfConceptSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ConceptScheme" element
     */
    @Override
    public void setConceptSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType conceptScheme) {
        generatedSetterHelperImpl(conceptScheme, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType insertNewConceptScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType addNewConceptScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptScheme" element
     */
    @Override
    public void removeConceptScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
