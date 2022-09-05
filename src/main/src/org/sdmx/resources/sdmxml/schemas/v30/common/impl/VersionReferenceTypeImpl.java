/*
 * XML Type:  VersionReferenceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v30.common.VersionReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v30.common.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * An XML VersionReferenceType(@http://www.sdmx.org/resources/sdmxml/schemas/v3_0/common).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.sdmx.resources.sdmxml.schemas.v30.common.LegacyVersionNumberType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.SemanticVersionNumberType
 *     org.sdmx.resources.sdmxml.schemas.v30.common.SemanticVersionReferenceType
 */
public class VersionReferenceTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v30.common.VersionReferenceType, org.sdmx.resources.sdmxml.schemas.v30.common.LegacyVersionNumberType, org.sdmx.resources.sdmxml.schemas.v30.common.SemanticVersionNumberType, org.sdmx.resources.sdmxml.schemas.v30.common.SemanticVersionReferenceType {
    private static final long serialVersionUID = 1L;

    public VersionReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType, false);
    }

    protected VersionReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
        super(sType, b);
    }
}
