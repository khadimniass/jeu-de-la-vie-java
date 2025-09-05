## Jeu de la Vie (Conway's Game of Life)

### Description
Ce projet est une **implémentation console en Java** du célèbre **Jeu de la Vie** de John Conway.  
Il s’agit d’un automate cellulaire où l’état d’une cellule dépend de ses voisines à la génération précédente.

Nous utilisons une **grille 5x5 fixe** (au lieu de l’infini) pour simplifier l’épreuve.
*SIZE=5*
---

### Règles
1. Toute cellule vivante avec **2 ou 3 voisins vivants** reste vivante.
2. Toute cellule morte avec **exactement 3 voisins vivants** devient vivante.
3. Toutes les autres cellules meurent ou restent mortes.

---

### Organisation du code
- `Cellule.java` → représente une cellule (vivante ou morte).
- `Grid.java` → contient la grille et les règles du jeu.
- `JeuDeLaVie.java` → programme principal qui exécute le jeu.

---

### Compilation & Exécution
Dans un terminal :

```bash
# Compilation
javac Cellule.java Grid.java JeuDeLaVie.java

# Exécution
java JeuDeLaVie
