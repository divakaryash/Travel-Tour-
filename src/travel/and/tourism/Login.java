/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.and.tourism;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Login extends JFrame {
    
    Login(){
        setSize(900,400);
        setLocation(600,300);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,120,200,200);
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel un = new JLabel("Username");
        un.setBounds(60,20,100,25);
        un.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(un);
        
        JTextField tun = new JTextField();
        tun.setBounds(60,60,300,30);
        tun.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tun);
        //
        JLabel pass = new JLabel("Password");
        pass.setBounds(60,130,100,25);
        pass.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(pass);
        
        JTextField tup = new JTextField();
        tup.setBounds(60,170,300,30);
        tup.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tup);
        
        JButton login = new JButton("Login");
        login.setBounds(60,220,130,30);
        login.setBackground(new Color(133,193,233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(login);
        
        JButton signup = new JButton("Signup");
        signup.setBounds(220,220,130,30);
        signup.setBackground(new Color(133,193,233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(signup);
        
        JButton fp = new JButton("Forget Password");
        fp.setBounds(150,260,130,30);
        fp.setBackground(new Color(133,193,233));
        fp.setForeground(Color.WHITE);
        fp.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(fp);
        
        JLabel text = new JLabel("Trouble In login...");
        text.setBounds(330,260,150,20);
        text.setForeground(Color.red);
        p2.add(text);
        
        setVisible(true);
    }
    
    public static void main(String[] args){
        Login l = new Login(); 
    }
}
