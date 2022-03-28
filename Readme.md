# SDK Android Easytransac

## Présentation

Le SDK Android d'Easytransac permet de payer depuis votre application Android en toute sécurité en effectuant une demande de paiement à l'application Easytransac, directement depuis votre application.
L'intégration est très simple à réaliser et offre à vos clients une expérience de paiement optimale.
Notre SDK Android vous **permet d'utiliser le NFC, le Flash de carte, l'entrée manuelle, le paiement distant Email, SMS et QRCode, ainsi que de réaliser des paiements multiples**, le tout très simplement via une liste de paramètre à envoyer à l'application Easytransac depuis votre application mobile en utilisant les URL scheme.


## Prérequis

- Application Easytransac installée sur le périphérique.
- Version d'Easytransac à jour 7.9.0+

Pour télécharger l'application et bénéficier du SDK, voici le lien vers l'application : https://play.google.com/store/apps/details?id=com.movidone.easytransac


## Fonctionnement

Le SDK est intégré dans l'application Easytransac elle-même, présente sur le Google Play Store. Pour l'utiliser, il faut appeler l'application via une URL easytransac://pay


## Documentation et paramètres

Les paramètres relatifs à la configuration du SDK se trouvent sur notre documentation publique : https://www.easytransac.com/fr/documentation#section/SDK-mobile-Android-android


## Informations générales

 - Toutes les dates sont basées sur le fuseau Europe/Paris UTC/GMT +1.
 - L'encodage des caractères est fait selon l'ISO 8859-1


## Sample app

Le projet contient une application Android montrant l'intégration du SDK.
Vous pouvez récupérer le projet courrant et le compiler pour tester l'intégration.
