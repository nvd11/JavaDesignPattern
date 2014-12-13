package strategy;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import strategy.bizobj.Operation;
import strategy.bizobj.OperationDel;
import strategy.bizobj.OperationContext;


public class Form2 {

	protected Shell shlCacul;
	private Text tb_i;
	private Text tb_j;
	private Label lblResult;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public static void newInstance() {
		try {
			Form2 window = new Form2();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlCacul.open();
		shlCacul.layout();
		while (!shlCacul.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCacul = new Shell();
		shlCacul.setSize(450, 300);
		shlCacul.setText("Calculator");
		
		tb_i = new Text(shlCacul, SWT.BORDER);
		tb_i.setBounds(57, 28, 103, 27);
		
		tb_j = new Text(shlCacul, SWT.BORDER);
		tb_j.setBounds(57, 61, 103, 27);
		
		Button btnAdd = new Button(shlCacul, SWT.NONE);
		btnAdd.addSelectionListener(new BtnClicked_btnAdd()); //bi
			
		
		btnAdd.setBounds(182, 28, 76, 27);
		btnAdd.setText("+");
		
		Button btnDel = new Button(shlCacul, SWT.NONE);
		btnDel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				BtnClicked_btnDel();
			}
		});
		btnDel.setText("-");
		btnDel.setBounds(182, 61, 76, 27);
		
		Label lblResultTag = new Label(shlCacul, SWT.NONE);
		lblResultTag.setFont(SWTResourceManager.getFont("Droid Sans", 12, SWT.NORMAL));
		lblResultTag.setBounds(57, 161, 62, 27);
		lblResultTag.setText("Result:");
		
		lblResult = new Label(shlCacul, SWT.NONE);
		lblResult.setFont(SWTResourceManager.getFont("Droid Sans", 12, SWT.NORMAL));
		lblResult.setBounds(125, 161, 62, 27);

	}
	
	private class BtnClicked_btnAdd extends SelectionAdapter
	{
		@Override
		public void widgetSelected(SelectionEvent e){
			int i = Integer.parseInt(tb_i.getText());
			int j = Integer.parseInt(tb_j.getText());
			
			System.out.println("123333");
		}
	}
	
	private void BtnClicked_btnDel(){
			int i = Integer.parseInt(tb_i.getText());
			int j = Integer.parseInt(tb_j.getText());
			
			OperationContext context = new OperationContext("-");
			lblResult.setText("" + context.compute(i,j));
	}
}
