package co.micol.prj.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//싱글톤 클래스(인스턴스를 여러개 생성하지 않고 자신 하나만 생성하는것!_외부에서 자신 생성자를 못만들도록)
public class DataSource { // 마이바티스를 사용하기때문에 return SqlSessionFactory 해야함
	private static SqlSessionFactory sqlSessionFactory;
	
	private DataSource() {}//생성자를 다른곳에서 생성 할 수 없도록/ 외부에서 생성 못하도록 만들었다

	public static SqlSessionFactory getInstace() {
		String resource = "config/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			System.out.println("DB 연결 성공!!!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패!!!");
		}
		
		return sqlSessionFactory;
	}


}
