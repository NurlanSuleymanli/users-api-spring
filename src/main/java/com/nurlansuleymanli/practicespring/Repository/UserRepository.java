package com.nurlansuleymanli.practicespring.Repository;

import com.nurlansuleymanli.practicespring.model.User;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserRepository {

    public void createRepository(User user){

        String sql = " INSERT INTO users (name, surname, mail, age) VALUES (?, ?, ?, ?) ";

        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/practicespring",
                "postgres", "postgres");

             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, user.getName());
            ps.setString(2, user.getSurname());
            ps.setString(3, user.getMail());
            ps.setInt(4, user.getAge());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<User> getAllUsersRepository(){

        List<User> users= new ArrayList<>();

        String sql = "SELECT * FROM users";

        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/practicespring",
                "postgres", "postgres");

             PreparedStatement ps = connection.prepareStatement(sql)) {


            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                users.add(new User(rs.getLong(1), rs.getString(2), rs.getString(3),
                        rs.getInt(5), rs.getString(4)));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return users;

    }

    public User getUserByIDRepository(Long id){
        String sql = "SELECT * FROM users WHERE id= ?";

        try( Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/practicespring",
                "postgres", "postgres"))
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1,id);

            ResultSet  rs= preparedStatement.executeQuery();

            rs.next();

            return new User(rs.getLong(1), rs.getString(2), rs.getString(3),
                    rs.getInt(5), rs.getString(4));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    public void deleteUserByIDRepository(Long id){
        String sql = "DELETE FROM users WHERE id=?";

        try(Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/practicespring",
                "postgres", "postgres");

        PreparedStatement preparedStatement= connection.prepareStatement(sql)){

            preparedStatement.setLong(1,id);

            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    public void updateUserByIDRepository(Long id, String mail){
        String sql = " UPDATE users SET mail=? WHERE id=? ";

        try(Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/practicespring",
                "postgres", "postgres");

            PreparedStatement preparedStatement= connection.prepareStatement(sql)){

            preparedStatement.setString(1,mail);
            preparedStatement.setLong(2,id);

            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    }

