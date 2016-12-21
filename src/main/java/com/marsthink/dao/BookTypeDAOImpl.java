package com.marsthink.dao;

import java.util.List;

import com.marsthink.bean.BookType;
import org.apache.ibatis.session.SqlSession;


/**
 * ʵ��ͼ���������ݷ���
 *
 */
public class BookTypeDAOImpl implements BookTypeDAO {

    @Override
    public List<BookType> getAllBookTypes() {
        //��ûỰ����
        SqlSession session=MyBatisUtil.getSession();
        try {
            //ͨ��MyBatisʵ�ֽӿ�BookTypeDAO������ʵ��
            BookTypeDAO bookTypeDAO=session.getMapper(BookTypeDAO.class);
            return bookTypeDAO.getAllBookTypes();
        } finally {
            session.close();
        }
    }

}
