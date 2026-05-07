package in.springprogramming.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.springprogramming.resources.SpringConfigFile;


public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		NamedParameterJdbcTemplate npJdbcTemplate=(NamedParameterJdbcTemplate) context.getBean(NamedParameterJdbcTemplate.class);
		
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("key_rollno", 104);
		map.put("key_name", "Deepak");
		map.put("key_marks", 89.6f);
		String query="INSERT INTO student VALUES(:key_rollno,  :key_name,  :key_marks)";
		int count=npJdbcTemplate.update(query,map);
		if(count>0) {
      	  System.out.println("Insertion Success");
        }else {
      	  System.out.println("Insertion Failed");
    }
    }
}
