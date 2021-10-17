import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

public class Q3_217188921 {

	final static String databaseName = "3421a03";
	final static String userName = "root";
	final static String password = "";
	final int conferenceIndex = 1;
	final int journalIndex = 2;
	final int bookIndex = 3;

	JFrame f;
	Connection con;
	JTabbedPane q1Tp;

	public Q3_217188921() {
		// connect to database
		String url = "jdbc:mysql://localhost:3306/" + databaseName;

		try {
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected!");
		} catch (SQLException e) {
			System.out.println("Error connecting.");
			e.printStackTrace();
		}

		// main frame
		f = new JFrame();
		JTabbedPane tp = new JTabbedPane();
		JPanel rootContainer = new JPanel(new BorderLayout());
		JPanel footer = new JPanel(new GridBagLayout());
		JButton addNewEventBtn = new JButton();

		tp.setMaximumSize(new Dimension(900, 700));
		tp.setPreferredSize(new Dimension(900, 700));
		tp.setSize(new Dimension(900, 700));

		footer.setMaximumSize(new Dimension(900, 30));
		footer.setPreferredSize(new Dimension(900, 30));
		footer.setSize(new Dimension(900, 30));

		Q1_217188921 q1 = new Q1_217188921(this);
		q1Tp = q1.getTp();
		addNewEventBtn.setText("Add new event");

		addNewEventBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetForms(q1);
				resetTabAvailability();
			}

		});

		tp.setBackground(new Color(255, 255, 0));
		tp.setForeground(new Color(0, 0, 0));
		rootContainer.add(tp, BorderLayout.NORTH);
		rootContainer.add(footer, BorderLayout.SOUTH);
		footer.add(addNewEventBtn);

		f.add(rootContainer);
		f.setSize(new Dimension(900, 800));
		f.setPreferredSize(new Dimension(900, 800));
		f.setResizable(false);
		f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		// add Q1 and Q2
		tp.addTab("Insert", q1);
		tp.addTab("Query", new Q2_217188921(this));

		// set frame visible
		f.setVisible(true);
	}

	private void resetTabAvailability() {
		q1Tp.setEnabledAt(journalIndex, true);
		q1Tp.setEnabledAt(bookIndex, true);
		q1Tp.setEnabledAt(conferenceIndex, true);
		q1Tp.setBackgroundAt(journalIndex, new Color(255, 64, 64));
		q1Tp.setBackgroundAt(conferenceIndex, new Color(255, 64, 64));
		q1Tp.setBackgroundAt(bookIndex, new Color(255, 64, 64));
		q1Tp.setSelectedIndex(0);
	}

	private void resetForms(Q1_217188921 q1) {
		q1.resetAllForms();
	}

	public void insertEvent(String Name, String EventWebLink, String CFPText) {
		Statement stmt;
		try {
			stmt = con.createStatement();

			String sql2 = "INSERT INTO Event (Name, EventWebLink, CFPText) VALUES ('" + Name + "','" + EventWebLink
					+ "','" + CFPText + "')";
			stmt.executeUpdate(sql2);
			JOptionPane.showMessageDialog(null, "Inserted Successfully", "Status", JOptionPane.INFORMATION_MESSAGE);

		} catch (SQLIntegrityConstraintViolationException ex) {
			JOptionPane.showMessageDialog(null, "Event name should be unique", "Info", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e19) {
			e19.printStackTrace();
		}

	}

	public void insertEventConference(String eventName, String city, String country, String date) {
		Statement stmt;
		q1Tp.setEnabledAt(journalIndex, false);
		q1Tp.setEnabledAt(bookIndex, false);
		q1Tp.setBackgroundAt(journalIndex, new Color(20, 20, 20));
		q1Tp.setBackgroundAt(bookIndex, new Color(20, 20, 20));
		try {
			stmt = con.createStatement();

			String sql2 = "INSERT INTO EventConference (EventName, City, Country, Date) VALUES ('" + eventName + "','"
					+ city + "','" + country + "','" + date + "')";
			stmt.executeUpdate(sql2);
			JOptionPane.showMessageDialog(null, "Inserted Successfully", "Status", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLIntegrityConstraintViolationException ex) {
			JOptionPane.showMessageDialog(null, "Event name should be unique", "Info", JOptionPane.INFORMATION_MESSAGE);
			ex.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertEventjournal(String eventName, String JournalName, String Publisher) {
		Statement stmt;
		q1Tp.setEnabledAt(conferenceIndex, false);
		q1Tp.setEnabledAt(bookIndex, false);
		q1Tp.setBackgroundAt(conferenceIndex, new Color(20, 20, 20));
		q1Tp.setBackgroundAt(bookIndex, new Color(20, 20, 20));
		try {
			stmt = con.createStatement();

			String sql4 = "INSERT INTO EventJournal (EventName, JournalName, Publisher) VALUES ('" + eventName + "','"
					+ JournalName + "','" + Publisher + "')";
			stmt.executeUpdate(sql4);
			JOptionPane.showMessageDialog(null, "Inserted Successfully", "Status", JOptionPane.INFORMATION_MESSAGE);

		} catch (SQLIntegrityConstraintViolationException ex) {
			JOptionPane.showMessageDialog(null, "Event name should be unique", "Info", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	public void insertEventbook(String eventName, String Publisher) {
		Statement stmt;
		q1Tp.setEnabledAt(conferenceIndex, false);
		q1Tp.setEnabledAt(journalIndex, false);
		q1Tp.setBackgroundAt(journalIndex, new Color(20, 20, 20));
		q1Tp.setBackgroundAt(conferenceIndex, new Color(20, 20, 20));
		try {
			stmt = con.createStatement();

			String sql6 = "INSERT INTO EventBook (EventName, Publisher) VALUES ('" + eventName + "','" + Publisher
					+ "')";
			stmt.executeUpdate(sql6);
			JOptionPane.showMessageDialog(null, "Inserted Successfully", "Status", JOptionPane.INFORMATION_MESSAGE);

		} catch (SQLIntegrityConstraintViolationException ex) {
			JOptionPane.showMessageDialog(null, "Event name should be unique", "Info", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e2) {
			e2.printStackTrace();
		}

	}

	public void insertActivityHappens(String eventName, String ActivityName, String ActivityDate) {
		Statement stmt;
		try {
			stmt = con.createStatement();
			String sql8 = "INSERT INTO ActivityHappens (EventName, ActivityName, ActivityDate) VALUES ('" + eventName
					+ "','" + ActivityName + "', '" + ActivityDate + "')";
			stmt.executeUpdate(sql8);
			JOptionPane.showMessageDialog(null, "Inserted Successfully", "Status", JOptionPane.INFORMATION_MESSAGE);

		} catch (SQLIntegrityConstraintViolationException ex) {
			JOptionPane.showMessageDialog(null, "Event name should be unique", "Info", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e3) {
			e3.printStackTrace();
		}

	}

	public void ResearchTopicCovers(String eventName, String Area, String TopicName) {
		Statement stmt;
		try {
			stmt = con.createStatement();

			String sql11 = "INSERT INTO ResearchTopic (Name, Area) VALUES ('" + TopicName + "','" + Area + "')";
			stmt.executeUpdate(sql11);
			String sql10 = "INSERT INTO Covers (EventName, TopicName) VALUES ('" + eventName + "','" + TopicName + "')";
			stmt.executeUpdate(sql10);
			JOptionPane.showMessageDialog(null, "Inserted Successfully", "Status", JOptionPane.INFORMATION_MESSAGE);

		} catch (SQLIntegrityConstraintViolationException ex) {
			JOptionPane.showMessageDialog(null, "Event name should be unique", "Info", JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e4) {
			e4.printStackTrace();
		}

	}

	public void peopleOrganizes(String eventName, String Affliation, String peopleName, String Role) {
		Statement stmt;
		try {
			stmt = con.createStatement();

			String sql11 = "INSERT INTO People (Name, Affilliation) VALUES ('" + peopleName + "','" + Affliation + "')";
			stmt.executeUpdate(sql11);
			String sql12 = "INSERT INTO Organizes(EventName, PeopleName, Role) VALUES ('" + eventName + "','"
					+ peopleName + "', '" + Role + "')";
			stmt.executeUpdate(sql12);
			JOptionPane.showMessageDialog(null, "Inserted Successfully", "Status", JOptionPane.INFORMATION_MESSAGE);

		} catch (SQLIntegrityConstraintViolationException ex) {
			JOptionPane.showMessageDialog(null, "Event name should exists or People name should be unique", "Info",
					JOptionPane.INFORMATION_MESSAGE);

		} catch (SQLException e5) {
			e5.printStackTrace();
		}
	}

	public String[][] partAQuery() {

		String data[][];

		Statement stmt;
		try {
			stmt = con.createStatement();

			String sql9 = "SELECT \"EventConference\" as type, Concat(monthname(Date),\", \",Year(Date)) as Month, count(*) as Count\n"
					+ "FROM EventConference\n" + "GROUP BY Year(Date), Month(Date)\n" + "UNION\n"
					+ "Select \"EventJournal\" as type, Concat(monthname(Temp.ADate),\", \",Year(Temp.ADate)) as Month, Count(*) as Count\n"
					+ "From (\n" + "	Select EventName, Min(ActivityDate) as ADate from ActivityHappens\n"
					+ "	WHERE EventName IN (Select EventName FROM EventJournal)\n" + "	Group by EventName\n"
					+ ") as Temp\n" + "Group by Year(Temp.ADate), Month(Temp.ADate)\n" + "UNION\n"
					+ "Select \"EventBook\" as type, Concat(monthname(Temp2.ADate),\", \",Year(Temp2.ADate)) as Month, Count(*) as Count\n"
					+ "From (\n" + "	Select EventName, Min(ActivityDate) as ADate from ActivityHappens\n"
					+ "	WHERE EventName IN (Select EventName FROM EventBook)\n" + "	Group by EventName\n"
					+ ") as Temp2\n" + "Group by Year(Temp2.ADate), Month(Temp2.ADate);";

			ResultSet rs = stmt.executeQuery(sql9);

			int count = 0;

			while (rs.next()) {
				count++;
			}

			data = new String[count][3];

			rs = stmt.executeQuery(sql9);

			count = 0;

			while (rs.next()) {
				data[count][0] = rs.getString("type");
				data[count][1] = rs.getString("Month");
				data[count][2] = rs.getString("Count");

				count++;
			}

			return data;

		} catch (SQLException e5) {
			e5.printStackTrace();
		}

		return null;
	}

	public String[][] partBQuery() {

		String data2[][];

		Statement stmt;
		try {
			stmt = con.createStatement();

			String sql9 = "SELECT \"EventConference\" as type, Concat(monthname(MIN(Date)),\", \",Year(MIN(Date))) as Month\n"
					+ "FROM EventConference\n" + "UNION\n"
					+ "Select \"EventJournal\" as type, Concat(monthname(MIN(Temp.ADate)),\", \",Year(MIN(Temp.ADate))) as Month\n"
					+ "From (\n" + "	Select EventName, Min(ActivityDate) as ADate from ActivityHappens\n"
					+ "	WHERE EventName IN (Select EventName FROM EventJournal)\n" + "	Group by EventName\n"
					+ ") as Temp\n" + "Group by Year(Temp.ADate), Month(Temp.ADate)\n" + "UNION\n"
					+ "Select \"EventBook\" as type, Concat(monthname(MIN(Temp2.ADate)),\", \",Year(MIN(Temp2.ADate))) as Month\n"
					+ "From (\n" + "	Select EventName, Min(ActivityDate) as ADate from ActivityHappens\n"
					+ "	WHERE EventName IN (Select EventName FROM EventBook)\n" + "	Group by EventName\n"
					+ ") as Temp2\n" + "Group by Year(Temp2.ADate), Month(Temp2.ADate);";

			ResultSet rs = stmt.executeQuery(sql9);

			int count = 0;

			while (rs.next()) {
				count++;
			}

			data2 = new String[count][2];

			rs = stmt.executeQuery(sql9);

			count = 0;

			while (rs.next()) {
				data2[count][0] = rs.getString("type");
				data2[count][1] = rs.getString("Month");

				count++;
			}

			return data2;

		} catch (SQLException e6) {
			e6.printStackTrace();
		}

		return null;
	}

	public static void main(String args[]) {
		new Q3_217188921();
	}

}
