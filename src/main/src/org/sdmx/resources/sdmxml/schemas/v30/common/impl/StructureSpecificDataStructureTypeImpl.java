/*
 * XML Type:  StructureSpecificDataStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.StructureSpecificDataStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML StructureSpecificDataStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a complex type.
 */
public class StructureSpecificDataStructureTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.common.impl.DataStructureTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.StructureSpecificDataStructureType {
    private static final long serialVersionUID = 1L;

    public StructureSpecificDataStructureTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("", "namespace"),
        new QName("", "dimensionAtObservation"),
        new QName("", "explicitMeasures"),
    };


    /**
     * Gets the "namespace" attribute
     */
    @Override
    public java.lang.String getNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "namespace" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlAnyURI xgetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * True if has "namespace" attribute
     */
    @Override
    public boolean isSetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[0]) != null;
        }
    }

    /**
     * Sets the "namespace" attribute
     */
    @Override
    public void setNamespace(java.lang.String namespace) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(namespace);
        }
    }

    /**
     * Sets (as xml) the "namespace" attribute
     */
    @Override
    public void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROPERTY_QNAME[0]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROPERTY_QNAME[0]);
            }
            target.set(namespace);
        }
    }

    /**
     * Unsets the "namespace" attribute
     */
    @Override
    public void unsetNamespace() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Gets the "dimensionAtObservation" attribute
     */
    @Override
    public java.lang.String getDimensionAtObservation() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "dimensionAtObservation" attribute
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType xgetDimensionAtObservation() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * True if has "dimensionAtObservation" attribute
     */
    @Override
    public boolean isSetDimensionAtObservation() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[1]) != null;
        }
    }

    /**
     * Sets the "dimensionAtObservation" attribute
     */
    @Override
    public void setDimensionAtObservation(java.lang.String dimensionAtObservation) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(dimensionAtObservation);
        }
    }

    /**
     * Sets (as xml) the "dimensionAtObservation" attribute
     */
    @Override
    public void xsetDimensionAtObservation(org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType dimensionAtObservation) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType)get_store().find_attribute_user(PROPERTY_QNAME[1]);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.common.ObservationDimensionType)get_store().add_attribute_user(PROPERTY_QNAME[1]);
            }
            target.set(dimensionAtObservation);
        }
    }

    /**
     * Unsets the "dimensionAtObservation" attribute
     */
    @Override
    public void unsetDimensionAtObservation() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Gets the "explicitMeasures" attribute
     */
    @Override
    public boolean getExplicitMeasures() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return (target == null) ? false : target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) the "explicitMeasures" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetExplicitMeasures() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROPERTY_QNAME[2]);
            }
            return target;
        }
    }

    /**
     * True if has "explicitMeasures" attribute
     */
    @Override
    public boolean isSetExplicitMeasures() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().find_attribute_user(PROPERTY_QNAME[2]) != null;
        }
    }

    /**
     * Sets the "explicitMeasures" attribute
     */
    @Override
    public void setExplicitMeasures(boolean explicitMeasures) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.setBooleanValue(explicitMeasures);
        }
    }

    /**
     * Sets (as xml) the "explicitMeasures" attribute
     */
    @Override
    public void xsetExplicitMeasures(org.apache.xmlbeans.XmlBoolean explicitMeasures) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROPERTY_QNAME[2]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROPERTY_QNAME[2]);
            }
            target.set(explicitMeasures);
        }
    }

    /**
     * Unsets the "explicitMeasures" attribute
     */
    @Override
    public void unsetExplicitMeasures() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_attribute(PROPERTY_QNAME[2]);
        }
    }
}
