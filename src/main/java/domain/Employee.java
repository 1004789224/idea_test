package domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;
import java.util.Date;
@Getter@Setter@ToString@Alias( "Employee" )
public class Employee {
    private Long id;

    private String name;

    private Long deptId;

    private BigDecimal salay;

    private Date hiredate;

}