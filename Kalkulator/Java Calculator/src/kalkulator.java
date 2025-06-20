import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kalkulator {
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton AC;
    private JButton btnBagi;
    private JButton btnKurang;
    private JButton btnKali;
    private JButton btnHasil;
    private JButton btngatau;
    private JButton angka7;
    private JButton angka4;
    private JButton angka1;
    private JButton btn00;
    private JButton btnTambah;
    private JButton angka8;
    private JButton angka5;
    private JButton angka2;
    private JButton angka0;
    private JButton btnTambahKurang;
    private JButton angka9;
    private JButton angka6;
    private JButton angka3;
    private JButton btnTitik;

    double a, b, result;
    String op;

    public kalkulator() {
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
        angka7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + angka7.getText());
            }
        });
        angka8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + angka8.getText());
            }
        });
        angka9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + angka9.getText());
            }
        });
        angka4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + angka4.getText());
            }
        });
        angka5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + angka5.getText());
            }
        });
        angka6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + angka6.getText());
            }
        });
        angka1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + angka1.getText());
            }
        });
        angka2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + angka2.getText());
            }
        });
        angka3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + angka3.getText());
            }
        });
        btn00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + btn00.getText());
            }
        });
        angka0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + angka0.getText());
            }
        });
        btnTambahKurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtDisplay.getText().contains(".")){
                    {
                        double pm = Double.parseDouble(txtDisplay.getText());
                        pm=pm*-1;
                        txtDisplay.setText(String.valueOf(pm));
                    }
                    {
                        long PM = Long.parseLong(txtDisplay.getText());
                        PM = PM*-1;
                        txtDisplay.setText(String.valueOf(PM));
                    }
                }
            }
        });
        btnTitik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains("."));
                {
                    txtDisplay.setText(txtDisplay.getText() + btnTitik.getText());
                }
            }
        });
        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "+";
                txtDisplay.setText("");;
            }
        });
        btnKurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "-";
                txtDisplay.setText("");;
            }
        });
        btnKali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "*";
                txtDisplay.setText("");;
            }
        });
        btnBagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                op = "/";
                txtDisplay.setText("");;
            }
        });
        btngatau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(txtDisplay.getText().length() > 0)
                {
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    txtDisplay.setText(backspace);
                }
            }
        });
        btnHasil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtDisplay.getText());

                if(op == "+"){
                    result = a+b;
                    txtDisplay.setText(String.valueOf(result));
                }else if(op == "-"){
                    result = a-b;
                    txtDisplay.setText(String.valueOf(result));
                }else if(op == "*"){
                    result = a*b;
                    txtDisplay.setText(String.valueOf(result));
                }else if(op == "/"){
                    result = a/b;
                    txtDisplay.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("kalkulator");
        frame.setContentPane(new kalkulator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
