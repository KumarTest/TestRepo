package firstSE

import javax.mail.*;
import javax.mail.internet.*;
 
@GrabConfig(systemClassLoader=true)
@Grapes( @Grab(group='javax.mail', module='mail', version='1.4.4'))

// setup connection
Properties props = new Properties();
def host = "localhost";
def username = "testuser";
def password = "password";
def provider = "pop3";
 
// Connect to the POP3 server
Session session = Session.getDefaultInstance props, null
Store store = session.getStore provider
store.connect host, username, password
 
// Open the folder
Folder inbox = store.getFolder 'INBOX'
if (!inbox) {
    println 'No INBOX'
    System.exit 1
}
 
inbox.open(Folder.READ_ONLY)
 
// Get the messages from the server
Message[] messages = inbox.getMessages()
messages.eachWithIndex { m, i ->
    println "------------ Message ${i+1} ------------"
    m.writeTo(System.out)
}
// Close the connection
// but don't remove the messages from the server
inbox.close false
store.close()
