package com.mailAPI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class App 
{
	static void createFrame1(String s){
		
		String[] str= new String[2];
		
		JFrame f=new JFrame("FeedBack Form");
	    JLabel l= new JLabel(s);
	    JRadioButton jb1,jb2,jb3,jb4;
	    
	    jb1=new JRadioButton("Excellent");
	    jb2=new JRadioButton("Good");
	    jb3=new JRadioButton("Average");
	    jb4=new JRadioButton("Poor");
	    ButtonGroup bg=new ButtonGroup();    
	    bg.add(jb1);bg.add(jb2);bg.add(jb3);bg.add(jb4);
	    
	    final JButton b=new JButton("Next");  
	    
	    l.setBounds(50,40,800,30); 
	    
	    jb1.setBounds(50,70,800,30);
	    jb2.setBounds(50,90,800,30);
	    jb3.setBounds(50,110,800,30);
	    jb4.setBounds(50,130,800,30);
	    
	    b.setBounds(250,200,95,30);  
	    b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){ 
		
	           Object o= e.getSource();
	           	if(o== b) {
	           		createFrame2("Rate the interaction of the faculties?");
	           		
	           }
	        }  
	    });  
	    
	    f.add(l);
	    f.add(jb1);f.add(jb2);f.add(jb3);f.add(jb4);
	    f.add(b);
	 
	    f.setSize(600,300);  
	    f.setLayout(null); 
	    f.setLocation(500, 280);
	    f.setVisible(true); 
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	}
	
	//frame 2	
	static void createFrame2(String s){
			
			JFrame f=new JFrame("FeedBack Form");
		    JLabel l= new JLabel(s);
		    JRadioButton jb1,jb2,jb3,jb4;
		    
		    jb1=new JRadioButton("Excellent");
		    jb2=new JRadioButton("Good");
		    jb3=new JRadioButton("Average");
		    jb4=new JRadioButton("Poor");
		    ButtonGroup bg=new ButtonGroup();    
		    bg.add(jb1);bg.add(jb2);bg.add(jb3);bg.add(jb4);
		    
		    final JButton b=new JButton("Next");  
		    
		    l.setBounds(50,40,800,30); 
		    
		    jb1.setBounds(50,70,800,30);
		    jb2.setBounds(50,90,800,30);
		    jb3.setBounds(50,110,800,30);
		    jb4.setBounds(50,130,800,30);
		    
		    b.setBounds(250,200,95,30);  
		    b.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){ 
			
		           Object o= e.getSource();
		           	if(o== b) {
		           		createFrame3("Rate the concept Clearance.");
		           }
		        }  
		    });  
		    
		    f.add(l);
		    f.add(jb1);f.add(jb2);f.add(jb3);f.add(jb4);
		    f.add(b);
		 
		    f.setSize(600,300);  
		    f.setLayout(null); 
		    f.setLocation(500, 280);
		    f.setVisible(true); 
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	//frame 3 
	static void createFrame3(String s){
		
		JFrame f=new JFrame("FeedBack Form");
	    JLabel l= new JLabel(s);
	    JRadioButton jb1,jb2,jb3,jb4;
	    
	    jb1=new JRadioButton("Excellent");
	    jb2=new JRadioButton("Good");
	    jb3=new JRadioButton("Average");
	    jb4=new JRadioButton("Poor");
	    ButtonGroup bg=new ButtonGroup();    
	    bg.add(jb1);bg.add(jb2);bg.add(jb3);bg.add(jb4);
	    
	    final JButton b=new JButton("Next");  
	    
	    l.setBounds(50,40,800,30); 
	    
	    jb1.setBounds(50,70,800,30);
	    jb2.setBounds(50,90,800,30);
	    jb3.setBounds(50,110,800,30);
	    jb4.setBounds(50,130,800,30);
	    
	    b.setBounds(250,200,95,30);  
	    b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){ 
		
	           Object o= e.getSource();
	           	if(o== b) {
	           		createFrame4("Rate the the notes and material provided by the faculties");
	           		
	           }
	        }  
	    });  
	    
	    f.add(l);
	    f.add(jb1);f.add(jb2);f.add(jb3);f.add(jb4);
	    f.add(b);
	 
	    f.setSize(600,300);  
	    f.setLayout(null); 
	    f.setLocation(500, 280);
	    f.setVisible(true); 
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	//frame 4
	static void createFrame4(String s){
		
		JFrame f=new JFrame("FeedBack Form");
	    JLabel l= new JLabel(s);
	    JRadioButton jb1,jb2,jb3,jb4;
	    
	    jb1=new JRadioButton("Excellent");
	    jb2=new JRadioButton("Good");
	    jb3=new JRadioButton("Average");
	    jb4=new JRadioButton("Poor");
	    ButtonGroup bg=new ButtonGroup();    
	    bg.add(jb1);bg.add(jb2);bg.add(jb3);bg.add(jb4);
	    
	    final JButton b=new JButton("Next");  
	    
	    l.setBounds(50,40,800,30); 
	    
	    jb1.setBounds(50,70,800,30);
	    jb2.setBounds(50,90,800,30);
	    jb3.setBounds(50,110,800,30);
	    jb4.setBounds(50,130,800,30);
	    
	    b.setBounds(250,200,95,30);  
	    b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){ 
		
	           Object o= e.getSource();
	           	if(o== b) {
	           		textField();
	           }
	        }  
	    });  
	    
	    f.add(l);
	    f.add(jb1);f.add(jb2);f.add(jb3);f.add(jb4);
	    f.add(b);
	 
	    f.setSize(600,300);  
	    f.setLayout(null); 
	    f.setLocation(500, 280);
	    f.setVisible(true); 
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//textfield
	 static void textField() {
		 
		 final JFrame f = new JFrame("Feedback Form");
		 JLabel l= new JLabel("Enter your Mail ID");
		
		 final JTextArea ta = new JTextArea("");
		 final JButton b = new JButton("Submit");
		   
		 
		 l.setBounds(50,40,800,30); 
		 ta.setBounds(50,80, 450,20); 
		 b.setBounds(250,200, 80,30);
		 
		 b.addActionListener(new ActionListener(){  
			 public void actionPerformed(ActionEvent e){ 
				 String s = ta.getText();

			            Object o= e.getSource();
			            	if(o== b) {
			            		textField();
			            	if(s.isEmpty()) {
			            		JOptionPane.showMessageDialog(f,"Please Enter Mail ID");
			            	}
			            	else {
			            		JOptionPane.showMessageDialog(f,"Thank You For Your Valuable Feedback \n\nCheck mail for Verification");
			            		sendMail(s);
			            		System.exit(0);
			            	}
			            		
			            }
			         }  
			     });  

		 f.add(l);
		 f.add(ta);
		 f.add(b);
		
		 
		 f.setSize(600,300); 
		 f.setLocation(500, 280);
		 f.setLayout(null);  
		 f.setVisible(true);   
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		 
	 }
	
	//main method
    public static void main( String[] args )
    {
        System.out.println( "start" );
        createFrame1("Rate the advices and the suggestion given by the faculties for your career.");   
        
    }

	private static void sendMail(String to) {
		//gmail host
		String msg="Thank you for your Valuable Feedback";
        String subject="Feedback Submitted";
        String from="sparktain3000@gmail.com";
		String host="smtp.gmail.com";
		//system properties
		Properties properties = System.getProperties();
		//setting system properties
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		//Session
		Session session  = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {		
				return new PasswordAuthentication( "sparktain3000@gmail.com","zxmbzdetddakspew");
			}	
		});
		//debug 
		session.setDebug(true);;
		MimeMessage m= new MimeMessage(session);
		try {
			m.setFrom(from);
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			m.setSubject(subject);
			m.setText(msg);
			Transport.send(m);
			System.out.println("sent succesfully ");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}//senMail method end
}//end of class
