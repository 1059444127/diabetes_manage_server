package com.zpy.yy.base;

/**
 *
 * ����mapper�ӿ�
 *
 */
public interface BaseMapper<T> {

    /**
     * ����
     *
     * @param t
     */
    public void save(T t);

    /**
     * ɾ��
     *
     * @param id
     */
    public void deleteById(Integer id);

    /**
     * ����
     *
     * @param id
     * @return
     */
    public T findById(Integer id);

    /**
     * �޸�
     *
     * @param t
     */
    public void update(T t);

}
