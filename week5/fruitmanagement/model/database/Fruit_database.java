package com.jmc.week5.fruitmanagement.model.database;

import com.jmc.week5.fruitmanagement.model.Customer;
import com.jmc.week5.fruitmanagement.model.Fruit;
import com.jmc.week5.fruitmanagement.model.Order;

import java.sql.*;
import java.util.List;

public class Fruit_database {
    private static final String URL = "jdbc:mysql://localhost:3306/manh"; // Thay bằng tên schema
    private static final String USER = "root";  // Thay bằng user của MySQL
    private static final String PASSWORD = "concop17@A";  // Nếu có mật khẩu thì điền vào

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Thêm Fruit vào database

  public  static void   insertFruit(Fruit fruit) {
        String query = "INSERT INTO fruit (idFruit,Name, Price, Origin) VALUES (?,?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, fruit.getFruitId());
            stmt.setString(2, fruit.getName());
            stmt.setDouble(3, fruit.getPrice());
            stmt.setString(4, fruit.getOrigin());

            stmt.executeUpdate();
            System.out.println("Thêm Fruit thành công!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Thêm Customer vào database
    public static void insertCustomer(Customer customer) {
        String query = "INSERT INTO Customer (idCustomer, Name, Total) VALUES (?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, customer.getCusId());
            stmt.setString(2, customer.getName());
            stmt.setDouble(3, customer.getTotal());

            stmt.executeUpdate();
            System.out.println("Thêm Customer thành công!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Thêm Order vào database
    public static void insertOrder(Order order) {
        String query = "INSERT INTO `Order` (CusId, FruitId, Quantity) VALUES (?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, order.getCusid());
            stmt.setInt(2, order.getId_fruit());
            stmt.setInt(3, order.getQuantity());

            stmt.executeUpdate();
            System.out.println("Thêm Order thành công!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public static void loadFruits(List<Fruit> fruits) {
            String query = "SELECT * FROM fruit";

            try (Connection conn = getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                while (rs.next()) {
                    int id = rs.getInt("idfruit");
                    String name = rs.getString("Name");
                    int price = rs.getInt("Price");
                    String origin = rs.getString("Origin");

                    fruits.add(new Fruit( id,name, price, origin));
                }
                System.out.println("Load danh sách trái cây thành công!");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Load Customers vào List<Customer>
        public static void loadCustomers(List<Customer> customers) {
            String query = "SELECT * FROM customer";

            try (Connection conn = getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                while (rs.next()) {
                    int id = rs.getInt("idCustomer");
                    String name = rs.getString("Name");
                    double total = rs.getDouble("Total");

                    customers.add(new Customer( id,name, total));
                }
                System.out.println("Load danh sách khách hàng thành công!");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Load Orders vào List<Order>
        public static void loadOrders(List<Order> orders) {
            String query = "SELECT * FROM `order`";

            try (Connection conn = getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                while (rs.next()) {
                    int cusid = rs.getInt("CusId");
                    int fruitid = rs.getInt("FruitId");
                    int quantity = rs.getInt("Quantity");

                    orders.add(new Order(cusid, fruitid, quantity));
                }
                System.out.println("Load danh sách đơn hàng thành công!");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    public static void clearDatabase() {
        String[] queries = {
                "DELETE FROM `order`",
                "DELETE FROM fruit",
                "DELETE FROM customer"
        };

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {

            // Tắt kiểm tra khóa ngoại tạm thời để tránh lỗi
            stmt.execute("SET FOREIGN_KEY_CHECKS = 0");

            for (String query : queries) {
                stmt.executeUpdate(query);
            }

            // Bật lại kiểm tra khóa ngoại
            stmt.execute("SET FOREIGN_KEY_CHECKS = 1");

            System.out.println("Đã xóa toàn bộ dữ liệu trong database thành công!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
