import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Animasi love sederhana menggunakan Java Swing.
 * Tidak memerlukan file gambar eksternal, menggunakan bentuk sederhana (love).
 */
public class loveAnimation extends JPanel implements ActionListener {

    private int loveX = 50;   // Posisi awal love
    private int loveY = 150; // Posisi awal love
    private final int loveY2 = 150;
    private final int loveX2 = 150;

    private final Timer timer;

    public loveAnimation() {
        setPreferredSize(new Dimension(500, 300));
        setBackground(Color.WHITE);

        // Timer untuk mengupdate animasi setiap 30ms
        timer = new Timer(30, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Gambar love (lingkaran PINK)
        g.setColor(Color.PINK);
        g.fillOval(loveX, loveY, 50, 50);

        // Gambar telinga love
        g.setColor(Color.BLACK);
        g.fillPolygon(new int[]{loveX + 10, loveX + 20, loveX + 5},
                      new int[]{loveY, loveY - 15, loveY}, 3);
        g.fillPolygon(new int[]{loveX + 40, loveX + 45, loveX + 35},
                      new int[]{loveY, loveY - 15, loveY}, 3);

        // Gambar love(love pink)
        g.setColor(Color.GRAY);
        g.fillOval(loveX + 10, loveY + 10, 30, 30);


    @Override
    public void actionPerformed(ActionEvent e) {
        // Gerakkan love ke kanan
        loveX += 2;
        if (loveX > getWidth()) {
            loveX = -50; // Reset posisi love
        }

        // Gerakkan love 
        if (loveX < loveX - 20) {
            loveX += 1;
        } else if (loveX > loveX - 20) {
            loveX -= 1;
        }

        repaint();
    }

    public static void main(String[] args) {
        // Pastikan program berjalan di thread GUI
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Animasi Love Sederhana");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new CatMouseAnimation());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
