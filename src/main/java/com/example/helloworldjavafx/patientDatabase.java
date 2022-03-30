package com.example.helloworldjavafx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class patientDatabase
{
    public static void writeToDatabase(String _name, String _dateOfBirth, String _sex, String _weight, String _bloodGroup, String _medications, String _phoneNum, String _id)
    {
        String url = "jdbc:postgresql://localhost:5432/javafx";
        String user = "postgres";
        String password = "123";

        String name = _name;
        String dateOfBirth = _dateOfBirth;
        String sex = _sex;
        String weight = _weight;
        String bloodGroup = _bloodGroup;
        String medications = _medications;
        String phoneNum = _phoneNum;
        String id = _id;

        String query = "INSERT INTO patient(Name, Date of Birth, Sex, Weight, Blood Group, Current Medication(s), Contact no., Patient ID) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try(Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = con.prepareStatement(query))
        {
            pst.setString(1, name);
            pst.setString(2, dateOfBirth);
            pst.setString(3, sex);
            pst.setString(4, weight);
            pst.setString(5, bloodGroup);
            pst.setString(6, medications);
            pst.setString(7, phoneNum);
            pst.setInt(8, Integer.parseInt(id));
            pst.executeUpdate();
            System.out.println("Successfully Created!");
        } catch (SQLException ex)
        {
            Logger lgr = Logger.getLogger(patientDatabase.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
