
package org.kapott.hbci.sepa.jaxb.pain_002_001_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TransactionGroupStatusCodeSEPA.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionGroupStatusCodeSEPA">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RJCT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionGroupStatusCodeSEPA", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.002.001.03")
@XmlEnum
public enum TransactionGroupStatusCodeSEPA {

    RJCT;

    public String value() {
        return name();
    }

    public static TransactionGroupStatusCodeSEPA fromValue(String v) {
        return valueOf(v);
    }

}