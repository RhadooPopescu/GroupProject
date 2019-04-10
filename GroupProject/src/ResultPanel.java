import javax.swing.*;

import com.github.lgooddatepicker.components.DatePicker;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("serial")
public class ResultPanel extends Container{
    private JPanel panel;
    private JLabel nameLabel, dateLabel, imageLabel, bandsLabel, venueLabel, priceLabel;
//    private GroupLayout group = new GroupLayout(this);
//    private GroupLayout.ParallelGroup pg = group.createParallelGroup();
//    private GroupLayout.SequentialGroup sg = group.createSequentialGroup();

    public ResultPanel(){
    	//////////////////////////////////////
    	//for UPCOMING RESULTS
    	////////////////////////////////////////
    	
    	
        //con.setMinimumSize(new Dimension(200,500));
        this.setPreferredSize(new Dimension(200,500));

        //scrollPane.setSize(200,200);
        this.setBackground(Color.black);
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
//        group.setAutoCreateContainerGaps(true);
//        group.setAutoCreateGaps(true);


        createPanels(getUpcomingResults());
//
//        group.setHorizontalGroup(pg);
//        group.setVerticalGroup(sg);
    }
    
    public ResultPanel(String searchCriteria) {
    	//Constructor for searching by strings only for the events name. The search by band I think it's too complicated to include it :))
    	//this.setPreferredSize(new Dimension(200,500));
    	this.setBackground(Color.black);
    	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    	
    	createPanels(getResultsOnlyString(searchCriteria));
    }
    
    public ResultPanel(DatePicker datePicker) {
    	//this.setPreferredSize(new Dimension(200,500));
    	this.setBackground(Color.black);
    	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    	
    	createPanels(getResultsOnlyDate(datePicker));
    }

    private List<List<String>> getUpcomingResults(){
        ResultSet rs = null;
        //List<String> list = new ArrayList<>();
        List<List<String>> results = new ArrayList<>();

        try {
            rs = Connect.selectStm("SELECT * FROM tbl_event WHERE DateOfEvent>NOW() ORDER BY DateofEvent LIMIT 3");
            while(rs.next()){
                String name = rs.getString("Name");
                String date = rs.getString("DateOfEvent");
                String image = rs.getString("Image");
                System.out.println("Name: "+name+" Date: "+date+" Image: "+image);
                String[] list = new String[] {name,date,image};
                System.out.println(Arrays.asList(list));
                results.add(Arrays.asList(list));
            }
            System.out.println(results);
        }
        catch (NullPointerException f){
            System.out.println("fuck off"+f.getStackTrace()[0]);f.getStackTrace();}
        catch (Exception e){e.getStackTrace();}
        return results;
    }
    
    private List<List<String>> getResultsOnlyString(String aString){
    	ResultSet rs = null;
        //List<String> list = new ArrayList<>();
        List<List<String>> results = new ArrayList<>();
        String query ="SELECT E.Name 'Event',E.Image, E.DateOfEvent, B.Name 'Band' FROM tbl_event E, tbl_band B, tbl_event_band EB " +
                "WHERE E.EventID = EB.EventID " +
                "AND B.BandID = EB.BandID " +
                "AND (E.Name LIKE '%"+aString+"%' OR B.Name LIKE '%"+aString+"%')" +
                "AND E.DateOfEvent>NOW()";

        try {
            rs = Connect.selectStm(query);
            while(rs.next()){
                String name = rs.getString("Event");
                String date = rs.getString("DateOfEvent");
                String image = rs.getString("Image");
                String band = rs.getString("Band");
                System.out.println("Name: "+name+" Date: "+date+" Image: "+image);
                String[] list = new String[] {name,date,image,band};
                System.out.println(Arrays.asList(list));
                results.add(Arrays.asList(list));
            }
            System.out.println("Query:\n"+query);
            System.out.println(results);
        }
        catch (NullPointerException f){
            System.out.println("fuck off"+f.getStackTrace()[0]);f.getStackTrace();}
        catch (SQLException e){e.printStackTrace();}
        catch (ClassNotFoundException g){g.getMessage();}
        return results;
    }

