/**
 * 確認網路是否連線
 */
public boolean isNetworkAvailable(Context context) {
    ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo network = connectivity.getActiveNetworkInfo();

    // 無任何連線方式時 NetworkInfo 會是 null
    if (network == null || network.isConnected() == false) {
        return false;
    }

    if (network.isAvailable() == false) {
        return false;
    }

    // 漫游模式
    if (network.isRoaming()) {
        // 處理方法...
    }

    return true;
}
