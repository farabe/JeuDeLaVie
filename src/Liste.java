
public class Liste {
		  Maillon tete;
		  
		  public Liste(){
			  tete=new Maillon();
		  }
		  
		  public Liste(Maillon m){
			   tete=new Maillon(m.info,m.suivant);
		  }
		  
		  public Couple teteDeListe(){
			  return this.tete.info;
		  }
		  
		  public int nbreMaillon(){
			  Maillon m=new Maillon();
			  int cpt=0;
			   if(this.estListeVide())
				   return 0;
			   else
				   m=this.tete;
				   while(m.suivant != null){
					   cpt++;
				   }
			    return cpt;   
		  }
		  
		  
		    public boolean estListeVide(){
		    	return this.tete==null;
		    }
		    
		    public void  ajouterEnTeteListe(Couple p){
		    	Maillon m =new Maillon(p,tete);
		    	this.tete=m;
		    }
		    
		    //Connaitre la position du maillon dont le couple est recherché
		      public int positionMaillon(Couple p){
		    	  Maillon m= new Maillon();
		    	  int position=0;
		    	  if(!this.estListeVide()){
		    		  m=this.tete;
		    		    position++;
		    	    while(m != null && !(m.info.equals(p))){
		    	    		  position++;
		    	    		 
		    	    		  m=m.suivant;
		    	    	}
		    	    }
		    	        return position;
		    	    }
		      
		      
		      //ON CHERCHE A SAVOIR SI UN COUPLE EXISTE DANS LA LISTE CHAINEE
		      public boolean coupleExiste(Couple p){
		    	  Maillon m =new Maillon();
		    	  boolean verif=false;
		    	  if(!this.estListeVide()){
		    			  m=this.tete;
		    		   while(!verif && m.suivant != null){
		    			   if(p.equals(m.info)){
		    				   verif=true;
		    			   }
		    			   else
		    				   m=m.suivant;
		    		   }
		    	  }
		    	  return verif;
		      }
		      
		    
		      //ON SUPPRIME LE MAILLON DONT CONTIENT LE COUPLE CHERCHER
		      public void supprimerCouple(Couple p){
		    	  Maillon m= new Maillon();
		    	  boolean trouve=false;
		    		 if(!this.estListeVide() ) {
		    			 if(this.coupleExiste(p))
		    				 this.tete=this.tete.suivant;
		    				 else
		    					 m=this.tete;
		    			         m=m.suivant;
		    				 while(m!=null && !trouve){
		    					 if(this.coupleExiste(p))
		    						 trouve=true;
		    					  m=m.suivant;
		    				 }
		    				 if(trouve==true)
		    				   m=m.suivant.suivant;
		    			 }
		    		 
		    		 }
		      
		      
		      //ON AFFICHE LA LISTE CHAINE AINSI DON CONTENU
		       public void afficherListe(){
		    	  Maillon m=new Maillon();
		    	    if(!this.estListeVide())
		    	    	m=this.tete;
		    	  while(m.suivant!=null){
		    		 System.out.print("|__"+m.info.getX()+" , "+m.info.getY()+"__||-->");
		    		   m=m.suivant;
		    	  }
		    	  System.out.println("NUll");
		    	  System.out.println("   ");
		      }
		   
		    //ON TRIE LA LISTE CHAINEE EN ORDRE CROISSANT
		      public void trie() {
		          Maillon m = null;
		          Maillon n = null;
		          Couple c = null;
		          if (!(this.estListeVide())) {
		              m = this.tete;
		              while (m.suivant != null) {
		                  n = m.suivant;
		                  while (n.suivant != null) {
		                      if (n.info.VerifCoupleGRand(m.info)) {
		                          c = m.info;
		                          m.info = n.info;
		                          n.info = c;
		                      }
		                      n = n.suivant;
		                  }
		                  m = m.suivant;
		              }
		          }
		      }
		      
		      
		     //ON CHERCHER LE MAX DES ABSCISES (LIGNE )
		        public int MaxX(){
		        	int cpt=0;
		        	Maillon m = new Maillon();
		        	if(!this.estListeVide())
		        		m=this.tete;
		        	while(m.suivant != null){
		        		if(cpt<m.info.getX())
		        			cpt=m.info.getX();
		        		m=m.suivant;
		        	}
		        	return cpt;
		        }
		        
