
public class LiveStream implements Playable {
    // TODO: Buat field-field yang diperlukan:
    // - String title (judul live stream)
    // - String streamerName (nama streamer)
    // - int viewerCount (jumlah penonton)
    // - boolean isLive (status apakah sedang live)
    // - boolean isPlaying (status pemutaran)
    // - int updateCounter (counter untuk update viewer count)

    private int updateCounter;
    private boolean isPlaying;
    private boolean isLive;
    private int viewerCount;
    private String streamerName;
    private String title;

    // TODO: Buat constructor yang menerima title, streamerName, viewerCount, dan
    // isLive
    /**
     * Constructor untuk membuat objek LiveStream
     * Inisialisasi semua field dan atur isPlaying = false, updateCounter = 0
     * 
     * @param title        judul live stream
     * @param streamerName nama streamer
     * @param viewerCount  jumlah penonton saat ini
     * @param isLive       status apakah sedang live
     */
    public LiveStream(String title, String streamerName, int viewerCount, boolean isLive) {
        this.title = title;
        this.streamerName = streamerName;
        this.viewerCount = viewerCount;
        this.isLive = isLive;
        this.isPlaying = false;
        this.updateCounter = 0;
    }

    // TODO: Implementasikan semua method dari interface Playable

    /**
     * Memulai menonton live stream
     * Jika isLive = true:
     * - Panggil updateViewerCount()
     * - Tampilkan: "Menonton live stream: [title] by [streamerName] - [viewerCount]
     * viewers"
     * - Ubah isPlaying menjadi true
     * Jika isLive = false:
     * - Tampilkan: "Stream sudah berakhir"
     * - Ubah isPlaying menjadi false
     */
    @Override
    public void play() {
        if (isLive) {
            updateViewerCount();
            System.out.println("Menonton live stream: "+this.title+ " by "+this.streamerName+ " - "+this.viewerCount + "viewers");
            this.isPlaying = true;
        } else {
            System.out.println("Stream sudah berakhir");
            this.isPlaying = false;
        }
    }

    /**
     * Tidak bisa pause live stream
     * Tampilkan: "Live stream tidak bisa dijeda, gunakan stop() untuk keluar"
     */
    @Override
    public void pause() {
        System.out.println("Live stream tidak bisa dijeda, gunakan stop() untuk keluar");
    }

    /**
     * Keluar dari live stream
     * Tampilkan: "Keluar dari live stream [title]"
     * Ubah isPlaying menjadi false
     * Panggil updateViewerCount()
     */
    @Override
    public void stop() {
        System.out.println("Keluar dari live stream "+this.title);
        this.isPlaying = false;
        this.updateViewerCount();
    }

    /**
     * Mendapatkan durasi live stream
     * 
     * @return -1 (live stream tidak memiliki durasi tetap)
     */
    @Override
    public int getDuration() {
        return -1;
    }

    /**
     * Mendapatkan judul live stream
     * 
     * @return judul live stream
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Mengecek apakah live stream sedang diputar
     * 
     * @return true jika sedang diputar, false jika tidak
     */
    @Override
    public boolean isPlaying() {
        return this.isPlaying;
    }

    // TODO: Implementasikan method tambahan khusus untuk LiveStream

    /**
     * Mengecek apakah live stream masih live
     * 
     * @return true jika masih live, false jika sudah berakhir
     */
    public boolean isLive() {
        return this.isLive;
    }

    /**
     * Mendapatkan nama streamer
     * 
     * @return nama streamer
     */
    public String getStreamerName() {
        return this.streamerName;
    }

    /**
     * Mendapatkan jumlah penonton saat ini
     * 
     * @return jumlah penonton
     */
    public int getViewerCount() {
        return this.viewerCount;
    }

    /**
     * Update jumlah penonton
     * Increment updateCounter
     * Hitung perubahan: (updateCounter % 11) - 5 (range: -5 sampai +5)
     * Update viewerCount: Math.max(0, viewerCount + change)
     */
    public void updateViewerCount() {
        this.updateCounter++;
        int change = (this.updateCounter % 11)- 5;
        this.viewerCount = Math.max(0, viewerCount + change);
        
    }

    /**
     * Mengakhiri live stream
     * Ubah isLive menjadi false dan isPlaying menjadi false
     * Tampilkan: "Live stream [title] telah berakhir"
     */
    public void endStream() {
        isLive = false;
        isPlaying = false;
        System.out.println("Live stream " +this.title+ " telah berakhir");
    }
}