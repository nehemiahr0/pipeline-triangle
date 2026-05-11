## Pipeline Triangle

**Travaux Pratiques** : Mise en place d'un pipeline CI/CD avec Jenkins pour une application Java de validation de triangles, conteneurisée avec Docker.

## Objectifs du TP

- Développer une application Java qui analyse des triangles
- Écrire des tests unitaires avec JUnit
- Conteneuriser l'application avec Docker
- Automatiser le build, les tests et le déploiement via un pipeline Jenkins

## Prérequis
 
| Outil       |     Version     |
|-------------|-----------------|
| Java (JDK)  | 21+             |
| Maven       | 3.9+            |
| Docker      | 24+             |
| Jenkins     | 2.555+          |



### Résumé des stages
 
| Stage        | Outil       | Description                          |
|--------------|-------------|--------------------------------------|
| Checkout     | Git         | Récupère le code depuis le dépôt     |
| Build        | Maven       | Compile le code Java                 |
| Test         | JUnit       | Exécute les tests unitaires          |
| Docker Build | Docker      | Crée l'image Docker                  |
| DockerHub    | Docker      | Entrepôt d'images dans le cloud      |


 
