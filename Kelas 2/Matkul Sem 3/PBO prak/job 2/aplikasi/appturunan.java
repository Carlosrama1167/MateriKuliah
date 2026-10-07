package aplikasi;

import com.polinema.library.kelas;

public class appturunan extends kelas {

    public void tampilkanData() {
        System.out.println(publicvar);       // Bisa
        System.out.println(protectedvar);    // Bisa karena extends

        // System.out.println(defaultvar);   // ERROR
        // System.out.println(privatevar);   // ERROR
    }

}