		        //ON CHERCHE LE MINIMUM DES ABSCISSES (LIGNE)
		        public int MinX(){
		        	int cpt=0;
		        	Maillon m = new Maillon();
		        	if(!this.estListeVide())
		        		m=this.tete;
		        	while(m.suivant != null){
		        		if(cpt>m.info.getX())
		        			cpt=m.info.getX();
		        		m=m.suivant;
		        	}
		        	return cpt;
		        }
		        
		        //ON CHERCHER LE MAXIMUM DES ORDONNEES(COLONNE)
		        public int MaxY(){
		        	int cpt=0;
		        	Maillon m = new Maillon();
		        	if(!this.estListeVide());
		        		m=this.tete;
		        	while(m.suivant != null){
		        		if(cpt<m.info.getY())
		        			cpt=m.info.getY();
		        		m=m.suivant;
		        	}
		        	return cpt;
		        }
		        
		        
		        //ON CHERCHE LE MINIMUM DES ORDONNEES (COLONNE)
		        public int MinY(){
		        	int cpt=0;
		        	Maillon m = new Maillon();
		        	if(!this.estListeVide())
		        		m=this.tete;
		        	while(m.suivant != null){
		        		if(cpt>m.info.getY())
		        			cpt=m.info.getY();
		        		m=m.suivant;
		        	} 
		        	return cpt;
		        }
		        
		        //LA TAILLE DE LA LIGNE QUI EST LA SOMME DE MAX ET MIN DE LIGNE
		        public int tailleGrilleX(){
		        	return Math.abs(this.MinX())+this.MaxX();
		        }

		        //LA TAILLE DE LA COLONNE QUI EST LA SOMME DE MAX ET MIN DE COLONNE
		        public int tailleGrilleY(){
		        	return Math.abs(this.MinY())+this.MaxY();
		        }
		         
		        
		       
		        //hISTOIRE 
//		        public Liste supprimerMaillon(int x, int y, Liste l) {
//		            Maillon m = new Maillon();
//		            if (!(l.estListeVide())) {
//		                //Verifions que le couple se trouve � la tete de la liste
//		                if (l.tete.info.getX() == x && l.tete.info.getY() == y) {
//		                    l.tete = l.tete.suivant;
//		                    return l;
//		                } else if (l.tete.suivant != null) {
//		                    m = l.tete.suivant;
//		                    while (m.suivant != null) {
//		                        if (m.info.getX() == x && m.info.getY() == y) {
//		                            m = m.suivant.suivant;
//		                        }
//		                        m = m.suivant;
//		                    }
//
//		                    return l;
//		                } else if (l.tete.suivant == null && l.tete.info.getX() == x && l.tete.info.getY() == y)
//		                    l.tete = null;
//		            }
//		            return l;
//		        }


		    //METHODE QUI RENVOIE LE SUCCESSEUR UTILE DANS LA METHODE INITGRILLE
		         public int plusUn(int n){
		            int p=0;
		            if(n>=0)
		                p=n+1;
		            else
		                p=n;
		            return p;
		         }

		         //METHODE QUI RETOURNE LA VALEUR NORMALE DE X DU COUPLE
		         public int valeurX(int n){
		        	 return (n-(Math.abs(this.MinX())));
		         }
		         
		         //METHODE QUI RETOURNE LA VALEUR NORMALE DE Y DU COUPLE
		          public int valeurY(int n){
		        	  return (n-(Math.abs(this.MinY())));
		          }
		          
		        public char[][] initGrille() {
		            Maillon m = new Maillon();
		            char[][] matrice = new char[this.plusUn(tailleGrilleX())][(this.plusUn(tailleGrilleY()))];
		            Couple c;
		            System.out.println("   ");
		            System.out.println("    ");
		            m = this.tete;
		             if(!this.estListeVide())
		            	 System.out.println(this.tailleGrilleY());
		            for(int i=0; i<=matrice.length-2;i++){
		            	for(int j=0; j<=matrice[i].length-2;j++){
		            		c=new Couple(this.plusUn(valeurX(i)),this.plusUn(valeurY(j)));
		            		 if(this.coupleExiste(c))
		            			matrice[i][j]='*';
		            		 else
		            			 matrice[i][j]=' ';
		                     }
		        }
		            return matrice;
		        }


