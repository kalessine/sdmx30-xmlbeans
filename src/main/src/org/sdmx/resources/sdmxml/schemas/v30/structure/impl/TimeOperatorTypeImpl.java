/*
 * XML Type:  TimeOperatorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.structure.TimeOperatorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.structure.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML TimeOperatorType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/structure).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleOperatorType
 *     org.sdmx.resources.sdmxml.schemas.v30.structure.RangeOperatorType
 */
public class TimeOperatorTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v30.structure.TimeOperatorType, org.sdmx.resources.sdmxml.schemas.v30.structure.SimpleOperatorType, org.sdmx.resources.sdmxml.schemas.v30.structure.RangeOperatorType {
    private static final long serialVersionUID = 1L;

    public TimeOperatorTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected TimeOperatorTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
}
