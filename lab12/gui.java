import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class now extends JFrame implements ActionListener {
    Container c;
    JLabel l1, l2, l3, l4;
    JTextField tf1, tf2, tf3, tf4;
    JButton b1, b2, b3, b4, b5;

    now() {
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        setTitle("Book");
        setVisible(true);
        setSize(500, 500);

        l1 = new JLabel("Fist Name");
        l2 = new JLabel("Last Name");
        l3 = new JLabel("Dept name");
        l4 = new JLabel("age");
        tf1 = new JTextField(30);
        tf2 = new JTextField(30);
        tf3 = new JTextField(30);
        tf4 = new JTextField(30);

        b1 = new JButton("Insert");
        b3 = new JButton("Delete");
        b5 = new JButton("Display");

        b1.addActionListener(this);
        b3.addActionListener(this);
        b5.addActionListener(this);

        c.add(l1);
        c.add(tf1);
        c.add(l2);
        c.add(tf2);
        c.add(l3);
        c.add(tf3);
        c.add(l4);
        c.add(tf4);

        c.add(b1);
        c.add(b3);
        c.add(b5);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String first = tf1.getText();
        String second = tf2.getText();
        String third = tf3.getText();
        String fourth = tf4.getText();

        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/final", "root", "");
            System.out.println("Connection established");
            Statement stmt = conn.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (ae.getSource() == b1) {
            System.out.println("Insert");
            try {
                // Prepared statements
                String ins = "Insert into dept values(?,?,?,?)";
                PreparedStatement stmt = conn.prepareStatement(ins);
                stmt.setString(1, first);
                stmt.setString(2, second);
                stmt.setString(3, third);
                stmt.setString(4, fourth);
                stmt.executeUpdate();
                System.out.println("Data Inserted");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        if (ae.getSource() == b3) {
            System.out.println("Delete");
            try {
                String dl = "Delete from dept where fname=?";
                PreparedStatement ps = conn.prepareStatement(dl);
                ps.setString(1, first);
                ps.executeUpdate();
                System.out.println("Data Deleted");
            } catch (Exception et) {
                System.out.println(et.getMessage());
            }
        }

        if (ae.getSource() == b4) {
            System.out.println("Clear");
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
        }

        if (ae.getSource() == b5) {
            System.out.println("Display");
            try {
                Statement st = conn.createStatement();
                // Resultset
                ResultSet rs = st.executeQuery("Select * FROM dept");
                System.out.println("Fname          Lname                dept            age");
                while (rs.next()) {
                    String name = rs.getString("fname");
                    String lname = rs.getString("lname");
                    String address = rs.getString("address");
                    String age = rs.getString("age");
                    System.out.println(name + "       " + lname + "        " + address + "       " + age + "  ");
                }

            } catch (Exception ept) {
                System.out.println(ept.getMessage());
            }
        }
    }

    public static void main(String args[]) {
        new now();
    }

}