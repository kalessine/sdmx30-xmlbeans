/*
 * XML Type:  ToVtlMappingMethodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingMethodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ToVtlMappingMethodType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.sdmx.resources.sdmxml.schemas.v30.structure.StandardToVtlMappingMethodType
 *     org.apache.xmlbeans.XmlString
 */
public interface ToVtlMappingMethodType extends org.apache.xmlbeans.XmlAnySimpleType {
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ToVtlMappingMethodType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "tovtlmappingmethodtype20c4type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();

}
