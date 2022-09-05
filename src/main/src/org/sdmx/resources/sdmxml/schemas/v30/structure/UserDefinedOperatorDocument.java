/*
 * An XML document type.
 * Localname: UserDefinedOperator
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one UserDefinedOperator(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public interface UserDefinedOperatorDocument extends org.sdmx.resources.sdmxml.schemas.v30.structure.ItemDocument {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "userdefinedoperatord6cedoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "UserDefinedOperator" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType getUserDefinedOperator();

    /**
     * Sets the "UserDefinedOperator" element
     */
    void setUserDefinedOperator(org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType userDefinedOperator);

    /**
     * Appends and returns a new empty "UserDefinedOperator" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.UserDefinedOperatorType addNewUserDefinedOperator();
}
