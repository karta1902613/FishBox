import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;
public class MainFrame extends JFrame{
    private Container cp;
    private JPanel jpl = new JPanel();
    private JPanel toolPane = new JPanel(new GridLayout(1,2,5,5));
    private JButton jbtnAddFish = new JButton("Add Fish");
    private JButton jbtnExit = new JButton("Exit");
    private JLabel jlb = new JLabel("");
    private int imgW,imgH;
    private int fishIndex = 0;
    private ArrayList <Fish> fishList = new ArrayList<Fish>();
   //    private ArrayList <Fish2> fishList2 = new ArrayList<Fish2>();
    private ArrayList <Thread> threadList = new ArrayList<Thread>();


    public MainFrame(){
        initComp();
    }
    public void initComp() {
        //imgW =
        cp = this.getContentPane();
        cp.add(toolPane, BorderLayout.NORTH);
        cp.add(jpl, BorderLayout.CENTER);
        jpl.setLayout(null);
        this.setBounds(350, 100, 1000, 900);
        this.setResizable(false);
        toolPane.add(jbtnAddFish);
        toolPane.add(jbtnExit);
        jlb.setBounds(100, 100, 80, 30);

        jbtnAddFish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fishList.add(new Fish(1000,900));
                jpl.add(fishList.get(fishList.size() - 1));
                threadList.add(new Thread(fishList.get(fishList.size()-1)));
                threadList.get(threadList.size()-1).start();
            }
        });

        jbtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });

    }

}
