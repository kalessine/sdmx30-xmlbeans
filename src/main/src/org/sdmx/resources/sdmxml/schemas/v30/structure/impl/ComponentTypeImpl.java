/*
 * XML Type:  ComponentType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ComponentType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ComponentTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ComponentBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ComponentType {
    private static final long serialVersionUID = 1L;

    public ComponentTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ConceptIdentity"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "LocalRepresentation"),
    };


    /**
     * Gets the "ConceptIdentity" element
     */
    @Override
    public java.lang.String getConceptIdentity() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ConceptIdentity" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType xgetConceptIdentity() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "ConceptIdentity" element
     */
    @Override
    public boolean isSetConceptIdentity() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "ConceptIdentity" element
     */
    @Override
    public void setConceptIdentity(java.lang.String conceptIdentity) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(conceptIdentity);
        }
    }

    /**
     * Sets (as xml) the "ConceptIdentity" element
     */
    @Override
    public void xsetConceptIdentity(org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType conceptIdentity) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(conceptIdentity);
        }
    }

    /**
     * Unsets the "ConceptIdentity" element
     */
    @Override
    public void unsetConceptIdentity() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "LocalRepresentation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType getLocalRepresentation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "LocalRepresentation" element
     */
    @Override
    public boolean isSetLocalRepresentation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "LocalRepresentation" element
     */
    @Override
    public void setLocalRepresentation(org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType localRepresentation) {
        generatedSetterHelperImpl(localRepresentation, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "LocalRepresentation" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType addNewLocalRepresentation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.RepresentationType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "LocalRepresentation" element
     */
    @Override
    public void unsetLocalRepresentation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }
}
