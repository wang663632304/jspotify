package com.nbarraille.jspotify.main;

public class AppKey {
	private static final char[] APP_KEY = {
		0x01, 0xF8, 0x4E, 0x0D, 0x02, 0x8D, 0x3A, 0xD0, 0x22, 0xD0, 0x5B, 0xF8, 0x35, 0xE5, 0x9A, 0xA4,
		0x02, 0x67, 0x19, 0x80, 0xBB, 0xDE, 0xF5, 0x9A, 0xD8, 0xDF, 0xDC, 0xD0, 0x53, 0x36, 0x7A, 0xC6,
		0x22, 0x6D, 0x36, 0xE1, 0x44, 0x88, 0xE5, 0x49, 0xC5, 0x45, 0xAE, 0x91, 0xAE, 0x03, 0xBD, 0xA1,
		0xEE, 0x79, 0xBF, 0x12, 0xC0, 0x0A, 0x7E, 0xCB, 0x49, 0x28, 0x23, 0x93, 0x4C, 0x1C, 0xDE, 0x25,
		0x5C, 0x56, 0x25, 0xD0, 0xB5, 0x40, 0x08, 0xDB, 0xC0, 0x43, 0x6A, 0x8F, 0x51, 0x09, 0x20, 0x90,
		0x03, 0xD4, 0x6F, 0xFA, 0x36, 0xB9, 0xE0, 0x29, 0x8C, 0xFE, 0xFB, 0x86, 0x3F, 0xA5, 0x4E, 0x4A,
		0xB0, 0xF0, 0x24, 0x86, 0x35, 0xA0, 0x9B, 0xB9, 0xF6, 0xD9, 0x87, 0xDC, 0x79, 0x82, 0xA3, 0x9A,
		0xFD, 0x61, 0x0C, 0x9A, 0xE2, 0xD1, 0xFA, 0xEB, 0x2E, 0x85, 0xFA, 0xCA, 0xC3, 0xAA, 0xE3, 0x03,
		0xF0, 0xCE, 0x9A, 0xF8, 0x91, 0xD1, 0x2F, 0xA8, 0xBC, 0x07, 0xBC, 0xF0, 0x66, 0xC5, 0xBB, 0x46,
		0x7B, 0x61, 0xEF, 0x1F, 0x2A, 0x78, 0x75, 0x11, 0xC7, 0xC4, 0xE7, 0x13, 0xAE, 0x86, 0xC8, 0x4E,
		0x7C, 0x83, 0x5E, 0x34, 0x81, 0xE4, 0x15, 0x35, 0x15, 0x40, 0x2C, 0x29, 0xE5, 0x34, 0xFD, 0x19,
		0xB0, 0x64, 0xF8, 0xB0, 0xD4, 0x26, 0xA7, 0x5F, 0xA7, 0xF6, 0x2B, 0xE6, 0x81, 0x69, 0x9B, 0x9B,
		0x5C, 0xEC, 0x8C, 0xF9, 0x80, 0x6E, 0xEE, 0x29, 0x3F, 0xF3, 0xDC, 0x14, 0xAF, 0x3E, 0x2F, 0xC3,
		0x94, 0x1C, 0xFC, 0x43, 0xD0, 0x1B, 0x90, 0x9B, 0xD1, 0xFF, 0xE4, 0xB4, 0x3E, 0x16, 0x7F, 0x6F,
		0xA9, 0x76, 0xA6, 0xD0, 0xA7, 0x30, 0x33, 0xF2, 0xA7, 0xE1, 0x2C, 0x43, 0xA9, 0xC1, 0xFD, 0xBB,
		0x0B, 0xE8, 0xAC, 0x82, 0xE0, 0x0D, 0xE1, 0xBA, 0x97, 0xE7, 0xBF, 0xEF, 0x2E, 0x07, 0xA6, 0x9C,
		0x42, 0x6A, 0xFD, 0x5E, 0xE0, 0x59, 0xFA, 0xE4, 0xBB, 0x33, 0x1B, 0x8C, 0xDA, 0xDD, 0x1D, 0xD1,
		0xAD, 0x6D, 0xA5, 0xFD, 0x5D, 0xAC, 0x0A, 0x58, 0x53, 0xEE, 0x15, 0x15, 0xB1, 0xFE, 0x9E, 0x38,
		0x9B, 0x8D, 0x2D, 0x3F, 0xA3, 0xF2, 0x01, 0x65, 0xFB, 0xC8, 0x41, 0xC5, 0x08, 0xDB, 0xF1, 0x2C,
		0xC5, 0x31, 0xEE, 0xFA, 0xB3, 0x7E, 0xD1, 0x97, 0x4F, 0x44, 0x78, 0x4B, 0xAD, 0xAE, 0x6F, 0x47,
		0xEF};
	
	public static byte[] toBytes() {
		byte[] b = new byte[APP_KEY.length];
		for(int i =0; i < APP_KEY.length; i++){
			if(APP_KEY[i] > 127){
				b[i] = (byte)(APP_KEY[i] - 256);
			}else{
				b[i] = (byte)APP_KEY[i];
			}
		}
		return b;
	}
	
	public static int size() {
		return APP_KEY.length;
	}
}