package UserInterface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



import SortingAlgorithms.SortByDateOfBirth;
import SortingAlgorithms.SortByName;
import Worker.Person;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;

public class GUI {

	
	private JTextArea textArea;
	private Thread reader;
	private Thread reader2;
	private boolean quit;
	public int Selection;
	Thread errorThrower;		
	
	private JFrame frame;
	private boolean flag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public GUI(/*int i*/) throws ParseException {
		initialize();
		//GUI.this.Selection=i;
	}

	
	public void initialize() throws ParseException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(31, 95, 160, 20);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("Question 1");
		comboBox.addItem("Question 2");
		comboBox.addItem("Question 3");
		comboBox.addItem("Question 4");
		
		Scanner kb=new Scanner(System.in);
		Person p=new Person();
		Main main=new Main();
		
		p.read();
	
		GUI.this.flag=false;
		
		if(comboBox.getSelectedItem().toString().equals("Question 2")){
			GUI.this.flag=true;
			
		}
		
		JButton btnNewButton = new JButton("Run");
		btnNewButton.setBounds(285, 94, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		//InputStream is=new InputStream();
		
		btnNewButton.addActionListener(new ActionListener() {
			File file = new File("src");
			
        	String absolutePath = file.getPath(); 
        	
        	Runtime rt = Runtime.getRuntime();

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(comboBox.getSelectedItem().toString().equals("Question 1")){
					
					try {
						////java -flag -flag -cp terminal-based-program.jar
			        	//rt.exec("cmd.exe /c cd \""+ absolutePath+ "\" & start cmd.exe /k \"java"+ name+"\"");
			        	System.out.println(absolutePath);
			        	rt.exec("cmd.exe /c cd \""+ absolutePath+ "\" & start cmd.exe /k \"java Main.RunFindByName\"");
			        
			        				        
						
					}  catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				if(comboBox.getSelectedItem().toString().equals("Question 2")){
				
					
						try {
							rt.exec("cmd.exe /c cd \""+ absolutePath+ "\" & start cmd.exe /k \"java Main.RunFindByDateOfBirth\"");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						
					
				}
				if(comboBox.getSelectedItem().toString().equals("Question 3")){
					
					
					try {
						rt.exec("cmd.exe /c cd \""+ absolutePath+ "\" & start cmd.exe /k \"java Main.RunOrganizationalStructure\"");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
				
					if(comboBox.getSelectedItem().toString().equals("Question 4")){
					
					
					try {
						rt.exec("cmd.exe /c cd \""+ absolutePath+ "\" & start cmd.exe /k \"java Main.RunFindBySalary\"");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
				
				
			}
			
			
					//RunOrganizationalStructure
					
				
			
		});
	}
	
	public int getSelection(){
		
		return this.Selection;
		
	}
	
	
	public void openTerminal() throws ParseException{
		Person P=new Person();
		P.read();
		
		 try {
		       // if(option==2){
		        
		        	File file = new File("src");
		        	String absolutePath = file.getAbsolutePath();
		        	
		        	Runtime rt = Runtime.getRuntime();////java -flag -flag -cp terminal-based-program.jar
		        	//rt.exec("cmd.exe /c cd \""+ absolutePath+ "\" & start cmd.exe /k \"java"+ name+"\"");
		        	
		        	rt.exec("cmd.exe /c cd \""+ absolutePath+ "\" & start cmd.exe /k \"java Main.RunFindByName\"");
		        	//rt.exec("cmd.exe /c cd \""+ absolutePath+ "\" & start cmd.exe /k \"java -jar Run(EPI_USE).jar\"");

		       // }
  
		    } catch (IOException e) {
		        System.out.println("catch:" + e.toString());
		    }
	}
	
	


	
	

}//ends class

