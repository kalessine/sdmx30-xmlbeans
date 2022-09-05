/*
 * XML Type:  CustomTypeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML CustomTypeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a complex type.
 */
public class CustomTypeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.CustomTypeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeType {
    private static final long serialVersionUID = 1L;

    public CustomTypeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlScalarType"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "DataType"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "VtlLiteralFormat"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "OutputFormat"),
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "NullValue"),
    };


    /**
     * Gets the "VtlScalarType" element
     */
    @Override
    public java.lang.String getVtlScalarType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "VtlScalarType" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetVtlScalarType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return target;
        }
    }

    /**
     * Sets the "VtlScalarType" element
     */
    @Override
    public void setVtlScalarType(java.lang.String vtlScalarType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.setStringValue(vtlScalarType);
        }
    }

    /**
     * Sets (as xml) the "VtlScalarType" element
     */
    @Override
    public void xsetVtlScalarType(org.apache.xmlbeans.XmlString vtlScalarType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[0]);
            }
            target.set(vtlScalarType);
        }
    }

    /**
     * Gets the "DataType" element
     */
    @Override
    public java.lang.String getDataType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DataType" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeDataType xgetDataType() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeDataType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            return target;
        }
    }

    /**
     * Sets the "DataType" element
     */
    @Override
    public void setDataType(java.lang.String dataType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.setStringValue(dataType);
        }
    }

    /**
     * Sets (as xml) the "DataType" element
     */
    @Override
    public void xsetDataType(org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeDataType dataType) {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeDataType)get_store().find_element_user(PROPERTY_QNAME[1], 0);
            if (target == null) {
                target = (org.sdmx.resources.sdmxml.schemas.v30.structure.CustomTypeDataType)get_store().add_element_user(PROPERTY_QNAME[1]);
            }
            target.set(dataType);
        }
    }

    /**
     * Gets the "VtlLiteralFormat" element
     */
    @Override
    public java.lang.String getVtlLiteralFormat() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "VtlLiteralFormat" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetVtlLiteralFormat() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            return target;
        }
    }

    /**
     * True if has "VtlLiteralFormat" element
     */
    @Override
    public boolean isSetVtlLiteralFormat() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]) != 0;
        }
    }

    /**
     * Sets the "VtlLiteralFormat" element
     */
    @Override
    public void setVtlLiteralFormat(java.lang.String vtlLiteralFormat) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.setStringValue(vtlLiteralFormat);
        }
    }

    /**
     * Sets (as xml) the "VtlLiteralFormat" element
     */
    @Override
    public void xsetVtlLiteralFormat(org.apache.xmlbeans.XmlString vtlLiteralFormat) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[2], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[2]);
            }
            target.set(vtlLiteralFormat);
        }
    }

    /**
     * Unsets the "VtlLiteralFormat" element
     */
    @Override
    public void unsetVtlLiteralFormat() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], 0);
        }
    }

    /**
     * Gets the "OutputFormat" element
     */
    @Override
    public java.lang.String getOutputFormat() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "OutputFormat" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetOutputFormat() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            return target;
        }
    }

    /**
     * True if has "OutputFormat" element
     */
    @Override
    public boolean isSetOutputFormat() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]) != 0;
        }
    }

    /**
     * Sets the "OutputFormat" element
     */
    @Override
    public void setOutputFormat(java.lang.String outputFormat) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.setStringValue(outputFormat);
        }
    }

    /**
     * Sets (as xml) the "OutputFormat" element
     */
    @Override
    public void xsetOutputFormat(org.apache.xmlbeans.XmlString outputFormat) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[3], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[3]);
            }
            target.set(outputFormat);
        }
    }

    /**
     * Unsets the "OutputFormat" element
     */
    @Override
    public void unsetOutputFormat() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], 0);
        }
    }

    /**
     * Gets the "NullValue" element
     */
    @Override
    public java.lang.String getNullValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return (target == null) ? null : target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "NullValue" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetNullValue() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            return target;
        }
    }

    /**
     * True if has "NullValue" element
     */
    @Override
    public boolean isSetNullValue() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]) != 0;
        }
    }

    /**
     * Sets the "NullValue" element
     */
    @Override
    public void setNullValue(java.lang.String nullValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.setStringValue(nullValue);
        }
    }

    /**
     * Sets (as xml) the "NullValue" element
     */
    @Override
    public void xsetNullValue(org.apache.xmlbeans.XmlString nullValue) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[4], 0);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[4]);
            }
            target.set(nullValue);
        }
    }

    /**
     * Unsets the "NullValue" element
     */
    @Override
    public void unsetNullValue() {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], 0);
        }
    }
}
