MultiThreadTalker :
Une application Java qui illustre le comportement classique de la programmation multi-threads. L'application crée 10 threads qui affichent 100 fois un message avec un numéro unique, démontrant le fonctionnement concurrent des threads en Java.

Fonctionnalités :
🔢 Création de 10 threads exécutant la même tâche.
💬 Chaque thread affiche 100 fois un message contenant un numéro unique associé à chaque instance du thread.
🕹️ Comportement concurrent des threads observé dans la sortie console.
Description du projet :
Le programme comporte :

Classe Talkative :
Contient un entier unique comme attribut pour chaque instance.
Implemente l'interface Runnable pour permettre l'exécution concurrente.
La méthode run() affiche 100 fois la valeur de l'attribut associé à l'instance.
Classe Main :gear:
Crée 10 instances de Thread, chaque instance étant associée à un objet Talkative avec un numéro unique.
Démarre les 10 threads pour observer leur exécution simultanée.
Exécution :
Prérequis :
📦 Java Development Kit (JDK) 17 ou supérieur.
🧑‍💻 Un IDE (comme IntelliJ IDEA, Eclipse) ou un terminal pour exécuter le programme.

🚦 Utilisation
Clonez le dépôt :

git clone https://github.com/votre-utilisateur/multithread-talker.git

Compilez les fichiers Java :
javac Talkative.java

Exécutez le programme :
java Talkative

Exemple de sortie :

plaintext
Copier le code
Thread :1
Thread :2
Thread :3
Thread :1
Thread :4
Thread :5
Thread :3
Thread :6
Thread :7
Thread :5
Thread :2
...

🚀 Utilisation des threads pour exécuter des tâches simultanées.
Chaque thread affiche son numéro 100 fois, mais l'ordre d'exécution varie à chaque lancement du programme, illustrant la nature concurrente des threads.