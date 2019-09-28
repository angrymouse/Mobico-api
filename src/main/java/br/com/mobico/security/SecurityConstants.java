package br.com.mobico.security;

public class SecurityConstants {
	public static final String SECRET = "42RpzHGZi3TDsUhg3k5hkHikoJ7JdcO8";
	public static final long EXPIRATION_TIME = 864_000_000; // 10 days
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final String LOGIN_URL = "/login";
	public static final String SIGN_UP_URL = "/user/account";
	public static final String RESET_PASSWORD_URL = "/user/reset-password";
	public static final String DOCUMENTATION_URL = "/**";
	public static final String EMAIL_VERIFICATION_URL = "/user/email-validation";
	public static final String TEST_ENDPOINT = "/testendpoint";
}
