package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//faktorial adalah produk dari semua bilangan bulat positif kurang dari
//atau sama dengan bilangan bulat positif yang dilambangkan tanda seru.

public class FactorialCounter {
    private JTextField InputText;
    private JTextField HasilText;
    private JButton hasilButton;
    private JButton clearButton;
    private JPanel GUI;
    private JButton endButton;

    // awal constructor
    public FactorialCounter() {
        hasilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                mengambil nilai inputan pada textfield InputText
                String input_user = InputText.getText();
//                merubah nilai inputan dari textfield dari string menjadi integer
                int input = Integer.parseInt(input_user);

//                mengambil hasil perhitungan dari method faktorial dan menyimpan pada varaibel hasil
                int hasil = Faktorial(input);
//                menampilkan hasil perhitungan pada textfield HasilText dengan cara merubah nilai int ke string
                HasilText.setText(Integer.toString(hasil));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HasilText.setText("");
                InputText.setText("");
            }
        });
        endButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
// akhir constructor

//    awal main method
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI_TA_PDKP");
        frame.setContentPane(new FactorialCounter().GUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(330, 250);
        frame.setResizable(false);
    }
//    akhir main method

//    method non void untuk menghitung inputan
    public int Faktorial(int input) {
        String nilai = InputText.getText(); //mengambil nilai inputan dan merubah
        int temp = 1;
        int A = Integer.parseInt(nilai);
        // pengkondisian  if else untuk menentukan nilai yang bisa diinputkan
         if ( A < 1 ){
             // jika nilai yang di inputkan tidak sesuai maka akan muncul massagebox
             String error ="Nilai yang dimasukkan salah";
             JOptionPane.showMessageDialog(null, error);
             System.exit(0);

         }
         else {
             // awal looping untuk mencari nilai faktorial
             for (int i = 1; i <= A; i++) {
                 temp = temp*i;
             }
             // akhir looping
         }
         // akhir pengkondisian if else

         return temp;

    }
}
/*
pada program ini mencakup modul :
1. pengkondisian
2. Tipe data
3. constructor
4. setter dan getter pada OOP
5. Looping
6. GUI
 */





