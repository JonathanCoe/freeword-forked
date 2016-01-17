package io.freeword.core;

public class NConstants {

	public static final int MIN_PASS_LENGTH = 8;
	 
	/**
	 * Checks if the password is valid based on its length
     *
	 * @param pass
     *
	 * @return True if the password is a valid one, false otherwise
	 */
	public static final boolean validatePassword(char[] pass) {
        if (pass.length < NConstants.MIN_PASS_LENGTH) {
            return false;
        }
        return true;
    }
}