public class Encryptor {
    /**
     * A two-dimensional array of single-character strings, instantiated in the constructor
     */
    private String[][] letterBlock;

    /**
     * The number of rows of letterBlock, set by the constructor
     */
    private int numRows;

    /**
     * The number of columns of letterBlock, set by the constructor
     */
    private int numCols;

    /**
     * Constructor
     */
    public Encryptor(int r, int c) {
        letterBlock = new String[r][c];
        numRows = r;
        numCols = c;
    }

    public String[][] getLetterBlock() {
        return letterBlock;
    }

    /**
     * Places a string into letterBlock in row-major order.
     *
     * @param str the string to be processed
     *            <p>
     *            Postcondition:
     *            if str.length() < numRows * numCols, "A" in each unfilled cell
     *            if str.length() > numRows * numCols, trailing characters are ignored
     */
    public void fillBlock(String str) {
        if (str.length() < numCols * numRows) {
            int emptySpaces = numRows * numCols - str.length();
            for (int i = 0; i < emptySpaces; i++) {
                str += "A";
            }
        }

        for (int row = 0; row < numRows; row++) {
            String currentRow = str.substring(0, numCols);
            str = str.substring(numCols);
            for (int col = 0; col < numCols; col++) {
                letterBlock[row][col] = currentRow.substring(col, col + 1);
            }
        }
    }

    /**
     * Extracts encrypted string from letterBlock in column-major order.
     * <p>
     * Precondition: letterBlock has been filled
     *
     * @return the encrypted string from letterBlock
     */
    public String encryptBlock() {
        String encryptedStr = "";
        for (int col = 0; col < numCols; col ++){
            for (int row = 0; row < numRows; row ++){
                encryptedStr += letterBlock[row][col];
            }
        }
        return encryptedStr;
    }

    /**
     * Encrypts a message.
     *
     * @param message the string to be encrypted
     * @return the encrypted message; if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message) {
        String finalMessage = "";
        int encryptedLen = numRows * numCols;
        if (message.length() % encryptedLen != 0){
            int toAdd = encryptedLen - message.length() % encryptedLen;
            for (int i = 0; i < toAdd; i ++){
                message += "A";
            }
        }

        int numOfBlocks = message.length() / encryptedLen;
        for (int time = 0; time < numOfBlocks; time ++){
            fillBlock(message.substring(0, encryptedLen));
            finalMessage += encryptBlock();
            message = message.substring(encryptedLen);
        }

        return finalMessage;
    }

    /**
     * Decrypts an encrypted message. All filler 'A's that may have been
     * added during encryption will be removed, so this assumes that the
     * original message (BEFORE it was encrypted) did NOT end in a capital A!
     * <p>
     * NOTE! When you are decrypting an encrypted message,
     * be sure that you have initialized your Encryptor object
     * with the same row/column used to encrypted the message! (i.e.
     * the “encryption key” that is necessary for successful decryption)
     * This is outlined in the precondition below.
     * <p>
     * Precondition: the Encryptor object being used for decryption has been
     * initialized with the same number of rows and columns
     * as was used for the Encryptor object used for encryption.
     *
     * @param encryptedMessage the encrypted message to decrypt
     * @return the decrypted, original message (which had been encrypted)
     * <p>
     * TIP: You are encouraged to create other helper methods as you see fit
     * (e.g. a method to decrypt each section of the decrypted message,
     * similar to how encryptBlock was used)
     */
    public String decryptMessage(String encryptedMessage) {
        String decryptedMessage = "";
        int lenOfBlocks = numCols * numRows;
        int numOfBlocks = encryptedMessage.length() / lenOfBlocks;
        for (int times = 0; times < numOfBlocks; times ++){
            String[][] colMajorArray = new String[numCols][numRows];
            String[][] rowMajorArray = new String[numRows][numCols];
            String tempMessage = encryptedMessage.substring(0,lenOfBlocks);
            encryptedMessage = encryptedMessage.substring(lenOfBlocks);
            for (int i = 0; i < lenOfBlocks);
        }
    }
}