import java.security.messagedigest
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Blockchain {
    private List<Block> blocks;
    private List<Transaction> transaction;

    public Blockchain () {
        this.blocks = new ArrayList<>();
        this.transaction = new ArrayList<>();
    }
    public void addBlock(Block block) {
        this.blocks.add(block);
    }
    public void addTransaction(Transaction transaction) {
        this.transaction.add(transaction);
    }
    public List<Block> getBlocks() {
        return this.blocks;
    }
}
    public List<Transaction> getTransactions() {
        return this.transaction; 
    }

