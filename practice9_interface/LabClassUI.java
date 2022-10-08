package practice9_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LabClassUI extends JFrame {
    JPanel jPanelMain = new JPanel(new BorderLayout());

    JPanel jPanelNorth = new JPanel();
    JButton findStudent = new JButton("Найти Студента по имени");

    JPanel jPanelSouth = new JPanel(new FlowLayout());
    JButton GPASort = new JButton("Sort by GPA");
    JButton idSort = new JButton("Sort by id");
    JButton nameSort = new JButton("Sort by name");

    JTextPane txtPane = new JTextPane();

    JTextField txtField = new JTextField();
    public LabClassUI() {
        LabClass StudentsBaseInstance = new LabClass(); //create just to fill array in its constructor
        setSize(1080, 1080);
        add(jPanelMain);
        jPanelMain.setSize(500, 500);
        jPanelMain.add(jPanelSouth, BorderLayout.SOUTH);
        jPanelMain.add(jPanelNorth, BorderLayout.NORTH);
        jPanelMain.add(txtPane, BorderLayout.CENTER);
        updateArrayDisplaying();

        jPanelSouth.setPreferredSize(new Dimension(450, 50));
        jPanelSouth.add(GPASort);
        jPanelSouth.add(idSort);
        jPanelSouth.add(nameSort);

        jPanelNorth.setLayout(new BoxLayout(jPanelNorth, BoxLayout.Y_AXIS));
        jPanelNorth.setPreferredSize(new Dimension(500, 100));
        jPanelNorth.add(txtField);
        txtField.setFont(new Font("Courier New", Font.BOLD, 30));
        jPanelNorth.add(findStudent);
        findStudent.setPreferredSize(new Dimension(100, 50));
        findStudent.setAlignmentX(Component.CENTER_ALIGNMENT);

        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*Верстка окончена, теперь логика*/
    }

    void run () {
        GPASort.addMouseListener(new MouseL(GPASort));
        idSort.addMouseListener(new MouseL(idSort));
        nameSort.addMouseListener(new MouseL(nameSort));
        findStudent.addMouseListener(new MouseL(findStudent));
    }

    public void updateArrayDisplaying() {
        StringBuilder text = new StringBuilder(); //save array to here
        for (int i=0; i<LabClass.arr.length; i++){
            text.append(LabClass.arr[i].toString()).append("\n");
        }
        txtPane.setFont(new Font("Courier New", Font.BOLD, 30));
        txtPane.setText(text.toString());
    }

    public class MouseL implements MouseListener {
        JButton b;
        public MouseL(JButton b) {
            this.b = b;
        }
        public void mouseClicked(MouseEvent event) {
            if (b == GPASort) {
                LabClass.sort(new LabClass.SortingStudentsByGPA());
                updateArrayDisplaying();
            }
            if (b == idSort) {
                LabClass.sort(new LabClass.SortingStudentsById());
                updateArrayDisplaying();
            }
            if (b == nameSort) {
                LabClass.sort(new LabClass.SortingStudentsByName()); //magic
                updateArrayDisplaying();
            }
            if (b == findStudent) {
                try {
                    Student instance = LabClass.findStudent(txtField.getText()); //pass input to the find method
                    txtPane.setText(instance.toString());
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(jPanelMain, e);
                }
            }
        };
        public void mouseEntered(MouseEvent event) {};
        public void mouseExited(MouseEvent event) {};
        public void mousePressed(MouseEvent event) {};
        public void mouseReleased(MouseEvent event) {};
    }
}
