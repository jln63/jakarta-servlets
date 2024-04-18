# Les servlets en Java

Compétences abordées :
- programmation d'un serveur HTTP en Java via des servlets
- déploiement d'un conteneur web en local

## Marche à suivre

1. Déployez le projet sur un conteneur web local
2. Accédez à la première page (par exemple, en utilisant l'URL [http://localhost:8080/](http://localhost:8080/))
3. complétez le code afin que les tests unitaires fonctionnent
4. Testez avec votre conteneur web au fur et à mesure de votre développement

## Indications techniques

### Comment déployer le projet sur un conteneur web ?

Afin de déployer le projet afin de le tester il vous faudra installer un conteneur Web local.

Les IDE intégrent des fonctionnalités pour facilement le faire, voici un sélection de tutoriels qui vous permettra de vous y retrouver avec votre outil :
- VSCode : http://localhost:8080/
- Eclipse : https://www.youtube.com/watch?v=LeoexrCAb5I
- IntelliJ : https://www.youtube.com/watch?v=c3dIEGXLgC4

Si le serveur Tomcat fonctionne, vous devriez arriver sur une page d'accueil et vous pourrez accéder à la page de gestion des projets déployés.

**Attention** : 
Il vous faudra ajouter un utilisateur "admin" pour pouvoir vous connecter aux pages de gestion.
Ajouter l'extrait suivant au fichier `tomcat-users.xml` du dossier de configuration du serveur :
```xml
<role rolename="manager"/>
<role rolename="admin"/>
<user username="admin" password="admin" roles="admin,manager,manager-gui" />
```