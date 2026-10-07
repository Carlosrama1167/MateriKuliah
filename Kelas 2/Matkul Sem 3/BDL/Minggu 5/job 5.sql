EXPLAIN ANALYZE
SELECT * FROM pelanggan WHERE email='pelanggan12345@mail.com';

CREATE INDEX idx_pelanggan_email ON pelanggan(email);

CREATE INDEX idx_transaksi_id_pelanggan ON transaksi(id_pelanggan);
EXPLAIN ANALYZE
SELECT * FROM transaksi
WHERE id_pelanggan = 100 AND tanggal_transaksi BETWEEN '2024-01-01' AND '2024-12-31';

CREATE INDEX idx_transaksi_pelanggan_tanggal
ON transaksi(id_pelanggan, tanggal_transaksi);

WITH cte AS (
 SELECT
 conrelid::regclass::text AS table_name,
 conname AS constraint_name,
 contype AS constraint_type,
 conindid::regclass AS index_name
 FROM
 pg_constraint
 WHERE
 contype IN ('p', 'u', 'f', 'c')
)
SELECT * FROM cte WHERE "table_name" = 'pelanggan';

SELECT indexname, indexdef FROM pg_indexes WHERE tablename = 'pelanggan';

DROP INDEX IF EXISTS idx_pelanggan_email;

ALTER TABLE pelanggan ADD CONSTRAINT pelanggan_email_key UNIQUE (email);

EXPLAIN ANALYZE SELECT email FROM pelanggan WHERE email LIKE
'pelanggan12345@mail.com'; 

INSERT INTO pelanggan (nama, email, kota)
VALUES ('Pelanggan Baru', 'pelanggan12345@mail.com', 'Jakarta');

CREATE INDEX idx_transaksi_recent
ON transaksi(tanggal_transaksi)
WHERE tanggal_transaksi > DATE '2025-08-01';

EXPLAIN ANALYZE
SELECT * FROM transaksi
WHERE tanggal_transaksi > DATE '2025-08-01';

EXPLAIN ANALYZE
SELECT * FROM transaksi
WHERE tanggal_transaksi < CURRENT_DATE - INTERVAL '200 days';
EXPLAIN SELECT * FROM transaksi WHERE id_transaksi = 12345;
EXPLAIN ANALYZE SELECT * FROM transaksi WHERE id_transaksi = 12345;

CREATE INDEX idx_transaksi_total ON transaksi(total);
CREATE INDEX idx_transaksi_jumlah ON transaksi(jumlah);
EXPLAIN ANALYZE
INSERT INTO transaksi (id_pelanggan, id_produk, tanggal_transaksi, jumlah, total)
VALUES (200, 10, CURRENT_DATE, 2, 250000);
DROP INDEX idx_transaksi_total;
DROP INDEX idx_transaksi_jumlah;

ANALYZE transaksi;
EXPLAIN ANALYZE
SELECT * FROM transaksi
WHERE tanggal_transaksi BETWEEN '2024-06-01' AND '2024-06-30';

EXPLAIN ANALYZE
SELECT * FROM transaksi
WHERE id_pelanggan IN (
 SELECT id_pelanggan FROM pelanggan WHERE kota = 'Jakarta'
);

EXPLAIN ANALYZE
SELECT t.*
FROM transaksi t
JOIN pelanggan p ON t.id_pelanggan = p.id_pelanggan
WHERE p.kota = 'Jakarta';

-- Membuat index dasar pada kolom email
CREATE INDEX idx_pelanggan_email ON pelanggan (email);
EXPLAIN ANALYZE SELECT * FROM pelanggan WHERE email = 'pelanggan100@mail.com';

-- Membuat composite index (multi-kolom)
CREATE INDEX idx_transaksi_pelanggan_tanggal 
ON transaksi (id_pelanggan, tanggal_transaksi);

-- Menambahkan constraint UNIQUE pada kolom email
ALTER TABLE pelanggan 
ADD CONSTRAINT uq_pelanggan_email UNIQUE (email);
INSERT INTO pelanggan (nama, email, kota) 
VALUES ('Pelanggan Baru', 'pelanggan100@mail.com', 'Jakarta');

-- Membuat partial index untuk transaksi setelah 1 Januari 2025
CREATE INDEX idx_transaksi_setelah_2025 
ON transaksi (tanggal_transaksi) 
WHERE tanggal_transaksi > '2025-01-01';
EXPLAIN ANALYZE 
SELECT * FROM transaksi 
WHERE tanggal_transaksi > '2025-01-01';
