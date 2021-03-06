
package ru.romanow.protocols.soap.generated.wrapped.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processRequestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processRequestResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestObjectResponse" type="{http://web.soap.protocols.romanow.ru/}testObjectResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processRequestResponse", propOrder = {
    "testObjectResponse"
})
public class ProcessRequestResponse {

    @XmlElement(name = "TestObjectResponse")
    protected TestObjectResponse testObjectResponse;

    /**
     * Gets the value of the testObjectResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TestObjectResponse }
     *     
     */
    public TestObjectResponse getTestObjectResponse() {
        return testObjectResponse;
    }

    /**
     * Sets the value of the testObjectResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestObjectResponse }
     *     
     */
    public void setTestObjectResponse(TestObjectResponse value) {
        this.testObjectResponse = value;
    }

}
