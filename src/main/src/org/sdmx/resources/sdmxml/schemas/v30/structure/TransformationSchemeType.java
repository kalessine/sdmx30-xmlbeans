/*
 * XML Type:  TransformationSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TransformationSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface TransformationSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationSchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "transformationschemetype0376type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VtlMappingScheme" element
     */
    java.lang.String getVtlMappingScheme();

    /**
     * Gets (as xml) the "VtlMappingScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType xgetVtlMappingScheme();

    /**
     * True if has "VtlMappingScheme" element
     */
    boolean isSetVtlMappingScheme();

    /**
     * Sets the "VtlMappingScheme" element
     */
    void setVtlMappingScheme(java.lang.String vtlMappingScheme);

    /**
     * Sets (as xml) the "VtlMappingScheme" element
     */
    void xsetVtlMappingScheme(org.sdmx.resources.sdmxml.schemas.v30.common.VtlMappingSchemeReferenceType vtlMappingScheme);

    /**
     * Unsets the "VtlMappingScheme" element
     */
    void unsetVtlMappingScheme();

    /**
     * Gets the "NamePersonalisationScheme" element
     */
    java.lang.String getNamePersonalisationScheme();

    /**
     * Gets (as xml) the "NamePersonalisationScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.NamePersonalisationSchemeReferenceType xgetNamePersonalisationScheme();

    /**
     * True if has "NamePersonalisationScheme" element
     */
    boolean isSetNamePersonalisationScheme();

    /**
     * Sets the "NamePersonalisationScheme" element
     */
    void setNamePersonalisationScheme(java.lang.String namePersonalisationScheme);

    /**
     * Sets (as xml) the "NamePersonalisationScheme" element
     */
    void xsetNamePersonalisationScheme(org.sdmx.resources.sdmxml.schemas.v30.common.NamePersonalisationSchemeReferenceType namePersonalisationScheme);

    /**
     * Unsets the "NamePersonalisationScheme" element
     */
    void unsetNamePersonalisationScheme();

    /**
     * Gets the "CustomTypeScheme" element
     */
    java.lang.String getCustomTypeScheme();

    /**
     * Gets (as xml) the "CustomTypeScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CustomTypeSchemeReferenceType xgetCustomTypeScheme();

    /**
     * True if has "CustomTypeScheme" element
     */
    boolean isSetCustomTypeScheme();

    /**
     * Sets the "CustomTypeScheme" element
     */
    void setCustomTypeScheme(java.lang.String customTypeScheme);

    /**
     * Sets (as xml) the "CustomTypeScheme" element
     */
    void xsetCustomTypeScheme(org.sdmx.resources.sdmxml.schemas.v30.common.CustomTypeSchemeReferenceType customTypeScheme);

    /**
     * Unsets the "CustomTypeScheme" element
     */
    void unsetCustomTypeScheme();

    /**
     * Gets a List of "RulesetScheme" elements
     */
    java.util.List<java.lang.String> getRulesetSchemeList();

    /**
     * Gets array of all "RulesetScheme" elements
     */
    java.lang.String[] getRulesetSchemeArray();

    /**
     * Gets ith "RulesetScheme" element
     */
    java.lang.String getRulesetSchemeArray(int i);

    /**
     * Gets (as xml) a List of "RulesetScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType> xgetRulesetSchemeList();

    /**
     * Gets (as xml) array of all "RulesetScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType[] xgetRulesetSchemeArray();

    /**
     * Gets (as xml) ith "RulesetScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType xgetRulesetSchemeArray(int i);

    /**
     * Returns number of "RulesetScheme" element
     */
    int sizeOfRulesetSchemeArray();

    /**
     * Sets ith "RulesetScheme" element
     */
    void setRulesetSchemeArray(int i, java.lang.String rulesetScheme);

    /**
     * Sets (as xml) array of all "RulesetScheme" element
     */
    void xsetRulesetSchemeArray(org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType[] rulesetSchemeArray);

    /**
     * Sets (as xml) ith "RulesetScheme" element
     */
    void xsetRulesetSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType rulesetScheme);

    /**
     * Inserts the value as the ith "RulesetScheme" element
     */
    void insertRulesetScheme(int i, java.lang.String rulesetScheme);

    /**
     * Appends the value as the last "RulesetScheme" element
     */
    void addRulesetScheme(java.lang.String rulesetScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RulesetScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType insertNewRulesetScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RulesetScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.RulesetSchemeReferenceType addNewRulesetScheme();

    /**
     * Removes the ith "RulesetScheme" element
     */
    void removeRulesetScheme(int i);

    /**
     * Gets a List of "UserDefinedOperatorScheme" elements
     */
    java.util.List<java.lang.String> getUserDefinedOperatorSchemeList();

    /**
     * Gets array of all "UserDefinedOperatorScheme" elements
     */
    java.lang.String[] getUserDefinedOperatorSchemeArray();

    /**
     * Gets ith "UserDefinedOperatorScheme" element
     */
    java.lang.String getUserDefinedOperatorSchemeArray(int i);

    /**
     * Gets (as xml) a List of "UserDefinedOperatorScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType> xgetUserDefinedOperatorSchemeList();

    /**
     * Gets (as xml) array of all "UserDefinedOperatorScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType[] xgetUserDefinedOperatorSchemeArray();

    /**
     * Gets (as xml) ith "UserDefinedOperatorScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType xgetUserDefinedOperatorSchemeArray(int i);

    /**
     * Returns number of "UserDefinedOperatorScheme" element
     */
    int sizeOfUserDefinedOperatorSchemeArray();

    /**
     * Sets ith "UserDefinedOperatorScheme" element
     */
    void setUserDefinedOperatorSchemeArray(int i, java.lang.String userDefinedOperatorScheme);

    /**
     * Sets (as xml) array of all "UserDefinedOperatorScheme" element
     */
    void xsetUserDefinedOperatorSchemeArray(org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType[] userDefinedOperatorSchemeArray);

    /**
     * Sets (as xml) ith "UserDefinedOperatorScheme" element
     */
    void xsetUserDefinedOperatorSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType userDefinedOperatorScheme);

    /**
     * Inserts the value as the ith "UserDefinedOperatorScheme" element
     */
    void insertUserDefinedOperatorScheme(int i, java.lang.String userDefinedOperatorScheme);

    /**
     * Appends the value as the last "UserDefinedOperatorScheme" element
     */
    void addUserDefinedOperatorScheme(java.lang.String userDefinedOperatorScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserDefinedOperatorScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType insertNewUserDefinedOperatorScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "UserDefinedOperatorScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.UserDefinedOperatorSchemeReferenceType addNewUserDefinedOperatorScheme();

    /**
     * Removes the ith "UserDefinedOperatorScheme" element
     */
    void removeUserDefinedOperatorScheme(int i);
}
