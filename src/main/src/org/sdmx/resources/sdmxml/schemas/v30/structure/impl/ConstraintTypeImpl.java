/*
 * XML Type:  ConstraintType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML ConstraintType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class ConstraintTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ConstraintBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintType {
    private static final long serialVersionUID = 1L;

    public ConstraintTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ConstraintAttachment"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "ReleaseCalendar"),
        new QName("", "role"),
    };


    /**
     * Gets the "ConstraintAttachment" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType getConstraintAttachment() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ConstraintAttachment" element
     */
    @Override
    public boolean isSetConstraintAttachment() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]) != 0;
        }
    }

    /**
     * Sets the "ConstraintAttachment" element
     */
    @Override
    public void setConstraintAttachment(org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType constraintAttachment) {
        generatedSetterHelperImpl(constraintAttachment, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ConstraintAttachment" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType addNewConstraintAttachment() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintAttachmentType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Unsets the "ConstraintAttachment" element
     */
    @Override
    public void unsetConstraintAttachment() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], 0);
        }
    }

    /**
     * Gets the "ReleaseCalendar" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType getReleaseCalendar() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * True if has "ReleaseCalendar" element
     */
    @Override
    public boolean isSetReleaseCalendar() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]) != 0;
        }
    }

    /**
     * Sets the "ReleaseCalendar" element
     */
    @Override
    public void setReleaseCalendar(org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType releaseCalendar) {
        generatedSetterHelperImpl(releaseCalendar, PROPERTY_QNAME[1], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ReleaseCalendar" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType addNewReleaseCalendar() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ReleaseCalendarType)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Unsets the "ReleaseCalendar" element
     */
    @Override
    public void unsetReleaseCalendar() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], 0);
        }
    }

    /**
     * Gets the "role" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType.Enum getRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return (target == null) ? null : (org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "role" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType xgetRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Sets the "role" attribute
     */
    @Override
    public void setRole(org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType.Enum role) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setEnumValue(role);
        }
    }

    /**
     * Sets (as xml) the "role" attribute
     */
    @Override
    public void xsetRole(org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType role) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(role);
        }
    }
}
