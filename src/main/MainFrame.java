package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainFrame implements ActionListener{
	/* Klassicher MainjFrame
	 * Soll der jFrame sein auf dem primär alles dargestellt wird. 
	 */
	
	JFrame jFrame;
	JPanel jPanel;
	
	JMenuBar jMenuBar;
	
	JMenu jMenuFile;
	JMenuItem jMenuFileNew;
	JMenuItem jMenuFileLoad;
	JMenuItem jMenuFileSave;
	JMenuItem jMenuFileSaveAs;
	JMenuItem jMenuFileExit;
	
	JMenu jMenuHelp;
	JMenuItem jMenuHelpShowHelp;
	
	public MainFrame() {
		jFrame=new JFrame("SimpleChat");
		jPanel=new JPanel();
        
		addMenues();
        jFrame.setJMenuBar(jMenuBar);
		
        jFrame.add(jPanel);
        jFrame.setSize(600, 1000);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        
        
        /* JButton button = new JButton();
         * button.setText("Send");
         * panel.add(button);
         */
		
	}
	
	public void addMenues() {
		jMenuBar=new JMenuBar();
		
		jMenuFile=new JMenu("File");
		jMenuHelp=new JMenu("Help");
		
		jMenuFileNew=new JMenuItem("New");
		jMenuFileLoad=new JMenuItem("Load");
		jMenuFileSave=new JMenuItem("Save");
		jMenuFileSaveAs=new JMenuItem("Save As...");
		jMenuFileExit=new JMenuItem("Exit");
		
		jMenuHelpShowHelp=new JMenuItem("Show Help");
		
		jMenuFile.add(jMenuFileNew);
		jMenuFile.add(jMenuFileLoad);
		jMenuFile.add(jMenuFileSave);
		jMenuFile.add(jMenuFileSaveAs);
		jMenuFile.add(jMenuFileExit);
		
		jMenuHelp.add(jMenuHelpShowHelp);
		
		jMenuFileNew.addActionListener(this);
		jMenuFileLoad.addActionListener(this);
		jMenuFileSave.addActionListener(this);
		jMenuFileSaveAs.addActionListener(this);
		jMenuFileExit.addActionListener(this);
		
		jMenuHelp.addActionListener(this);
		
		jMenuBar.add(jMenuFile);
		jMenuBar.add(jMenuHelp);
	}
	
	
	public void addMsg(String s) {
		
	}
	
	public void actionPerformed(ActionEvent e) {    
		if(e.getSource()==jMenuFileNew) {
			
		}
		if(e.getSource()==jMenuFileLoad) {
			
		}
		if(e.getSource()==jMenuFileSave) {
			
		}
		if(e.getSource()==jMenuFileSaveAs) {
			
		}
		if(e.getSource()==jMenuFileExit) {
			System.exit(0);
		}
		if(e.getSource()==jMenuHelpShowHelp) {
			
		}
	}
}