		        public void afficherGrille(char [][] matrice){
		        	 System.out.println("       ECRAN 'Jeu de la vie :)      ");
		        	 System.out.println("________________________________________________");
		        	 System.out.println(" -Nombre de cellule:" +this.nbElement());
		        	 System.out.println(" -Nombre de cellule morte:");
		        	 System.out.println(" -Nombre de cellule vivante: ");
		        	 System.out.println(" Etat de generation suivanate : ");
		        	 System.out.println("   *Methode qui retourne String ");
		             System.out.println("                                     ");
		             System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		             System.out.println("                                   ");
		             System.out.println("                                          ");
		            for(int i=0;i<=matrice.length-1;i++){
		                for(int j=0;j<=matrice[i].length-1;j++){
		                    System.out.print(matrice[i][j]);
		                    
		                } 
		                System.out.println("    ");
		               
		                
		             }
		            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		             
		        }




		      /* public void afficherGrille(char s) {
		            int taille = this.lePlusGrand(l.)
		            System.out.println("             ");
		            for (int i = -2; i <= ; i++) {
		                for (int j = -2; j <= m[i].length - 1; j++) {
		                    System.out.print("|__");
		                    System.out.print(m[i][j] + "__");
		                }
		                System.out.println("___|");
		                System.out.println("               ");
		            }
		        }

		         public void afficherGrille(char [][] m){
		           for(int i=0; i<=m.length-1; i++){
		               for(int j=0; j<=m[i].length-1;j++){
		                   System.out.print(m[i][j]);
		               }
		               System.out.println(" ");
		           }
		       }*/

		        public boolean chercherElement(Couple c) {
		            boolean trouve = false;
		           Maillon ref = new Maillon();
		            if(!this.estListeVide()) {
		                ref = this.tete;
		                while (!trouve && ref != null) {
		                    if (ref.info.getX() == (c.getX()) && ref.info.getY() == c.getY()) {
		                        trouve = true;
		                    } else {
		                        ref = ref.suivant;
		                    }

		                }
		            }
		            return trouve;

		        }


		        public Liste copieListe(Liste l) {
		            Maillon m = null, n = null;
		            Liste copieListe = null;
		            if (l.estListeVide())
		                return copieListe;
		            else
		                m = l.tete;
		            n = m;
		            copieListe = new Liste(n);
		            m = m.suivant;
		            n.suivant = m;
		            while (m != null) {
		                m = m.suivant;
		                n = n.suivant;
		            }

		            return copieListe;
		        }


		        public int nbElement() {
		            Maillon m = new Maillon();
		            int cpt = 0;
		            if (!this.estListeVide()) {
		                m = this.tete;
		                while (m.suivant != null) {
		                	cpt++;
		                      m = m.suivant;
		                   }
		            }
		            return cpt;
		        }

