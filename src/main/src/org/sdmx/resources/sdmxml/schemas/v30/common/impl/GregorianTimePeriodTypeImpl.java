/*
 * XML Type:  GregorianTimePeriodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.GregorianTimePeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML GregorianTimePeriodType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlGYear
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlDate
 */
public class GregorianTimePeriodTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.GregorianTimePeriodType, org.apache.xmlbeans.XmlGYear, org.apache.xmlbeans.XmlGYearMonth, org.apache.xmlbeans.XmlDate {
    private static final long serialVersionUID = 1L;

    public GregorianTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected GregorianTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
}
