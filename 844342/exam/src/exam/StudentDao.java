package exam;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<Student> diplayAllRecords()
	{
		String sql="select * from student";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Student>>() {

			@Override
			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Student> l=new ArrayList<Student>();
				while(rs.next()) {
					Student s=new Student();
					s.setId(rs.getInt(1));
					s.setName(rs.getString(2));
					s.setAge(rs.getInt(3));
					l.add(s);
				}
				return l;
			}
			
		});
	}
	
	public boolean searchStudent(int id) {
		String sql="select * from student where id="+id;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Boolean>() {

			@Override
			public Boolean extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					return true;
				}
				else {
					return false;
				}
		
			}
			
		});	
	}
	
	public int addRecord(Student st) {
		boolean search_res=searchStudent(st.getId());
		if(search_res)
		{
			return 0;
		}
		else
		{
			String sql="insert into student values (?,?,?)";
			return jdbcTemplate.update(sql,st.getId(),st.getName(),st.getAge());
		}
	}
	
	public int updateRecord(Student st) {
		String sql="update student set name=?,age=? where id=?";
		return jdbcTemplate.update(sql,st.getName(),st.getAge(),st.getId());
	}

	
	public List<Student> getDetailsByCriteria(String col_name,String condition){
		String sql="select * from student where "+col_name+" "+condition;
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Student>>(){

			@Override
			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Student> l=new ArrayList<Student>();
				while(rs.next()) {
					Student s=new Student();
					s.setId(rs.getInt(1));
					s.setName(rs.getString(2));
					s.setAge(rs.getInt(3));
					l.add(s);
				}
				return l;
				
			}
			
		});
		
		
	}
}
