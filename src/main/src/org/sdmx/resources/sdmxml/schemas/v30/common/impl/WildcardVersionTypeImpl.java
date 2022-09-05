/*
 * XML Type:  WildcardVersionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.WildcardVersionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML WildcardVersionType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.sdmx.resources.sdmxml.schemas.v30.common.LegacyVersionNumberType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.SemanticVersionNumberType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.SemanticVersionReferenceType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.WildcardType
 */
public class WildcardVersionTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.WildcardVersionType, org.sdmx.resources.sdmxml.schemas.v30.common.VersionReferenceType, org.sdmx.resources.sdmxml.schemas.v30.common.WildcardType {
    private static final long serialVersionUID = 1L;

    public WildcardVersionTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected WildcardVersionTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
}
