
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author HOREB DON
 */
public class tictac extends javax.swing.JFrame {
private  String again;
private int playeronecount=0;
    private int complayercount=0;
    private String playerone="player one";
    private String playertwo="player two";
    private String playersTurn="";
    private String whoseTurn="X";
      private String complayer="";
      private String askuser;
      private int playertwocount=0;
    
    /**
     * Creates new form tictac
     */
    public tictac() {
        initComponents();
        setSize(400, 400);
        setLocationRelativeTo(null);
        getask();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        box1 = new javax.swing.JTextField();
        box2 = new javax.swing.JTextField();
        box3 = new javax.swing.JTextField();
        box4 = new javax.swing.JTextField();
        box5 = new javax.swing.JTextField();
        box6 = new javax.swing.JTextField();
        box7 = new javax.swing.JTextField();
        box8 = new javax.swing.JTextField();
        box9 = new javax.swing.JTextField();
        Refresh = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe ");
        setBackground(new java.awt.Color(0, 0, 0));

        box1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        box1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box1MouseClicked(evt);
            }
        });
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        box2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        box2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box2MouseClicked(evt);
            }
        });
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });

        box3.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        box3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box3MouseClicked(evt);
            }
        });
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });

        box4.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        box4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box4MouseClicked(evt);
            }
        });
        box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box4ActionPerformed(evt);
            }
        });

        box5.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        box5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box5MouseClicked(evt);
            }
        });
        box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box5ActionPerformed(evt);
            }
        });

        box6.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        box6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box6MouseClicked(evt);
            }
        });
        box6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box6ActionPerformed(evt);
            }
        });

        box7.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        box7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box7MouseClicked(evt);
            }
        });
        box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box7ActionPerformed(evt);
            }
        });

        box8.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        box8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box8MouseClicked(evt);
            }
        });
        box8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box8ActionPerformed(evt);
            }
        });

        box9.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        box9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box9MouseClicked(evt);
            }
        });
        box9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box9ActionPerformed(evt);
            }
        });

        Refresh.setBackground(new java.awt.Color(255, 255, 255));
        Refresh.setText("refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        score.setText("jLabel1");

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(score, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(box1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(box5, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(box8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(box3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Refresh)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(box2)
                        .addComponent(box3))
                    .addComponent(box1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Exit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(score))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void tiegame()
    {
        String c1=box1.getText();
     String c2=box2.getText();
     String c3=box3.getText();
     String c4=box4.getText();
     String c5=box5.getText();
     String c6=box6.getText();
     String c7=box7.getText();
     String c8=box8.getText();
     String c9=box9.getText();
     
     if(c1 != ""&& c2 !=""&& c3 !="" && c4 != "" && c5 !="" && c6 !="" && c7 !="" && c8 != ""&& c9 !="")
     {
        
         JOptionPane.showMessageDialog(null,"Tie!");
         playgain();
     }
        
    }
    private void determineWhoseturn()
{
   
    if (whoseTurn == "X") {
            whoseTurn = "O";
        }
      else {
            whoseTurn = "X";
        }
        
}
 private void setplayername()
    {
         if(whoseTurn=="X")
        {
            playersTurn=playerone;
        }
        else
        {
            playersTurn=playertwo;
        }
         setscore();
    }
 private void getplayernames()
    {
        playerone=JOptionPane.showInputDialog( this,
                "player one name:",
                "player name",
                JOptionPane.INFORMATION_MESSAGE);
         playertwo=JOptionPane.showInputDialog( this,
                "player two name:",
                "player name",
                JOptionPane.INFORMATION_MESSAGE);
        
    }
 private void setscore()
    {
        
       
        score.setText(playerone+ " 's score is: "+ String.valueOf(playeronecount)+"     \t\t\t\t      "+playersTurn+"'s move"+"     \t\t\t\t     "+playertwo+
        "'s score is: "+ String.valueOf(playertwocount));
                }
    private void getask()
    {
  
        askuser=JOptionPane.showInputDialog(this,"Whom Do You Want To Play?","Computer/Human",JOptionPane.INFORMATION_MESSAGE);
        switch(askuser)
        {
 
            case "Computer":case "computer":
                getcmpplayername();
                setcomplayername();
                setcomscore();
                break;
                
            case "Human":case "human":
                getplayernames();
                setplayername();
                setscore();
                
                break;
            default:JOptionPane.showMessageDialog(null, "invalid input");
            System.exit(0);
            
                break;
     
        }
    }
        
      
    
           
        
    private void determineIfWin()
 {
     String c1=box1.getText();
     String c2=box2.getText();
     String c3=box3.getText();
     String c4=box4.getText();
     String c5=box5.getText();
     String c6=box6.getText();
     String c7=box7.getText();
     String c8=box8.getText();
     String c9=box9.getText();
     
     if(c1=="X"&&c2=="X"&&c3=="X")
     {
       xwins();  
     }
     if(c4=="X"&&c5=="X"&&c6=="X")
     {
       xwins();  
     }
     if(c7=="X"&&c8=="X"&&c9=="X")
     {
       xwins();  
     }
     if(c1=="X"&&c4=="X"&&c7=="X")
     {
       xwins();  
     }
     if(c2=="X"&&c5=="X"&&c8=="X")
     {
       xwins();  
     }
     if(c3=="X"&&c6=="X"&&c9=="X")
     {
       xwins();  
     }
     if(c7=="X"&&c5=="X"&&c3=="X")
     {
       xwins();  
     }
     if(c1=="X"&&c5=="X"&&c9=="X")
     {
       xwins();  
     }
     if(c1=="O"&&c2=="O"&&c3=="O")
     {
       owins();  
     }
     if(c4=="O"&&c5=="O"&&c6=="O")
     {
       owins();  
     }
     if(c7=="O"&&c8=="O"&&c9=="O")
     {
       owins();  
     }
     if(c1=="O"&&c4=="O"&&c7=="O")
     {
       owins();  
     }
     if(c2=="O"&&c5=="O"&&c8=="O")
     {
       owins();  
     }
     if(c3=="O"&&c6=="O"&&c9=="O")
     {
       owins();  
     }
     if(c7=="O"&&c5=="O"&&c3=="O")
     {
       owins();  
     }
     if(c1=="O"&&c5=="O"&&c9=="O")
     {
       owins();  
     }
     
     
 }
    
    

private void xwins()
{
    JOptionPane.showMessageDialog(this,
            playerone+ " \t Has Won",
            "winner",JOptionPane.INFORMATION_MESSAGE);
    playeronecount++;
   // JOptionPane.showInputDialog(this,"Type Yes To Reset","Reset",JOptionPane.INFORMATION_MESSAGE);
   
    playgain();
    Refresh.doClick(1000);
   
}
private void owins()
{
    JOptionPane.showMessageDialog(this,
            playertwo +" \t Has Won",
            "winner",JOptionPane.INFORMATION_MESSAGE);
   // playertwocount++;
    //JOptionPane.showInputDialog(this,"Type Yes To Reset","Reset",JOptionPane.INFORMATION_MESSAGE);
    playgain();
    Refresh.doClick(1000);
    
}
   
    
    private void getcmpplayername()
    {
      playerone=JOptionPane.showInputDialog(this,
                "Enter Your  name:",
                "player name",
                JOptionPane.INFORMATION_MESSAGE); 
     complayer=JOptionPane.showInputDialog(this,"Enter Your Opponent name","choose You Want To Play With?",JOptionPane.INFORMATION_MESSAGE);
   
        
        
    
    }
    
   private void setcomscore()
    {
        
       
        score.setText(playerone+ " 's score is: "+ String.valueOf(playeronecount)+"                                  \t\t\t\t\t                "+complayer+
        "'s score is: "+ String.valueOf(complayercount));
                }
    private void setcomplayername()
    {
         if(whoseTurn=="X")
        {
            playersTurn=playerone;
        }
        else
        {
            playersTurn=complayer;
        }
         setcomscore();
    }
    private void resetgame()
{
    
    box1.setText("");
    box2.setText("");
    box3.setText("");
    box4.setText("");
    box5.setText("");
    box6.setText("");
    box7.setText("");
    box8.setText("");
    box9.setText("");
    
    
    setcomscore();
}
   
    private void playgain()
    {
       again=JOptionPane.showInputDialog(this,"Would you like to Start a new game?  Yes/No","New Game?",JOptionPane.INFORMATION_MESSAGE);
    
        switch(again)
    {
        case "yes":case "Yes":
            resetgame();
            break;
        case "no":case "No":
            System.exit(0);
            break;
    }  
    }
    private  void human()
    {

     String c1= box1.getText();
     String c2= box2.getText();
     String c3= box3.getText();
     String c4= box4.getText();
     String c5= box5.getText();
     String c6= box6.getText();
     String c7= box7.getText();
     String c8= box8.getText();
     String c9= box9.getText();
     if((i%2)==1)
     {
     if  ((c1.equals(c2))&&(c2.equals("X"))&&(b3==0)){
        box3.setText("O");
        b3=1;i++;
        }
        else if  ((c3.equals(c2))&&(c2.equals("X"))&&(b1==0)){
        box1.setText("O");
        b1=1;i++;
        }
        else if  ((c1.equals(c3))&&(c1.equals("X"))&&(b2==0)){
        box2.setText("O");
        b2=1;i++;
        }

        else if((c4.equals(c5))&&(c5.equals("X"))&&(b6==0)){
        box6.setText("O");
        b6=1;i++;
        }
        else if((c6.equals(c5))&&(c5.equals("X"))&&(b4==0)){
        box4.setText("O");
        b4=1;i++;
        }
        else if((c4.equals(c6))&&(c4.equals("X"))&&(b5==0)){
        box5.setText("O");
        b5=1;i++;
        }

        else if((c7.equals(c8))&&(c8.equals("X"))&&(b9==0)){
        box9.setText("O");
        b9=1;i++;
        }
        else if((c9.equals(c8))&&(c8.equals("X"))&&(b7==0)){
        box7.setText("O");
        b7=1;i++;
        }
        else if((c7.equals(c9))&&(c7.equals("X"))&&(b8==0)){
        box8.setText("O");
        b8=1;i++;
        }

        else if((c1.equals(c4))&&(c4.equals("X"))&&(b7==0)){
        box7.setText("O");
        b7=1;i++;
        }
        else if((c7.equals(c4))&&(c4.equals("X"))&&(b1==0)){
        box1.setText("O");
        b1=1;i++;
        }
        else if((c1.equals(c7))&&(c1.equals("X"))&&(b4==0)){
        box4.setText("O");
        b4=1;i++;
        }

        else if((c2.equals(c5))&&(c5.equals("X"))&&(b8==0)){
        box8.setText("O");
        b8=1;i++;
        }
        else if((c8.equals(c5))&&(c5.equals("X"))&&(b2==0)){
        box2.setText("O");
        b2=1;i++;
        }
        else if((c2.equals(c8))&&(c2.equals("X"))&&(b5==0)){
        box5.setText("O");
        b5=1;i++;
        }


        else if((c3.equals(c6))&&(c6.equals("X"))&&(b9==0)){
        box9.setText("O");
        b9=1;i++;
        }
        else if((c9.equals(c6))&&(c6.equals("X"))&&(b3==0)){
        box3.setText("O");
        b3=1;i++;
        }
        else if((c3.equals(c9))&&(c3.equals("X"))&&(b6==0)){
        box6.setText("O");
        b6=1;i++;
        }

        else if((c1.equals(c5))&&(c5.equals("X"))&&(b9==0)){
        box9.setText("O");
        b9=1;i++;
        }
        else if((c9.equals(c5))&&(c5.equals("X"))&&(b1==0)){
        box1.setText("O");
        b1=1;i++;
        }
        else if((c1.equals(c9))&&(c1.equals("X"))&&(b5==0)){
        box5.setText("O");
        b5=1;i++;
        }

        else if((c3.equals(c5))&&(c5.equals("X"))&&(b7==0)){
        box7.setText("O");
        b7=1;i++;
        }
        else if((c7.equals(c5))&&(c5.equals("X"))&&(b3==0)){
        box3.setText("O");
        b3=1;i++;
        }
        else if((c3.equals(c7))&&(c3.equals("X"))&&(b5==0)){
        box5.setText("O");
        b5=1;i++;
        }
        else
        {
         if(i==1)
         {
             if(b5==0)
             {             
             box5.setText("O");
             b5=1;
             i++;
             }
             else{
         Random a1 = new Random();
         int first = a1.nextInt((4));
         first++;
         if((first==1)&&(b1==0))
         {
             box1.setText("O");
             b1=1;
             i++;
         }
         else if((first==2)&&(b3==0))
         {
             box3.setText("O");
             b3=1;
             i++;
         }
         else if((first==3)&&(b7==0))
         {
             box7.setText("O");
             b7=1;
             i++;
         }
         else if((first==4)&&(b9==0))
         {
             box9.setText("O");
             b9=1;
             i++;
         }
             }
         }
         else if((  (c1.equals(c9))&&(c9.equals("X")  ))   ||   
                 (  (c3.equals(c7))&&(c7.equals("X")  ))   &&
                 (i==3))
         {
         box6.setText("O");
         b6=1;
         i++;
         }
         else if(i>1)
         {
         
         boolean done = false;
         if(i!=9)
         while(done==false){
         Random a2 = new Random();
         int scnd = a2.nextInt((9));
         scnd++;
         
         if((scnd==1)&&(b1==0))
         {
         box1.setText("O");
         b1=1;
         i++;done=true;
         }
         else if((scnd==2)&&(b2==0)&&(b1==1)&&(b3==1)&&(b7==1)&&(b9==1))
         {
         box2.setText("O");
         b2=1;
         i++;done=true;
         }
         else if((scnd==3)&&(b3==0))
         {
         box3.setText("O");
         b3=1;
         i++;done=true;
         }
         else if((scnd==4)&&(b4==0)&&(b1==1)&&(b3==1)&&(b7==1)&&(b9==1))
         {
         box4.setText("O");
         b4=1;
         i++;done=true;
         }
         else if((scnd==5)&&(b3==0))
         {
         box3.setText("O");
         b3=1;
         i++;done=true;
         }
         else if((scnd==6)&&(b6==0)&&(b1==1)&&(b3==1)&&(b7==1)&&(b9==1))
         {
         box6.setText("O");
         b6=1;
         i++;done=true;
         }
         else if((scnd==7)&&(b7==0))
         {
         box7.setText("O");
         b7=1;
         i++;done=true;
         }
         else if((scnd==8)&&(b8==0)&&(b1==1)&&(b3==1)&&(b7==1)&&(b9==1))
         {
         box8.setText("O");
         b8=1;
         i++;done=true;
         }
         else if((scnd==9)&&(b9==0))
         {
         box9.setText("O");
         b9=1;
         i++;done=true;
         }
         }
         }


        }
        
     }
 }

    private void computer()
    {
     boolean computer_wins=false;
     String c1= box1.getText();
     String c2= box2.getText();
     String c3= box3.getText();
     String c4= box4.getText();
     String c5= box5.getText();
     String c6= box6.getText();
     String c7= box7.getText();
     String c8= box8.getText();
     String c9= box9.getText();
        if((i%2)==1)
            
        {
     if  ((c1.equals(c2))&&(c2.equals("O"))&&(b3==0)){
        box3.setText("O");
        b3=1;
        i++;computer_wins=true;
        }
        else if  ((c3.equals(c2))&&(c2.equals("O"))&&(b1==0)){
        box1.setText("O");
        b1=1;i++;computer_wins=true;
        }
        else if  ((c1.equals(c3))&&(c1.equals("O"))&&(b2==0)){
        box2.setText("O");
        b2=1;i++;computer_wins=true;
        }

        else if((c4.equals(c5))&&(c5.equals("O"))&&(b6==0)){
        box6.setText("O");
        b6=1;i++;computer_wins=true;
        }
        else if((c6.equals(c5))&&(c5.equals("O"))&&(b4==0)){
        box4.setText("O");
        b4=1;i++;computer_wins=true;
        }
        else if((c4.equals(c6))&&(c4.equals("O"))&&(b5==0)){
        box5.setText("O");
        b5=1;i++;computer_wins=true;
        }

        else if((c7.equals(c8))&&(c8.equals("O"))&&(b9==0)){
        box9.setText("O");
        b9=1;i++;computer_wins=true;
        }
        else if((c9.equals(c8))&&(c8.equals("O"))&&(b7==0)){
        box7.setText("O");
        b7=1;i++;computer_wins=true;
        }
        else if((c7.equals(c9))&&(c7.equals("O"))&&(b8==0)){
        box8.setText("O");
        b8=1;i++;computer_wins=true;
        }

        else if((c1.equals(c4))&&(c4.equals("O"))&&(b7==0)){
        box7.setText("O");
        b7=1;i++;computer_wins=true;
        }
        else if((c7.equals(c4))&&(c4.equals("O"))&&(b1==0)){
        box1.setText("O");
        b1=1;i++;computer_wins=true;
        }
        else if((c1.equals(c7))&&(c1.equals("O"))&&(b4==0)){
        box4.setText("O");
        b4=1;i++;computer_wins=true;
        }

        else if((c2.equals(c5))&&(c5.equals("O"))&&(b8==0)){
        box8.setText("O");
        b8=1;i++;computer_wins=true;
        }
        else if((c8.equals(c5))&&(c5.equals("O"))&&(b2==0)){
        box2.setText("O");
        b2=1;i++;computer_wins=true;
        }
        else if((c2.equals(c8))&&(c2.equals("O"))&&(b5==0)){
        box5.setText("O");
        b5=1;i++;computer_wins=true;
        }


        else if((c3.equals(c6))&&(c6.equals("O"))&&(b9==0)){
        box9.setText("O");
        b9=1;i++;computer_wins=true;
        }
        else if((c9.equals(c6))&&(c6.equals("O"))&&(b3==0)){
        box3.setText("O");
        b3=1;i++;computer_wins=true;
        }
        else if((c3.equals(c9))&&(c3.equals("O"))&&(b6==0)){
        box6.setText("O");
        b6=1;i++;computer_wins=true;
        }

        else if((c1.equals(c5))&&(c5.equals("O"))&&(b9==0)){
        box9.setText("O");
        b9=1;i++;computer_wins=true;
        }
        else if((c9.equals(c5))&&(c5.equals("O"))&&(b1==0)){
        box1.setText("O");
        b1=1;i++;computer_wins=true;
        }
        else if((c1.equals(c9))&&(c1.equals("O"))&&(b5==0)){
        box5.setText("O");
        b5=1;i++;computer_wins=true;
        }

        else if((c3.equals(c5))&&(c5.equals("O"))&&(b7==0)){
        box7.setText("O");
        b7=1;i++;computer_wins=true;
        }
        else if((c7.equals(c5))&&(c5.equals("O"))&&(b3==0)){
        box3.setText("O");
        b3=1;i++;computer_wins=true;
        }
        else if((c3.equals(c7))&&(c3.equals("O"))&&(b5==0)){
        box5.setText("O");
        b5=1;i++;computer_wins=true;
        }

        }
        if(computer_wins==true)
        {
        JOptionPane.showMessageDialog(this,
            complayer +" \t Has Won",
            "winner",JOptionPane.INFORMATION_MESSAGE);
        complayercount++;
        playgain();
        Refresh.doClick(1000);
        }
 }
    private void wino()
     {
     
     String c1= box1.getText();
     String c2= box2.getText();
     String c3= box3.getText();
     String c4= box4.getText();
     String c5= box5.getText();
     String c6= box6.getText();
     String c7= box7.getText();
     String c8= box8.getText();
     String c9= box9.getText();
     if(((c1.equals(c2))&&(c2.equals(c3))&&(c1.equals("O")) )  ||
        ((c4.equals(c5))&&(c5.equals(c6))&&(c4.equals("O")) )  ||
        ((c7.equals(c8))&&(c8.equals(c9))&&(c7.equals("O")) )  ||/*Horizontal Complete*/
        ((c1.equals(c4))&&(c4.equals(c7))&&(c1.equals("O")) )  ||
        ((c2.equals(c5))&&(c5.equals(c8))&&(c2.equals("O")) )  ||
        ((c3.equals(c6))&&(c6.equals(c9))&&(c3.equals("O")) )  ||/*Vertical Complete*/
        ((c1.equals(c5))&&(c5.equals(c9))&&(c1.equals("O")) )  ||
        ((c3.equals(c5))&&(c5.equals(c7))&&(c3.equals("O")) ))   /*Doagonal Complete*/
     {
        
        JOptionPane.showMessageDialog(this,
            playerone+ " \t Has Won",
            "winner",JOptionPane.INFORMATION_MESSAGE);
        playeronecount++;
        Refresh.doClick(1000);
     }

    }
    
      private void winx()
     {
     
     String c1= box1.getText();
     String c2= box2.getText();
     String c3= box3.getText();
     String c4= box4.getText();
     String c5= box5.getText();
     String c6= box6.getText();
     String c7= box7.getText();
     String c8= box8.getText();
     String c9= box9.getText();
     if(((c1.equals(c2))&&(c2.equals(c3))&&(c1.equals("X")) )  ||
        ((c4.equals(c5))&&(c5.equals(c6))&&(c4.equals("X")) )  ||
        ((c7.equals(c8))&&(c8.equals(c9))&&(c7.equals("X")) )  ||/*Horizontal Complete*/
        ((c1.equals(c4))&&(c4.equals(c7))&&(c1.equals("X")) )  ||
        ((c2.equals(c5))&&(c5.equals(c8))&&(c2.equals("X")) )  ||
        ((c3.equals(c6))&&(c6.equals(c9))&&(c3.equals("X")) )  ||/*Vertical Complete*/
        ((c1.equals(c5))&&(c5.equals(c9))&&(c1.equals("X")) )  ||
        ((c3.equals(c5))&&(c5.equals(c7))&&(c3.equals("X")) ))   /*Doagonal Complete*/
     {
        
        JOptionPane.showMessageDialog(this,
            playertwo+ " \t Has Won",
            "winner",JOptionPane.INFORMATION_MESSAGE);
        playeronecount++;
        Refresh.doClick(1000);
     }

    }

       void special_case()
       {
           if(i==3){

     String c1= box1.getText();
     String c2= box2.getText();
     String c3= box3.getText();
     String c4= box4.getText();
     String c5= box5.getText();
     String c6= box6.getText();
     String c7= box7.getText();
     String c8= box8.getText();
     String c9= box9.getText();
     if( ((c7.equals("X"))||(c9.equals("X")))  &&(c2.equals("X"))&&(c5.equals("O")))
     {
     Random choice = new Random();
     int box = choice.nextInt((2))+1;
     if(box==1)
     {
     box1.setText("O");
       box1.setForeground(Color.blue);
     b1=1;
     i++;
     }
     else
     {
     box3.setText("O");
       box3.setForeground(Color.blue);
     b3=1;i++;
     }
     }

     else if((c1.equals("X")||(c7.equals("X")))&&(c6.equals("X"))&&(c5.equals("O")))
     {
     Random choice = new Random();
     int box = choice.nextInt((2))+1;
     if(box==1)
     {
     box3.setText("O");
       box3.setForeground(Color.blue);
     b3=1;i++;
     }
     else
     {
     box9.setText("O");
       box9.setForeground(Color.blue);
     b9=1;i++;
     }
     }

     else if( ((c3.equals("X")) || (c1.equals("X"))) &&(c8.equals("X"))&&(c5.equals("O")))
     {
     Random choice = new Random();
     int box = choice.nextInt((2))+1;
     if(box==1)
     {
     box7.setText("O");
       box7.setForeground(Color.blue);
     b7=1;i++;
     }
     else
     {
     box9.setText("O");
       box9.setForeground(Color.blue);
     b9=1;i++;
     }
     }

     else if((c9.equals("X") || (c3.equals("X"))) &&(c4.equals("X"))&&(c5.equals("O")))
     {
     Random choice = new Random();
     int box = choice.nextInt((2))+1;
     if(box==1)
     {
     box7.setText("O");
     box7.setForeground(Color.blue);
     b7=1;i++;
     }
     else
     {
     box1.setText("O");
     box1.setForeground(Color.blue);
     b1=1;i++;
     }
     }
  }}
       int i=0,b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,b7=0,b8=0,b9=0;
       
    private void box1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1MouseClicked
       switch(askuser)
             
       {
             case "computer":case "Computer":
        if(b1==0){
box1.setForeground(Color.RED);
box1.setText("X");
b1=1;
i++;
}
   special_case();
 determineIfWin();
 computer();
human();

setcomplayername();
                 break;
    
         
         case "human": case "Human":
             box1.setText(whoseTurn);
       if(whoseTurn=="X")
      {
         box1.setForeground(Color.red);
      }
      else
      {
          box1.setForeground(Color.blue);
      }
      determineWhoseturn();
      determineIfWin();
      winx();
      wino();
      setplayername();
             break;
        }



    }//GEN-LAST:event_box1MouseClicked

    private void box2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2MouseClicked
        // TODO add your handling code here:
       switch(askuser)
             
       {
             case "computer":case "Computer":
        if(b2==0){
box2.setForeground(Color.RED);
box2.setText("X");
b2=1;
i++;
}
   special_case();
 determineIfWin();
 computer();
human();

setcomplayername();
                 break;
    
         
         case "human": case "Human":
             box2.setText(whoseTurn);
       if(whoseTurn=="X")
      {
         box2.setForeground(Color.red);
      }
      else
      {
          box2.setForeground(Color.blue);
      }
      determineWhoseturn();
      determineIfWin();
     winx();
     wino();
      setplayername();
             break;
        }


    }//GEN-LAST:event_box2MouseClicked

    private void box3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box3MouseClicked
        // TODO add your handling code here:
          switch(askuser)
             
       {
             case "computer":case "Computer":
        if(b3==0){
box3.setForeground(Color.RED);
box3.setText("X");
b3=1;
i++;
}
   special_case();
 determineIfWin();
 computer();
human();

setcomplayername();
                 break;
    
         
         case "human": case "Human":
             box3.setText(whoseTurn);
       if(whoseTurn=="X")
      {
         box3.setForeground(Color.red);
      }
      else
      {
          box3.setForeground(Color.blue);
      }
      determineWhoseturn();
      determineIfWin();
      winx();
      wino();
      setplayername();
             break;
        }

    }//GEN-LAST:event_box3MouseClicked

    private void box4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box4MouseClicked
        // TODO add your handling code here:
          switch(askuser)
             
       {
             case "computer":case "Computer":
        if(b4==0){
box4.setForeground(Color.RED);
box4.setText("X");
b4=1;
i++;
}
   special_case();
 determineIfWin();
 computer();
human();

setcomplayername();
                 break;
    
         
         case "human": case "Human":
             box4.setText(whoseTurn);
       if(whoseTurn=="X")
      {
         box4.setForeground(Color.red);
      }
      else
      {
          box4.setForeground(Color.blue);
      }
      determineWhoseturn();
      determineIfWin();
    winx();
    wino();
      setplayername();
             break;
        }


    }//GEN-LAST:event_box4MouseClicked

    private void box5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box5MouseClicked
        // TODO add your handling code here:
          switch(askuser)
             
       {
             case "computer":case "Computer":
        if(b5==0){
box5.setForeground(Color.RED);
box5.setText("X");
b5=1;
i++;
}
   special_case();
 determineIfWin();
 computer();
human();

setcomplayername();
                 break;
    
         
         case "human": case "Human":
             box5.setText(whoseTurn);
       if(whoseTurn=="X")
      {
         box5.setForeground(Color.red);
      }
      else
      {
          box5.setForeground(Color.blue);
      }
      determineWhoseturn();
      determineIfWin();
      winx();
      wino();
      setplayername();
             break;
        }


    }//GEN-LAST:event_box5MouseClicked

    private void box6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box6MouseClicked
        // TODO add your handling code here:
          switch(askuser)
             
       {
             case "computer":case "Computer":
        if(b6==0){
box6.setForeground(Color.RED);
box6.setText("X");
b6=1;
i++;
}
   special_case();
 determineIfWin();
 computer();
human();

setcomplayername();
                 break;
    
         
         case "human": case "Human":
             box6.setText(whoseTurn);
       if(whoseTurn=="X")
      {
         box6.setForeground(Color.red);
      }
      else
      {
          box6.setForeground(Color.blue);
      }
      determineWhoseturn();
      determineIfWin();
      winx();
      wino();
      setplayername();
             break;
        }

    }//GEN-LAST:event_box6MouseClicked

    private void box7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box7MouseClicked
        // TODO add your handling code here:
          switch(askuser)
             
       {
             case "computer":case "Computer":
        if(b7==0){
box7.setForeground(Color.RED);
box7.setText("X");
b7=1;
i++;
}
   special_case();
 determineIfWin();
 computer();
human();

setcomplayername();
                 break;
    
         
         case "human": case "Human":
             box7.setText(whoseTurn);
       if(whoseTurn=="X")
      {
         box7.setForeground(Color.red);
      }
      else
      {
          box7.setForeground(Color.blue);
      }
      determineWhoseturn();
      determineIfWin();
      winx();
      wino();
      setplayername();
             break;
        }



    }//GEN-LAST:event_box7MouseClicked

    private void box8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box8MouseClicked
        // TODO add your handling code here:
         switch(askuser)
             
       {
             case "computer":case "Computer":
        if(b8==0){
box8.setForeground(Color.RED);
box8.setText("X");
b8=1;
i++;
}
   special_case();
 determineIfWin();
 computer();
human();

setcomplayername();
                 break;
    
         
         case "human": case "Human":
             box8.setText(whoseTurn);
       if(whoseTurn=="X")
      {
         box8.setForeground(Color.red);
      }
      else
      {
          box8.setForeground(Color.blue);
      }
      determineWhoseturn();
      determineIfWin();
      winx();
      wino();
      setplayername();
             break;
        }


    }//GEN-LAST:event_box8MouseClicked

    private void box9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box9MouseClicked
        // TODO add your handling code here:
        switch(askuser)
             
       {
             case "computer":case "Computer":
        if(b9==0){
box9.setForeground(Color.RED);
box9.setText("X");
b9=1;
i++;
}
   special_case();
 determineIfWin();
 computer();
human();

setcomplayername();
                 break;
    
         
         case "human": case "Human":
             box9.setText(whoseTurn);
       if(whoseTurn=="X")
      {
         box9.setForeground(Color.red);
      }
      else
      {
          box9.setForeground(Color.blue);
      }
      determineWhoseturn();
      determineIfWin();
      winx();
      wino();
      setplayername();
             break;
        }


    }//GEN-LAST:event_box9MouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        box1.setText("");
     box2.setText("");
     box3.setText("");
     box4.setText("");
     box5.setText("");
     box6.setText("");
     box7.setText("");
     box8.setText("");
     box9.setText("");
     i=0;
     b1=0;b2=0;b3=0;b4=0;b5=0;b6=0;b7=0;b8=0;b9=0;
     box1.setForeground(Color.BLACK);box2.setForeground(Color.BLACK);box3.setForeground(Color.BLACK);
     box4.setForeground(Color.BLACK);box5.setForeground(Color.BLACK);box6.setForeground(Color.BLACK);
     box7.setForeground(Color.BLACK);box8.setForeground(Color.BLACK);box9.setForeground(Color.BLACK);
    }//GEN-LAST:event_RefreshActionPerformed


    

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
       
    }//GEN-LAST:event_box1ActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
   
                     
    }//GEN-LAST:event_box2ActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed
       
    }//GEN-LAST:event_box3ActionPerformed

    private void box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_box4ActionPerformed

    private void box5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box5ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_box5ActionPerformed

    private void box6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box6ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_box6ActionPerformed

    private void box7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box7ActionPerformed
        
    }//GEN-LAST:event_box7ActionPerformed

    private void box8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box8ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_box8ActionPerformed

    private void box9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box9ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_box9ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_ExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Refresh;
    private javax.swing.JTextField box1;
    private javax.swing.JTextField box2;
    private javax.swing.JTextField box3;
    private javax.swing.JTextField box4;
    private javax.swing.JTextField box5;
    private javax.swing.JTextField box6;
    private javax.swing.JTextField box7;
    private javax.swing.JTextField box8;
    private javax.swing.JTextField box9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables
}
