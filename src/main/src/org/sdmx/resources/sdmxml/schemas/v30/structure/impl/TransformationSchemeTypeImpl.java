/*
 * XML Type:  TransformationSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML TransformationSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class TransformationSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.TransformationSchemeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType {
    private static final long serialVersionUID = 1L;

    public TransformationSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlMappingScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "NamePersonalisationScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "CustomTypeScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "RulesetScheme"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "UserDefinedOperatorScheme"),
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
     * Gets the "NamePersonalisationScheme" element
     */
    @Override
    public java.lang.String getNamePersonalisationScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "NamePersonalisationScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.NamePersonalisationSchemeReferenceType xgetNamePersonalisationScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NamePersonalisationSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NamePersonalisationSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * True if has "NamePersonalisationScheme" element
     */
    @Override
    public boolean isSetNamePersonalisationScheme() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "NamePersonalisationScheme" element
     */
    @Override
    public void setNamePersonalisationScheme(java.lang.String namePersonalisationScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(namePersonalisationScheme);
        }
    }

    /**
     * Sets (as xml) the "NamePersonalisationScheme" element
     */
    @Override
    public void xsetNamePersonalisationScheme(org.sdmx.resources.sdmxml.schemas.v30.common.NamePersonalisationSchemeReferenceType namePersonalisationScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.NamePersonalisationSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.NamePersonalisationSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.NamePersonalisationSchemeReferenceType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(namePersonalisationScheme);
        }
    }

    /**
     * Unsets the "NamePersonalisationScheme" element
     */
    @Override
    public void unsetNamePersonalisationScheme() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "CustomTypeScheme" element
     */
    @Override
    public java.lang.String getCustomTypeScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "CustomTypeScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.CustomTypeSchemeReferenceType xgetCustomTypeScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CustomTypeSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CustomTypeSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "CustomTypeScheme" element
     */
    @Override
    public boolean isSetCustomTypeScheme() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "CustomTypeScheme" element
     */
    @Override
    public void setCustomTypeScheme(java.lang.String customTypeScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(customTypeScheme);
        }
    }

    /**
     * Sets (as xml) the "CustomTypeScheme" element
     */
    @Override
    public void xsetCustomTypeScheme(org.sdmx.resources.sdmxml.schemas.v30.common.CustomTypeSchemeReferenceType customTypeScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.CustomTypeSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.CustomTypeSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.CustomTypeSchemeReferenceType)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(customTypeScheme);
        }
    }

    /**
     * Unsets the "CustomTypeScheme" element
     */
    @Override
    public void unsetCustomTypeScheme() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
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
        return getObjectArray(PROPERTY_QNAME[3], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "RulesetScheme" element
     */
    @Override
    public java.lang.String getRulesetSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
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
        return xgetArray(PROPERTY_QNAME[3], org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "RulesetScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType xgetRulesetSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[3], i);
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
            return get_store().count_elements(PROPERTY_QNAME[3]);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
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
            arraySetterHelper(rulesetSchemeArray, PROPERTY_QNAME[3]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[3], i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[3], i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType)get_store().insert_element_user(PROPERTY_QNAME[3], i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType)get_store().add_element_user(PROPERTY_QNAME[3]);
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
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "UserDefinedOperatorScheme" elements
     */
    @Override
    public java.util.List<java.lang.String> getUserDefinedOperatorSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getUserDefinedOperatorSchemeArray,
                this::setUserDefinedOperatorSchemeArray,
                this::insertUserDefinedOperatorScheme,
                this::removeUserDefinedOperatorScheme,
                this::sizeOfUserDefinedOperatorSchemeArray
            );
        }
    }

    /**
     * Gets array of all "UserDefinedOperatorScheme" elements
     */
    @Override
    public java.lang.String[] getUserDefinedOperatorSchemeArray() {
        return getObjectArray(PROPERTY_QNAME[4], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "UserDefinedOperatorScheme" element
     */
    @Override
    public java.lang.String getUserDefinedOperatorSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "UserDefinedOperatorScheme" elements
     */
    @Override
    public java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType> xgetUserDefinedOperatorSchemeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetUserDefinedOperatorSchemeArray,
                this::xsetUserDefinedOperatorSchemeArray,
                this::insertNewUserDefinedOperatorScheme,
                this::removeUserDefinedOperatorScheme,
                this::sizeOfUserDefinedOperatorSchemeArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "UserDefinedOperatorScheme" elements
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType[] xgetUserDefinedOperatorSchemeArray() {
        return xgetArray(PROPERTY_QNAME[4], org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType[]::new);
    }

    /**
     * Gets (as xml) ith "UserDefinedOperatorScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType xgetUserDefinedOperatorSchemeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "UserDefinedOperatorScheme" element
     */
    @Override
    public int sizeOfUserDefinedOperatorSchemeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "UserDefinedOperatorScheme" element
     */
    @Override
    public void setUserDefinedOperatorSchemeArray(int i, java.lang.String userDefinedOperatorScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(userDefinedOperatorScheme);
        }
    }

    /**
     * Sets (as xml) array of all "UserDefinedOperatorScheme" element
     */
    @Override
    public void xsetUserDefinedOperatorSchemeArray(org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType[]userDefinedOperatorSchemeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(userDefinedOperatorSchemeArray, PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets (as xml) ith "UserDefinedOperatorScheme" element
     */
    @Override
    public void xsetUserDefinedOperatorSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType userDefinedOperatorScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(userDefinedOperatorScheme);
        }
    }

    /**
     * Inserts the value as the ith "UserDefinedOperatorScheme" element
     */
    @Override
    public void insertUserDefinedOperatorScheme(int i, java.lang.String userDefinedOperatorScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            target.setStringValue(userDefinedOperatorScheme);
        }
    }

    /**
     * Appends the value as the last "UserDefinedOperatorScheme" element
     */
    @Override
    public void addUserDefinedOperatorScheme(java.lang.String userDefinedOperatorScheme) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            target.setStringValue(userDefinedOperatorScheme);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserDefinedOperatorScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType insertNewUserDefinedOperatorScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "UserDefinedOperatorScheme" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType addNewUserDefinedOperatorScheme() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "UserDefinedOperatorScheme" element
     */
    @Override
    public void removeUserDefinedOperatorScheme(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }
}
