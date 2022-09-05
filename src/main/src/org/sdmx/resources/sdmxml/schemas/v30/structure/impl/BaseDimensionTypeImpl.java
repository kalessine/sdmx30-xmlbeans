/*
 * XML Type:  BaseDimensionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.BaseDimensionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML BaseDimensionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class BaseDimensionTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.BaseDimensionBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.BaseDimensionType {
    private static final long serialVersionUID = 1L;

    public BaseDimensionTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ConceptRole"),
        new QName("", "position"),
    };


    /**
     * Gets a List of "ConceptRole" elements
     */
    @Override
    public java.util.List<java.lang.String> getConceptRoleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getConceptRoleArray,
                this::setConceptRoleArray,
                this::insertConceptRole,
                this::removeConceptRole,
                this::sizeOfConceptRoleArray
            );
        }
    }

    /**
     * Gets array of all "ConceptRole" elements
     */
    @Override
    public java.lang.String[] getConceptRoleArray() {
        return getObjectArray(PROPERTY_QNAME[0], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "ConceptRole" element
     */
    @Override
    public java.lang.String getConceptRoleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "ConceptRole" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType> xgetConceptRoleList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetConceptRoleArray,
                this::xsetConceptRoleArray,
                this::insertNewConceptRole,
                this::removeConceptRole,
                this::sizeOfConceptRoleArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "ConceptRole" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType[] xgetConceptRoleArray() {
        return xgetArray(PROPERTY_QNAME[0], org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "ConceptRole" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType xgetConceptRoleArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ConceptRole" element
     */
    @Override
    public int sizeOfConceptRoleArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets ith "ConceptRole" element
     */
    @Override
    public void setConceptRoleArray(int i, java.lang.String conceptRole) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(conceptRole);
        }
    }

    /**
     * Sets (as xml) array of all "ConceptRole" element
     */
    @Override
    public void xsetConceptRoleArray(org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType[]conceptRoleArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(conceptRoleArray, PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets (as xml) ith "ConceptRole" element
     */
    @Override
    public void xsetConceptRoleArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType conceptRole) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptRole);
        }
    }

    /**
     * Inserts the value as the ith "ConceptRole" element
     */
    @Override
    public void insertConceptRole(int i, java.lang.String conceptRole) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            target.setStringValue(conceptRole);
        }
    }

    /**
     * Appends the value as the last "ConceptRole" element
     */
    @Override
    public void addConceptRole(java.lang.String conceptRole) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            target.setStringValue(conceptRole);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptRole" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType insertNewConceptRole(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptRole" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType addNewConceptRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConceptReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "ConceptRole" element
     */
    @Override
    public void removeConceptRole(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets the "position" attribute
     */
    @Override
    public int getPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? 0 : target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "position" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetPosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "position" attribute
     */
    @Override
    public boolean isSetPosition() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "position" attribute
     */
    @Override
    public void setPosition(int position) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setIntValue(position);
        }
    }

    /**
     * Sets (as xml) the "position" attribute
     */
    @Override
    public void xsetPosition(org.apache.xmlbeans.XmlInt position) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(position);
        }
    }

    /**
     * Unsets the "position" attribute
     */
    @Override
    public void unsetPosition() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }
}
