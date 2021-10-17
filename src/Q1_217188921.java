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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Q1_217188921 extends JPanel {
	private JTabbedPane tp;
	JTextField EventNameeventnewText;
	JTextField EventWebLinkText1;
	JTextField CFPTextText;
	JTextField eventNameText;
	JTextField cityText;
	JTextField countryText;
	JTextField conferenceDateText;
	JTextField eventNameText2;
	JTextField journalText;
	JTextField publisherText;
	JTextField eventNameText3;
	JTextField publisherText1;
	JTextField eventResearchText;
	JTextField AreaText1;
	JTextField TopicNameText;
	JTextField EventNamePeopleText;
	JTextField AffilliationText1;
	JTextField PeopleNameText;
	JTextField RoleText;
	JTextField eventNameText4;
	JTextField ActivityText1;
	JTextField DateText1;

	public JTabbedPane getTp() {
		return tp;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Q1_217188921(Q3_217188921 q3) {
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
		JLabel label1 = new JLabel("Please insert the data below for Q1");
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);

		containerTop.add(label1, BorderLayout.NORTH);

		this.add(containerTop, BorderLayout.NORTH);
		this.add(containerBottom, BorderLayout.SOUTH);

		tp = new JTabbedPane();

		this.add(tp);
		// beginning of event table
		JPanel eventnew = new JPanel();
		GridBagLayout eventnewGrid = new GridBagLayout();
		GridBagConstraints eventnewConstraints = new GridBagConstraints();
		eventnew.setLayout(eventnewGrid);
		eventnew.setBackground(new Color(150, 189, 255));
		JLabel eventnew1Label = new JLabel("                                                   ");
		eventnewConstraints.fill = GridBagConstraints.HORIZONTAL;
		eventnewConstraints.gridx = 0;
		eventnewConstraints.gridy = 0;
		eventnewConstraints.gridwidth = 4;
		eventnew.add(eventnew1Label, eventnewConstraints);

		JLabel eventnewEventlable = new JLabel("Name    ");
		eventnewConstraints.gridx = 1;
		eventnewConstraints.gridy = 1;
		eventnewConstraints.gridwidth = 1;
		eventnew.add(eventnewEventlable, eventnewConstraints);

		EventNameeventnewText = new JTextField();
		eventnewConstraints.gridx = 2;
		eventnewConstraints.gridy = 1;
		eventnewConstraints.gridwidth = 2;
		eventnew.add(EventNameeventnewText, eventnewConstraints);

		JLabel EventWebLink = new JLabel("EventWebLink");
		eventnewConstraints.gridx = 1;
		eventnewConstraints.gridy = 2;
		eventnewConstraints.gridwidth = 1;
		eventnew.add(EventWebLink, eventnewConstraints);

		EventWebLinkText1 = new JTextField();
		eventnewConstraints.gridx = 2;
		eventnewConstraints.gridy = 2;
		eventnewConstraints.gridwidth = 2;
		eventnew.add(EventWebLinkText1, eventnewConstraints);

		JLabel eventnewName = new JLabel("CFPText");
		eventnewConstraints.gridx = 1;
		eventnewConstraints.gridy = 3;
		eventnewConstraints.gridwidth = 1;
		eventnew.add(eventnewName, eventnewConstraints);

		CFPTextText = new JTextField();
		eventnewConstraints.gridx = 2;
		eventnewConstraints.gridy = 3;
		eventnewConstraints.gridwidth = 2;
		eventnew.add(CFPTextText, eventnewConstraints);

		JLabel eLabel = new JLabel("                                                   ");
		eventnewConstraints.fill = GridBagConstraints.HORIZONTAL;
		eventnewConstraints.gridx = 0;
		eventnewConstraints.gridy = 4;
		eventnewConstraints.gridwidth = 4;
		eventnew.add(eLabel, eventnewConstraints);

		JButton eventnewInsert = new JButton("Insert");
		eventnewConstraints.gridx = 0;
		eventnewConstraints.gridy = 7;
		eventnewConstraints.gridwidth = 4;
		eventnew.add(eventnewInsert, eventnewConstraints);

		eventnewInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e19) {

				if (EventNameeventnewText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Name should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}

				if (EventWebLinkText1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "EventWebLink should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (CFPTextText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Country should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}

				q3.insertEvent(EventNameeventnewText.getText(), EventWebLinkText1.getText(), CFPTextText.getText());

			}
		});
		// end of event table

		// conference panel
		JPanel conference = new JPanel();
		GridBagLayout conferenceGrid = new GridBagLayout();
		GridBagConstraints conferenceConstraints = new GridBagConstraints();
		conference.setLayout(conferenceGrid);
		conference.setBackground(new Color(166, 232, 247));
		JLabel e1Label = new JLabel("                                                   ");
		conferenceConstraints.fill = GridBagConstraints.HORIZONTAL;
		conferenceConstraints.gridx = 0;
		conferenceConstraints.gridy = 0;
		conferenceConstraints.gridwidth = 4;
		conference.add(e1Label, conferenceConstraints);

		JLabel eventNameLabel = new JLabel("Event Name       ");
		conferenceConstraints.gridx = 1;
		conferenceConstraints.gridy = 1;
		conferenceConstraints.gridwidth = 1;
		conference.add(eventNameLabel, conferenceConstraints);

		eventNameText = new JTextField();
		conferenceConstraints.gridx = 2;
		conferenceConstraints.gridy = 1;
		conferenceConstraints.gridwidth = 2;
		conference.add(eventNameText, conferenceConstraints);

		JLabel cityLabel = new JLabel("City");
		conferenceConstraints.gridx = 1;
		conferenceConstraints.gridy = 2;
		conferenceConstraints.gridwidth = 1;
		conference.add(cityLabel, conferenceConstraints);

		cityText = new JTextField();
		conferenceConstraints.gridx = 2;
		conferenceConstraints.gridy = 2;
		conferenceConstraints.gridwidth = 2;
		conference.add(cityText, conferenceConstraints);

		JLabel countryLabel = new JLabel("Country");
		conferenceConstraints.gridx = 1;
		conferenceConstraints.gridy = 3;
		conferenceConstraints.gridwidth = 1;
		conference.add(countryLabel, conferenceConstraints);

		countryText = new JTextField();
		conferenceConstraints.gridx = 2;
		conferenceConstraints.gridy = 3;
		conferenceConstraints.gridwidth = 2;
		conference.add(countryText, conferenceConstraints);

		JLabel e2Label = new JLabel("                                                   ");
		conferenceConstraints.fill = GridBagConstraints.HORIZONTAL;
		conferenceConstraints.gridx = 0;
		conferenceConstraints.gridy = 4;
		conferenceConstraints.gridwidth = 4;
		conference.add(e2Label, conferenceConstraints);

		JLabel conferenceDateLabel = new JLabel("Date(Y-M-D)");
		conferenceConstraints.gridx = 1;
		conferenceConstraints.gridy = 4;
		conferenceConstraints.gridwidth = 1;
		conferenceConstraints.ipadx = 20;
		conference.add(conferenceDateLabel, conferenceConstraints);

		conferenceDateText = new JTextField();
		conferenceConstraints.gridx = 2;
		conferenceConstraints.gridy = 4;
		conferenceConstraints.gridwidth = 2;
		conference.add(conferenceDateText, conferenceConstraints);

		JButton conferenceInsert = new JButton("Insert");
		conferenceConstraints.gridx = 0;
		conferenceConstraints.gridy = 5;
		conferenceConstraints.gridwidth = 4;
		conference.add(conferenceInsert, conferenceConstraints);

		conferenceInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (eventNameText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Event Name should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}

				if (cityText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "City should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (countryText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Country should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (conferenceDateText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Date(Y-M-D)should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}

				q3.insertEventConference(eventNameText.getText(), cityText.getText(), countryText.getText(),
						conferenceDateText.getText());

			}
		});

		// end of panel

		// journal panel
		JPanel journal = new JPanel();

		GridBagLayout journalGrid = new GridBagLayout();
		GridBagConstraints journalConstraints = new GridBagConstraints();
		journal.setLayout(journalGrid);
		journal.setBackground(new Color(252, 187, 229));
		JLabel j1Label = new JLabel("                                                   ");
		journalConstraints.fill = GridBagConstraints.HORIZONTAL;
		journalConstraints.gridx = 0;
		journalConstraints.gridy = 0;
		journalConstraints.gridwidth = 4;
		journal.add(j1Label, journalConstraints);

		JLabel eventNameLabel1 = new JLabel("Event Name     ");
		journalConstraints.gridx = 1;
		journalConstraints.gridy = 1;
		journalConstraints.gridwidth = 1;
		journal.add(eventNameLabel1, journalConstraints);

		eventNameText2 = new JTextField();
		journalConstraints.gridx = 2;
		journalConstraints.gridy = 1;
		journalConstraints.gridwidth = 2;
		journal.add(eventNameText2, journalConstraints);

		JLabel journalLabel = new JLabel("Journal Name");
		journalConstraints.gridx = 1;
		journalConstraints.gridy = 2;
		journalConstraints.gridwidth = 1;
		journal.add(journalLabel, journalConstraints);

		journalText = new JTextField();
		journalConstraints.gridx = 2;
		journalConstraints.gridy = 2;
		journalConstraints.gridwidth = 2;
		journal.add(journalText, journalConstraints);

		JLabel publisherLabel = new JLabel("Publisher");
		journalConstraints.gridx = 1;
		journalConstraints.gridy = 3;
		journalConstraints.gridwidth = 1;
		journal.add(publisherLabel, journalConstraints);

		publisherText = new JTextField();
		journalConstraints.gridx = 2;
		journalConstraints.gridy = 3;
		journalConstraints.gridwidth = 2;
		journal.add(publisherText, journalConstraints);

		JLabel e3Label = new JLabel("                                                   ");
		journalConstraints.fill = GridBagConstraints.HORIZONTAL;
		journalConstraints.gridx = 0;
		journalConstraints.gridy = 4;
		journalConstraints.gridwidth = 4;
		journal.add(e3Label, journalConstraints);

		JButton journalInsert = new JButton("Insert");
		journalConstraints.gridx = 0;
		journalConstraints.gridy = 5;
		journalConstraints.gridwidth = 4;
		journal.add(journalInsert, journalConstraints);

		journalInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e1) {

				if (eventNameText2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Event Name should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (journalText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Journal Name should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (publisherText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Publisher should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}

				q3.insertEventjournal(eventNameText2.getText(), journalText.getText(), publisherText.getText());

			}
		});
		// end of journal panel

		// book panel
		JPanel book = new JPanel();

		GridBagLayout bookGrid = new GridBagLayout();
		GridBagConstraints bookConstraints = new GridBagConstraints();
		book.setLayout(bookGrid);
		book.setBackground(new Color(255, 64, 64));
		JLabel book1Label = new JLabel("                                                   ");
		bookConstraints.fill = GridBagConstraints.HORIZONTAL;
		bookConstraints.gridx = 0;
		bookConstraints.gridy = 0;
		bookConstraints.gridwidth = 4;
		book.add(book1Label, bookConstraints);

		JLabel eventNameLabel2 = new JLabel("Event Name     ");
		bookConstraints.gridx = 1;
		bookConstraints.gridy = 1;
		bookConstraints.gridwidth = 1;
		book.add(eventNameLabel2, bookConstraints);

		eventNameText3 = new JTextField();
		bookConstraints.gridx = 2;
		bookConstraints.gridy = 1;
		bookConstraints.gridwidth = 2;
		book.add(eventNameText3, bookConstraints);

		JLabel publisherLabel1 = new JLabel("Publisher");
		bookConstraints.gridx = 1;
		bookConstraints.gridy = 3;
		bookConstraints.gridwidth = 1;
		book.add(publisherLabel1, bookConstraints);

		publisherText1 = new JTextField();
		bookConstraints.gridx = 2;
		bookConstraints.gridy = 3;
		bookConstraints.gridwidth = 2;
		book.add(publisherText1, bookConstraints);

		JLabel e4Label = new JLabel("                                                   ");
		bookConstraints.fill = GridBagConstraints.HORIZONTAL;
		bookConstraints.gridx = 0;
		bookConstraints.gridy = 4;
		bookConstraints.gridwidth = 4;
		book.add(e4Label, bookConstraints);

		JButton bookInsert = new JButton("Insert");
		bookConstraints.gridx = 0;
		bookConstraints.gridy = 5;
		bookConstraints.gridwidth = 4;
		book.add(bookInsert, bookConstraints);

		bookInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e2) {

				if (eventNameText3.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Event Name should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (publisherText1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Publisher should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}

				q3.insertEventbook(eventNameText3.getText(), publisherText1.getText());
			}
		});
		// end of book panel

		// ResearchTopic panel
		JPanel ResearchTopic = new JPanel();
		GridBagLayout ResearchTopicGrid = new GridBagLayout();
		GridBagConstraints ResearchTopicConstraints = new GridBagConstraints();
		ResearchTopic.setLayout(ResearchTopicGrid);
		ResearchTopic.setBackground(new Color(242, 136, 235));
		JLabel ResearchTopic1Label = new JLabel("                                                   ");
		ResearchTopicConstraints.fill = GridBagConstraints.HORIZONTAL;
		ResearchTopicConstraints.gridx = 0;
		ResearchTopicConstraints.gridy = 0;
		ResearchTopicConstraints.gridwidth = 4;
		ResearchTopic.add(ResearchTopic1Label, ResearchTopicConstraints);

		JLabel eventResearchLabel = new JLabel("Event Name     ");
		ResearchTopicConstraints.gridx = 1;
		ResearchTopicConstraints.gridy = 1;
		ResearchTopicConstraints.gridwidth = 1;
		ResearchTopic.add(eventResearchLabel, ResearchTopicConstraints);

		eventResearchText = new JTextField();
		ResearchTopicConstraints.gridx = 2;
		ResearchTopicConstraints.gridy = 1;
		ResearchTopicConstraints.gridwidth = 2;
		ResearchTopic.add(eventResearchText, ResearchTopicConstraints);

		JLabel Area = new JLabel("Area");
		ResearchTopicConstraints.gridx = 1;
		ResearchTopicConstraints.gridy = 2;
		ResearchTopicConstraints.gridwidth = 1;
		ResearchTopic.add(Area, ResearchTopicConstraints);

		AreaText1 = new JTextField();
		ResearchTopicConstraints.gridx = 2;
		ResearchTopicConstraints.gridy = 2;
		ResearchTopicConstraints.gridwidth = 2;
		ResearchTopic.add(AreaText1, ResearchTopicConstraints);
		JLabel TopicName = new JLabel("Topic Name");
		ResearchTopicConstraints.gridx = 1;
		ResearchTopicConstraints.gridy = 3;
		ResearchTopicConstraints.gridwidth = 1;
		ResearchTopic.add(TopicName, ResearchTopicConstraints);

		TopicNameText = new JTextField();
		ResearchTopicConstraints.gridx = 2;
		ResearchTopicConstraints.gridy = 3;
		ResearchTopicConstraints.gridwidth = 2;
		ResearchTopic.add(TopicNameText, ResearchTopicConstraints);

		JLabel e6Label = new JLabel("                                                   ");
		ResearchTopicConstraints.fill = GridBagConstraints.HORIZONTAL;
		ResearchTopicConstraints.gridx = 0;
		ResearchTopicConstraints.gridy = 4;
		ResearchTopicConstraints.gridwidth = 4;
		ResearchTopic.add(e6Label, ResearchTopicConstraints);

		JButton ResearchTopicInsert = new JButton("Insert");
		ResearchTopicConstraints.gridx = 0;
		ResearchTopicConstraints.gridy = 5;
		ResearchTopicConstraints.gridwidth = 4;
		ResearchTopic.add(ResearchTopicInsert, ResearchTopicConstraints);

		ResearchTopicInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e4) {

				if (eventResearchText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Event Name should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (AreaText1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Area should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}

				if (TopicNameText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Topic Name should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}

				q3.ResearchTopicCovers(eventResearchText.getText(), AreaText1.getText(), TopicNameText.getText());
			}
		});
		// end of ResearchTopic panel

		// people panel
		JPanel people = new JPanel();

		GridBagLayout peopleGrid = new GridBagLayout();
		GridBagConstraints peopleConstraints = new GridBagConstraints();
		people.setLayout(peopleGrid);
		people.setBackground(new Color(150, 189, 255));
		JLabel people1Label = new JLabel("                                                   ");
		peopleConstraints.fill = GridBagConstraints.HORIZONTAL;
		peopleConstraints.gridx = 0;
		peopleConstraints.gridy = 0;
		peopleConstraints.gridwidth = 4;
		people.add(people1Label, peopleConstraints);

		JLabel PeopleEventlable = new JLabel("Event Name     ");
		peopleConstraints.gridx = 1;
		peopleConstraints.gridy = 1;
		peopleConstraints.gridwidth = 1;
		people.add(PeopleEventlable, peopleConstraints);

		EventNamePeopleText = new JTextField();
		peopleConstraints.gridx = 2;
		peopleConstraints.gridy = 1;
		peopleConstraints.gridwidth = 2;
		people.add(EventNamePeopleText, peopleConstraints);

		JLabel Affilliation = new JLabel("Affilliation");
		peopleConstraints.gridx = 1;
		peopleConstraints.gridy = 2;
		peopleConstraints.gridwidth = 1;
		people.add(Affilliation, peopleConstraints);

		AffilliationText1 = new JTextField();
		peopleConstraints.gridx = 2;
		peopleConstraints.gridy = 2;
		peopleConstraints.gridwidth = 2;
		people.add(AffilliationText1, peopleConstraints);

		JLabel PeopleName = new JLabel("People Name");
		peopleConstraints.gridx = 1;
		peopleConstraints.gridy = 3;
		peopleConstraints.gridwidth = 1;
		people.add(PeopleName, peopleConstraints);

		PeopleNameText = new JTextField();
		peopleConstraints.gridx = 2;
		peopleConstraints.gridy = 3;
		peopleConstraints.gridwidth = 2;
		people.add(PeopleNameText, peopleConstraints);

		JLabel RoleName = new JLabel("Role");
		peopleConstraints.gridx = 1;
		peopleConstraints.gridy = 4;
		peopleConstraints.gridwidth = 1;
		people.add(RoleName, peopleConstraints);

		RoleText = new JTextField();
		peopleConstraints.gridx = 2;
		peopleConstraints.gridy = 4;
		peopleConstraints.gridwidth = 2;
		people.add(RoleText, peopleConstraints);

		JLabel e7Label = new JLabel("                                                   ");
		peopleConstraints.fill = GridBagConstraints.HORIZONTAL;
		peopleConstraints.gridx = 0;
		peopleConstraints.gridy = 4;
		peopleConstraints.gridwidth = 4;
		people.add(e7Label, peopleConstraints);

		JButton peopleInsert = new JButton("Insert");
		peopleConstraints.gridx = 0;
		peopleConstraints.gridy = 7;
		peopleConstraints.gridwidth = 4;
		people.add(peopleInsert, peopleConstraints);

		peopleInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e5) {

				if (EventNamePeopleText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Event Name should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (AffilliationText1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Affilliation should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (PeopleNameText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "People Name should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (RoleText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Role should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}

				q3.peopleOrganizes(EventNamePeopleText.getText(), AffilliationText1.getText(), PeopleNameText.getText(),
						RoleText.getText());
			}
		});
		// end of people panel

		JPanel ActivityHappens = new JPanel();

		GridBagLayout ActivityHappensGrid = new GridBagLayout();
		GridBagConstraints ActivityHappensConstraints = new GridBagConstraints();
		ActivityHappens.setLayout(ActivityHappensGrid);
		ActivityHappens.setBackground(new Color(54, 255, 231));
		JLabel ActivityHappens1Label = new JLabel("                                                   ");
		ActivityHappensConstraints.fill = GridBagConstraints.HORIZONTAL;
		ActivityHappensConstraints.gridx = 0;
		ActivityHappensConstraints.gridy = 0;
		ActivityHappensConstraints.gridwidth = 4;
		ActivityHappens.add(ActivityHappens1Label, ActivityHappensConstraints);

		JLabel eventNameLabel3 = new JLabel("Event Name     ");
		ActivityHappensConstraints.gridx = 1;
		ActivityHappensConstraints.gridy = 1;
		ActivityHappensConstraints.gridwidth = 1;
		ActivityHappens.add(eventNameLabel3, ActivityHappensConstraints);

		eventNameText4 = new JTextField();
		ActivityHappensConstraints.gridx = 2;
		ActivityHappensConstraints.gridy = 1;
		ActivityHappensConstraints.gridwidth = 2;
		ActivityHappens.add(eventNameText4, ActivityHappensConstraints);

		JLabel ActivityLabel1 = new JLabel("Activity Name");
		ActivityHappensConstraints.gridx = 1;
		ActivityHappensConstraints.gridy = 2;
		ActivityHappensConstraints.gridwidth = 1;
		ActivityHappens.add(ActivityLabel1, ActivityHappensConstraints);

		ActivityText1 = new JTextField();
		ActivityHappensConstraints.gridx = 2;
		ActivityHappensConstraints.gridy = 2;
		ActivityHappensConstraints.gridwidth = 2;
		ActivityHappens.add(ActivityText1, ActivityHappensConstraints);

		JLabel DateLabel1 = new JLabel("Date(Y-M-D)");
		ActivityHappensConstraints.gridx = 1;
		ActivityHappensConstraints.gridy = 3;
		ActivityHappensConstraints.gridwidth = 1;
		ActivityHappens.add(DateLabel1, ActivityHappensConstraints);

		DateText1 = new JTextField();
		ActivityHappensConstraints.gridx = 2;
		ActivityHappensConstraints.gridy = 3;
		ActivityHappensConstraints.gridwidth = 2;
		ActivityHappens.add(DateText1, ActivityHappensConstraints);

		JLabel e5Label = new JLabel("                                                   ");
		ActivityHappensConstraints.fill = GridBagConstraints.HORIZONTAL;
		ActivityHappensConstraints.gridx = 0;
		ActivityHappensConstraints.gridy = 4;
		ActivityHappensConstraints.gridwidth = 4;
		ActivityHappens.add(e5Label, ActivityHappensConstraints);

		JButton ActivityHappensInsert = new JButton("Insert");
		ActivityHappensConstraints.gridx = 0;
		ActivityHappensConstraints.gridy = 5;
		ActivityHappensConstraints.gridwidth = 4;
		ActivityHappens.add(ActivityHappensInsert, ActivityHappensConstraints);

		ActivityHappensInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e3) {

				if (eventNameText4.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Event Name  should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (ActivityText1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Activity Name should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				if (DateText1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Date(Y-M-D) should be filled", "Info",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				q3.insertActivityHappens(eventNameText4.getText(), ActivityText1.getText(), DateText1.getText());
			}
		});
		tp.addTab("Event", eventnew);
		tp.addTab("EventConference", conference);
		tp.addTab("EventJournal", journal);
		tp.addTab("EventBook", book);
		tp.addTab("ResearchTopic & Covers", ResearchTopic);
		tp.addTab("people & Organizes", people);
		tp.addTab("ActivityHappens", ActivityHappens);
		tp.setBackgroundAt(0, new Color(255, 64, 64));
		tp.setBackgroundAt(1, new Color(255, 64, 64));
		tp.setBackgroundAt(2, new Color(255, 64, 64));
		tp.setBackgroundAt(3, new Color(255, 64, 64));
		tp.setBackgroundAt(4, new Color(255, 64, 64));
		tp.setBackgroundAt(5, new Color(255, 64, 64));
		tp.setBackgroundAt(6, new Color(255, 64, 64));
		tp.setForeground(new Color(0, 0, 0));
		tp.setOpaque(false);
	}

	public void resetAllForms() {
		EventNameeventnewText.setText("");
		EventWebLinkText1.setText("");
		CFPTextText.setText("");
		eventNameText.setText("");
		cityText.setText("");
		countryText.setText("");
		conferenceDateText.setText("");
		eventNameText2.setText("");
		journalText.setText("");
		publisherText.setText("");
		eventNameText3.setText("");
		publisherText1.setText("");
		eventResearchText.setText("");
		AreaText1.setText("");
		TopicNameText.setText("");
		EventNamePeopleText.setText("");
		AffilliationText1.setText("");
		PeopleNameText.setText("");
		RoleText.setText("");
		eventNameText4.setText("");
		ActivityText1.setText("");
		DateText1.setText("");

	}
}
