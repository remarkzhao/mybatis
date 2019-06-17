package com.zhaobo;

import com.zhaobo.Utils.MybatisUtil;
import com.zhaobo.entity.Dept;
import org.apache.ibatis.session.SqlSession;

import java.rmi.server.ExportException;
import java.util.List;

public class Test {
    public static  void  main(String[] args) throws Exception {
        SqlSession session = MybatisUtil.getSession();
        List<Dept> list = session.selectList("" +
                "findAll");
        for(Dept dept : list){
            System.out.println(dept.getDeptno() + " " + dept.getDname() + " " + dept.getLoc());
        }
//        Dept dept = session.selectOne("findById",20);
//        System.out.println(dept.getDeptno()+" " + dept.getDname() + " " + dept.getLoc());
//          Dept dept = new Dept(60,"BiData","BeiJing");
//          session.insert("save",dept);
//          session.commit();
//        session.delete("deleteById",60);
//        session.commit();
//        session.update("update","XiAn");
//        session.commit();



        session.close();
    }
}
