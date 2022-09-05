/*
 * XML Type:  ResultType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ResultType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a complex type.
 */
public class ResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v30.registry.ResultType {
    private static final long serialVersionUID = 1L;

    public ResultTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Registration"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry", "Constraint"),
    };


    /**
     * Gets the "Registration" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType getRegistration() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Registration" element
     */
    @Override
    public void setRegistration(org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType registration) {
        generatedSetterHelperImpl(registration, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Registration" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType addNewRegistration() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.registry.RegistrationType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Gets a List of "Constraint" elements
     */
    @Override
    public java.util.List<java.lang.String> getConstraintList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getConstraintArray,
                this::setConstraintArray,
                this::insertConstraint,
                this::removeConstraint,
                this::sizeOfConstraintArray
            );
        }
    }

    /**
     * Gets array of all "Constraint" elements
     */
    @Override
    public java.lang.String[] getConstraintArray() {
        return getObjectArray(PROPERTY_QNAME[1], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "Constraint" element
     */
    @Override
    public java.lang.String getConstraintArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "Constraint" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType> xgetConstraintList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetConstraintArray,
                this::xsetConstraintArray,
                this::insertNewConstraint,
                this::removeConstraint,
                this::sizeOfConstraintArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "Constraint" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType[] xgetConstraintArray() {
        return xgetArray(PROPERTY_QNAME[1], org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "Constraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType xgetConstraintArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Constraint" element
     */
    @Override
    public int sizeOfConstraintArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Constraint" element
     */
    @Override
    public void setConstraintArray(int i, java.lang.String constraint) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(constraint);
        }
    }

    /**
     * Sets (as xml) array of all "Constraint" element
     */
    @Override
    public void xsetConstraintArray(org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType[]constraintArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(constraintArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "Constraint" element
     */
    @Override
    public void xsetConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType constraint) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(constraint);
        }
    }

    /**
     * Inserts the value as the ith "Constraint" element
     */
    @Override
    public void insertConstraint(int i, java.lang.String constraint) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setStringValue(constraint);
        }
    }

    /**
     * Appends the value as the last "Constraint" element
     */
    @Override
    public void addConstraint(java.lang.String constraint) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setStringValue(constraint);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Constraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType insertNewConstraint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Constraint" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType addNewConstraint() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ConstraintReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Constraint" element
     */
    @Override
    public void removeConstraint(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
