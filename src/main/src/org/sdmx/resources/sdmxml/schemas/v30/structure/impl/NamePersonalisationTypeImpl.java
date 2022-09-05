/*
 * XML Type:  NamePersonalisationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML NamePersonalisationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class NamePersonalisationTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.NamePersonalisationBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.NamePersonalisationType {
    private static final long serialVersionUID = 1L;

    public NamePersonalisationTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlDefaultName"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "PersonalisedName"),
        new QName("", "vtlArtefact"),
    };


    /**
     * Gets the "VtlDefaultName" element
     */
    @Override
    public java.lang.String getVtlDefaultName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "VtlDefaultName" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetVtlDefaultName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "VtlDefaultName" element
     */
    @Override
    public void setVtlDefaultName(java.lang.String vtlDefaultName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(vtlDefaultName);
        }
    }

    /**
     * Sets (as xml) the "VtlDefaultName" element
     */
    @Override
    public void xsetVtlDefaultName(org.apache.xmlbeans.XmlString vtlDefaultName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(vtlDefaultName);
        }
    }

    /**
     * Gets the "PersonalisedName" element
     */
    @Override
    public java.lang.String getPersonalisedName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "PersonalisedName" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetPersonalisedName() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "PersonalisedName" element
     */
    @Override
    public void setPersonalisedName(java.lang.String personalisedName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(personalisedName);
        }
    }

    /**
     * Sets (as xml) the "PersonalisedName" element
     */
    @Override
    public void xsetPersonalisedName(org.apache.xmlbeans.XmlString personalisedName) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(personalisedName);
        }
    }

    /**
     * Gets the "vtlArtefact" attribute
     */
    @Override
    public java.lang.String getVtlArtefact() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "vtlArtefact" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetVtlArtefact() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "vtlArtefact" attribute
     */
    @Override
    public void setVtlArtefact(java.lang.String vtlArtefact) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(vtlArtefact);
        }
    }

    /**
     * Sets (as xml) the "vtlArtefact" attribute
     */
    @Override
    public void xsetVtlArtefact(org.apache.xmlbeans.XmlString vtlArtefact) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(vtlArtefact);
        }
    }
}
