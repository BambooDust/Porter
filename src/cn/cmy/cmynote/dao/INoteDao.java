package cn.cmy.cmynote.dao;

import java.util.List;

import cn.cmy.cmynote.entity.Note;

public interface INoteDao {

	/**
	 * �����ռ�
	 * @param note
	 */
	long savNote(Note note);
	
	/**
	 * ��ѯ�����ռ�
	 * @return
	 */
	List<Note> queryAllNote(String[] columns, String whereClause, String[] whereArgs);
	
	/**
	 * ��ѯָ���ռ�
	 * @return
	 */
	List<Note> queryAllNoteByKey(String key);
	
	/**
	 * �޸ļ���
	 * @param note
	 * @return
	 */
	long updateNote(Note note);
	
	/**
	 * ɾ������
	 * @param id
	 * @return
	 */
	long deleteNote(long id);
}
