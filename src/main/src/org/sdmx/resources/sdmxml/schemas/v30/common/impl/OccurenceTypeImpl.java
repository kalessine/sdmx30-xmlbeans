/*
 * XML Type:  OccurenceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML OccurenceType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.sdmx.resources.sdmxml.schemas.v30.common.MaxOccursNumberType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.UnboundedCodeType
 */
public class OccurenceTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.OccurenceType, org.sdmx.resources.sdmxml.schemas.v30.common.MaxOccursNumberType, org.sdmx.resources.sdmxml.schemas.v30.common.UnboundedCodeType {
    private static final long serialVersionUID = 1L;

    public OccurenceTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected OccurenceTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
}
