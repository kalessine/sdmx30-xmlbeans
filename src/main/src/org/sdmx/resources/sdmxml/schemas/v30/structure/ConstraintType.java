/*
 * XML Type:  ConstraintType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML ConstraintType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public interface ConstraintType extends org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintBaseType {
    AbstractDocumentFactory<org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintType> Factory = new AbstractDocumentFactory<>(org.apache.xmlbeans.metadata.system.s8F117A22AAF2566D69780D55C438B5BD.TypeSystemHolder.typeSystem, "constrainttypede85type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "ConstraintAttachment" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType getConstraintAttachment();

    /**
     * True if has "ConstraintAttachment" element
     */
    boolean isSetConstraintAttachment();

    /**
     * Sets the "ConstraintAttachment" element
     */
    void setConstraintAttachment(org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType constraintAttachment);

    /**
     * Appends and returns a new empty "ConstraintAttachment" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType addNewConstraintAttachment();

    /**
     * Unsets the "ConstraintAttachment" element
     */
    void unsetConstraintAttachment();

    /**
     * Gets the "ReleaseCalendar" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType getReleaseCalendar();

    /**
     * True if has "ReleaseCalendar" element
     */
    boolean isSetReleaseCalendar();

    /**
     * Sets the "ReleaseCalendar" element
     */
    void setReleaseCalendar(org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType releaseCalendar);

    /**
     * Appends and returns a new empty "ReleaseCalendar" element
     */
    org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType addNewReleaseCalendar();

    /**
     * Unsets the "ReleaseCalendar" element
     */
    void unsetReleaseCalendar();

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
