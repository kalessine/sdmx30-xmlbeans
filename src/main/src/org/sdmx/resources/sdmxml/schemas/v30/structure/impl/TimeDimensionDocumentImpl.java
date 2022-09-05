/*
 * An XML document type.
 * Localname: TimeDimension
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one TimeDimension(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure) element.
 *
 * This is a complex type.
 */
public class TimeDimensionDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v30.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionDocument {
    private static final long serialVersionUID = 1L;

    public TimeDimensionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure", "TimeDimension"),
    };


    /**
     * Gets the "TimeDimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType getTimeDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "TimeDimension" element
     */
    @Override
    public void setTimeDimension(org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType timeDimension) {
        generatedSetterHelperImpl(timeDimension, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "TimeDimension" element
     */
    @Override
    public org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType addNewTimeDimension() {
        synchronized (monitor()) {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v30.structure.TimeDimensionType)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
