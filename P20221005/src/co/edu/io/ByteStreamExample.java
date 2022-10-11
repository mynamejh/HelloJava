package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamExample {

	public static void main(String[] args) {
		try {
			fileCopy();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileCopy() throws IOException {
		FileInputStream fis = new FileInputStream("C:/Temp/origin.jpg");
		FileOutputStream fos = new FileOutputStream("C:/Temp/copy.jpg");
		byte[] buf = new byte[100];

		// 시간출력.
		long start = System.currentTimeMillis(); // 현재시간

		while (true) {
			int bytes = fis.read(buf); // 한 바이트씩 읽기.
			if (bytes == -1) // 더 이상 없으면~
				break;

			fos.write(buf); // 배열의 크기만큼 버퍼에 저장하고 한번에 저장하겠다!
		}

		fos.close();
		fis.close();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println("complete.");
	}

	public static void readBuf() throws IOException {
		InputStream is = new FileInputStream("C:/Temp/data2.dat");
		byte[] buf = new byte[2];

		while (true) { //속도를 줄이려면 read & write 메소드에 배열을 사용하면 된다
			int bytes = is.read(buf); // 배열에 선언된 크기만큼 읽어들임.
			if (bytes == -1) { // 읽어올 값이 없으면 빠져나올게
				break;
			}
			for (int i = 0; i < bytes; i++) {
				System.out.print(buf[i] + " ");
			}
			System.out.println();
		}
		System.out.println("complete!");
		is.close();
	}

	public static void writeBuf() throws IOException { // 꽤 상위의 Exception
		byte[] arr = new byte[] { 10, 20, 30 };
		OutputStream os = new FileOutputStream("C:/Temp/data2.dat");
		os.write(arr);
		os.close();

		System.out.println("complete~");
	}

	public static void read() {
		try {
			InputStream is = new FileInputStream("C:/Temp/data1.dat");

			while (true) {
				int bytes = is.read(); // byte 읽고 더 이상 읽을 바이트 없으면 -1값 반환
				if (bytes == -1) {
					break;
				}
				System.out.println(bytes);
			}

			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("complete");
	}

	public static void write() {
		// 출력스트림(바이트)
		try {
			OutputStream os = new FileOutputStream("C:/Temp/data1.dat");
			// write(byte b)
			byte a = 10;
			byte b = 20;

			os.write(a);
			os.write(b);

			// resource 반환
			os.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Complete");
	}
}// end class
