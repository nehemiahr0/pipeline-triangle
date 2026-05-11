# Utilisation d'une image Eclipse Temurin (très stable pour Java)
FROM eclipse-temurin:21-jre-alpine

# Définition du dossier de travail dans le conteneur
WORKDIR /app

# Copie du fichier JAR généré par Maven vers le conteneur
# Note : Maven génère le JAR dans le dossier 'target'
COPY target/pipeline-triangle-1.0-SNAPSHOT.jar app.jar

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "app.jar"]