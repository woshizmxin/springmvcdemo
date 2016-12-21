package com.marsthink.dao;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class MyBatisUtil {
    
    //GC����static
    private static SqlSessionFactory factory=null;
    public static SqlSessionFactory getSqlSessionFactory(){
        if(factory==null){
        // ��û��������ļ���
        InputStream config = MyBatisUtil.class.getClassLoader().getResourceAsStream("MyBatisCfg.xml");
        // ����sql�Ự����
        factory = new SqlSessionFactoryBuilder().build(config);
        }
        return factory;
    }
    
    //��ûỰ
    public static SqlSession getSession(){
        return getSqlSessionFactory().openSession(true);
    }
    
    /**
     * ��õ�sql�Ự
     * @param isAutoCommit �Ƿ��Զ��ύ�����Ϊfalse����ҪsqlSession.commit();rollback();
     * @return sql�Ự
     */
    public static SqlSession getSession(boolean isAutoCommit){
        return getSqlSessionFactory().openSession(isAutoCommit);
    }
    
}