		        public int nombreVoisin(Couple c) {
		           int cpt=0;
		           //ON TESTE SI LA LISTE N'EST PAS VIDE
		            if(!this.estListeVide()){
		            	//ON TESTE TOUS LES COUPLES DONT L'ABSCISSE ET L'ORDONNE EST PLUS GRAND QUE 1
		            	if(c.getY()>1 && c.getY() < this.MaxY() && c.getX()>1 && c.getX()<this.MaxX()){
		            		if(this.coupleExiste(new Couple(c.getX()-1,c.getY())))
		            			cpt=cpt+1;
		            		if(this.coupleExiste(new Couple(c.getX(),c.getY()+1)))
		            			cpt=cpt+1;
		            		if(this.coupleExiste(new Couple(c.getX()+1,c.getY()+1)))
		            			cpt=cpt+1;
		            		if(this.coupleExiste(new Couple(c.getX()+1,c.getY())))
		            			cpt=cpt+1;
		            		if(this.coupleExiste(new Couple(c.getX()+1,c.getY()-1)))
		            			cpt=cpt+1;
		            		if(this.coupleExiste(new Couple(c.getX(),c.getY()-1)))
		            			cpt=cpt+1;
		            		if(this.coupleExiste(new Couple(c.getX()-1,c.getY()-1)))
		            			cpt=cpt+1;
		            		if(this.coupleExiste(new Couple(c.getX()-1,c.getY())))
		            			cpt=cpt+1;
		            	}
		            	else
		            		//ON CHERCHE TOUS LES COUPLES DONT l'ORDONNE EST PLUS PETIT QUE L'ABSICE
		            		if(c.getY()==1 && c.getX()>1 && c.getX() < this.MaxX() && c.getY()<this.MaxY()){
		            			cpt=0;
		            			if(this.coupleExiste(new Couple(c.getX()-1,c.getY())))
		            				cpt=cpt+1;
		            			if(this.coupleExiste(new Couple(c.getX()-1,c.getY()+1)))
		            				cpt=cpt+1;
		            			if(this.coupleExiste(new Couple(c.getX(),c.getY()+1)))
		            				cpt=cpt+1;
		            			if(this.coupleExiste(new Couple (c.getX()+1,c.getY()+1)))
		            				cpt=cpt+1;
		            			if(this.coupleExiste(new Couple(c.getX()+1,c.getY())))
		            				cpt=cpt+1;
		            		}
		            	
		            	//ON CHERCHE TOUS LES VOISINS DU COUPLES DONT L'ABSCISE ET ORDONNET SONT A 1
		            			else if(c.getY()==1 && c.getX()==1 && c.getY()<this.MaxY() && c.getX()<this.MaxX()){
		            				cpt=0;
		            			  if(this.coupleExiste(new Couple(c.getX(),c.getY()+1)))
		            				  cpt=cpt+1;
		            			   if(this.coupleExiste(new Couple(c.getX()+1,c.getY()+1)))
		            				   cpt=cpt+1;
		            			   if(this.coupleExiste(new Couple(c.getX()+1,c.getY())))
		            				   cpt=cpt+1;
		            			}
		            	
		            	//ON CHERCHE TOUS LES VOISINS DES COUPLES DONT L'ORDONNNE EST A LA DERNIERE COLONNE ET L'ABSCISE A LA PREMIERE LIGNE
		            			   else if(c.getY()==this.MaxY() && c.getX()==1 && c.getX()<this.MaxX()){
		            				   cpt=0;
		            			     if(this.coupleExiste(new Couple(c.getX(),c.getY()-1)))
		            			    	 cpt=cpt+1;
		            			     if(this.coupleExiste(new Couple(c.getX()+1,c.getY()-1)))
		            			    	 cpt=cpt+1;
		            			     if(this.coupleExiste(new Couple(c.getX()+1,c.getY())))
		            			    	 cpt=cpt+1;
		            			   }
		            	
		            	//ON CHERCHE TOUS LES VOISINS DES COUPLES DONT L'ORDONNE EST LE MAXIMUM DE Y ET l'ABSCISE EST DANS N*
		            			   else if(c.getY()==this.MaxY() && c.getX()>1 && c.getX()<this.MaxX()){
		            				   cpt=0;
		            	           if(this.coupleExiste(new Couple(c.getX()-1,c.getY())))
		            	        	   cpt=cpt+1;
		            	           if(this.coupleExiste(new Couple(c.getX()-1,c.getY()-1)))
		            	        	   cpt=cpt+1;
		            	           if(this.coupleExiste(new Couple(c.getX(),c.getY()-1)))
		            	        	   cpt=cpt+1;
		            	           if(this.coupleExiste(new Couple(c.getX()+1,c.getY()-1)))
		            	        	   cpt=cpt+1;
		            	           if(this.coupleExiste(new Couple(c.getX()+1,c.getY())))
		            	        	   cpt=cpt+1;
		                        }
		            	
		            	//ON CHERCHE TOUS LES VOISINS DU COUPLE DONT L'ORDONNE ET L'ABSCISE SONT EN MAXIMUM
		                          else if(c.getY()==this.MaxY() && c.getX()==this.MaxX()){
		                        	  cpt=0;
		                        	  if(this.coupleExiste(new Couple(c.getX()-1,c.getY())))
		                        		  cpt=cpt+1;
		                        	  if(this.coupleExiste(new Couple(c.getX()-1,c.getY()-1)))
		                        		  cpt=cpt+1;
		                        	  if(this.coupleExiste(new Couple(c.getX(),c.getY()-1)))
		                        		  cpt=cpt+1;
		                             }
		            	
		            	//ON CHERCHE TOUS LES VOISINS DU COUPLE DONT L'ABSCISE EST STRICTYEMENT SUPERIEUR A L'ORDONNEE
		                          else if(c.getX()==1 && c.getY()>1 && c.getY()<this.MaxY()){
		                        	  cpt=0;
		            	             if(this.coupleExiste(new Couple(c.getX(), c.getY()-1)))
		            	            	 cpt=cpt+1;
		            	             if(this.coupleExiste(new Couple(c.getX()+1,c.getY()-1)))
		            	            	 cpt=cpt+1;
		            	             if(this.coupleExiste(new Couple(c.getX()+1,c.getY())))
		            	            	 cpt=cpt+1;
		            	             if(this.coupleExiste(new Couple(c.getX()+1,c.getY()+1)))
		            	            	 cpt=cpt+1;
		            	             if(this.coupleExiste(new Couple(c.getX()+1,c.getY()+1)))
		            	            		 cpt=cpt+1;
		                          }
		            	//ON CHERCHE TOUS LES VOISINS DES COUPLES DONT L'ABSCISE EST EN MAXIMUM ET L'ORDONNE EST PLUS GRAND QUE 1
		                          else
		                        	  if(c.getX()==this.MaxX() && c.getY()>1 && c.getY()<this.MaxY()){
		                        		  cpt=0;
		                        		  if(this.coupleExiste(new Couple(c.getX(),c.getY()-1)))
		                        			  cpt=cpt+1;
		                        		  if(this.coupleExiste(new Couple(c.getX()-1,c.getY()-1)))
		                        			  cpt=cpt+1;
		                        		  if(this.coupleExiste(new Couple(c.getX()-1,c.getY())))
		                        			  cpt=cpt+1;
		                        		  if(this.coupleExiste(new Couple(c.getX()-1,c.getY()+1)))
		                        			  cpt=cpt+1;
		                        		  if(this.coupleExiste(new Couple(c.getX(),c.getY()+1)))
		                        			  cpt=cpt+1;
		                        	   }
		            	
		            	
		                        	  else if(c.getX()==this.MaxX() && c.getY()==1 && c.getY()<this.MaxY()){
		                        		      cpt=0;
		                        		      if(this.coupleExiste(new Couple(c.getX()-1,c.getY())))
		                        		    	  cpt=cpt+1;
		                        		      if(this.coupleExiste(new Couple(c.getX()-1,c.getY()+1)))
		                        		    	  cpt=cpt+1;
		                        		      if(this.coupleExiste(new Couple(c.getX(),c.getY()+1)))
		                        		    	  cpt=cpt+1;
		                        	      }
		                        	  
		            	
		            
		                           }
		                     return cpt;
		             }
		            		
		            
		        

