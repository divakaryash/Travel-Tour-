
package travel.and.tourism;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;

public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetail,viewPersonalDetail,UpdatePersonalDetail,checkpackage,bookpackage,viewpackage;
    JButton viewhotel,destination,bookhotel,viewbookhotel,payment,notepad,calculator,about;
    Dashboard(String username){
        
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1920,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("DashBoard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahom", Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,1080);
        add(p2);
        
        addPersonalDetail = new JButton("Add Personal Detail"); 
        addPersonalDetail.setBounds(0,0,300,50);
        addPersonalDetail.setBackground(new Color(0,0,102));
        addPersonalDetail.setForeground(Color.WHITE);
        addPersonalDetail.setFont(new Font("Tahnoma",Font.PLAIN,20));
        addPersonalDetail.setMargin(new Insets(0,0,0,60));
        addPersonalDetail.addActionListener(this);
        p2.add(addPersonalDetail);
        
        UpdatePersonalDetail = new JButton("Update Personal Detail"); 
        UpdatePersonalDetail.setBounds(0,50,300,50);
        UpdatePersonalDetail.setBackground(new Color(0,0,102));
        UpdatePersonalDetail.setForeground(Color.WHITE);
        UpdatePersonalDetail.setFont(new Font("Tahnoma",Font.PLAIN,20));
        UpdatePersonalDetail.setMargin(new Insets(0,0,0,30));
        p2.add(UpdatePersonalDetail);
        
        viewPersonalDetail = new JButton("View Detail"); 
        viewPersonalDetail.setBounds(0,100,300,50);
        viewPersonalDetail.setBackground(new Color(0,0,102));
        viewPersonalDetail.setForeground(Color.WHITE);
        viewPersonalDetail.setFont(new Font("Tahnoma",Font.PLAIN,20));
        viewPersonalDetail.setMargin(new Insets(0,0,0,140));
        viewPersonalDetail.addActionListener(this);
        p2.add(viewPersonalDetail);
        
        JButton deletePersonalDetail = new JButton("Delete Personal Detail"); 
        deletePersonalDetail.setBounds(0,150,300,50);
        deletePersonalDetail.setBackground(new Color(0,0,102));
        deletePersonalDetail.setForeground(Color.WHITE);
        deletePersonalDetail.setFont(new Font("Tahnoma",Font.PLAIN,20));
        deletePersonalDetail.setMargin(new Insets(0,0,0,40));
        p2.add(deletePersonalDetail);
        
        checkpackage = new JButton("Check Package"); 
        checkpackage.setBounds(0,200,300,50);
        checkpackage.setBackground(new Color(0,0,102));
        checkpackage.setForeground(Color.WHITE);
        checkpackage.setFont(new Font("Tahnoma",Font.PLAIN,20));
        checkpackage.setMargin(new Insets(0,0,0,100));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);
        
        bookpackage = new JButton("Book Package"); 
        bookpackage.setBounds(0,250,300,50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahnoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0,0,0,110));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage = new JButton("View Package"); 
        viewpackage.setBounds(0,300,300,50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahnoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,110));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotel = new JButton("View Hotel"); 
        viewhotel.setBounds(0,350,300,50);
        viewhotel.setBackground(new Color(0,0,102));
        viewhotel.setForeground(Color.WHITE);
        viewhotel.setFont(new Font("Tahnoma",Font.PLAIN,20));
        viewhotel.setMargin(new Insets(0,0,0,140));
        viewhotel.addActionListener(this);
        p2.add(viewhotel);
        
        bookhotel = new JButton("Book Hotel"); 
        bookhotel.setBounds(0,400,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahnoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel .addActionListener(this);
        p2.add(bookhotel);
        
        viewbookhotel = new JButton("View Booked Hotel"); 
        viewbookhotel.setBounds(0,450,300,50);
        viewbookhotel.setBackground(new Color(0,0,102));
        viewbookhotel.setForeground(Color.WHITE);
        viewbookhotel.setFont(new Font("Tahnoma",Font.PLAIN,20));
        viewbookhotel.setMargin(new Insets(0,0,0,70));
        viewbookhotel .addActionListener(this);
        p2.add(viewbookhotel);
        
        destination = new JButton("Destination"); 
        destination.setBounds(0,500,300,50);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahnoma",Font.PLAIN,20));
        destination.setMargin(new Insets(0,0,0,140));
        destination.addActionListener(this);
        p2.add(destination);
        
        payment = new JButton("Payment"); 
        payment.setBounds(0,550,300,50);
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahnoma",Font.PLAIN,20));
        payment.setMargin(new Insets(0,0,0,160));
        payment.addActionListener(this);
        p2.add(payment);
        
        calculator = new JButton("Calculator"); 
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahnoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,150));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad = new JButton("Notepad"); 
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahnoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,165));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About"); 
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahnoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,185));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1920, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel  image = new JLabel (i6);
        image.setBounds(0,0,1920,1080);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(600,70,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN,55));
        image.add(text);
       
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetail){
            new AddCustomer(username);
        }else if(ae.getSource() == viewPersonalDetail){
            new ViewCustomer(username);
        }else if(ae.getSource() == UpdatePersonalDetail){
            new UpdateCustomer(username);
        }else if(ae.getSource() == checkpackage){
            new CheckPackage();
        }else if(ae.getSource() == bookpackage){
            new BookPackage(username);
        }else if(ae.getSource() == viewpackage){
            new ViewPackage(username);
        }else if(ae.getSource() == viewhotel){
            new CheckHotels();
        }else if(ae.getSource() == destination){
            new Destination();
        }else if(ae.getSource() == bookhotel){
            new BookHotel(username);
        }else if(ae.getSource() == viewbookhotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource() == payment){
            new Payment();
        }else if(ae.getSource() == calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == about){
            new About();
        }
    }
    
    public static void main(String[] args){
        new Dashboard("");
    }
}
