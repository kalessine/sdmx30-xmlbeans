/*
 * XML Type:  MetadataConstraintBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML MetadataConstraintBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface MetadataConstraintBaseType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintBaseType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "metadataconstraintbasetype0685type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "role" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType.Enum getRole();

    /**
     * Gets (as xml) the "role" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType xgetRole();

    /**
     * Sets the "role" attribute
     */
    void setRole(org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType.Enum role);

    /**
     * Sets (as xml) the "role" attribute
     */
    void xsetRole(org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType role);
}
