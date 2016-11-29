import java.awt.*;
import java.awt.event.*;

 class Converter  extends Frame implements ActionListener{
   // Frame f = new Frame();
	double 	sConvert;
	double 	sConvert1;
	double cFormula;
	double	fFormula;
    Label l = new Label("Input");
    Label l1 = new Label("Result");
    Button b = new Button("calsius");
    Button b1 = new Button("Farhenheit");
    TextField t = new TextField();
    TextField t1 = new TextField();
    public Converter()
    {
        setSize(400,400);
        setVisible(true);
		setLayout(null);
        l.setBounds(25,35,75,50);
        add(l);
        t.setBounds(100,50,275,25);
        add(t);
        b.setBounds(100,100,75,30);
        add(b);
		b.addActionListener(this);
        b1.setBounds(250,100,75,30);
        add(b1);
		b1.addActionListener(this);
        l1.setBounds(25,160,75,50);
        add(l1);
        t1.setBounds(100,175,275,25);
        add(t1);
    }
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			sConvert=Double.parseDouble(t.getText());
			cFormula= (sConvert*(9.0/5.0))+32.0;
			t1.setText(cFormula+"");			
		}
		else
		{
			sConvert1=Double.parseDouble(t.getText());
			fFormula=(sConvert-32.0)*(5.0/9.0);
			t1.setText(fFormula+"");	
		}
	}
    
}