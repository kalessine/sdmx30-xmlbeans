/*
 * XML Type:  ConceptType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ConceptType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ConceptTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ConceptBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptType {
    private static final long serialVersionUID = 1L;

    public ConceptTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CoreRepresentation"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ISOConceptReference"),
    };


    /**
     * Gets the "CoreRepresentation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptRepresentation getCoreRepresentation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptRepresentation target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptRepresentation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "CoreRepresentation" element
     */
    @Override
    public boolean isSetCoreRepresentation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "CoreRepresentation" element
     */
    @Override
    public void setCoreRepresentation(org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptRepresentation coreRepresentation) {
        generatedSetterHelperImpl(coreRepresentation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CoreRepresentation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptRepresentation addNewCoreRepresentation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptRepresentation target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConceptRepresentation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "CoreRepresentation" element
     */
    @Override
    public void unsetCoreRepresentation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "ISOConceptReference" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType getISOConceptReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ISOConceptReference" element
     */
    @Override
    public boolean isSetISOConceptReference() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "ISOConceptReference" element
     */
    @Override
    public void setISOConceptReference(org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType isoConceptReference) {
        generatedSetterHelperImpl(isoConceptReference, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ISOConceptReference" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType addNewISOConceptReference() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ISOConceptReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "ISOConceptReference" element
     */
    @Override
    public void unsetISOConceptReference() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
