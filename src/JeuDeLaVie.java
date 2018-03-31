
public class JeuDeLaVie{
	public static void main(String[] args) {
		 Maillon m,n,o;
         Liste l1=new Liste();
         Couple a=new Couple(2,2);
         Couple b=new Couple(3,3);
         Couple c=new Couple(4,4);
         m=new Maillon(c,l1.tete);
         l1.ajouterEnTeteListe(a);
         l1.ajouterEnTeteListe(m.info);
         l1.ajouterEnTeteListe(b);
         l1.afficherListe();
         l1.trie();
         l1.afficherListe();
         System.out.println(l1.nombreVoisin(c));
//         l1.supprimerCouple(a);
//         l1.afficherListe();
      l1.afficherGrille(l1.initGrille());
       
       /* //  Couple c,d;
      //  Maillon m,n;
      //   d=new Couple (1,5);
      //  Liste l= new Liste(new Maillon(d,null));
    liste=remplirLaliste();
     System.out.println("______________________________________________________________"    );
     System.out.println("nombre de cellules " +liste.nbElement ()+ "                   "    );
     System.out.println("nombre de  cellules morte " + liste.nbCelluleMorte() +"       "    );
     System.out.println(" nombre de cellule vivante" + liste.nbCelluleVivante()+        "   ");
     System.out.println(" nombre de renaissance de cellule" + liste.nbCelluleNaissance()+"  " );
     System.out.println(liste.toString()                                                      );
     System.out.println("_______________________________________________________________"      );
      Couple k =new Couple (4,5);
      Couple s = new Couple(2,0);
       m=new Maillon(k,null);
      n=new Maillon(s,null);
      System.out.println(" ");
      l.ajouterMaillonEntete(m.info);
      l.ajouterMaillonEntete(n.info);
      l.ajouterMaillonEntete(new Couple(6,4));
        l.ajouterMaillonEntete(new Couple(7,10));
        l.supprimerMaillon(d);
        System.out.println(k.comparable(s));
         System.out.println(k.voisin(s));
             c=new Couple(3,3);
        d=new Couple(2,2);
        Couple t=new Couple(-2,-2);
        Couple p=new Couple(-1,-1);
        l.ajouterMaillonAlaFin(new Maillon(d,null));
        l.ajouterMaillonAlaFin(new Maillon(t,null));
        l.ajouterMaillonEntete(c);
        l.ajouterMaillonEntete(p);
        System.out.println(" ");
        System.out.println("(3,3) voisin (2,2) ? "+c.voisin(d));
        System.out.println("(3,3) voisin (-1,-1) ? "+ c.voisin(p));
        System.out.println("(-1,-1) voisin (-2,-2) ? "+ t.voisin(p));
         System.out.println("Est ce que la liste est vide? "+ l.estListeVide());
         System.out.println("le maximum de la ligne "+l.MaxX(l));
         System.out.println("le maximum de la colonne " + l.MaxY(l));
         System.out.println("                                         ");
        l.afficherGrille(l.initGrille(l));
        l.ajouterMaillonAlaFin(new Maillon(new Couple(2,5), null));
        System.out.println(l.chercherElement(6,4));
        l.trie();

      Liste l = new Liste();
      Liste li =new Liste();
      Couple a, b, c, d, e, f, g, h, k, m,n,o;
      a = new Couple(4, 4);
      b = new Couple(3, 4);
      c = new Couple(2, 4);
      d = new Couple(2, 1);
      e = new Couple(5, 5);
     f = new Couple(3, 1);
      g = new Couple(6, 7);
      h = new Couple(4, 4);
      k = new Couple(11, 3);
      m = new Couple(3, 11);
      n=new Couple(11,4);
      o=new Couple(11,5);

      l.ajouterMaillonEntete(a);
      l.ajouterMaillonEntete(b);
      l.ajouterMaillonEntete(c);
     l.ajouterMaillonEntete(d);
     l.ajouterMaillonEntete(e);
   l.ajouterMaillonEntete(f);
      l.ajouterMaillonEntete(g);
      l.ajouterMaillonEntete(h);
      l.ajouterMaillonEntete(k);
      l.ajouterMaillonEntete(n);
      l.ajouterMaillonEntete(o);
      l.ajouterMaillonEntete(new  Couple(9,9));
      l.ajouterMaillonEntete(new Couple(3,6));
      l.ajouterMaillonEntete(new Couple(2,4));
      l.ajouterMaillonEntete(new Couple(-1,7));
      //  l.ajouterMaillonEntete(m);
      l.trie();
      l.afficher();
      l.afficherGrille(l.initGrille(l));
      l.afficher();
      l = l.supprimerMaillon(5, 5, l);
      l.afficher();
      li = li.copieListe(l);
      l.trie();
      li.afficher();
      l.afficherGrille(l.initGrille(l.generation()));
      Couple tc= new Couple(3,1);
      System.out.println(" Couple " +tc.toString()+ " existe? " +l.chercherElement(tc));
    //  System.out.println(tc.voisin(tc));
    //  l.vieCouple();
     System.out.println(" min x = " +l.MinX(l)+ " min y = " +l.MinY(l));
     System.out.println("Max x = " +l.MaxX(l)+ " Max Y " +l.MaxY(l));


    } */

	}

}