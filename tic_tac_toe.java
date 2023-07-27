import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
   Label l;
   Button b[]=new Button[9];
   Button R=new Button("Replay");
   int x=100,y=100,w=100,h=100;
   FDemo()
   {
	   setForeground(Color.red);
	   setVisible(true);
	   setLocation(0,0);
	   setSize(1000,1000);
	   setTitle("Tic Tac Toe");
	   setFont(new Font("Arial",Font.BOLD,15));
	   setLayout(null);
	   R.setSize(100,30);
	   R.setLocation(20,50);
	   add(R);
	   int k=0;
	   for(int i=0; i<3; i++)
	   {
		   for(int j=0; j<3; j++)
		   {
			   b[k]=new Button();
			   b[k].setSize(w,h);
			   b[k].setLocation(x,y);
			   add(b[k]);
			   b[k].addActionListener(this);
			   k++;
			   x+=100;
		   }
		   x=100;
		   y+=100;
	   }
   } 
   int c=0;
  public void actionPerformed(ActionEvent e)
 {
	Button b1=(Button)e.getSource();
	c++;
	if(c%2==0)
		b1.setLabel("0");
	else
		b1.setLabel("X");
	b1.removeActionListener(this);
 if(b[0].getLabel()=="0"&&b[4].getLabel()=="0"&&b[8].getLabel()=="0" || b[2].getLabel()=="0"&&b[4].getLabel()=="0"&&b[6].getLabel()=="0"||
    b[0].getLabel()=="0"&&b[1].getLabel()=="0"&&b[2].getLabel()=="0" || b[3].getLabel()=="0"&&b[4].getLabel()=="0"&&b[5].getLabel()=="0"||
    b[6].getLabel()=="0"&&b[7].getLabel()=="0"&&b[8].getLabel()=="0" || b[0].getLabel()=="0"&&b[3].getLabel()=="0"&&b[6].getLabel()=="0"||
    b[1].getLabel()=="0"&&b[4].getLabel()=="0"&&b[7].getLabel()=="0" || b[2].getLabel()=="0"&&b[5].getLabel()=="0"&&b[8].getLabel()=="0")
   {
	l=new Label("0 is Winner");
	l.setSize(200,30);
	l.setLocation(200,450);
	add(l);
	for(int m=0;m<9; m++)
		b[m].removeActionListener(this);
   }
else if(b[0].getLabel()=="X"&&b[4].getLabel()=="X"&&b[8].getLabel()=="X" || b[2].getLabel()=="X"&&b[4].getLabel()=="X"&&b[6].getLabel()=="X"||
    b[0].getLabel()=="X"&&b[1].getLabel()=="X"&&b[2].getLabel()=="X" || b[3].getLabel()=="X"&&b[4].getLabel()=="X"&&b[5].getLabel()=="X"||
    b[6].getLabel()=="X"&&b[7].getLabel()=="X"&&b[8].getLabel()=="X" || b[0].getLabel()=="X"&&b[3].getLabel()=="X"&&b[6].getLabel()=="X"||
    b[1].getLabel()=="X"&&b[4].getLabel()=="X"&&b[7].getLabel()=="X" || b[2].getLabel()=="X"&&b[5].getLabel()=="X"&&b[8].getLabel()=="X")
   {
	l=new Label("X is Winner");
	l.setSize(200,30);
	l.setLocation(200,450);
	add(l);
	for(int m=0;m<9; m++)
		b[m].removeActionListener(this);
   }
	 if(e.getSource()==R)
	 {
		for(int i=0; i<9; i++)
		{
         b[i].setLabel("");
         b[i].addActionListener(this);			
		}		 
	 }
  }   
}
class tictactoe
{
	public static void main(String[]ar)
	{
		FDemo f=new FDemo();
	}
}
