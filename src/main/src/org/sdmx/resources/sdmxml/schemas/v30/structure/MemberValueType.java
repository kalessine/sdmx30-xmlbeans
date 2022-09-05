/*
 * XML Type:  MemberValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MemberValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType.
 */
public interface MemberValueType extends org.sdmx.resources.sdmxml.schemas.v30.structure.WildcardedMemberValueType {
    DocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MemberValueType> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "membervaluetypeaa2dtype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "cascadeValues" attribute
     */
    java.lang.Object getCascadeValues();

    /**
     * Gets (as xml) the "cascadeValues" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType xgetCascadeValues();

    /**
     * True if has "cascadeValues" attribute
     */
    boolean isSetCascadeValues();

    /**
     * Sets the "cascadeValues" attribute
     */
    void setCascadeValues(java.lang.Object cascadeValues);

    /**
     * Sets (as xml) the "cascadeValues" attribute
     */
    void xsetCascadeValues(org.sdmx.resources.sdmxml.schemas.v30.common.CascadeSelectionType cascadeValues);

    /**
     * Unsets the "cascadeValues" attribute
     */
    void unsetCascadeValues();
}
