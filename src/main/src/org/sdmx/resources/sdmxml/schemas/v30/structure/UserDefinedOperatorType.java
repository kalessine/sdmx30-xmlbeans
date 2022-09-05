/*
 * XML Type:  UserDefinedOperatorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML UserDefinedOperatorType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface UserDefinedOperatorType extends org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "userdefinedoperatortype92b8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "OperatorDefinition" element
     */
    java.lang.String getOperatorDefinition();

    /**
     * Gets (as xml) the "OperatorDefinition" element
     */
    org.apache.xmlbeans.XmlString xgetOperatorDefinition();

    /**
     * Sets the "OperatorDefinition" element
     */
    void setOperatorDefinition(java.lang.String operatorDefinition);

    /**
     * Sets (as xml) the "OperatorDefinition" element
     */
    void xsetOperatorDefinition(org.apache.xmlbeans.XmlString operatorDefinition);
}
