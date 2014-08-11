package firstSE

import geb.spock.GebReportingSpec
import geb.spock.*
import spock.lang.*

class SecretEscapesAutomation extends GebReportingSpec {
	
	def "Visit SecretEscapes"() {
		when:
		go() // uses base url system property
		
		then:
		title == "Join now for Free | Save up to 70% on luxury travel | Secret Escapes"
	}
	
}