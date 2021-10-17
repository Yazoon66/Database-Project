import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Q2_217188921 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String partAColumns[] = { "type", "Month", "Count" };
	String partBColumns[] = { "type", "Month " };

	public Q2_217188921(Q3_217188921 q3) {
		// containers
		JPanel containerTop = new JPanel();
		JPanel containerBottom = new JPanel();
		JPanel selectionContainer = new JPanel();
		JPanel descContainer = new JPanel();

		// layouts
		this.setLayout(new BorderLayout());
		containerTop.setLayout(new BoxLayout(containerTop, BoxLayout.Y_AXIS));
		containerBottom.setLayout(new BorderLayout());
		selectionContainer.setLayout(new FlowLayout());
		descContainer.setLayout(new FlowLayout());

		// view description
		JLabel label1 = new JLabel("The results of insert from Q2");
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);

		containerTop.add(label1, BorderLayout.NORTH);

		this.add(containerTop, BorderLayout.NORTH);
		this.add(containerBottom, BorderLayout.SOUTH);

		JTabbedPane tp = new JTabbedPane();

		this.add(tp);

		JPanel PartA = new JPanel();
		GridBagLayout PartAGrid = new GridBagLayout();
		GridBagConstraints PartAConstraints = new GridBagConstraints();
		PartA.setLayout(PartAGrid);
		JButton partAQuery = new JButton("Refresh Part A");
		PartAConstraints.gridx = 0;
		PartAConstraints.gridy = 0;
		PartAConstraints.gridwidth = 4;
		PartA.add(partAQuery, PartAConstraints);
		PartA.setBackground(new Color(54, 255, 231));

		String data[][] = {};

		JTable jt = new JTable(new DefaultTableModel(data, partAColumns));
		jt.setBounds(0, 0, 500, 500);
		JScrollPane sp = new JScrollPane(jt);
		PartAConstraints.gridx = 0;
		PartAConstraints.gridy = 2;
		PartAConstraints.gridwidth = 10;
		PartA.add(sp, PartAConstraints);
		PartA.setSize(500, 500);
		PartA.setVisible(true);

		partAQuery.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String[][] data = q3.partAQuery();

				DefaultTableModel dtm = (DefaultTableModel) jt.getModel();
				dtm.setRowCount(0);

				for (int i = 0; i < data.length; i++) {
					dtm.addRow(data[i]);
				}
			}
		});

		JPanel PartB = new JPanel();
		GridBagLayout PartBGrid = new GridBagLayout();
		PartB.setLayout(PartBGrid);
		GridBagConstraints PartBConstraints = new GridBagConstraints();
		JButton partBQuery = new JButton("Refresh Part B");
		PartBConstraints.gridx = 0;
		PartBConstraints.gridy = 0;
		PartBConstraints.gridwidth = 4;
		PartB.add(partBQuery, PartBConstraints);
		PartB.setBackground(new Color(54, 255, 231));

		tp.addTab("PartA", PartA);
		tp.addTab("PartB", PartB);

		tp.setBackgroundAt(0, new Color(255, 64, 64));
		tp.setBackgroundAt(1, new Color(255, 64, 64));
		tp.setForeground(new Color(0, 0, 0));
		tp.setOpaque(false);

		String data2[][] = {};

		JTable jt1 = new JTable(new DefaultTableModel(data2, partBColumns));
		jt1.setBounds(0, 0, 500, 500);
		JScrollPane sp1 = new JScrollPane(jt1);
		PartBConstraints.gridx = 0;
		PartBConstraints.gridy = 2;
		PartBConstraints.gridwidth = 10;
		PartB.add(sp1, PartBConstraints);
		PartB.setSize(500, 500);
		PartB.setVisible(true);

		partBQuery.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String[][] data2 = q3.partBQuery();

				DefaultTableModel dtm = (DefaultTableModel) jt1.getModel();
				dtm.setRowCount(0);

				for (int i = 0; i < data2.length; i++) {
					dtm.addRow(data2[i]);
				}
			}
		});

	}
}