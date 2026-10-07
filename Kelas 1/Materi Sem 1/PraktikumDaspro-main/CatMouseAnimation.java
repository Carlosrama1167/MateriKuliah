import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Animasi sederhana kucing mengejar tikus menggunakan Java Swing.
 * Tidak memerlukan file gambar eksternal, menggunakan bentuk sederhana (oval).
 */
public class CatMouseAnimation extends JPanel implements ActionListener {

    private int catX = 50;   // Posisi awal kucing
    private int mouseX = 300; // Posisi awal tikus
    private final int catY = 150;
    private final int mouseY = 150;

    private final Timer timer;

    public CatMouseAnimation() {
        setPreferredSize(new Dimension(500, 300));
        setBackground(Color.WHITE);

        // Timer untuk mengupdate animasi setiap 30ms
        timer = new Timer(30, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Gambar kucing (lingkaran oranye)
        g.setColor(Color.ORANGE);
        g.fillOval(catX, catY, 50, 50);

        // Gambar telinga kucing
        g.setColor(Color.BLACK);
        g.fillPolygon(new int[]{catX + 10, catX + 20, catX + 5},
                      new int[]{catY, catY - 15, catY}, 3);
        g.fillPolygon(new int[]{catX + 40, catX + 45, catX + 35},
                      new int[]{catY, catY - 15, catY}, 3);

        // Gambar tikus (lingkaran abu-abu)
        g.setColor(Color.GRAY);
        g.fillOval(mouseX, mouseY, 30, 30);

        // Gambar telinga tikus
        g.setColor(Color.DARK_GRAY);
        g.fillOval(mouseX + 2, mouseY - 8, 10, 10);
        g.fillOval(mouseX + 18, mouseY - 8, 10, 10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Gerakkan tikus ke kanan
        mouseX += 2;
        if (mouseX > getWidth()) {
            mouseX = -30; // Reset posisi tikus
        }

        // Gerakkan kucing mengejar tikus
        if (catX < mouseX - 20) {
            catX += 1;
        } else if (catX > mouseX - 20) {
            catX -= 1;
        }

        repaint();
    }

    public static void main(String[] args) {
        // Pastikan program berjalan di thread GUI
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Animasi Kucing dan Tikus");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new CatMouseAnimation());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
