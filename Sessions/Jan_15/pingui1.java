import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class pingui2 extends Frame implements ActionListener
{
	private Label lblInfo1,lblInfo2,lblInfo3;
	private TextField txtInfo1,txtInfo2,txtInfo3;
	private Button btnAdd,btnSubs,btnMult,btnDiv,btnExit;
	public pingui2(String s)
	{
		super( s );
		lblInfo1 = new Label("Number1 : ");
		lblInfo2 = new Label("Number2 : ");
		lblInfo3 = new Label("Result : ");
		txtInfo1 = new TextField( 10 );
		txtInfo2 = new TextField( 10 );
		txtInfo3 = new TextField( 10 );
		txtInfo3.setEnabled( false );
		btnAdd = new Button(" + ");
		btnSubs = new Button(" - ");
		btnMult = new Button(" * ");
		btnDiv = new Button(" / ");
		btnExit = new Button("Exit");
		btnAdd.addActionListener( this );
		btnSubs.addActionListener( this );
		btnMult.addActionListener( this );
		btnDiv.addActionListener( this );
		btnExit.addActionListener( this );
		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(1);
			}
		});
		/*FlowLayout f = new FlowLayout();
		setLayout( f );*/
		setLayout( new GridLayout(3, 3) );
		add( lblInfo1 );
		add( txtInfo1 );
		add( lblInfo2 );
		add( txtInfo2 );
		add( lblInfo3 );
		add( txtInfo3 );
		add( btnAdd );
		add( btnSubs );
		add( btnMult );
		add( btnDiv );
		add( btnExit );
		setSize(700,400);
		setVisible( true );
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnExit)
		{
			System.exit(1);
		}
		else
		{
			if(txtInfo1.getText().equals("") || txtInfo2.getText().equals(""))
			{
				System.out.println("Enter num1 and num2");
			}
			else
			{
				int num1,num2,res = 0;
				num1 = Integer.parseInt( txtInfo1.getText() );
				num2 = Integer.parseInt(txtInfo2.getText());
				if(e.getSource() == btnAdd)
				{
					res = num1 + num2;
				}
				if(e.getSource() == btnSubs)
				{
					res = num1 - num2;
				}
				if(e.getSource() == btnMult)
				{
					res = num1 * num2;
				}
				if(e.getSource() == btnDiv)
				{
					res = num1 / num2;
				}
				txtInfo3.setText( String.valueOf( res ) );
			}
		}
	}
	public static void fn()
	{
		System.out.println("XYZ");
	}
	public static void main(String args[])
	{
		new pingui2("Pinnacle");
		fn();
	}
}

