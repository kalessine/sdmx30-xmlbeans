/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdmx.xml;

/**
 *
 * @author jsg
 */
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlString;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ReferenceHandler {
    public static final String URN_REGEX = "urn:sdmx:org\\.sdmx\\.infomodel\\.(?<package>[a-z]+)\\.(?<class>[A-Za-z]+)=(?<agency>[A-Za-z][A-Za-z0-9_\\\\-]*(\\.[A-Za-z][A-Za-z0-9_\\\\-]*)*|\\*):(?<id>[A-Za-z0-9_@$\\\\-]+|\\*)\\((?<version>(0|[1-9]\\d*)(\\.(0|[1-9]\\d*)){2}(\\-(([A-Za-z\\\\-]|([A-Za-z\\\\-][A-Za-z0-9\\\\-]+)|([A-Za-z0-9\\\\-]+[A-Za-z\\\\-][A-Za-z0-9\\\\-]*))|(0|[1-9][0-9]*))(\\.(([A-Za-z\\\\-]|([A-Za-z\\\\-][A-Za-z0-9\\\\-]+)|([A-Za-z0-9\\\\-]+[A-Za-z\\\\-][A-Za-z0-9\\\\-]*))|(0|[1-9][0-9]*)))*)|(0|[1-9]\\d*)(\\.(0|[1-9]\\d*))?|\\*)\\)\\.(?<objectid>[A-Za-z0-9_@$\\-]+)";
    public static final String MAINTAINABLE_REGEX = "urn:sdmx:org\\.sdmx\\.infomodel\\.(?<package>[a-z]+)\\.(?<class>[A-Za-z]+)=(?<agency>[A-Za-z][A-Za-z0-9_\\\\-]*(\\.[A-Za-z][A-Za-z0-9_\\\\-]*)*|\\*):(?<id>[A-Za-z0-9_@$\\\\-]+|\\*)\\((?<version>(0|[1-9]\\d*)(\\.(0|[1-9]\\d*)){2}(\\-(([A-Za-z\\\\-]|([A-Za-z\\\\-][A-Za-z0-9\\\\-]+)|([A-Za-z0-9\\\\-]+[A-Za-z\\\\-][A-Za-z0-9\\\\-]*))|(0|[1-9][0-9]*))(\\.(([A-Za-z\\\\-]|([A-Za-z\\\\-][A-Za-z0-9\\\\-]+)|([A-Za-z0-9\\\\-]+[A-Za-z\\\\-][A-Za-z0-9\\\\-]*))|(0|[1-9][0-9]*)))*)|(0|[1-9]\\d*)(\\.(0|[1-9]\\d*))?|\\*)\\)";
    public static final Pattern URN_PATTERN = Pattern.compile(URN_REGEX, Pattern.CASE_INSENSITIVE);
    public static final Pattern MAINTAINABLE_PATTERN = Pattern.compile(MAINTAINABLE_REGEX, Pattern.CASE_INSENSITIVE);
   
    public static String getPackage(XmlObject xo) {
        XmlString s = (XmlString)xo;
        if( xo instanceof org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType){
            Matcher matcher = MAINTAINABLE_PATTERN.matcher(s.getStringValue());
            if(!matcher.matches()){
            throw new RuntimeException("reference does not match regex:"+s.getStringValue());
            }
            return matcher.group("package");
        }else{
            Matcher matcher = URN_PATTERN.matcher(s.getStringValue());
            if(!matcher.matches()){
            throw new RuntimeException("reference does not match regex:"+s.getStringValue());
            }
            return matcher.group("package");
        }
    }
    /*
      Distinguish me from Object.getClass()
    */
    public static String getURNClass(XmlObject xo) {
        XmlString s = (XmlString)xo;
        if( xo instanceof org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType){
            Matcher matcher = MAINTAINABLE_PATTERN.matcher(s.getStringValue());
            if(!matcher.matches()){
            throw new RuntimeException("reference does not match regex:"+s.getStringValue());
            }
            return matcher.group("class");
        }else{
            Matcher matcher = URN_PATTERN.matcher(s.getStringValue());
            if(!matcher.matches()){
            throw new RuntimeException("reference does not match regex:"+s.getStringValue());
            }
            return matcher.group("class");
        }
    }
    public static String getAgencyID(XmlObject xo){
        XmlString s = (XmlString)xo;
        if( xo instanceof org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType){
            Matcher matcher = MAINTAINABLE_PATTERN.matcher(s.getStringValue());
            if(!matcher.matches()){
            throw new RuntimeException("reference does not match regex:"+s.getStringValue());
            }
            return matcher.group("agency");
        }else{
            Matcher matcher = URN_PATTERN.matcher(s.getStringValue());
            if(!matcher.matches()){
            throw new RuntimeException("reference does not match regex:"+s.getStringValue());
            }
            return matcher.group("agency");
        }
    }
    public static String getParentID(XmlObject xo){
        XmlString s = (XmlString)xo;
        if( xo instanceof org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType){
            Matcher matcher = MAINTAINABLE_PATTERN.matcher(s.getStringValue());
            if(!matcher.matches()){
            throw new RuntimeException("reference does not match regex:"+s.getStringValue());
            }
            return matcher.group("id");
        }else{
            Matcher matcher = URN_PATTERN.matcher(s.getStringValue());
            if(!matcher.matches()){
            throw new RuntimeException("reference does not match regex:"+s.getStringValue());
            }
            return matcher.group("id");
        }
    }
    public static String getVersion(XmlObject xo){
        XmlString s = (XmlString)xo;
        if( xo instanceof org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType){
            Matcher matcher = MAINTAINABLE_PATTERN.matcher(s.getStringValue());
            if(!matcher.matches()){
            throw new RuntimeException("reference does not match regex:"+s.getStringValue());
            }
            return matcher.group("version");
        }else{
            Matcher matcher = URN_PATTERN.matcher(s.getStringValue());
            if(!matcher.matches()){
            throw new RuntimeException("reference does not match regex:"+s.getStringValue());
            }
            return matcher.group("version");
        }
    }
    public static String getID(XmlObject xo){
        XmlString s = (XmlString)xo;
        if( xo instanceof org.sdmx.resources.sdmxml.schemas.v30.common.MaintainableUrnReferenceType){
            throw new RuntimeException("No Object Id");
        }else{
            Matcher matcher = URN_PATTERN.matcher(s.getStringValue());
            if(!matcher.matches()){
            throw new RuntimeException("reference does not match regex:"+s.getStringValue());
            }
            return matcher.group("objectid");
        }
    }
}
