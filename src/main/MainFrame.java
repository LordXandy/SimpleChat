package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame implements ActionListener{
	/* Klassicher MainjFrame
	 * Soll der jFrame sein auf dem primär alles dargestellt wird. 
	 */
	
	JFrame jFrame;
	JPanel jPanel;
	JTextField  jTextField;	
	JTextArea jTextArea;
	JScrollPane jScrollPane;
	
	//------------------------------------------------------------------------------------------
	
	JMenuBar jMenuBar;
	
	JMenu jMenuFile;
	JMenuItem jMenuFileNew;
	JMenuItem jMenuFileLoad;
	JMenuItem jMenuFileSave;
	JMenuItem jMenuFileSaveAs;
	JMenuItem jMenuFileExit;
	
	JMenu jMenuConnection;
	JMenuItem jMenuConnectionConnectToRoom;
	JMenuItem jMenuConnectionAddNewRoom;
	JMenuItem jMenuConnectionConnect;
	JMenuItem jMenuConnectionDisconnect;
	
	JMenu jMenuHelp;
	JMenuItem jMenuHelpShowHelp;
	
	public MainFrame() {		
		jFrame=new JFrame("SimpleChat");
		
		jTextArea=new JTextArea();
		jScrollPane=new JScrollPane(jTextArea);
		jTextField=new JTextField();
		//------------------------------------------------------------------------------------------
		addMenues();
        jFrame.setJMenuBar(jMenuBar);
        //------------------------------------------------------------------------------------------
        addPanel();
        jFrame.add(jPanel);
		//------------------------------------------------------------------------------------------
        jFrame.setSize(600, 1000);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        /* JButton button = new JButton();
         * button.setText("Send");
         * panel.add(button);
         */
		
	}
	
	public void addPanel() {
		jPanel=new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jScrollPane,BorderLayout.CENTER);
		jPanel.add(jTextField, BorderLayout.PAGE_END);
		//jPanel.add(jScrollPane);
	}
	
	public void addMenues() {
		jMenuBar=new JMenuBar();
		
		jMenuFile=new JMenu("File");
		jMenuConnection=new JMenu("Connection");
		jMenuHelp=new JMenu("Help");
		
		//------------------------------------------------------------------------------------------
		
		jMenuFileNew=new JMenuItem("New");
		jMenuFileLoad=new JMenuItem("Load");
		jMenuFileSave=new JMenuItem("Save");
		jMenuFileSaveAs=new JMenuItem("Save As...");
		jMenuFileExit=new JMenuItem("Exit");
		
		jMenuConnectionConnectToRoom=new JMenuItem("Connect to room");		
		jMenuConnectionAddNewRoom=new JMenuItem("Add new room...");
		jMenuConnectionConnect=new JMenuItem("Connect...");
		jMenuConnectionDisconnect=new JMenuItem("Disconnect");
		
		jMenuHelpShowHelp=new JMenuItem("Show Help");
		
		//------------------------------------------------------------------------------------------
		
		jMenuFile.add(jMenuFileNew);
		jMenuFile.add(jMenuFileLoad);
		jMenuFile.add(jMenuFileSave);
		jMenuFile.add(jMenuFileSaveAs);
		jMenuFile.add(jMenuFileExit);
		
		jMenuConnection.add(jMenuConnectionConnectToRoom);
		jMenuConnection.add(jMenuConnectionAddNewRoom);
		jMenuConnection.add(jMenuConnectionConnect);
		jMenuConnection.add(jMenuConnectionDisconnect);
		
		jMenuHelp.add(jMenuHelpShowHelp);
		
		//------------------------------------------------------------------------------------------
		
		jMenuFileNew.addActionListener(this);
		jMenuFileLoad.addActionListener(this);
		jMenuFileSave.addActionListener(this);
		jMenuFileSaveAs.addActionListener(this);
		jMenuFileExit.addActionListener(this);
		
		jMenuConnectionConnectToRoom.addActionListener(this);
		jMenuConnectionAddNewRoom.addActionListener(this);
		jMenuConnectionConnect.addActionListener(this);
		jMenuConnectionDisconnect.addActionListener(this);
		
		jMenuHelp.addActionListener(this);
		
		//------------------------------------------------------------------------------------------
		
		jMenuBar.add(jMenuFile);
		jMenuBar.add(jMenuConnection);
		jMenuBar.add(jMenuHelp);
	}
	
	
	public void addMsg(String s) {
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//------------------------------------------------------------------------------------------
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
		//------------------------------------------------------------------------------------------
		if(e.getSource()==jMenuConnectionConnectToRoom) {
			
		}if(e.getSource()==jMenuConnectionAddNewRoom) {
			
		}if(e.getSource()==jMenuConnectionConnect) {
			
		}if(e.getSource()==jMenuConnectionDisconnect) {
			
		}
		//------------------------------------------------------------------------------------------
		if(e.getSource()==jMenuHelpShowHelp) {
			
		}
		//------------------------------------------------------------------------------------------
	}
}
