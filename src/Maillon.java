
public class Maillon {
	 Couple info;
     Maillon suivant;
     

     public Maillon() {
         this.info = null;
         this.suivant = null;
     }

     public Maillon(Couple info, Maillon s) {
         this.info = new Couple(info.x, info.y);
         this.suivant = s;
     }
      
     
    
}
