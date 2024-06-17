package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

  JTextField aadhar,pan;
  JButton next;
  JRadioButton eyes,eno,syes,sno;
  JComboBox<String> religion,category,occupation,education,income;
  String formno;


    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        setTitle("New Account Application Form");


        JLabel additionaldetails = new JLabel("Page 2:Additional Details" );
        additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionaldetails.setBounds(290,80,400,40);
        add(additionaldetails);

        JLabel name = new JLabel("Religion:" );
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);

        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","other"};
         religion=new JComboBox<>(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        
        JLabel fName = new JLabel(" Category:" );
        fName.setFont(new Font("Raleway",Font.BOLD,22));
        fName.setBounds(100,190,200,30);
        add(fName);

        String valcategory[]={"General","OBC","SC","ST","Other"};
         category=new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob= new JLabel("Income:" );
       dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,240,200,30);
        add(dob);

        String incomecategory[]={"Null","< 1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
         income=new JComboBox(incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);

       
        JLabel gender = new JLabel(" Education" );
       gender.setFont(new Font("Raleway",Font.BOLD,20));
      gender.setBounds(100,290,200,30);
        add(gender);

        

        JLabel email = new JLabel(" Qualification" );
      email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);

        String educationvalues[]={"Non Graduated","Graduate","Post Graduate","Doctarate","others"};
       education=new JComboBox(educationvalues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add( education);
    
         
        JLabel marital = new JLabel(" Occupation:" );
        marital .setFont(new Font("Raleway",Font.BOLD,22));
        marital .setBounds(100,390,200,30);
        add(marital );

        String occupationvalues[]={"Salaried","Self Employed","Bussiness","Student","Retired","others"};
        occupation=new JComboBox(occupationvalues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);


        JLabel address = new JLabel(" Pan Number:" );
     address .setFont(new Font("Raleway",Font.BOLD,22));
      address.setBounds(100,440,200,30);
        add(address );

        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel city = new JLabel(" Aadhar Number:" );
        city.setFont(new Font("Raleway",Font.BOLD,22));
       city.setBounds(100,490,200,30);
           add(city );

           
        aadhar=new JTextField();
       aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
      
           JLabel State = new JLabel(" Senior citizen:" );
        State.setFont(new Font("Raleway",Font.BOLD,22));
       State.setBounds(100,540,200,30);
           add(State );

           
         syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
         syes.setBackground(Color.WHITE);
         add(syes);
 
       sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
         add(sno);
 
         ButtonGroup maritalgroup=new ButtonGroup();
         maritalgroup.add(syes);
         maritalgroup.add(sno);
        

           JLabel Pincode = new JLabel("Existing Account:" );
           Pincode.setFont(new Font("Raleway",Font.BOLD,22));
           Pincode.setBounds(105,590,200,30);
              add(Pincode );

                
         eyes=new JRadioButton("Yes");
         eyes.setBounds(300,590,100,30);
          eyes.setBackground(Color.WHITE);
          add(eyes);
  
        eno=new JRadioButton("No");
         eno.setBounds(450,590,100,30);
         eno.setBackground(Color.WHITE);
          add(eno);
  
          ButtonGroup emaritalgroup=new ButtonGroup();
          emaritalgroup.add(eyes);
          emaritalgroup.add(eno);

               

               next=new JButton("Next");
              next.setBackground(Color.BLACK);
              next.setForeground(Color.WHITE);
              next.setFont(new Font("Raleway",Font.BOLD,14));
              next.setBounds(620,660,80,30);
              next.addActionListener(this);
            add(next);
           

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
     // String formno= ""+random;
      String sreligion=(String)religion.getSelectedItem();
      String scategory=(String)category.getSelectedItem();
      String sincome=(String) income.getSelectedItem();
      String seducation=(String) education.getSelectedItem();
      String soccupation=(String) occupation.getSelectedItem();
      String seniorcitizen=null;
      if(syes.isSelected()){
        seniorcitizen="Yes";

      }
      else if(sno.isSelected()){
        seniorcitizen="No";
      }
    
      String existingaccount=null;
      if(eyes.isSelected()){
        existingaccount="Yes";
      }else if(eno.isSelected()){
        existingaccount="No";
      }
      
String span=pan.getText();
String saadhar=aadhar.getText();


try{
 
  
    Conn c= new Conn();
    String query ="INSERT INTO signuptwo (formno, religion, category, income, education, occupation, pan, aadhar, seniorcitizen,  existingaccount) VALUES ('" 
    + formno + "', '" 
    + sreligion + "', '" 
    + scategory + "', '" 
    + sincome + "', '" 
    + seducation + "', '" 
    + soccupation + "', '" 
    + span + "', '" 
    + saadhar + "', '" 
    + seniorcitizen + "', '" 
    + existingaccount+ "')";
    c.s.executeUpdate(query);

    setVisible(false);
    new Signupthree(formno).setVisible(true);;
 
}
catch(Exception e){
  System.out.println(e);
}
     }
     
    public static void main(String args[]){
        new SignupTwo("");
    }
    
}
