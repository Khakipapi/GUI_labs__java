/*
@author Jose Reyes
CMIS242
UMGC
2/14/2022

This program will convert temperatures from Fahrenheit temperature into Celsius.
 The program will also convert miles to kilometers.
 It will also create a GUI for the user to input the information.
 */

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CMIS242ASG3ReyesJ {

   private static class Converter
    {

        //attribute
        private Double data;

       public Converter()
        {
            data = Double.NaN;
        }
      public Converter(Double data)
        {
            setData(data);
        }

       public Double convert()
        {
            Double data1 = 0.0;
           if (data != data)
            data1 = data;
                return data1;
        }
        public double getData() {
            return data;
        }

        public void setData(double data) {
            this.data = data;
        }
    }//end Converter
    static class TemperatureConverter extends Converter
    {
        Double temp;
        TemperatureConverter()
        {
            super();
        }
        TemperatureConverter(Double temp)
        {
            this.temp= temp;
        }


        @Override
        public Double convert() {
            Double tempInput;

            if (!temp.isNaN()) {
                tempInput = ((temp - 32.0) * 5.0) / 9.0;
            }
            else {
                tempInput = Double.NaN;
            }
            return tempInput;
        }
    }//end TemperatureConverter

    static class DistanceConverter extends Converter
    {
        Double dis;
        public DistanceConverter(Double dis)
        {
            this.dis = dis;
        }
        public DistanceConverter()
        {
            super();
        }
        @Override
        public Double convert()
       {
           Double distanceInput;

           if (!dis.isNaN())
               distanceInput = dis * 1.609;

           else
               distanceInput = Double.NaN;

           return distanceInput;
       }
    }//end DistanceConverter

    static class GUIConverter extends JFrame
    {
        JFrame frame;
        JButton temp,distance,exit;
        JPanel panel;
        JLabel prompt;

        public GUIConverter()
        {
            //set up frame

            frame = new JFrame("Converter");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.getContentPane().setBackground(new Color(3456));
            frame.setSize(450,150);
            frame.setResizable(false);
            frame.setLayout(null);


            //set buttons
            prompt = new JLabel("Please select the converter you would like: ");
            temp = new JButton("Temperature");
            temp.setBackground(Color.YELLOW);
            distance = new JButton("Distance");
            distance.setBackground(Color.GREEN);
            exit = new JButton("Exit");
            exit.setBackground(Color.RED);

            //add panel
            panel = new JPanel();
            panel.setBounds(50,15,350,250);
            panel.setLayout(new FlowLayout());
            panel.setBackground(Color.MAGENTA);

            //add buttons to panel widget
            panel.add(prompt,BorderLayout.NORTH);
            panel.add(distance,BorderLayout.WEST);
            panel.add(temp,BorderLayout.EAST);
            panel.add(exit,BorderLayout.SOUTH);

            //add actionListener
            distance.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    Double distance = Double.parseDouble(JOptionPane.showInputDialog("Input distance in miles" +
                            " to convert to kilometers: "));

                    DistanceConverter distanceConverter = new DistanceConverter(distance);
                   JOptionPane.showMessageDialog(frame,distance + " miles is equal to "+
                           distanceConverter.convert() + " K");
                }
            });
            //end actionPerformed
            temp.addActionListener(event -> {
                Double temp = Double.parseDouble(JOptionPane.showInputDialog("Input Fahrenheit temp to convert " +
                        "to Celsius: "));

                TemperatureConverter temperatureConverter = new TemperatureConverter(temp);//new instance

                JOptionPane.showMessageDialog(frame,temp + " F is equal to "+ temperatureConverter.convert()
                + " C");//message output
            });
            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
           //add panel to frame
            frame.add(panel);
            frame.setVisible(true);
        }
    }

    static public void main(String[] args) {
       new GUIConverter();
    }//end main
}//end CMIS242ASG3ReyesJ
