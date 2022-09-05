/*
 * XML Type:  ConceptSchemeMapsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ConceptSchemeMapsType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ConceptSchemeMapsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapsType {
    private static final long serialVersionUID = 1L;

    public ConceptSchemeMapsTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ConceptSchemeMap"),
    };


    /**
     * Gets a List of "ConceptSchemeMap" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType> getConceptSchemeMapList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConceptSchemeMapArray,
                this::setConceptSchemeMapArray,
                this::insertNewConceptSchemeMap,
                this::removeConceptSchemeMap,
                this::sizeOfConceptSchemeMapArray
            );
        }
    }

    /**
     * Gets array of all "ConceptSchemeMap" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType[] getConceptSchemeMapArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType[0]);
    }

    /**
     * Gets ith "ConceptSchemeMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType getConceptSchemeMapArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptSchemeMap" element
     */
    @Override
    public int sizeOfConceptSchemeMapArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ConceptSchemeMap" element
     */
    @Override
    public void setConceptSchemeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType conceptSchemeMap) {
        generatedSetterHelperImpl(conceptSchemeMap, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSchemeMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType insertNewConceptSchemeMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSchemeMap" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType addNewConceptSchemeMap() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptSchemeMapType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptSchemeMap" element
     */
    @Override
    public void removeConceptSchemeMap(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }
}
