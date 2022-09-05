/*
 * XML Type:  HeaderTimeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.message.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML HeaderTimeType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/message).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDateTime
 *     org.apache.xmlbeans.XmlDate
 */
public class HeaderTimeTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v30.message.HeaderTimeType, org.apache.xmlbeans.XmlDateTime, org.apache.xmlbeans.XmlDate {
    private static final long serialVersionUID = 1L;

    public HeaderTimeTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected HeaderTimeTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
}
