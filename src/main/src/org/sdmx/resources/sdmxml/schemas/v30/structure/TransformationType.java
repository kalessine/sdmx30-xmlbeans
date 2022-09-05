/*
 * XML Type:  TransformationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML TransformationType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface TransformationType extends org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationBaseType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.TransformationType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "transformationtypeaf31type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "Expression" element
     */
    java.lang.String getExpression();

    /**
     * Gets (as xml) the "Expression" element
     */
    org.apache.xmlbeans.XmlString xgetExpression();

    /**
     * Sets the "Expression" element
     */
    void setExpression(java.lang.String expression);

    /**
     * Sets (as xml) the "Expression" element
     */
    void xsetExpression(org.apache.xmlbeans.XmlString expression);

    /**
     * Gets the "Result" element
     */
    java.lang.String getResult();

    /**
     * Gets (as xml) the "Result" element
     */
    org.apache.xmlbeans.XmlString xgetResult();

    /**
     * Sets the "Result" element
     */
    void setResult(java.lang.String result);

    /**
     * Sets (as xml) the "Result" element
     */
    void xsetResult(org.apache.xmlbeans.XmlString result);

    /**
     * Gets the "isPersistent" attribute
     */
    boolean getIsPersistent();

    /**
     * Gets (as xml) the "isPersistent" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPersistent();

    /**
     * Sets the "isPersistent" attribute
     */
    void setIsPersistent(boolean isPersistent);

    /**
     * Sets (as xml) the "isPersistent" attribute
     */
    void xsetIsPersistent(org.apache.xmlbeans.XmlBoolean isPersistent);
}
