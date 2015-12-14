package nash_3_interactivefiction;
import java.util.Scanner;
/**
 *
 * @author TexasTiger32
 */
public class Nash_3_InteractiveFiction {

    /**
     * @param args the command line arguments
     */
  //#method3()
    public static void main(String[] args) {
        male();
        female();
       
        
    }
    static int o;
    //#method1()
    static void male () {
    System.out.println("Female(1) Or Male(2) Character?");
        Scanner gender = new Scanner(System.in);
    int a = gender.nextInt(); 
        if (a==2){
            System.out.println("The Men are the backbone of this country");
            System.out.println("What is your Name son?");
            Scanner name = new Scanner(System.in);
            String xx = name.nextLine();
            System.out.println("Hell son you took long enough "+ xx + ", my Name Is Joshua aka The Man and I like progress and I need it now");
            System.out.println("I have some issues that I need taken care of and I heared you were the one to call");
            System.out.println("There are some people in this world that have quite a problem with me And I need them out do you follow?"); 
            System.out.println("C'mon Answer Me !!(Yes(3) No(4))");
            //#enemyObject
            Scanner answer = new Scanner(System.in);
                int b = answer.nextInt(); 
                    if (b==3) {
                        System.out.println("Great, now this job needs precision and stealth, The people after me are sneaky individuals.");
                        System.out.println(" But I also have some toys we can use to get the job done quicker.");
                        System.out.println("Choose your Weapon Sniper(5) Poison Bow(6)");
                        Scanner Decision = new Scanner(System.in);
                            int g = Decision.nextInt();
                                if (g==5) {
                                        System.out.println("OOOH we gon have some fun Sniper Range = 7 Damage = 10");
                                    }
                                if (g==6) {
                                        System.out.println(" One of my favorites Poison Bow Range = 6 Damage = 7");
                                    }
                        System.out.println("Hold up son I have a call to  make");
                        System.out.println("WHAT? We need to up our security by the diamond  more guns more men more camera's MORE EVERYTHING");
                        System.out.println("Nancy can not get close to me, if she does this whole operation... and my life are over.");
                        System.out.println("Ask who is Nancy and why we should be so cautious(7)");
                        Scanner Question = new Scanner(System.in);
                            int h = Question.nextInt();
                                if (h==7) {
                                    System.out.println("Nancy is a stonecold assassin, not scared of anything but failure. She is the best of the best of what she does....");
                                    System.out.println("But she is also my daughter.");
                                    System.out.println("Ask why his daughter is trying to kill him(8)");
                                    Scanner Curious = new Scanner(System.in);
                            int j = Curious.nextInt();
                                if (j==8) {
                                    System.out.println("When Nancy was little I made a decision that my work was more important than my family.");
                                    System.out.println("So my first job was to kill her mother, my wife to show my dedication... I did it.");
                                    System.out.println("Ever since then she has been in hiding and has became the most feared assassin's in the business and now she is after me.");   
                                }
                                if (b==4) {
                        System.out.println("You have a 2 day start when those 2 days are up");
                        System.out.println("Im going to track you down and kill you in the most painful way possible");
                    }
                                 //#win //#lose
                                System.out.println("We are in the assasins warehouse be on the lookout and keep your head on a swivel");
                                    System.out.println(" We are in Fire Fire Fire(Press the number that pops up on the screen to fire)");
                        System.out.println("4");
                                    Scanner number = new Scanner(System.in);
                            int x = number.nextInt();
                                  if (x==4)  {
                                    System.out.println("Keep Shooting....Keep Shooting");
                                  }
                                  if (x!=4)  {
                                    System.out.println("You put up a fight and I love your loyalty but you have failed me");
                                  }
                        System.out.println("8");
                                    Scanner Fire = new Scanner(System.in);
                            int d = Fire.nextInt();
                                    if  (d==8) {
                                    System.out.println("Shoot your way out...Don't stop"); 
                                    }
                                    if (d!=8)  {
                                        System.out.println("You put up a fight and I love your loyalty but you have failed me");
                                    }
                                    
                              System.out.println("2");
                        Scanner Anger = new Scanner(System.in);
                            int o = Anger.nextInt();
                                if (o==2) {
                                    System.out.println("Now go to the office and get all the papers");
                                    }
                                   
                                if (o!=2) {
                                    System.out.println("You put up a fight and I love your loyalty but you have failed me");
                                }
                                System.out.println("Thank you for protection and loyalty the money is being transfered");
                                 
                                     //while          
                                    while(o==2) {
                                        System.out.println("10,000,000$ are being transfered to your account");
                                        System.out.println("You also have my protection from any federal encounters");
                                    }
                                
                                        
                                 
                                
                                
                                
    
               }
                       }
             }
    }
    //#method2()
    //#hero
   static void female () {
        Scanner gender = new Scanner(System.in);
        int a = gender.nextInt();
            if (a==1){
            System.out.println("Females are the reason men are so successful");
            System.out.println("What is your Name Darling?");
            Scanner Female = new Scanner(System.in);
            String ii = Female.nextLine();
            System.out.println("You took long enough "+ ii + ", my Name Is Nancy and I like Money and soon we will have enough to rule ");
            System.out.println(" Ok We have a job to kill the most protected man in the universe The Man and big bucks come when we are successful");
            System.out.println("Are you in or not we need warriors and I heared you were the one people would call in this situation(Yes(3) No(4)");
            
        Scanner answer = new Scanner(System.in);
                int b = answer.nextInt(); 
                    if (b==3) {
                        System.out.println("Great, now this job needs precision and stealth, The Man is a very sneaky individual.");
                        System.out.println("We have to defeat the man with intelligence, and we need to be resilient, Training is a must ");
                        System.out.println("Choose your Weapon Shotgun(5) Brass Knuckles(6)");
                            Scanner Weapon = new Scanner(System.in);
                                int c = Weapon.nextInt();
                                    if (c==5) {
                                        System.out.println(" Smart choice you have chosen the glorious Sniper Range = 7 Damage = 10");
                                    }
                                    if (c==6) {
                                        System.out.println(" Painful, you have chosen the Poison Bow Range = 6 Damage = 7");
                                    }
                        System.out.println("Ask why we are trying to kill TheMan (8)");
                        Scanner jab = new Scanner(System.in);
                            int y = jab.nextInt();
                                if (y==8) {
                                    System.out.println("He killed my mother when I was a young girl, I will give anything to have his blood in my hands");
                                    System.out.println("A bullet to the head will safice, but if you have him don't shoot he's mine");
                                }
                                //#win //#lose //#forthewin
                                 System.out.println(" We are being ambushed Fire Fire Fire(Press the number that pops up on the screen to fire)");
                        System.out.println("4");
                                    Scanner number = new Scanner(System.in);
                            int x = number.nextInt();
                                  if (x==4)  {
                                    System.out.println("Keep Shooting....Keep Shooting");
                                  }
                                  if (x!=4)  {
                                    System.out.println("You put up a fight and I love your loyalty but you have failed me");
                                  }
                        System.out.println("8");
                                    Scanner Fire = new Scanner(System.in);
                            int d = Fire.nextInt();
                                    if  (d==8) {
                                    System.out.println("Protect the papers at all cost...Don't stop");
                                    }
                                    if (d!=8)  {
                                        System.out.println("You put up a fight and I love your loyalty but you have failed me");
                                    }
                              System.out.println("2");
                        Scanner Anger = new Scanner(System.in);
                            int o = Anger.nextInt();
                                if (o==2) {
                                    System.out.println("Lock the Safe!");
                                }
                                if (o!=2) {
                                    System.out.println("You put up a fight and I love your loyalty but you have failed me");
                                }
                                System.out.println("Win");
                                System.out.println("Money is being transfered");
                                 }
                         
                    }
            
                        
                                    
                    
                    }
        
      
     
}



        
        
       
        

