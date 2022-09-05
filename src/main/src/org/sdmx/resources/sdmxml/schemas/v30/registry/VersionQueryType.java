/*
 * XML Type:  VersionQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.registry;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML VersionQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/registry).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.sdmx.resources.sdmxml.schemas.v30.common.LegacyVersionNumberType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.SemanticVersionNumberType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.SemanticVersionReferenceType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.WildcardType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.WildCardValueType
 */
public interface VersionQueryType extends org.apache.xmlbeans.XmlAnySimpleType {
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    SimpleTypeFactory<org.sdmx.resources.sdmxml.schemas.v30.registry.VersionQueryType> Factory = new SimpleTypeFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "versionquerytype7bd8type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();

}
