import javax.swing.*;

import com.github.lgooddatepicker.components.DatePicker;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@SuppressWarnings("serial")
public class ResultPanel extends Container{
    private JPanel panel;
    private JLabel nameLabel, dateLabel, imageLabel, bandsLabel, venueLabel, priceLabel;

    public ResultPanel(){
    	//////////////////////////////////////
    	//for UPCOMING RESULTS
    	////////////////////////////////////////

        this.setPreferredSize(new Dimension(200,500));
        this.setBackground(Color.black);
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
//        group.setAutoCreateContainerGaps(true);
//        group.setAutoCreateGaps(true);

        String query = "SELECT E.Name, E.Price, B.Name ArtistName, E.DateOfEvent, E.Image, V.Name Venue" +
                " FROM tbl_venue V, tbl_event E, tbl_event_band EB, tbl_band B " +
                "WHERE E.VenueID = V.VenueID AND E.EventID = EB.EventID AND B.BandID = EB.BandID " +
                "AND E.DateOfEvent>NOW() ORDER BY E.DateOfEvent";

        createPanels(query);

    }
    
    public ResultPanel(String searchCriteria) {
    	this.setBackground(Color.black);
    	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        String query ="SELECT E.Name, E.Price, B.Name ArtistName, E.DateOfEvent, E.Image, V.Name Venue" +
                " FROM tbl_venue V, tbl_event E, tbl_event_band EB, tbl_band B " +
                "WHERE E.VenueID = V.VenueID AND E.EventID = EB.EventID AND B.BandID = EB.BandID " +
                "AND (E.Name LIKE '%"+searchCriteria+"%' OR B.Name LIKE '%"+searchCriteria+"%')" +
                "AND E.DateOfEvent>NOW()";
    	
    	createPanels(query);
    }
    
    public ResultPanel(DatePicker datePicker) {
    	//this.setPreferredSize(new Dimension(200,500));
    	this.setBackground(Color.black);
    	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        LocalDate dateFromDatePicker = datePicker.getDate();

        String query ="SELECT E.Name, E.Price, B.Name ArtistName, E.DateOfEvent, E.Image, V.Name Venue" +
                " FROM tbl_venue V, tbl_event E, tbl_event_band EB, tbl_band B " +
                "WHERE E.VenueID = V.VenueID AND E.EventID = EB.EventID AND B.BandID = EB.BandID " +
                "AND DateOfEvent = "+ "\"" + dateFromDatePicker.toString() + "\"" + " ORDER BY DateofEvent";
    	
    	createPanels(query);
    }

    private List<List<String>> getResults(String query){
        ResultSet rs = null;
        List<List<String>> results = new ArrayList<>();

        try {
            rs = Connect.selectStm(query);
            while(rs.next()){
                String name = rs.getString("Name");
                String date = rs.getString("DateOfEvent");
                String image = rs.getString("Image");
                String venue = rs.getString("Venue");
                String artist = rs.getString("ArtistName");
                float price = rs.getFloat("Price");
                boolean has = false;
                for (List<String> list : results){
                    if (list.get(0).equals(name)){
                        has =true;
                    }
                }
                if (has){
                        int index = results.indexOf(results.stream().filter(e -> e.contains(name)).findAny().get());
                        results.get(index).add(artist);
                } else{
                    results.add(new ArrayList<>(Arrays.asList(new String[]{name,date,image,venue,String.valueOf(price),artist})));}

            }

        }
        catch (NullPointerException f){
            System.out.println("fuck off"+f.getStackTrace()[0]);f.getStackTrace();
        }
        catch (SQLException e){
        	e.printStackTrace();
        }
        catch (ClassNotFoundException g){
            System.out.println(g.getMessage());
        }
        return results;
    }

    
    private void createPanels(String query){
        List<List<String>> results = getResults(query);
        System.out.println(results);
        int size= results.size();
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
            ImageIcon img = new ImageIcon((results.get(i).get(2)));
            Image image = img.getImage().getScaledInstance(135,109,Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(image));
            panel.add(imageLabel);

            nameLabel = new JLabel(results.get(i).get(0));
            nameLabel.setBounds(174, 13, 95, 23);
            panel.add(nameLabel);

            bandsLabel = new JLabel(results.get(i).get(3));
            bandsLabel.setBounds(185, 85, 345, 41);
            panel.add(bandsLabel);

            dateLabel = new JLabel(results.get(i).get(1));
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

        }
    }


    public static void main(String[] args){
        new ResultPanel("2019-04-20");
//        List<List<String>> resluts = panel.getResultsOnlyDate(DatePicker datepicker);
//        System.out.println(resluts);
    }

}
