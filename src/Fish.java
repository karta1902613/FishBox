import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Fish extends JLabel implements Runnable{
    private int frmW , frmH,x,y,r1,r;
    private ImageIcon[][] imgIcons = {{new ImageIcon("fish.png"),new ImageIcon("fish.png"),new ImageIcon("fish.png"),new ImageIcon("fish.png"),new ImageIcon("fish.png")},{new ImageIcon("fish.png"),new ImageIcon("fish.png"),new ImageIcon("fish.png"),new ImageIcon("fish.png"),new ImageIcon("fish.png")}};
   // private boolean dirFlag = true;
    private Timer t1;
    private Random rand = new Random();
    public Fish(int frmH, int frmW){
        this.frmH = frmH;
        this.frmW = frmW;
        x = rand.nextInt(1000-100);
        y = rand.nextInt(900-100);
    //    r = rand.nextInt(2);
   //     if(r==1){
     //       this.dirFlag = false;
     //   }
        this.setIcon(imgIcons[1][r1 = rand.nextInt(5)]);
        this.setBounds(x,y,this.getIcon().getIconWidth(),this.getIcon().getIconHeight());

    }
    @Override
    public void run(){

        t1 = new Timer(rand.nextInt(1000)+50, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                    System.out.println(x);

                        x += 30;
                        if(x>1000){
                            t1.stop();
                        }
                    Fish.this.setLocation(x,y);


            }
        });
        t1.start();
    }
}
