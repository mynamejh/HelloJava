package co.micol.prj.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//싱글톤
public class DataSource {//싱글통 클래스의 기본 형
	
	private static SqlSessionFactory sqlSessionFactory; //MyBatis 사용하기때문
	//sqlSesisonFactory를 사용해서 mapper가능.
	
	private DataSource () {} //생성자를 다른곳에서 생성할 수 없도록 private로 생성
	
	public static SqlSessionFactory getInstance(){
		String resource = "config/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			System.out.println("DB 연결 성공!!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("DB 연결실패!!");
		}
		return sqlSessionFactory;
	}
}
