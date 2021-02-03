class Projet extends Program {


    int taille_tabQuestions = 4;
    int nbCategorie = 3;//0:Général (ou tests?) 1:1ère catégorie 2:2ème catégorie


    //EN COMMENTAIRE POUR PASSER LES TESTS.

    void algorithm() {
	main();
    }





    void main() {
	//appeler toute les fonctions utile au fonctionnement du jeu.

	//CONTIENT UNIQUEMENT LA PHASE DE QUESTIONS POUR LE MOMENT
	boolean question = question();
	if(question){
	    println("Bonne réponse");
	} else {
	    println("Mauvaise réponse");
	}

    }
    /*
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

    //STATS DES MOBS, DEFINITION DE VARIABLE FIXES?
    //soit créer une fonction, soit les implémenter hors du main -> variable globale



    //AFFICHAGE
    //Pas besoin de tests (on verra à l'execution)

    void affichagePrincipal(plein de trucs) {
	//Regroupe toute les fonctions d'affichage.
    }

    void affichageMonstre1() {//optionel
	//ASCII Art du monstre1
    }

    void affichageMonstre2() {//optionel
	//ASCII Art du monstre2
    }

    void affichageMonstre3() {//optionel
	//ASCII Art du monstre3
    }

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------

*/
    //QUESTIONS

  boolean question() {//boolean parce que c'est plus partique de renvoyer si le joueur à eu vrai ou faux.
	//Regroupe toute les fonctions correspondant à la phase de question.

	int idQuestion = questionAleatoire();
	int categorie = 0;//égal à 0 pour faire des tests

	String question = banqueDeQuestions(idQuestion, categorie);//categorie à ecrire
	String[] reponses = banqueDeReponses(idQuestion, categorie);

	//println(idQuestion);
	println(question);
	for(int i=0; i<length(reponses); i++){
	    print((char)((int)'A'+i)+" : ");
	    println(reponses[i]);
	}

	println("Saisissez une réponse :");
	char saisie = readChar();


	return true;
    }





    void testQuestionAleatoire() {
	int x = questionAleatoire();

	assertTrue(x <= taille_tabQuestions && x >= 0);
	assertFalse(x > taille_tabQuestions);
    }

    int questionAleatoire() {//GENERE LE ID_QUESTION
	//Randomise un entier de 1 à [question_max]
	//On affectera cette valeur à une variable int id_question.

	double id_question;

	id_question = random() * taille_tabQuestions;

        return (int)id_question;
    }

    void testBanqueDeQuestions() {
	assertEquals("Deuxième Question", banqueDeQuestions(1, 0));
    }

    String banqueDeQuestions(int id_question, int categorie) {//ATTENTION A BIEN DEFINIR ID_QUESTION AVANT DE L'APPELER
	//Renvoie le texte d'une question (dans un String) en fonction d'un id généré précédemment.

	//tableau de String contenant toute les questions.
	//Il faudra définir chaque question une à une.

	String[][] tabQuestions = new String[taille_tabQuestions][nbCategorie];
	String questionReturn = "";

	tabQuestions[0][0] = "Première Question";
	tabQuestions[1][0] = "Deuxième Question";
	tabQuestions[2][0] = "Troisième Question";
	tabQuestions[3][0] = "Quatrième Question";

	questionReturn = tabQuestions[id_question][categorie];

	return questionReturn;
    }

    void testBanqueDeReponses() {
       	String[] reponses = banqueDeReponses(0, 0);
	assertEquals(reponses[0], "1ere réponse");
	assertEquals(reponses[2], "3eme réponse");

	reponses = banqueDeReponses(3, 0);
	assertEquals(reponses[1], "2eme réponse");
    }

    String[] banqueDeReponses(int id_question, int categorie) {
	//Renvoie les réponses possible aux questions.
	String[][][] tabReponses = new String[taille_tabQuestions][nbCategorie][4];//4 = nombre de réponses possibles
	String[] reponses = new String[4];

	tabReponses[0][0][0] = "1ere réponse";
	tabReponses[0][0][1] = "2eme réponse";
	tabReponses[0][0][2] = "3eme réponse";
	tabReponses[0][0][3] = "4eme réponse";

	tabReponses[1][0][0] = "1ere réponse";
	tabReponses[1][0][1] = "2eme réponse";
	tabReponses[1][0][2] = "3eme réponse";
	tabReponses[1][0][3] = "4eme réponse";

	tabReponses[2][0][0] = "1ere réponse";
	tabReponses[2][0][1] = "2eme réponse";
	tabReponses[2][0][2] = "3eme réponse";
	tabReponses[2][0][3] = "4eme réponse";

	tabReponses[3][0][0] = "1ere réponse";
	tabReponses[3][0][1] = "2eme réponse";
	tabReponses[3][0][2] = "3eme réponse";
	tabReponses[3][0][3] = "4eme réponse";

	for(int idx=0; idx<4; idx++){
	    reponses[idx] = tabReponses[id_question][categorie][idx];
        }

	return reponses;
    }


    int[] correspondancesQuestions(int id_question, int categorie) {
	//Renvoit le couple ID Question/ID Bonne Réponse dans un tableau.
	int[][][] coupleValide = new int[nbCategorie][taille_tabQuestions][taille_tabQuestions];//categorie | id question | id reponse(1 à 4)
	int[] coupleReturn = new int[2];



	return coupleReturn;
    }

    /*

    boolean validationQuestion(int[] ou ( int reponse_utilisateur, int bonne_reponse ) ) {
	//Valide ou pas en fonction des IDs des questions.

	//Compare la réponse donnée par l'utilisateur avec celle de correspondanceQuestions.
    }

    */
    /*

    void testQuestion() {
	//Série de tests servant à verifier le fonctionnement de toute la phase de questions.
    }


/-----------------------------------------------------------------------------------------------------------------------------------------------------
    */

    //MAGASIN (en fonction du nombre de tours)

    void shop() {


    }


    /*

    //COMBATS?

    //STATS JOUEUR (PVs restants etc...)
      //Créer un type pour le joueur

    //TERRAIN, MAP
      //GENERATION ALEATOIRE DU TERRAIN
      //DONNEES DU TERRAIN
      //Créer un type pour case terrain?



      */





}
