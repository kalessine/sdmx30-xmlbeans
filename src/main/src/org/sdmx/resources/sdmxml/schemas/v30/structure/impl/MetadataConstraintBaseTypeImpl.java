/*
 * XML Type:  MetadataConstraintBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML MetadataConstraintBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class MetadataConstraintBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ConstraintTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.MetadataConstraintBaseType {
    private static final long serialVersionUID = 1L;

    public MetadataConstraintBaseTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "role"),
    };


    /**
     * Gets the "role" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType.Enum getRole() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType)get_default_attribute_value(PROPERTY_QNAME[0]);
            }
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
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
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.ConstraintRoleType)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(role);
        }
    }
}
