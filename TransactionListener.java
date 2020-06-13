public interface TransactionListener {
    /**
     * the sign process is in progress
     */
    void onLoading();

    /**
     * @param account returns the connected user
     */
    void onComplete(Bank account);

    /**
     * @param error returns the error message
     */
    void onError(String error);
}
