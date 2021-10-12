/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

/**
 *
 * @author Sahabat Computer
 */
public class Fuzzy {
    public static double ph;
    public static double ntu;
    public static double air;
    public static double a_ph1;
    public static double a_ph2;
    public static double a_ph3;
    public static double a_air1;
    public static double a_air2;
    public static double a_air3;
    public static double a_ntu1;
    public static double a_ntu2;
    public static double a_ntu3;
    public static double ap1;
    public static double ap2;
    public static double ap3;
    public static double ap4;
    public static double ap5;
    public static double ap6;
    public static double ap7;
    public static double ap8;
    public static double ap9;
    public static double z1;
    public static double z2;
    public static double z3;
    public static double z4;
    public static double z5;
    public static double z6;
    public static double z7;
    public static double z8;
    public static double z9;
    public static double ap_ntu1;
    public static double ap_ntu2;
    public static double ap_ntu3;
    public static double ap_ntu4;
    public static double ap_ntu5;
    public static double ap_ntu6;
    public static double ap_ntu7;
    public static double ap_ntu8;
    public static double ap_ntu9;
    public static double z_ntu1;
    public static double z_ntu2;
    public static double z_ntu3;
    public static double z_ntu4;
    public static double z_ntu5;
    public static double z_ntu6;
    public static double z_ntu7;
    public static double z_ntu8;
    public static double z_ntu9;
    public static double z_soda_ash;
    public static double z_al_sulfat;
    public static double soda_ash;
    public static double al_sulfat;
    public static double total_predikat_sodaAsh;
    public static double total_predikat_alSulfat;
    public static double total_rules_sodaAsh;
    public static double total_rules_alSulfat;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
      
    }
   public static void keanggotaan_ph(){
   if (ph <= 6.5){a_ph1 = 1;}
   else if (ph >= 7){a_ph1 = 0;}
   else { a_ph1 = (double) ((7-ph)/(7-6.5)); }
   
   if(ph == 7){ a_ph2=1;}
   else if(6.5 < ph && ph < 7 ){a_ph2= (double)((ph-6.5)/(7-6.5));}
   else if (7 < ph && ph < 7.5){a_ph2 = (double) ((7.5-ph)/(7.5-7));}
   else{a_ph2=0;}
   
   if(ph >= 7.5){a_ph3=1;}
   else if (ph <=7){a_ph3=0;}
   else {a_ph3 = (double)((ph-7)/(7.5-7));}
   }
   
   public static void keanggotaan_air(){
   if (air <= 20000){a_air1 = 1;}
   else if (air >=25000){a_air1 = 0;}
   else{a_air1 = (double) ((25000-air)/(25000-20000));}
   
   if (air == 25000){a_air2 = 1;}
   else if (20000 < air && air < 25000){a_air2 = (double)((air - 20000)/(25000-20000));}
   else if (25000< air && air < 30000){a_air2 = (double)((30000-air)/(30000-25000));}
   else {a_air2 = 0;}
   
   if (air >= 30000){a_air3 = 1;}
   else if (25000 < air && air < 30000){a_air3 = (double)((air-25000)/(30000-25000));}
   else {a_air3 = 0;}
   }
   
   public static void keanggotaan_ntu(){
   if (ntu <= 6){a_ntu1 = 1;}
   else if (ntu >= 11){ a_ntu1 = 0;}
   else {a_ntu1 = (double) ((11-ntu)/(11-6)); }
   
   if (ntu == 11){a_ntu2 = 1;}
   else if (6<ntu && ntu < 11){a_ntu2 = (double)((ntu-6)/(11-6));}
   else if (11 < ntu && ntu <15){a_ntu2 = (double) ((15-ntu)/(15-11));}
   else {a_ntu2 = 0;}
   
   if (ntu >= 15){a_ntu3 = 1;}
   else if (11<ntu && ntu <15){a_ntu3 = (double)((ntu-11)/(15-11));}
   else {a_ntu3 = 0;}
   
   }
   
   public static void soda_ash(){
   ap1=Math.min(a_ph1, a_air1);
   z1= - (ap1)*(27-24)+27;
   ap2=Math.min(a_ph1, a_air2);
   z2=ap2*(27-24)+27;
   ap3 = Math.min(a_ph1, a_air3);
   z3 = ap3*(30-27)+27 ;
   ap4=Math.min(a_ph2, a_air1);
   z4=- (ap4)*(27-24)+27;
   ap5=Math.min(a_ph2, a_air2);
   z5=-ap5*(27-24)+27;
   ap6=Math.min(a_ph2, a_air3);
   z6=ap6*(30-27)+27 ;
   ap7=Math.min(a_ph3, a_air1);
   z7=- (ap7)*(27-24)+27;
   ap8=Math.min (a_ph3, a_air2);
   z8=- (ap8)*(27-24)+27;
   ap9=Math.min (a_ph3, a_air3);
   z9=- (ap9)*(27-24)+27;
   }
   
   
   public static void alumuniumsulfat(){
   ap_ntu1=Math.min (a_ntu1, a_air1);
   z_ntu1= - ap_ntu1*(48-40)+48;
   ap_ntu2=Math.min (a_ntu1, a_air2);
   z_ntu2=- ap_ntu2*(48-40)+48;
   ap_ntu3=Math.min (a_ntu1, a_air3);
   z_ntu3=- ap_ntu3* (48-40)+48;
   ap_ntu4=Math.min (a_ntu2, a_air1);
   z_ntu4=- ap_ntu4*(48-40)+48;
   ap_ntu5=Math.min (a_ntu2, a_air2);
   z_ntu5= ap_ntu5 *(48-40)+40; 
   ap_ntu6=Math.min (a_ntu2, a_air3);
   z_ntu6= ap_ntu6 * (56-48)+48;
   ap_ntu7=Math.min (a_ntu3, a_air1);
   z_ntu7=- ap_ntu7* (48-40)+48;
   ap_ntu8=Math.min (a_ntu3, a_air2);
   z_ntu8=ap_ntu8 * (48-40)+40;
   ap_ntu9=Math.min (a_ntu3, a_air3);
   z_ntu9=ap_ntu9* (56-48)+48;
   }
   
   public static void defuzyfikasi(){
   total_rules_sodaAsh = (ap1*z1)+(ap2*z2)+(ap3*z3)+(ap4*z4)+(ap5*z5)+(ap6*z6)+(ap7*z7)+(ap8*z8)+(ap9*z9);
   total_predikat_sodaAsh = ap1+ap2+ap3+ap4+ap5+ap6+ap7+ap8+ap9;
   total_rules_alSulfat = (ap_ntu1*z_ntu1)+(ap_ntu2*z_ntu2)+(ap_ntu3*z_ntu3)+(ap_ntu4*z_ntu4)+(ap_ntu5*z_ntu5)+(ap_ntu6*z_ntu6)+(ap_ntu7*z_ntu7)+(ap_ntu8*z_ntu8)+(ap_ntu9*z_ntu9);
   total_predikat_alSulfat = ap_ntu1+ap_ntu2+ap_ntu3+ap_ntu4+ap_ntu5+ap_ntu6+ap_ntu7+ap_ntu8+ap_ntu9;
   z_soda_ash = (total_rules_sodaAsh)/ (total_predikat_sodaAsh);
   z_al_sulfat = (total_rules_alSulfat)/ (total_predikat_alSulfat);
   
//konversi ppm ke kg
   soda_ash = (z_soda_ash*air)/1000000;
   al_sulfat = (z_al_sulfat*air)/1000000;
   }
   
   public static void run_all(){
   keanggotaan_ph();
        keanggotaan_air();
        keanggotaan_ntu();
        soda_ash();
        alumuniumsulfat();
        defuzyfikasi();
        System.out.println("a_ph1 = "+a_ph1);
        System.out.println("a_ph2 = "+a_ph2);
        System.out.println("a_ph3 = "+a_ph3);
        System.out.println("a_air1 = "+a_air1);
        System.out.println("a_air2 = "+a_air2); 
        System.out.println("a_air3 = "+a_air3);
        System.out.println("a_ntu1 = "+a_ntu1);
        System.out.println("a_ntu2 = "+a_ntu2); 
        System.out.println("a_ntu3 = "+a_ntu3);
        System.out.println("ap1 = "+ap1);
        System.out.println("z1 = "+z1);
        System.out.println("ap2 = "+ap2);
        System.out.println("z2 = "+z2);
        System.out.println("ap3 = "+ap3);
        System.out.println("z3 = "+z3);
        System.out.println("ap4 = "+ap4);
        System.out.println("z4 = "+z4);
        System.out.println("ap5 = "+ap5);
        System.out.println("z5 = "+z5);
        System.out.println("ap6 = "+ap6);
        System.out.println("z6 = "+z6);
        System.out.println("ap7 = "+ap7);
        System.out.println("z7 = "+z7);
        System.out.println("ap8 = "+ap8);
        System.out.println("z8 = "+z8);
        System.out.println("ap9 = "+ap9);
        System.out.println("z9 = "+z9);
        System.out.println("ap_ntu1 = "+ap_ntu1);
        System.out.println("z_ntu1 = "+z_ntu1);
        System.out.println("ap_ntu2 = "+ap_ntu2);
        System.out.println("z_ntu2 = "+z_ntu2);
        System.out.println("ap_ntu3 = "+ap_ntu3);
        System.out.println("z_ntu3 = "+z_ntu3);
        System.out.println("ap_ntu4 = "+ap_ntu4);
        System.out.println("z_ntu4 = "+z_ntu4);
        System.out.println("ap_ntu5 = "+ap_ntu5);
        System.out.println("z_ntu5 = "+z_ntu5);
        System.out.println("ap_ntu6 = "+ap_ntu6);
        System.out.println("z_ntu6 = "+z_ntu6);
        System.out.println("ap_ntu7 = "+ap_ntu7);
        System.out.println("z_ntu7 = "+z_ntu7);
        System.out.println("ap_ntu8 = "+ap_ntu8);
        System.out.println("z_ntu8 = "+z_ntu8);
        System.out.println("ap_ntu9 = "+ap_ntu9);
        System.out.println("z_ntu9 = "+z_ntu9);
        System.out.println("Z soda ash = " + z_soda_ash);
        System.out.println("Z alum sulfat = " + z_al_sulfat);
        System.out.println("jumlah Soda Ash = "+soda_ash+" Kg");
        System.out.println("jumlah Alumunium Sulfat = "+al_sulfat+" Kg");       
   }
   
   public static void clear(){
   ph= 0;
   ntu= 0;
   air= 0;
   a_ph1= 0;
   a_ph2= 0;
   a_ph3= 0;
   a_air1= 0;
   a_air2= 0;
   a_air3= 0;
   a_ntu1= 0;
   a_ntu2= 0;
   a_ntu3= 0;
   ap1= 0;
   ap2= 0;
   ap3= 0;
   ap4= 0;
   ap5= 0;
   ap6= 0;
   ap7= 0;
   ap8= 0;
   ap9= 0;
   z1= 0;
   z2= 0;
   z3= 0;
   z4= 0;
   z5= 0;
   z6= 0;
   z7= 0;
   z8= 0;
   z9= 0;
   ap_ntu1= 0;
   ap_ntu2= 0;
   ap_ntu3= 0;
   ap_ntu4= 0;
   ap_ntu5= 0;
   ap_ntu6= 0;
   ap_ntu7= 0;
   ap_ntu8= 0;
   ap_ntu9= 0;
   z_ntu1= 0;
   z_ntu2= 0;
   z_ntu3= 0;
   z_ntu4= 0;
   z_ntu5 = 0;
   z_ntu6= 0;
   z_ntu7= 0;
   z_ntu8= 0;
   z_ntu9= 0;
   z_soda_ash= 0;
   z_al_sulfat= 0;
   soda_ash= 0;
   al_sulfat= 0;
   total_predikat_sodaAsh = 0;
   total_predikat_alSulfat = 0;
   total_rules_sodaAsh = 0;
   total_rules_alSulfat = 0;
   }
   
}
