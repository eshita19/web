## Servlet
 - https://www.javatpoint.com/servlet-tutorial
 

## OAUTH 2.0
  - https://www.youtube.com/watch?v=1M6gqoGiO2s
  - <img src="https://github.com/eshita19/web/blob/master/oauth2.0.png"></img>
  - https://www.digitalocean.com/community/tutorials/an-introduction-to-oauth-2
  - Google OAuth : https://ktor.io/quickstart/guides/oauth.html
  - Github OAUth: https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/

## LDAP
  - LDAP setup on mac: 
     - Download the latest OpenLDAP release
       - `$ tar zxf openldap-x.x.x.tgz`
       - `$ cd openldap-x.x.x`
       - `- $ ./configure`
       - `- $ make depend`
       - ` - $ make`
       - `- $ sudo make install`
   - https://www.youtube.com/watch?v=mG3yNCHeQiY  
   
## SSL : 
   - Assymetric encryption using truststore(CA certificate) and keystore(private key):
   - The server sends its CA certificates. Browser checks them among its known certificates list(similar to known hosts in SSH). Browser then encrypts shared secret key using CA Browser sends the shared key by encrypting with public key(truststore) to server. Server decrypts it with private key.
   - Server(private Key) <-> Browser (Public key)
   - https://www.youtube.com/watch?v=33VYnE7Bzpk&t=43
      
##  SSH: 
   - Assymetric encryption: Public key: (.ssh/authorized_keys), private key: (.ssh), Known hosts(.ssh/known_hosts)
   - Client(Private key) <-> Server (Public Key)
   - https://www.youtube.com/watch?v=y2SWzw9D4RA&t=325s
   
## Java Security Providers:
  - https://docs.oracle.com/javase/7/docs/technotes/guides/security/overview/jsoverview.html
  
## Syslog
 https://blog.heroix.com/blog/configuring-and-collecting-syslog
   
   

