package dao;

import static db.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.Dog;

public class DogDAO {
	Connection conn;
	private static DogDAO boardDAO;

	private DogDAO() {
	}

	public static DogDAO getInstance() {
		if (boardDAO == null)
			boardDAO = new DogDAO();
		return boardDAO;
	}

	public void setConnection(Connection conn) {
		this.conn = conn;
	}

	public ArrayList<Dog> selectDogList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Dog> dogList = null;

		try {
			pstmt = conn.prepareStatement("select * from dog");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dogList = new ArrayList<Dog>();

				do {
					dogList.add(new Dog(rs.getInt("id"), rs.getString("kind"), rs.getInt("price"),
							rs.getString("image"), rs.getString("country"), rs.getInt("height"), rs.getInt("weight"),
							rs.getString("content"), rs.getInt("readcount")));
				} while (rs.next());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}

		return dogList;
	}

	public int insertDog(Dog dog) {
		PreparedStatement pstmt = null;
		int insertCount = 0;
		String sql = "";

		try {
			sql = "INSERT INTO dog VALUES(null,?,?,?,?,?,?,?,?)"; // sql 구문에서는 null로 표기
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dog.getKind());
			pstmt.setInt(2, dog.getPrice());
			pstmt.setString(3, dog.getImage());
			pstmt.setString(4, dog.getCountry());
			pstmt.setInt(5, dog.getHeight());
			pstmt.setInt(6, dog.getWeight());
			pstmt.setString(7, dog.getContent());
			pstmt.setInt(8, dog.getReadcount());
			insertCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return insertCount;
	}

	public int upadateReadCount(int id) {
		PreparedStatement pstmt = null;
		int updateCount = 0;
		String sql = "";

		try {
			sql = "UPDATE dog SET readcount = readcount + 1 where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			updateCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return updateCount;
	}

	public Dog selectDog(int id) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dog dog = null;

		try {
			pstmt = conn.prepareStatement("SELECT * FROM dog where id=?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dog = new Dog(rs.getInt("id"), rs.getString("kind"), rs.getInt("price"), rs.getString("image"),
						rs.getString("country"), rs.getInt("height"), rs.getInt("weight"), rs.getString("content"),
						rs.getInt("readcount"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}
		return dog;
	}

}
