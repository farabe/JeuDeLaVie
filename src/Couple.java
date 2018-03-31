/**
 * 
 */

/**
 * 31 mars 2018
 */

public class Couple{

public int x;

public  int y;


public Couple(int a, int b){
x=a;
y=b;

   }


public int getX(){
return x;
}

public int getY(){

return y;
}

public boolean VerifCoupleGRand(Couple p){

boolean grand =false;

if(this.x < p.x|| (this.x ==p.x && this.y < p.y)){
grand =true;

}

 return grand;

}


	   
public boolean equals(Couple z){
 return this.getX()==z.getX() && this.getY()==z.getY();
}

 //On chercher un voisins horizontal
public boolean  voisinHorizontalDroit(Couple z){
 return  (this.y == z.y && (((this.x<= z.x) && (z.x == (this.x)+1))));

}


public boolean voisinHorizontalGauche(Couple z){
return (this.y== z.y && (((this.x >= z.x) && (z.x == this.y-1))));

 }




//On cherche un voisin vertical

 public boolean voisinVerticalDroit(Couple z){

return (this.x== z.x && (((this.y <= z.y) && (z.y == this.y+1))));
 }


public boolean voisinVerticalGauche(Couple z){

 return  (this.x == z.x && (((this.y >= z.y) && (z.y == (this.y)-1))));

}

//On cherche un voisin en diagonal positif
public boolean voisinDiagonalDroite(Couple z){

return  ((this.x== z.x + 1 && this.y == z.y + 1) || (z.x == this.x+1 && z.y == this.y+1));
}


 public boolean voisinDiagonalN(Couple z){
return ((this.x== (z.x - 1)) && (this.y== (z.y + 1)));

}

//On recherche un voisin en diagonal negatif
 public boolean voisinDiagonalGauche(Couple z){

return ((this.x == (z.x - 1) && this.y == (z.y - 1)) || (z.x == this.x-1 && z.y == this.y- 1));


}



 public boolean voisinDiagonalD(Couple z){
   return ((this.x== z.x + 1) && (this.y== z.y-1));

}



public boolean voisin(Couple z){
 boolean p= false;
 if(voisinVerticalDroit(z) || voisinDiagonalN(z) || voisinDiagonalD(z)|| voisinVerticalGauche(z)||
 voisinHorizontalDroit(z)|| voisinHorizontalGauche(z) || voisinDiagonalDroite(z) || voisinDiagonalGauche(z))

 p=true;
return p;

 }


	     



public int nbreVoisin(Couple c) {
 int cpt = 0;

 if (c.voisin(c)) {
if (c.voisinHorizontalDroit(c))
	
cpt++;
if (c.voisinHorizontalGauche(c))
cpt++;
if (c.voisinVerticalDroit(c))

 cpt++;

 if (c.voisinVerticalGauche(c))

 cpt++;

if (c.voisinDiagonalN(c))
 cpt++;
	
 if (c.voisinDiagonalD(c))
cpt++;

if (c.voisinDiagonalDroite(c))

 cpt++;
	
if (c.voisinDiagonalGauche(c))
cpt++;

}
return cpt;

}


 public String toString(){
return "(" +this.getX()+ " , "+this.getY()+ ")";

}

}
