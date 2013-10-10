
Cr�ation du projet
------------------

Environnement install� : JDK 1.7, maven 3, Eclipse avec plugin m2eclipse  

Dans Eclipse, File > New > Other ... > Maven > Maven Project

Alternative : g�n�ration du squelette avec la commande maven.
mvn archetype:generate -DgroupId=... -DartifactId=... -DarchetypeArtifactId=...


Dependances maven
-----------------

Ajout des libs n�cessaires dans maven
Pour les services REST : JAX-RS
Librairie Jackson pour la serialisation POJO
Pas encore utilis� : Jersey (Anootations @Path )
On utilise plut�t Spring MVC ( annotations @RequestMapping ...)
Utilisation de Jetty 9.
Attention : requiert SDK Java 7.

Installation de l'envionnement de dev Eclipse :
-----------------------------------------------
mvn eclipse:clean 
mvn eclipse:eclipse

Setup
-----
Configuration xml selon les tutos

web.xml, mvc-dispatcher-servlet.xml, applicationContext.xml

web.xml : declaration de la servlet. L'URL pattern choisi est url-pattern=/service_rs/*

mvc-dispatcher-servlet.xml : on utilisera les annotations. Penser � mettre : <mvc:annotation-driven />

applicationContext.xml :  Les servlets sont dans le package <context:component-scan base-package="com.itkweb.menotte.menotte_rs.service" />


Specs API Compl�te
------------------
Pour les requ�tes possibles, voir : https://github.com/ITKWeb/menottes/wiki/api



D�veloppements
--------------

Cr�ation des POJO dans le model Project.java, Ticket.java

Cr�ation des services avec annotations Spring MVC en mode POST et GET : ProjectsService, TicketsService

Utilisation du plugin m2
mvn clean intall
mvn jetty:run

Possibilt� de faire en Debug avec Debug Configuration..

Possibilit� d'utiliser le plugin maven (attention version).

Test manuels :
--------------
GET via URL dans explorateur.

Ex (en supossant que url-pattern=/service_rs/*Service) : 
http://localhost:8080/service_rs/projets
http://localhost:8080/service_rs/tickets
http://localhost:8080/service_rs/tickets/1

POST : utilisation d'une extension Chrome ou client javascript avec jquery (cf index.jsp)

Sur Firefox : RESTClient
Sur Chrome : extension REST Console


Exemple de Header � envoyer 
Accept:application/json
Accept-Encoding:gzip,deflate,sdch
Accept-Language:fr-FR,fr;q=0.8,en-US;q=0.6,en;q=0.4
Connection:keep-alive
Content-Length:28
Content-Type:application/json
Cookie:JSESSIONID=znofln2fk1tuna2xrmrb8eih
Host:localhost:8080
Origin:chrome-extension://cokgbflfommojglbmbpenpphppikmonn
User-Agent:Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.69 Safari/537.36

DELETE : utilisation d'un plugin REST firefox ou Chrome


Suite TODO :
------------

Evaluer les diff�rences avec Jersey.

Brancher la persistance. Par ex. avec du noSql.
Au choix : 
- mongoDB (orient� documment)
- Cassandra (Apache, adapt� big data, orient� Colonnes / Lignes) 



Probl�mes rencontr�s :
----------------------
JDK 1.7 n�cessaire � Jetty 9.
D�pendances / versions maven. Utiliser mvn dependency:tree pour v�rifier.
Testing du POST : erreur " Unsupported Media Type". Penser au Header Content-Type:application/json.



Tutos 
-----

http://hmkcode.com/spring-mvc-json-json-to-java/
http://www.mkyong.com/spring-mvc/spring-3-rest-hello-world-example/ (plusieurs autres samples sur ce site en Spring / REST )
http://www.mkyong.com/spring-mvc/spring-3-mvc-and-json-example

http://getj2ee.over-blog.com/categorie-10315135.html : REST with Spring MVC (Jackson) / Maven. Bons exemples avec passage de param�tres PUT pour l'UPDATE.



http://blog.xebia.fr/2011/11/14/rest-java-serveur/ : tuto Jersey [fr]
http://www.icysoft.fr/jersey-creation-de-webservices-en-java/ : tuto maven + Jersy pas � pas (plusieurs pages) [fr]

https://github.com/steveliles/jetty-embedded-spring-mvc projet sample pour config jetty embedded

http://developpement-java.faire-des-jeux.com/controleur-avec-spring-3-mvc-et-maven2/ : Cr�ation d'un projet Maven / Spring MVC


Doc
---

Jackson : http://jackson.codehaus.org/

Jetty : http://www.eclipse.org/jetty/documentation/current/

Spring MVC : http://docs.spring.io/spring/docs/3.0.x/spring-framework-reference/html/mvc.html

Firefox addon : https://addons.mozilla.org/en-US/firefox/addon/restclient/

REST : http://www.packetizer.com/ws/rest.html

Maven http://maven-guide-fr.erwan-alliaume.com/maven-guide-fr/site/reference/simple-project-sect-create-simple.html (site tr�s complet)
