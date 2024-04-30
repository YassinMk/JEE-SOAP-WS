## JEE-SOAP-WS
WS-SOAP est un projet Java qui utilise le protocole SOAP pour la communication entre le client et le serveur. Il comprend un module client qui consomme le service Web.
On appliquons l'architecture suivante :  
![image](https://github.com/YassinMk/JEE-SOAP-WS/assets/122708120/dd7c6b19-2ef0-4da7-8438-750719d8ede3)


## Technologies utilisées

- Java 18
- Maven pour la gestion des dépendances et la construction du projet
- SOAP pour la communication entre le client et le serveur
- Jakarta EE pour la consommation de web service par le client
## Structure du projet
e projet est divisé en deux modules principaux :

- `Client-SOAP` : Ce module contient le code du client qui consomme le service Web.
- `src/main/java`: Ce module contient le code source Java du service Web. Il comprend des classes pour gérer les comptes bancaires, comme la classe `Compte` qui représente un compte bancaire avec un code, un solde et une date de création. Le module contient également la classe `ServerJWS` le code pour le service Web SOAP, qui permet la communication entre le client et le serveur.

## Fonctionnalités du service Web

- Conversion de l'Euro en Dirham marocain.
- Récupération des informations d'un compte par son code.
- Liste de tous les comptes.

## Dépendances

Ce projet utilise les dépendances suivantes :

- `com.sun.xml.ws:jaxws-ri:4.0.2` : Une implémentation de référence pour les services Web SOAP en Java.

Pour gérer ces dépendances, nous utilisons Maven. Assurez-vous d'avoir Maven installé sur votre machine et utilisez la commande `mvn clean install` pour télécharger et installer les dépendances nécessaires.

  
