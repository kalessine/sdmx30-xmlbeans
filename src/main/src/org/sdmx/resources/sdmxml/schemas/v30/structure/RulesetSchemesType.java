/*
 * XML Type:  RulesetSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML RulesetSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface RulesetSchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "rulesetschemestype38d0type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "RulesetScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType> getRulesetSchemeList();

    /**
     * Gets array of all "RulesetScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType[] getRulesetSchemeArray();

    /**
     * Gets ith "RulesetScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType getRulesetSchemeArray(int i);

    /**
     * Returns number of "RulesetScheme" element
     */
    int sizeOfRulesetSchemeArray();

    /**
     * Sets ith "RulesetScheme" element
     */
    void setRulesetSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType rulesetScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "RulesetScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType insertNewRulesetScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "RulesetScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.RulesetSchemeType addNewRulesetScheme();

    /**
     * Removes the ith "RulesetScheme" element
     */
    void removeRulesetScheme(int i);
}
