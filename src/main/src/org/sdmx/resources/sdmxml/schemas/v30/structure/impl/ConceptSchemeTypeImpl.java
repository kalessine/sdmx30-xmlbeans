/*
 * XML Type:  ConceptSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ConceptSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ConceptSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ItemSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeType {
    private static final long serialVersionUID = 1L;

    public ConceptSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Concept"),
    };


    /**
     * Gets a List of "Concept" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType> getConceptList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptArray,
                this::setConceptArray,
                this::insertNewConcept,
                this::removeConcept,
                this::sizeOfConceptArray
            );
        }
    }

    /**
     * Gets array of all "Concept" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType[] getConceptArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType[0]);
    }

    /**
     * Gets ith "Concept" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType getConceptArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Concept" element
     */
    @Override
    public int sizeOfConceptArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "Concept" element
     */
    @Override
    public void setConceptArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType concept) {
        generatedSetterHelperImpl(concept, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Concept" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType insertNewConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Concept" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType addNewConcept() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "Concept" element
     */
    @Override
    public void removeConcept(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
