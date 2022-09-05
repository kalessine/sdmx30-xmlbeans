/*
 * XML Type:  UserDefinedOperatorSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML UserDefinedOperatorSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class UserDefinedOperatorSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.UserDefinedOperatorSchemeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType {
    private static final long serialVersionUID = 1L;

    public UserDefinedOperatorSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlMappingScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "RulesetScheme"),
    };


    /**
     * Gets the "VtlMappingScheme" element
     */
    @Override
    public java.lang.String getVtlMappingScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "VtlMappingScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType xgetVtlMappingScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * True if has "VtlMappingScheme" element
     */
    @Override
    public boolean isSetVtlMappingScheme() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "VtlMappingScheme" element
     */
    @Override
    public void setVtlMappingScheme(java.lang.String vtlMappingScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(vtlMappingScheme);
        }
    }

    /**
     * Sets (as xml) the "VtlMappingScheme" element
     */
    @Override
    public void xsetVtlMappingScheme(org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType vtlMappingScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(vtlMappingScheme);
        }
    }

    /**
     * Unsets the "VtlMappingScheme" element
     */
    @Override
    public void unsetVtlMappingScheme() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets a List of "RulesetScheme" elements
     */
    @Override
    public java.util.List<java.lang.String> getRulesetSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getRulesetSchemeArray,
                this::setRulesetSchemeArray,
                this::insertRulesetScheme,
                this::removeRulesetScheme,
                this::sizeOfRulesetSchemeArray
            );
        }
    }

    /**
     * Gets array of all "RulesetScheme" elements
     */
    @Override
    public java.lang.String[] getRulesetSchemeArray() {
        return getObjectArray(PROPERTY_QNAME[1], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "RulesetScheme" element
     */
    @Override
    public java.lang.String getRulesetSchemeArray(int i) {
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
     * Gets (as xml) a List of "RulesetScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType> xgetRulesetSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetRulesetSchemeArray,
                this::xsetRulesetSchemeArray,
                this::insertNewRulesetScheme,
                this::removeRulesetScheme,
                this::sizeOfRulesetSchemeArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "RulesetScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType[] xgetRulesetSchemeArray() {
        return xgetArray(PROPERTY_QNAME[1], org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "RulesetScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType xgetRulesetSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "RulesetScheme" element
     */
    @Override
    public int sizeOfRulesetSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "RulesetScheme" element
     */
    @Override
    public void setRulesetSchemeArray(int i, java.lang.String rulesetScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(rulesetScheme);
        }
    }

    /**
     * Sets (as xml) array of all "RulesetScheme" element
     */
    @Override
    public void xsetRulesetSchemeArray(org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType[]rulesetSchemeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(rulesetSchemeArray, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "RulesetScheme" element
     */
    @Override
    public void xsetRulesetSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType rulesetScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(rulesetScheme);
        }
    }

    /**
     * Inserts the value as the ith "RulesetScheme" element
     */
    @Override
    public void insertRulesetScheme(int i, java.lang.String rulesetScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setStringValue(rulesetScheme);
        }
    }

    /**
     * Appends the value as the last "RulesetScheme" element
     */
    @Override
    public void addRulesetScheme(java.lang.String rulesetScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setStringValue(rulesetScheme);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RulesetScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType insertNewRulesetScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "RulesetScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType addNewRulesetScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "RulesetScheme" element
     */
    @Override
    public void removeRulesetScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }
}
