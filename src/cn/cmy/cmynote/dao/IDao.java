package cn.cmy.cmynote.dao;

public interface IDao {

	/**
	 * �ص������ӿ�
	 */
	public interface AsyncCallback {

		void onSuccess(Object success);

		void onError(Object error);

	}
	
}
