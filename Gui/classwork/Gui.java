import java.awt.*;
class Gui extends Frame{
	Button b = new Button("Next");
	public Gui(){
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		b.setBounds(50,50,100,100);
		add(b);
	}
}