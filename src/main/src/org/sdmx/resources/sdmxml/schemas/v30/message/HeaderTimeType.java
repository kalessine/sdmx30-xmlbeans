/*
 * XML Type:  HeaderTimeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML HeaderTimeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDateTime
 *     org.apache.xmlbeans.XmlDate
 */
public interface HeaderTimeType extends org.apache.xmlbeans.XmlAnySimpleType {
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "headertimetype8df6type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();

}
