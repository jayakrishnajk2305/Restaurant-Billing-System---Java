
	package jk;

	import java.awt.Button;

	import java.awt.Checkbox;
	import java.awt.Choice;
	import java.awt.Color;
	import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
	import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class jk {
	static int temp,temp5,temp10,temp15=0;
		static	int temp1,temp6,temp11,temp16=0;
		static	int temp2,temp7,temp12,temp17=0;
		static	int temp3,temp8,temp13=0;
		static int temp4,temp9,temp14=0;
		static int total2,total1,total,total3=0;

		public static void main(String[] args) {
			JFrame f = new JFrame();// creating instance of JFrame
			JLabel l1;
			l1 = new JLabel("TEKIES RESTURANT");
			l1.setBounds(250,60,900,50);
			l1.setFont(new Font("TEKIES RESTURANT", Font.ITALIC + Font.PLAIN,64));
			l1.setForeground(Color.BLUE);
			f.add(l1);
			
			JLabel l2;
	        l2 = new JLabel("**In this resturant you can different types item like veg food items**");
			l2.setBounds(280,130,900, 30);
			l2.setFont(new Font("**In this resturant you can different types item like veg food items**", Font.ITALIC ,20));
	        f.add(l2);
		
			JLabel l3;
		    l3 = new JLabel("**We can also provide prebooking tables.It is a wonderful place for families**");
			l3.setBounds(290,150, 900, 30);
			l3.setFont(new Font("**We can also provide prebooking tables.It is a wonderful place for families**", Font.ITALIC ,20));
	        f.add(l3);
	        
	        JLabel l4;
		    l4 = new JLabel(" **It is a  good place to go and enjoy the wonderful time**");
			l4.setBounds(290,170, 900, 30);
			l4.setFont(new Font(" **It is a  good place to go and enjoy the wonderful time**", Font.ITALIC ,20));
	        f.add(l4);
	        
	        JLabel l5;
		    l5 = new JLabel(" **We can also provide online delivery in cheap cost**");
			l5.setBounds(290,190, 900, 30);
			l5.setFont(new Font(" **We can also provide online delivery in cheap cost**", Font.ITALIC ,20));
	        f.add(l5);
	        
	        
	     	JButton x= new JButton(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\jk1.jpg"));
		   	x.setBounds(600,250,300,300);
		     f.add(x);
		     
		     JButton y= new JButton(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\jk2.jpg"));
			   	y.setBounds(200,250,300,300);
			     f.add(y);
			     
			     Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Mohammad\\Desktop\\icon.png");  
			        f.setIconImage(icon); 
			
		
			Button j = new Button("MENU CARD");
			j.setBounds(250,600, 200, 40);
			f.add(j);
			
			Button p = new Button("BOOKING");
			p.setBounds(700,600, 200, 40);
			f.add(p);
			
			f.setSize(1600, 1600);// 400 width and 500 height
			f.setLayout(null);// using no layout managers
			f.setVisible(true);// making the frame visible
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			
			j.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                 Toolkit.getDefaultToolkit().beep();
					JFrame f1 = new JFrame();// creating instance of JFrame
					 final Label label = new Label();          
				       label.setAlignment(Label.CENTER);  
				       label.setSize(400,100); 
				       f1.add(label);
				       Button b=new Button("**BILL**");  
				       b.setBounds(375,650,150,75); 
				       f1.add(b);
				       Label l1,l2,l8,l9,l10,l11,l12,l13,l15;
					   JLabel l3;
				   	   l3 =  new JLabel("MENU ITEMS");
					   l3.setBounds(450,60,600,80);
					   l3.setFont(new Font("veg items", Font.ITALIC + Font.PLAIN,64));
					   l3.setForeground(Color.GREEN);
					   f1.add(l3);
					   JLabel l4;
					   l4= new JLabel("(1)");
					   l4.setBounds(50,250,50,50);
					   l4.setFont(new Font("(1)", Font.ITALIC ,26));
					   l4.setForeground(Color.BLACK);
					   f1.add(l4);
					   JLabel l5;
					   l5= new JLabel("(2)");
					   l5.setBounds(50,360,50,50);
					   l5.setFont(new Font("(1)", Font.ITALIC ,26));
					   l5.setForeground(Color.BLACK);
					   f1.add(l5);
					   JLabel l6;
					   l6= new JLabel("(3)");
					   l6.setBounds(50,470,50,50);
					   l6.setFont(new Font("(1)", Font.ITALIC ,26));
					   l6.setForeground(Color.BLACK);
					   f1.add(l6);
					   JLabel l7;
					   l7= new JLabel("(4)");
					   l7.setBounds(50,580,50,50);
					   l7.setFont(new Font("(1)", Font.ITALIC ,26));
					   l7.setForeground(Color.BLACK);
					   f1.add(l7);
					   Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Mohammad\\Desktop\\icon.png");  
				        f1.setIconImage(icon); 
					   
				       l1=new Label("");  
				       l1.setBounds(950,300, 250,30);  
				       l2=new Label("");  
				       l2.setBounds(950,350, 250,30);
				       l8=new Label("");  
				       l8.setBounds(950,400, 250,30);  
				       l9= new Label("");  
				       l9.setBounds(950,450, 250,30);
				       l10= new Label("");  
				       l10.setBounds(950,600, 400,40);
				       l10.setFont(new Font("", Font.ITALIC ,26));
					   l10.setForeground(Color.RED);
				       l11=new Label("FOOD ITEMS");  
				       l11.setBounds(150,180, 80,50);
				       l10.setFont(new Font("FOOD ITEMS", Font.ITALIC ,34));
					   l10.setForeground(Color.RED);
				       l12=new Label("FOOD ITEMS WITH PRIZES");  
				       l12.setBounds(400,180, 170,30);
				       l10.setFont(new Font("FOOD ITEMS WITH PRIZES", Font.ITALIC ,26));
					   l10.setForeground(Color.RED);
				       l13=new Label("QUANTITY");  
				       l13.setBounds(700,180, 150,30);
				       l10.setFont(new Font("(1)", Font.ITALIC ,26));
					   l10.setForeground(Color.RED);
					   JLabel l14;
				       l14= new JLabel("BILL RECEIPT");  
				       l14.setBounds(1000,150, 150,40);
				       l10.setFont(new Font("(1)", Font.ITALIC ,34));
					   l10.setForeground(Color.RED);
				       l15= new Label("");  
				       l15.setBounds(1000,200, 400,30);
				       f1.add(l11);
				       f1.add(l12);
				       f1.add(l13);
				       f1.add(l14);
				       f1.add(l15);
				       f1.add(l10);
				       f1.add(l1);
				       f1.add(l2);
				       f1.add(l8);
				       f1.add(l9);
				       final Label label3 = new Label();  
				       final Label label1 = new Label();          
				       label1.setBounds(500,300,100,30);  
				       final Label label2 = new Label();          
				       label2.setBounds(500,350,100,30);        
				       label3.setBounds(500,400,100,30);  
				       final Label label4 = new Label();          
				       label4.setBounds(500,450,100,30);
				       Checkbox checkBox1 = new Checkbox("burger",  false); 
				       checkBox1.setFont(new Font("(1)", Font.ITALIC ,26));
				       checkBox1.setBounds(150,240, 150,75);    
				       Checkbox checkBox2 = new Checkbox("pizza",  false); 
				       checkBox2.setFont(new Font("(1)", Font.ITALIC ,26));
				       checkBox2.setBounds(150,355, 150,57);  
				       Checkbox checkBox3 = new Checkbox("fired rice",  false); 
				       checkBox3.setFont(new Font("(1)", Font.ITALIC ,26));
				       checkBox3.setBounds(150,470, 150,57); 
				       Checkbox checkBox4 = new Checkbox("roti",  false); 
				       checkBox4.setFont(new Font("(1)", Font.ITALIC ,26));
				       checkBox4.setBounds(150,585, 150,57); 
				       f1.add(checkBox1);    
				       f1.add(checkBox2); 
				       f1.add(checkBox3);
				       f1.add(checkBox4);
				       final Choice a=new Choice();  
				       a.setBounds(400,260, 150,75);
				       a.add("no item selected");
				       a.add("only burger(40)");  
				       a.add("butter burger(50)");  
				       a.add("burger with coke(60)");  
				       a.add("combo burger(70)"); 
				       f1.add(a);
				       final Choice a1=new Choice();  
				       a1.setBounds(700,260, 100,50); 
				       a1.add("0");
				       a1.add("1");  
				       a1.add("2");  
				       a1.add("3");  
				       a1.add("4");
				       f1.add(a1);
				       final Choice b1=new Choice();  
				       b1.setBounds(400,375, 150,75);
				       b1.add(" no item selected");
				       b1.add("regular veg pizza(110)");  
				       b1.add("medium veg pizza(120)");  
				       b1.add("large veg pizza(130)");  
				       b1.add("pizza with coke(140)");
				       f1.add(b1);
				    final Choice b11=new Choice();  
				       b11.setBounds(700,375,100,50);
				       b11.add("0");
				       b11.add("1");  
				       b11.add("2");  
				       b11.add("3");  
				       b11.add("4");  
				       f1.add(b11);
				       final Choice c1=new Choice();  
				       c1.setBounds(400,490, 150,75);
				       c1.add(" no item selected");
				       c1.add("veg fired rice(45)");  
				       c1.add("mushroom fired rice(55)");  
				       c1.add("tomata fired rice(65)");  
				       c1.add("mush&tomata pizza(75)");
				       f1.add(c1);
				       final Choice c11=new Choice();  
				       c11.setBounds(700,490,100,50);
				       c11.add("0");
				       c11.add("1");  
				       c11.add("2");  
				       c11.add("3");  
				       c11.add("4");  
				       f1.add(c11);
				       final Choice d1=new Choice();  
				       d1.setBounds(400,605, 150,75);
				       d1.add(" no item selected");
				       d1.add("butter roti(25)");  
				       d1.add("small roti(35)");  
				       d1.add("medium roti(45)");  
				       d1.add("large roti(55)");
				       f1.add(d1);
				       final Choice d11=new Choice();  
				       d11.setBounds(700,605,100,50);
				       d11.add("0");
				       d11.add("1");  
				       d11.add("2");  
				       d11.add("3");  
				       d11.add("4");  
				       f1.add(d11);
				       f1.setSize(1400,1400);  
				       f1.setLayout(null);  
				       f1.setVisible(true);  
				       b.addActionListener(new ActionListener() {  
				           public void actionPerformed(ActionEvent e) {
				        	   Toolkit.getDefaultToolkit().beep();
				       if(checkBox1.getState()==true)
				        		{
				        	     System.out.println(checkBox1.getState());
				        	       temp5=0;
				             if(a.getSelectedItem().equals("only burger(40)")) {
				            	System.out.println(a.getSelectedItem());
				                	   temp1 = 40;
				                   		if(a1.getSelectedItem().equals("0")) {
				                   			l1.setText(" no item ");
				                   		System.out.println(temp);
				                   		}
				                   		else if(a1.getSelectedItem().equals("1")) {
				                   			l1.setText(" only burger"+"  "+"quantity 1"+" -- "+temp1*1);
				                   		    total=total+(temp1*1);
				                   		}
				                   		else if(a1.getSelectedItem().equals("2")) {
				                   			
				                   			total=total+(temp1*2);
				                   			l1.setText(" only burger"+"  "+"quantity 2"+" -- "+temp1*2);
				                   		}
				                   		else if(a1.getSelectedItem().equals("3")) {
					                   		l1.setText(" only burger"+"  "+"quantity 3"+" -- "+temp1*3);
					                   		total=total+(temp1*3);	
				                   		}
				                   		else if(a1.getSelectedItem().equals("4")) {
					                   		l1.setText(" only burger"+"  "+"quantity 4"+" -- "+temp1*4);
					                   		total=total+(temp1*4);
				                   		}
				                   		else {
				                   			l1.setText("select quntity");
				                   		    total+=temp5;
				                   		}
				            }
				             if(a.getSelectedItem().equals("butter burger(50)")) {
					            	System.out.println(a.getSelectedItem());
					                	   temp2 = 50;
					                   		if(a1.getSelectedItem().equals("0")) {
					                   			l1.setText(" no item ");
					                   		System.out.println(temp);
					                   		}
					                   		else if(a1.getSelectedItem().equals("1")) {
					                   			l1.setText("butter burger"+"  "+"quantity 1"+" -- "+temp2*1);
					                   		    total=total+(temp2*1);
					                   		}
					                   		else if(a1.getSelectedItem().equals("2")) {
					                   			l1.setText("butter burger"+"  "+"quantity 2"+" -- "+temp2*2);
					                   			total=total+(temp2*2);
					                        }
					                   		else if(a1.getSelectedItem().equals("3")) {
						                   		l1.setText("butter burger"+"  "+"quantity 3"+" -- "+temp2*3);
						                   		total=total+(temp2*3);	
					                   		}
					                   		else if(a1.getSelectedItem().equals("4")) {
						                   		l1.setText("butter burger"+"  "+"quantity 4"+" -- "+temp2*4);
						                   		total=total+(temp2*4);
					                   		}
					                   		else {
					                   			l1.setText("select quntity");
					                   		    total+=temp5;
					                   		}
					            }
				             if(a.getSelectedItem().equals("burger with coke(60)")) {
					            	System.out.println(a.getSelectedItem());
					                	   temp3 = 60;
					                   		if(a1.getSelectedItem().equals("0")) {
					                   			l1.setText(" no item ");
					                   		System.out.println(temp);
					                   		}
					                   		else if(a1.getSelectedItem().equals("1")) {
					                   			l1.setText("burger with coke"+"  "+"quantity 1"+" -- "+temp3*1);
					                   		    total=total+(temp3*1);
					                   		}
					                   		else if(a1.getSelectedItem().equals("2")) {
					                   			l1.setText("burger with coke"+"  "+"quantity 2"+" -- "+temp3*2);
					                   			total=total+(temp3*2);
					                        }
					                   		else if(a1.getSelectedItem().equals("3")) {
						                   		l1.setText("burger with coke"+"  "+"quantity 3"+" -- "+temp3*3);
						                   		total=total+(temp3*3);	
					                   		}
					                   		else if(a1.getSelectedItem().equals("4")) {
						                   		l1.setText("burger with coke"+"  "+"quantity 4"+" -- "+temp3*4);
						                   		total=total+(temp3*4);
					                   		}
					                   		else {
					                   			l1.setText("select quntity");
					                   		    total+=temp5;
					                   		}
					            }
				             if(a.getSelectedItem().equals("combo burger(70)")) {
					            	System.out.println(a.getSelectedItem());
					                	   temp4 = 70;
					                   		if(a1.getSelectedItem().equals("0")) {
					                   			l1.setText(" no item ");
					                   		System.out.println(temp);
					                   		}
					                   		else if(a1.getSelectedItem().equals("1")) {
					                   			l1.setText("combo burger"+"  "+"quantity 1"+" -- "+temp4*1);
					                   		    total=total+(temp4*1);
					                   		}
					                   		else if(a1.getSelectedItem().equals("2")) {
					                   			l1.setText("combo burger"+"  "+"quantity 2"+" -- "+temp4*2);
					                   			total=total+(temp4*2);
					                        }
					                   		else if(a1.getSelectedItem().equals("3")) {
						                   		l1.setText("combo burger"+"  "+"quantity 3"+" -- "+temp4*3);
						                   		total=total+(temp4*3);	
					                   		}
					                   		else if(a1.getSelectedItem().equals("4")) {
						                   		l1.setText("combo burger"+"  "+"quantity 4"+" -- "+temp4*4);
						                   		total=total+(temp4*4);
					                   		}
					                   		else {
					                   			l1.setText("select quntity");
					                   		    total+=temp5;
					                   		}
					            }
				             
				       }
				      // checkbox1finish
				        if(checkBox2.getState()==true)
		       		            {
		       	                System.out.println(checkBox2.getState());
		       	                 temp5=0;
		                      if(b1.getSelectedItem().equals("regular veg pizza(110)")) {
		           	            System.out.println(b1.getSelectedItem());
		               	         temp6 = 110;
		                  		if(b11.getSelectedItem().equals("0")) {
		                  			l2.setText(" no item ");
		                  		System.out.println(temp);
		                  		}
		                  		else if(b11.getSelectedItem().equals("1")) {
		                  			l2.setText("regular veg pizza"+"  "+"quantity 1"+" -- "+temp6*1);
		                  		    total1=total1+(temp6*1);
		                  		}
		                  		else if(b11.getSelectedItem().equals("2")) {
		                  			
		                  			total1=total1+(temp6*2);
		                  			l2.setText("regular veg pizza"+"  "+"quantity 2"+" -- "+temp6*2);
		                  		}
		                  		else if(b11.getSelectedItem().equals("3")) {
			                   		l2.setText("regular veg pizza"+"  "+"quantity 3"+" -- "+temp6*3);
			                   		total1=total1+(temp6*3);	
		                  		}
		                  		else if(b11.getSelectedItem().equals("4")) {
			                   		l2.setText("regular veg pizza"+"  "+"quantity 4"+" -- "+temp6*4);
			                   		total1=total1+(temp6*4);
		                  		}
		                  		else {
		                  			l2.setText("select quntity");
		                  			total1+=temp5;
		                  		}
		           } 
		                       if(b1.getSelectedItem().equals("medium veg pizza(120)")) {
			            	    System.out.println(b1.getSelectedItem());
			                	   temp7 = 120;
			                   		if(b11.getSelectedItem().equals("0")) {
			                   			l2.setText(" no item ");
			                   		System.out.println(temp);
			                   		}
			                   		else if(b11.getSelectedItem().equals("1")) {
			                   			l2.setText("medium veg pizza"+"  "+"quantity 1"+" -- "+temp7*1);
			                   			total1=total1+(temp7*1);
			                   		}
			                   		else if(b11.getSelectedItem().equals("2")) {
			                   			l2.setText("medium veg pizza"+"  "+"quantity 2"+" -- "+temp7*2);
			                   			total1=total1+(temp7*2);
			                        }
			                   		else if(b11.getSelectedItem().equals("3")) {
			                   			l2.setText("medium veg pizza"+"  "+"quantity 3"+" -- "+temp7*3);
			                   			total1=total1+(temp7*3);	
			                   		}
			                   		else if(b11.getSelectedItem().equals("4")) {
			                   			l2.setText("medium veg pizza"+"  "+"quantity 4"+" -- "+temp7*4);
			                   			total1=total1+(temp7*4);
			                   		}
			                   		else {
			                   			l2.setText("select quntity");
			                   			total1+=temp5;
			                   		}
			            }
		            if(b1.getSelectedItem().equals("large veg pizza(130)")) {
			            	System.out.println(b1.getSelectedItem());
			                	   temp8 = 130;
			                   		if(b11.getSelectedItem().equals("0")) {
			                   			l2.setText(" no item ");
			                   		System.out.println(temp);
			                   		}
			                   		else if(b11.getSelectedItem().equals("1")) {
			                   			l2.setText("large veg pizza"+"  "+"quantity 1"+" -- "+temp8*1);
			                   			total1=total1+(temp8*1);
			                   		}
			                   		else if(b11.getSelectedItem().equals("2")) {
			                   			l2.setText("large veg pizza"+"  "+"quantity 12"+" -- "+temp8*2);
			                   			total1=total1+(temp8*2);
			                        }
			                   		else if(b11.getSelectedItem().equals("3")) {
			                   			l2.setText("large veg pizza"+"  "+"quantity 3"+" -- "+temp8*3);
			                   			total1=total1+(temp8*3);	
			                   		}
			                   		else if(b11.getSelectedItem().equals("4")) {
			                   			l2.setText("large veg pizza"+"  "+"quantity 4"+" -- "+temp8*4);
			                   			total1=total1+(temp8*4);
			                   		}
			                   		else {
			                   			l2.setText("select quntity");
			                   			total1+=temp5;
			                   		}
			            }
		            if(b1.getSelectedItem().equals("pizza with coke(140)")) {
			            	System.out.println(a.getSelectedItem());
			                	   temp9 = 140;
			                   		if(b11.getSelectedItem().equals("0")) {
			                   			l2.setText(" no item ");
			                   		System.out.println(temp);
			                   		}
			                   		else if(b11.getSelectedItem().equals("1")) {
			                   			l2.setText("pizza with coke"+"  "+"quantity 1"+" -- "+temp9*1);
			                   			total1=total1+(temp9*1);
			                   		}
			                   		else if(b11.getSelectedItem().equals("2")) {
			                   			l2.setText("pizza with coke"+"  "+"quantity 2"+" -- "+temp9*2);
			                   			total1=total1+(temp9*2);
			                        }
			                   		else if(b11.getSelectedItem().equals("3")) {
			                   			l2.setText("pizza with coke"+"  "+"quantity 3"+" -- "+temp9*3);
			                   			total1=total1+(temp9*3);	
			                   		}
			                   		else if(b11.getSelectedItem().equals("4")) {
			                   			l2.setText("pizza with coke"+"  "+"quantity 4"+" -- "+temp9*4);
			                   			total1=total1+(temp9*4);
			                   		}
			                   		else {
			                   			l2.setText("select quntity");
			                   			total1+=temp5;
			                   		}
			            }
		            }
				    // checkbox2finish   
				        if(checkBox3.getState()==true)
				            {
			                System.out.println(checkBox3.getState());
			                 temp5=0;
		                 if(c1.getSelectedItem().equals("veg fired rice(45)")) {
		  	               System.out.println(c1.getSelectedItem());
		      	          temp10 = 45;
		         		      if(c11.getSelectedItem().equals("0")) {
		         			l8.setText(" no item ");
		         			System.out.println(temp);
		                		}
		         		  else if(c11.getSelectedItem().equals("1")) {
		         			l8.setText("veg fried rice"+"  "+"quantity 1"+"  "+temp10*1);
		         		    total3=total3+(temp10*1);
		         		}
		         		else if(c11.getSelectedItem().equals("2")) {
		         			
		         			total3=total3+(temp10*2);
		         			l8.setText("veg fried rice"+"  "+"quantity 2"+" -- "+temp10*2);
		         		}
		         		else if(c11.getSelectedItem().equals("3")) {
		         			l8.setText("veg fried rice"+"  "+"quantity 3"+" -- "+temp10*3);
		         			total3=total3+(temp10*3);	
		         		}
		         		else if(c11.getSelectedItem().equals("4")) {
		         			l8.setText("veg fried rice"+"  "+"quantity 4"+" -- "+temp10*4);
		         			total3=total3+(temp10*4);
		         		}
		         		else {
		         			l8.setText("select quntity");
		         			total3+=temp5;
		         		}
		              } 
		              if(c1.getSelectedItem().equals("mushroom fired rice(55)")) {
		       	        System.out.println(c1.getSelectedItem());
		           	     temp11 = 55;
		              		if(c11.getSelectedItem().equals("0")) {
		              			l8.setText(" no item ");
		              		System.out.println(temp);
		              		}
		              		else if(c11.getSelectedItem().equals("1")) {
		              			l8.setText("mushroom fired rice"+"  "+"quantity 1"+" -- "+temp11*1);
		              			total3=total3+(temp11*1);
		              		}
		              		else if(c11.getSelectedItem().equals("2")) {
		              			l8.setText("mushroom fired rice"+"  "+"quantity 2"+" -- "+temp11*2);
		              			total3=total3+(temp11*2);
		                   }
		              		else if(c11.getSelectedItem().equals("3")) {
		              			l8.setText("mushroom fired rice"+"  "+"quantity 3"+" -- "+temp11*3);
		              			total3=total3+(temp11*3);	
		              		}
		              		else if(c11.getSelectedItem().equals("4")) {
		              			l8.setText("mushroom fired rice"+"  "+"quantity 4"+" -- "+temp11*4);
		              			total3=total3+(temp11*4);
		              		}
		              		else {
		              			l8.setText("select quntity");
		              			total3+=temp5;
		              		}
		       }
		            if(c1.getSelectedItem().equals("tomata fired rice(65)")) {
		            	System.out.println(c1.getSelectedItem());
		           	    temp12 = 65;
		               		if(c11.getSelectedItem().equals("0")) {
		              			l8.setText(" no item ");
		              		System.out.println(temp);
		              		}
		              		else if(c11.getSelectedItem().equals("1")) {
		              			l8.setText("tomata fried rice"+"  "+"quantity 1"+" -- "+temp12*1);
		              			total3=total3+(temp12*1);
		              		}
		              		else if(c11.getSelectedItem().equals("2")) {
		              			l8.setText("tomata fried rice"+"  "+"quantity 2"+" -- "+temp12*2);
		              			total3=total3+(temp12*2);
		                   }
		              		else if(c11.getSelectedItem().equals("3")) {
		              			l8.setText("tomata fried rice"+"  "+"quantity 3"+" -- "+temp12*3);
		              			total3=total3+(temp12*3);	
		              		}
		              		else if(c11.getSelectedItem().equals("4")) {
		              			l8.setText("tomata fried rice"+"  "+"quantity 4"+" -- "+temp12*4);
		              			total3=total3+(temp12*4);
		              		}
		              		else {
		              			l8.setText("select quntity");
		              			total3+=temp5;
		              		}
		       }
		          if(c1.getSelectedItem().equals("mush&tomata pizza(75)")) {
		          	    System.out.println(c1.getSelectedItem());
		           	       temp13 =75;
		              		if(c11.getSelectedItem().equals("0")) {
		              			l8.setText(" no item ");
		              		System.out.println(temp);
		              		}
		              		else if(c11.getSelectedItem().equals("1")) {
		              			l8.setText("mush&tomata fired rice"+"  "+"quantity 1"+" -- "+temp13*1);
		              			total3=total3+(temp13*1);
		              		}
		              		else if(c11.getSelectedItem().equals("2")) {
		              			l8.setText("mush&tomata fired rice"+"  "+"quantity 2"+" -- "+temp13*2);
		              			total3=total3+(temp13*2);
		                   }
		              		else if(c11.getSelectedItem().equals("3")) {
		              			l8.setText("mush&tomata fired rice"+"  "+"quantity 3"+" -- "+temp13*3);
		              			total3=total3+(temp13*3);	
		              		}
		              		else if(c11.getSelectedItem().equals("4")) {
		              			l8.setText("mush&tomata fired rice"+"  "+"quantity 4"+" -- "+temp13*4);
		              			total3=total3+(temp13*4);
		              		}
		              		else {
		              			l8.setText("select quntity");
		              			total3+=temp5;
		              		}
		       }
		   }
				    // checkbox3finish 
				        if(checkBox4.getState()==true)
			            {
		                System.out.println(checkBox4.getState());
		                 temp5=0;
		                     if(d1.getSelectedItem().equals("butter roti(25)")) {
			               System.out.println(d1.getSelectedItem());
		  	              temp14 = 25;
		     		      if(d11.getSelectedItem().equals("0")) {
		     			l9.setText(" no item ");
		     			System.out.println(temp);
		            		}
		     		     else if(d11.getSelectedItem().equals("1")) {
		     			l9.setText("butter roti"+"  "+"quantity 1"+"  "+temp14*1);
		     		    total2=total2+(temp14*1);
		     		     }
		     	     	else if(d11.getSelectedItem().equals("2")) {
		     			
		     	     		total2=total2+(temp14*2);
		     			l9.setText("butter roti"+"  "+"quantity 2"+" -- "+temp14*2);
		     		   }
		     		   else if(d11.getSelectedItem().equals("3")) {
		     			l9.setText("butter roti"+"  "+"quantity 3"+" -- "+temp14*3);
		     			total2=total2+(temp14*3);	
		     		    }
		     		   else if(d11.getSelectedItem().equals("4")) {
		     			l9.setText("butter roti"+"  "+"quantity 4"+" -- "+temp14*4);
		     			total2=total2+(temp14*4);
		     		   }
		     		   else {
		     			l9.setText("select quntity");
		     			total2+=temp5;
		     		   }
		             } 
		          if(d1.getSelectedItem().equals("small roti(35)")) {
		   	        System.out.println(d1.getSelectedItem());
		       	     temp15 = 35;
		          		if(d11.getSelectedItem().equals("0")) {
		          			l9.setText(" no item ");
		          		System.out.println(temp);
		          		}
		          		else if(d11.getSelectedItem().equals("1")) {
		          			l9.setText("small roti"+"  "+"quantity 1"+" -- "+temp15*1);
		          			total2=total2+(temp15*1);
		          		}
		          		else if(d11.getSelectedItem().equals("2")) {
		          			l9.setText("small roti"+"  "+"quantity 2"+" -- "+temp15*2);
		          			total2=total2+(temp15*2);
		               }
		          		else if(d11.getSelectedItem().equals("3")) {
		          			l9.setText("small roti"+"  "+"quantity 3"+" -- "+temp15*3);
		          			total2=total2+(temp15*3);	
		          		}
		          		else if(d11.getSelectedItem().equals("4")) {
		          			l9.setText("small roti"+"  "+"quantity 4"+" -- "+temp15*4);
		          			total2=total2+(temp15*4);
		          		}
		          		else {
		          			l9.setText("select quntity");
		          			total2+=temp5;
		          		}
		   }
		        if(d1.getSelectedItem().equals("medium roti(45)")) {
		        	System.out.println(d1.getSelectedItem());
		       	    temp16 =45;
		           		if(d11.getSelectedItem().equals("0")) {
		          			l9.setText(" no item ");
		          		System.out.println(temp);
		          		}
		          		else if(d11.getSelectedItem().equals("1")) {
		          			l9.setText("medium roti"+"  "+"quantity 1"+" -- "+temp16*1);
		          			total2=total2+(temp16*1);
		          		}
		          		else if(d11.getSelectedItem().equals("2")) {
		          			l9.setText("medium roti"+"  "+"quantity 2"+" -- "+temp16*2);
		          			total2=total2+(temp16*2);
		               }
		          		else if(d11.getSelectedItem().equals("3")) {
		          			l9.setText("medium roti"+"  "+"quantity 3"+" -- "+temp16*3);
		          			total2=total2+(temp16*3);	
		          		}
		          		else if(d11.getSelectedItem().equals("4")) {
		          			l9.setText("medium roti"+"  "+"quantity 4"+" -- "+temp16*4);
		          			total2=total2+(temp16*4);
		          		}
		          		else {
		          			l9.setText("select quntity");
		          			total2+=temp5;
		          		}
		   }
		      if(d1.getSelectedItem().equals("large roti(55)")) {
		      	    System.out.println(c1.getSelectedItem());
		       	       temp17 =55;
		          		if(d11.getSelectedItem().equals("0")) {
		          			l9.setText(" no item ");
		          		System.out.println(temp);
		          		}
		          		else if(d11.getSelectedItem().equals("1")) {
		          			l9.setText("large roti"+"  "+"quantity 1"+" -- "+temp17*1);
		          			total2=total2+(temp17*1);
		          		}
		          		else if(d11.getSelectedItem().equals("2")) {
		          			l9.setText("large roti"+"  "+"quantity 2"+" -- "+temp17*2);
		          			total2=total2+(temp17*2);
		               }
		          		else if(d11.getSelectedItem().equals("3")) {
		          			l9.setText("large roti"+"  "+"quantity 3"+" -- "+temp17*3);
		          			total2=total2+(temp17*3);	
		          		}
		          		else if(d11.getSelectedItem().equals("4")) {
		          			l9.setText("large roti"+"  "+"quantity 4"+" -- "+temp17*4);
		          			total2=total2+(temp17*4);
		          		}
		          		else {
		          			l9.setText("select quantity");
		          			total2+=temp5;
		          		}
		   }
		}
			//	System.out.println("total amount"+total);
				        int jk = total+total2+total1+total3;
				l10.setText("TOTAL AMOUNT="+jk);
					   // check4finish     		
	f1.setSize(1600, 1600);// 400 width and 500 height
	f1.setLayout(null);// using no layout managers
	f1.setVisible(true);// making the frame visible
				          /////////////add(frame)
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	p.addActionListener(new ActionListener() {
		@SuppressWarnings("rawtypes")
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
	JFrame f;
	JFrame f3 = new JFrame();
	// creating instance of JFrame
	JLabel l5;
	l5 = new JLabel("ONLINE BOOKING");
	l5.setBounds(50, 50, 700, 50);
	l5.setFont(new Font("First Name", Font.ITALIC + Font.BOLD ,50));
	f3.add(l5);
	  Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Mohammad\\Desktop\\icon.png");  
      f3.setIconImage(icon); 

	JLabel l1;
	TextField t1;
	l1 = new JLabel("First Name:");
	l1.setBounds(50, 170, 100, 30);
	l1.setFont(new Font("First Name", Font.ITALIC + Font.BOLD ,16));
	t1 = new TextField("");
	t1.setBounds(200, 170, 220, 30);
	f3.add(l1);
	f3.add(t1);
	JLabel l2;
	TextField t2;
	l2 = new JLabel("Last Name:");
	l2.setBounds(50, 220, 100, 30);
	l2.setFont(new Font("Last Name", Font.ITALIC + Font.BOLD ,16));
	t2 = new TextField("");
	t2.setBounds(200, 220, 220, 30);
	f3.add(l2);
	f3.add(t2);
	JLabel l3;
	TextField t3;
	l3 = new JLabel("Phone number:");
	l3.setBounds(50, 270, 100, 30);
	l1.setFont(new Font("phone number ", Font.ITALIC + Font.BOLD ,16));
	t3 = new TextField("");
	t3.setBounds(200, 270, 220, 30);
	f3.add(l3);
	f3.add(t3);
	JLabel l4;
	l4 = new JLabel("how many tables ??");
	l4.setBounds(50, 320, 100, 30);
	l1.setFont(new Font("how many tables", Font.ITALIC + Font.BOLD ,16));
	 final Choice a1=new Choice();  
	    a1.setBounds(200,320, 75,75); 
	    a1.add("0");
	    a1.add("1");  
	    a1.add("2");  
	    a1.add("3");  
	    a1.add("4");
	    f3.add(a1);
	f3.add(l4);
	Checkbox checkBox11 = new Checkbox("PAY AT HOTEL",  false); 
	checkBox11.setFont(new Font("(1)", Font.ITALIC ,26));
	checkBox11.setBounds(150,400, 300,75);    
	f3.add(checkBox11);
	JButton xy= new JButton(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\jk33.jpg"));
   	xy.setBounds(700,100,300,300);
     f3.add(xy);

	JLabel j13=new JLabel("DATE:");j13.setBounds(50,370,70,30);
	j13.setFont(new Font("Courier New",Font.ITALIC,20));
	String date1[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	final JComboBox dm=new JComboBox(date1);
	dm.setBounds(140,370,70,30);
	dm.setFont(new Font("Courier New",Font.ITALIC,20));
	f3.add(j13);
	f3.add(dm);


	JLabel j14=new JLabel("MONTH:");j14.setBounds(250,370,90,30);
	j14.setFont(new Font("Courier New",Font.ITALIC,20));
	String num[]= {"jan","feb","mar","april","may","june","july","aug","sept","oct","nov","dec"};
	final JComboBox cm=new JComboBox(num);
	cm.setBounds(360,370,90,30);
	cm.setFont(new Font("Courier New",Font.ITALIC,20));	
	f3.add(j14);
	f3.add(cm);

	JLabel j15=new JLabel("YEAR:");j15.setBounds(470,370,70,30);
	j15.setFont(new Font("Courier New",Font.ITALIC,20));
	String num1[]= {"2020","2021","2022","2023","2024"};
	final JComboBox cn=new JComboBox(num1);
	cn.setBounds(550,370,80,30);
	f3.add(j15);;       f3.add(cn);
	 Button b=new Button("book");  
	    b.setBounds(350,560,100,40);  
	    f3.add(b);   
	f3.setSize(1600,1600);//400 width and 500 height  
	f3.setLayout(null);//using no layout managers  
	f3.setVisible(true);//making the frame visible
	b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
	String NAME=t1.getText();
	String NAME1=t2.getText();

	String PHONE1=t3.getText();
	JFrame f;
	JFrame f4 = new JFrame();
	// creating instance of JFrame
	  Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Mohammad\\Desktop\\icon.png");  
      f4.setIconImage(icon); 
	JLabel l5;
	l5 = new JLabel("booking recepit");
	l5.setBounds(50, 50, 700, 50);
	l5.setFont(new Font("First Name", Font.ITALIC + Font.BOLD ,50));
	f4.add(l5);
	JLabel l1;
	l1 = new JLabel("First Name:");
	l1.setBounds(50, 170, 100, 30);
	l1.setFont(new Font("First Name", Font.ITALIC + Font.BOLD ,16));
	f4.add(l1);
	JLabel l2;
	TextField t2;
	l2 = new JLabel("Last Name:");
	l2.setBounds(50, 220, 100, 30);
	l2.setFont(new Font("Last Name", Font.ITALIC + Font.BOLD ,16));
	f4.add(l2);
	JLabel l3;
	TextField t3;
	l3 = new JLabel("Phone number:");
	l3.setBounds(50, 270, 100, 30);
	l1.setFont(new Font("phone number ", Font.ITALIC + Font.BOLD ,16));
	f4.add(l3);
	JLabel l4;
	l4 = new JLabel("by showing this receipt we can provide u table");
	l4.setBounds(50, 350, 700, 30);
	l4.setFont(new Font("by showing this receipt we can provide u table", Font.ITALIC + Font.BOLD ,16));
	f4.add(l4);
	JTextField t11,t12,t13;
	t11=new JTextField(NAME);
	t11.setBounds(200,170, 220,30);
	t11.setEditable(false);
	t12=new JTextField(NAME1);
	t12.setBounds(200,220, 220,30);
	t12.setEditable(false);
	t13=new JTextField(PHONE1);
	t13.setBounds(200,270, 220,30);
	t13.setEditable(false);
	f4.add(t11); f4.add(t12);f4.add(t13);
	Button b1=new Button("OK");  
	b1.setBounds(500,400,100,40);  
	f4.add(b1);  f3.dispose();
	JButton y1= new JButton(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\h1.jpg"));
   	y1.setBounds(500,125,300,200);
     f4.add(y1);
	f4.setSize(1600,1600);//400 width and 500 height  
	f4.setLayout(null);//using no layout managers  
	f4.setVisible(true);
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep();
			JFrame f5;
			JFrame f51=new JFrame();
			JOptionPane.showMessageDialog(f51, "THANK YOU VISIT AGAIN");
			     }
	            });				
               }
	          });
	         }
	        });
           }
	      });
	     }
		});
	   }
	  }
		
