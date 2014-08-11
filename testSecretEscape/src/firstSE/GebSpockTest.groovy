
import org.junit.After;

import geb.spock.*
import spock.lang.*

class SecretEscapesAutomation extends GebReportingSpec {
	
	def "Visit SecretEscapes"() {
		when:
		go() // uses base url system property
		
		then:
		title == "Join now for Free | Save up to 70% on luxury travel | Secret Escapes"
		
	}
	
/*	def "Login" (){
		when:		
		go "login"
		username = "me"
		report "login screen" // take a report of the login screen
		login().click()
 
		then:
		title == "Logged in!"
	}*/
	
}