package com.itheima.mapper;

import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;
import com.itheima.pojo.Emp;

@Mapper
public interface EmpMapper {

    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
    "values (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    public void insert(Emp emp);

    // 变成动态更新
//    @Update("update emp set username = #{username}, name = #{name}, gender = #{gender}, image = #{image}, job = #{job}, entrydate = #{entrydate}, " +
//            "dept_id = #{deptId}, update_time = #{updateTime} where id = #{id}")
    public void update(Emp emp);


    @Select("select * from emp where id = #{id}")
    public Emp getById(Integer id);

    // 变成动态查询
//    @Select("select * from emp where name like concat('%', #{name}, '%') and gender = #{gender} and entrydate between #{begin} and #{end}" +
//            "order by update_time desc ")
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

    // 变成动态 批量删除
    public void deleteByIds(List<Integer> ids);
}
