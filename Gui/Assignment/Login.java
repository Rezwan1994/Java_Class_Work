import java.awt.*;
class Login extends Frame{
	Button b = new Button("Register");
	Button b1 = new Button("Login");
	TextField f = new TextField();
	TextField f1 = new TextField();
	Label l = new Label("User Name");
	Label l1 = new Label("Password");
	public Login(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		l.setBounds(30,65,75,50);
		add(l);
		l1.setBounds(30,140,75,50);
		add(l1);
		f.setBounds(125,75,257, 32);
		add(f);
		f1.setBounds(125,150,257, 32);
		add(f1);
		b1.setBounds(300,250,75, 30);
		add(b1);	
		b.setBounds(200,250,75, 30);
		add(b);
	}
}