/*
 * XML Type:  UserDefinedOperatorSchemeBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML UserDefinedOperatorSchemeBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface UserDefinedOperatorSchemeBaseType extends org.sdmx.resources.sdmxml.schemas.v30.structure.VtlDefinitionSchemeType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorSchemeBaseType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "userdefinedoperatorschemebasetypef9aetype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets a List of "UserDefinedOperator" elements
     */
    java.util.List<org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType> getUserDefinedOperatorList();

    /**
     * Gets array of all "UserDefinedOperator" elements
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType[] getUserDefinedOperatorArray();

    /**
     * Gets ith "UserDefinedOperator" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType getUserDefinedOperatorArray(int i);

    /**
     * Returns number of "UserDefinedOperator" element
     */
    int sizeOfUserDefinedOperatorArray();

    /**
     * Sets ith "UserDefinedOperator" element
     */
    void setUserDefinedOperatorArray(int i, org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType userDefinedOperator);

    /**
     * Inserts and returns a new empty value (as xml) as the ith "UserDefinedOperator" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType insertNewUserDefinedOperator(int i);

    /**
     * Appends and returns a new empty value (as xml) as the last "UserDefinedOperator" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType addNewUserDefinedOperator();

    /**
     * Removes the ith "UserDefinedOperator" element
     */
    void removeUserDefinedOperator(int i);
}