    private List<List<String>> getResultsOnlyDate(DatePicker datePicker){
    	ResultSet rs = null;
        //List<String> list = new ArrayList<>();
        List<List<String>> results = new ArrayList<>();
        LocalDate dateFromDatePicker = datePicker.getDate();
        
        try {
            rs = Connect.selectStm("SELECT * FROM tbl_event WHERE DateOfEvent = "+ "\"" + dateFromDatePicker.toString() + "\"" + " ORDER BY DateofEvent");
            while(rs.next()){
                String name = rs.getString("Name");
                String date = rs.getString("DateOfEvent");
                String image = rs.getString("Image");
                System.out.println("Name: "+name+" Date: "+date+" Image: "+image);
                String[] list = new String[] {name,date,image};
                System.out.println(Arrays.asList(list));
                results.add(Arrays.asList(list));
            }
            System.out.println(results);
        }
        catch (NullPointerException f){
            System.out.println("fuck off"+f.getStackTrace()[0]);f.getStackTrace();}
        catch (Exception e){e.getStackTrace();}
        return results;
    }
    
    private void createPanels(List<List<String>> aList){
        System.out.println("Results:\n"+aList);
        int size= aList.size();
        this.setPreferredSize(new Dimension(200,150*size));
        for (int i=0;i<size;i++){
            panel = new JPanel();


            panel.setForeground(SystemColor.inactiveCaption);
            panel.setBackground(SystemColor.inactiveCaption);
            panel.setPreferredSize(new Dimension(200, 50));
            panel.setBounds(71, 70, 730, 139);
            panel.setLayout(null);

            imageLabel = new JLabel("image");
            imageLabel.setBounds(12, 13, 135, 109);
            ImageIcon img = new ImageIcon((aList.get(i).get(2)));
            Image image = img.getImage().getScaledInstance(135,109,Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(image));
            panel.add(imageLabel);

            nameLabel = new JLabel(aList.get(i).get(0));
            nameLabel.setBounds(174, 13, 95, 23);
            panel.add(nameLabel);

            bandsLabel = new JLabel(aList.get(i).get(3));
            bandsLabel.setBounds(185, 85, 345, 41);
            panel.add(bandsLabel);

            dateLabel = new JLabel(aList.get(i).get(1));
            dateLabel.setBounds(174, 49, 80, 16);
            panel.add(dateLabel);

            JButton bookButton = new JButton("Book");
            bookButton.setForeground(SystemColor.inactiveCaption);
            bookButton.setBackground(new Color(0, 0, 128));
            bookButton.setBounds(569, 34, 135, 43);
            panel.add(bookButton);

            priceLabel = new JLabel("price");
            priceLabel.setBounds(602, 97, 56, 16);
            panel.add(priceLabel);

            venueLabel = new JLabel("venue");
            venueLabel.setBounds(290, 16, 229, 30);
            panel.add(venueLabel);

            add(panel);
//            pg.addComponent(panel);
//            sg.addComponent(panel);
        }
    }
    @SuppressWarnings("unused")
	private List<List<String>> getEventBands(){
        List<List<String>> results = getUpcomingResults();
        List<List<String>> events = new ArrayList<>(results.size());
        List<String> bands = new ArrayList<>();

        for(int i = 0;i<results.size();i++){
            System.out.println(results.get(i).get(0));
            bands.add(results.get(i).get(0));
            events.add(new ArrayList<>());
            events.set(i,bands.stream().collect(Collectors.toList()));
            bands.clear();
        }
        try{
            ResultSet rs = Connect.selectStm("SELECT E.Name Event, B.Name Band FROM tbl_event E, tbl_band B, " +
                    "tbl_event_band EB WHERE E.EventID = EB.EventID AND B.BandID = EB.BandID;");
            while(rs.next()) {
                for (int i = 0; i < events.size(); i++) {
                    if (rs.getString("Event").equalsIgnoreCase(events.get(i).get(0))) {
                        events.get(i).add(rs.getString("Band"));
                    }
                }
            }
        }catch (SQLException e){e.printStackTrace();}
        catch (ClassNotFoundException f){
            System.out.println(f.getMessage());}
        return events;
    }

    public static void main(String[] args){
        new ResultPanel("2019-04-20");
//        List<List<String>> resluts = panel.getResultsOnlyDate(DatePicker datepicker);
//        System.out.println(resluts);
    }

}
