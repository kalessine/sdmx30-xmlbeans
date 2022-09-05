/*
 * XML Type:  UserDefinedOperatorSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML UserDefinedOperatorSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface UserDefinedOperatorSchemesType extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemesType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "userdefinedoperatorschemestype1134type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "UserDefinedOperatorScheme" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType> getUserDefinedOperatorSchemeList();

    /**
     * Gets array of all "UserDefinedOperatorScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType[] getUserDefinedOperatorSchemeArray();

    /**
     * Gets ith "UserDefinedOperatorScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType getUserDefinedOperatorSchemeArray(int i);

    /**
     * Returns number of "UserDefinedOperatorScheme" element
     */
    int sizeOfUserDefinedOperatorSchemeArray();

    /**
     * Sets ith "UserDefinedOperatorScheme" element
     */
    void setUserDefinedOperatorSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType userDefinedOperatorScheme);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserDefinedOperatorScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType insertNewUserDefinedOperatorScheme(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "UserDefinedOperatorScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeType addNewUserDefinedOperatorScheme();

    /**
     * Removes the ith "UserDefinedOperatorScheme" element
     */
    void removeUserDefinedOperatorScheme(int i);
}
