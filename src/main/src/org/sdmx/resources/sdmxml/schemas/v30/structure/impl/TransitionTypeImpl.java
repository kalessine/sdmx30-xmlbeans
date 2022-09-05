/*
 * XML Type:  TransitionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML TransitionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class TransitionTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.TransitionBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TransitionType {
    private static final long serialVersionUID = 1L;

    public TransitionTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TargetStep"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "Condition"),
        new QName("", "localID"),
    };


    /**
     * Gets the "TargetStep" element
     */
    @Override
    public java.lang.String getTargetStep() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "TargetStep" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType xgetTargetStep() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "TargetStep" element
     */
    @Override
    public void setTargetStep(java.lang.String targetStep) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(targetStep);
        }
    }

    /**
     * Sets (as xml) the "TargetStep" element
     */
    @Override
    public void xsetTargetStep(org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType targetStep) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.NestedIDType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(targetStep);
        }
    }

    /**
     * Gets a List of "Condition" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.TextType> getConditionList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getConditionArray,
                this::setConditionArray,
                this::insertNewCondition,
                this::removeCondition,
                this::sizeOfConditionArray
            );
        }
    }

    /**
     * Gets array of all "Condition" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType[] getConditionArray() {
        return getXmlObjectArray(PROPERTY_QNAME[1], new org.sdmx.resources.sdmxml.schemas.v30.common.TextType[0]);
    }

    /**
     * Gets ith "Condition" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType getConditionArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "Condition" element
     */
    @Override
    public int sizeOfConditionArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "Condition" element
     */
    @Override
    public void setConditionArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.TextType condition) {
        generatedSetterHelperImpl(condition, PROPERTY_QNAME[1], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "Condition" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType insertNewCondition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "Condition" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.TextType addNewCondition() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.TextType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "Condition" element
     */
    @Override
    public void removeCondition(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets the "localID" attribute
     */
    @Override
    public java.lang.String getLocalID() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "localID" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.IDType xgetLocalID() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * True if has "localID" attribute
     */
    @Override
    public boolean isSetLocalID() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "localID" attribute
     */
    @Override
    public void setLocalID(java.lang.String localID) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(localID);
        }
    }

    /**
     * Sets (as xml) the "localID" attribute
     */
    @Override
    public void xsetLocalID(org.sdmx.resources.sdmxml.schemas.v30.common.IDType localID) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.IDType)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(localID);
        }
    }

    /**
     * Unsets the "localID" attribute
     */
    @Override
    public void unsetLocalID() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}
