/*
 * XML Type:  UserDefinedOperatorSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML UserDefinedOperatorSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface UserDefinedOperatorSchemeType extends org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "userdefinedoperatorschemetypee5bdtype");
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
}
