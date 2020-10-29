//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.13 at 03:22:53 PM IST 
//

package io.mosip.resident.dto;


public enum BiometricType {

	
	SCENT("Scent"), DNA("DNA"),
	EAR("Ear "),
	FACE("Face"),
	FINGER("Finger"),
	FOOT("Foot"),
	VEIN("Vein"),
	HAND_GEOMETRY("HandGeometry"),
	IRIS("Iris"),
	RETINA("Retina"), 
	VOICE("Voice"), 
	GAIT("Gait"),
	KEYSTROKE("Keystroke"), 
	LIP_MOVEMENT("LipMovement"), 
	SIGNATURE_SIGN("SignatureSign");

	private final String value;

	BiometricType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static BiometricType fromValue(String v) {
		for (BiometricType c : BiometricType.values()) {
			if (c.value.equalsIgnoreCase(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
