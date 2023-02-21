package org.ms.example.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

public class HashMapExample {
	static Logger logger = Logger.getLogger("HashMapExample");

	private static void jdk8Print(Map<String, Object> inputMap) {
		inputMap.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));
//		Stream.of(inputMap).
	}

	public static void main(String[] args) {
		Map<String, Object> inputMap = new HashMap<>();
		PatientInfo inputPatientInfo = new PatientInfo();
		inputPatientInfo.setMrn("A04667");
		inputMap.put("4667", inputPatientInfo);

//		logger.info("inputMap "+inputMap);

//		inputMap.en
		Iterator<Map.Entry<String, Object>> itr1 = inputMap.entrySet().iterator();
		while (itr1.hasNext()) {
			Map.Entry<String, Object> entry = itr1.next();
			entry.getKey();
			entry.getValue();
//			logger.info("Value of entrymap \n " + entry.getValue());

			if (entry.getValue() instanceof PatientInfo) {
				logger.info("yes it is instance of that");
				PatientInfo patientInfo = (PatientInfo) entry.getValue();
				logger.info("MRN -- " + patientInfo.getMrn());
				logger.info("Old MRN -- " + patientInfo.getOldMrn());
			} else
				logger.info("No it is NOT");
		}

		boolean mrnMatch = false;
		String stringValue = String.valueOf(mrnMatch);
		logger.info("mrnMatch value -- " + stringValue);
		logger.info("Logger");

	}

}