		           public Liste generation(){
		             return this;
		           }




		      /*  public Liste mortCouple(Couple c, Liste l) {
		            int x = c.getX();
		            int y = c.getY();
		            this.copieListe(this);
		            matrice[x - 1][y - 1] = 'M';
		            return this;
		        }



		        public void vieCouple(){
		            Maillon m =new Maillon();
		            Maillon n=new Maillon();
		            int cpt=0;
		            if(!this.estListeVide()){
		                m=this.tete;
		                while(m.suivant!=null){
		                    n=m.suivant;
		                    while(n!=null){
		                        if(m.info.nbreVoisin(n.info)==3) {
		                            this.naissanceCouple(n.info);
		                        }
		                           else if(m.info.nbreVoisin(n.info)<2 || m.info.nbreVoisin(n.info)>3) {
		                               this.mortCouple();
		                        }
		                           n=n.suivant;
		                    }
		                    m=m.suivant;
		                }
		            }
		               this.afficherGrille(this.initGrille(this));
		        }


		        public void evolution(Liste l){
		            if(this.nbElement() > l.nbElement()){
		                System.out.println("augmentation ");
		             }
		             else if(this.nbElement()<l.nbElement()){
		                System.out.println(" Dimunuation ");
		             }else
		                 System.out.println("etat est Stable ");
		        }*/
		    }