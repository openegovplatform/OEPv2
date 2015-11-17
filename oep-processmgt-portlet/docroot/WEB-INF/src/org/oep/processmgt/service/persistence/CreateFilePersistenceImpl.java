/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.oep.processmgt.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.processmgt.NoSuchCreateFileException;
import org.oep.processmgt.model.CreateFile;
import org.oep.processmgt.model.impl.CreateFileImpl;
import org.oep.processmgt.model.impl.CreateFileModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the create file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see CreateFilePersistence
 * @see CreateFileUtil
 * @generated
 */
public class CreateFilePersistenceImpl extends BasePersistenceImpl<CreateFile>
	implements CreateFilePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CreateFileUtil} to access the create file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CreateFileImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CreateFileModelImpl.ENTITY_CACHE_ENABLED,
			CreateFileModelImpl.FINDER_CACHE_ENABLED, CreateFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CreateFileModelImpl.ENTITY_CACHE_ENABLED,
			CreateFileModelImpl.FINDER_CACHE_ENABLED, CreateFileImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CreateFileModelImpl.ENTITY_CACHE_ENABLED,
			CreateFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CreateFilePersistenceImpl() {
		setModelClass(CreateFile.class);
	}

	/**
	 * Caches the create file in the entity cache if it is enabled.
	 *
	 * @param createFile the create file
	 */
	@Override
	public void cacheResult(CreateFile createFile) {
		EntityCacheUtil.putResult(CreateFileModelImpl.ENTITY_CACHE_ENABLED,
			CreateFileImpl.class, createFile.getPrimaryKey(), createFile);

		createFile.resetOriginalValues();
	}

	/**
	 * Caches the create files in the entity cache if it is enabled.
	 *
	 * @param createFiles the create files
	 */
	@Override
	public void cacheResult(List<CreateFile> createFiles) {
		for (CreateFile createFile : createFiles) {
			if (EntityCacheUtil.getResult(
						CreateFileModelImpl.ENTITY_CACHE_ENABLED,
						CreateFileImpl.class, createFile.getPrimaryKey()) == null) {
				cacheResult(createFile);
			}
			else {
				createFile.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all create files.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CreateFileImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CreateFileImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the create file.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CreateFile createFile) {
		EntityCacheUtil.removeResult(CreateFileModelImpl.ENTITY_CACHE_ENABLED,
			CreateFileImpl.class, createFile.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CreateFile> createFiles) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CreateFile createFile : createFiles) {
			EntityCacheUtil.removeResult(CreateFileModelImpl.ENTITY_CACHE_ENABLED,
				CreateFileImpl.class, createFile.getPrimaryKey());
		}
	}

	/**
	 * Creates a new create file with the primary key. Does not add the create file to the database.
	 *
	 * @param createFileId the primary key for the new create file
	 * @return the new create file
	 */
	@Override
	public CreateFile create(long createFileId) {
		CreateFile createFile = new CreateFileImpl();

		createFile.setNew(true);
		createFile.setPrimaryKey(createFileId);

		return createFile;
	}

	/**
	 * Removes the create file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param createFileId the primary key of the create file
	 * @return the create file that was removed
	 * @throws org.oep.processmgt.NoSuchCreateFileException if a create file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CreateFile remove(long createFileId)
		throws NoSuchCreateFileException, SystemException {
		return remove((Serializable)createFileId);
	}

	/**
	 * Removes the create file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the create file
	 * @return the create file that was removed
	 * @throws org.oep.processmgt.NoSuchCreateFileException if a create file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CreateFile remove(Serializable primaryKey)
		throws NoSuchCreateFileException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CreateFile createFile = (CreateFile)session.get(CreateFileImpl.class,
					primaryKey);

			if (createFile == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreateFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(createFile);
		}
		catch (NoSuchCreateFileException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CreateFile removeImpl(CreateFile createFile)
		throws SystemException {
		createFile = toUnwrappedModel(createFile);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(createFile)) {
				createFile = (CreateFile)session.get(CreateFileImpl.class,
						createFile.getPrimaryKeyObj());
			}

			if (createFile != null) {
				session.delete(createFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (createFile != null) {
			clearCache(createFile);
		}

		return createFile;
	}

	@Override
	public CreateFile updateImpl(org.oep.processmgt.model.CreateFile createFile)
		throws SystemException {
		createFile = toUnwrappedModel(createFile);

		boolean isNew = createFile.isNew();

		Session session = null;

		try {
			session = openSession();

			if (createFile.isNew()) {
				session.save(createFile);

				createFile.setNew(false);
			}
			else {
				session.merge(createFile);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CreateFileModelImpl.ENTITY_CACHE_ENABLED,
			CreateFileImpl.class, createFile.getPrimaryKey(), createFile);

		return createFile;
	}

	protected CreateFile toUnwrappedModel(CreateFile createFile) {
		if (createFile instanceof CreateFileImpl) {
			return createFile;
		}

		CreateFileImpl createFileImpl = new CreateFileImpl();

		createFileImpl.setNew(createFile.isNew());
		createFileImpl.setPrimaryKey(createFile.getPrimaryKey());

		createFileImpl.setCreateFileId(createFile.getCreateFileId());
		createFileImpl.setUserId(createFile.getUserId());
		createFileImpl.setGroupId(createFile.getGroupId());
		createFileImpl.setCompanyId(createFile.getCompanyId());
		createFileImpl.setCreateDate(createFile.getCreateDate());
		createFileImpl.setProcessOrderId(createFile.getProcessOrderId());
		createFileImpl.setDossierStepId(createFile.getDossierStepId());
		createFileImpl.setStepDate(createFile.getStepDate());
		createFileImpl.setDocFileId(createFile.getDocFileId());

		return createFileImpl;
	}

	/**
	 * Returns the create file with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the create file
	 * @return the create file
	 * @throws org.oep.processmgt.NoSuchCreateFileException if a create file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CreateFile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCreateFileException, SystemException {
		CreateFile createFile = fetchByPrimaryKey(primaryKey);

		if (createFile == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreateFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return createFile;
	}

	/**
	 * Returns the create file with the primary key or throws a {@link org.oep.processmgt.NoSuchCreateFileException} if it could not be found.
	 *
	 * @param createFileId the primary key of the create file
	 * @return the create file
	 * @throws org.oep.processmgt.NoSuchCreateFileException if a create file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CreateFile findByPrimaryKey(long createFileId)
		throws NoSuchCreateFileException, SystemException {
		return findByPrimaryKey((Serializable)createFileId);
	}

	/**
	 * Returns the create file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the create file
	 * @return the create file, or <code>null</code> if a create file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CreateFile fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CreateFile createFile = (CreateFile)EntityCacheUtil.getResult(CreateFileModelImpl.ENTITY_CACHE_ENABLED,
				CreateFileImpl.class, primaryKey);

		if (createFile == _nullCreateFile) {
			return null;
		}

		if (createFile == null) {
			Session session = null;

			try {
				session = openSession();

				createFile = (CreateFile)session.get(CreateFileImpl.class,
						primaryKey);

				if (createFile != null) {
					cacheResult(createFile);
				}
				else {
					EntityCacheUtil.putResult(CreateFileModelImpl.ENTITY_CACHE_ENABLED,
						CreateFileImpl.class, primaryKey, _nullCreateFile);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CreateFileModelImpl.ENTITY_CACHE_ENABLED,
					CreateFileImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return createFile;
	}

	/**
	 * Returns the create file with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param createFileId the primary key of the create file
	 * @return the create file, or <code>null</code> if a create file with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CreateFile fetchByPrimaryKey(long createFileId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)createFileId);
	}

	/**
	 * Returns all the create files.
	 *
	 * @return the create files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CreateFile> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the create files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.CreateFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of create files
	 * @param end the upper bound of the range of create files (not inclusive)
	 * @return the range of create files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CreateFile> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the create files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.processmgt.model.impl.CreateFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of create files
	 * @param end the upper bound of the range of create files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of create files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CreateFile> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CreateFile> list = (List<CreateFile>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CREATEFILE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CREATEFILE;

				if (pagination) {
					sql = sql.concat(CreateFileModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CreateFile>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CreateFile>(list);
				}
				else {
					list = (List<CreateFile>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the create files from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CreateFile createFile : findAll()) {
			remove(createFile);
		}
	}

	/**
	 * Returns the number of create files.
	 *
	 * @return the number of create files
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CREATEFILE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the create file persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.processmgt.model.CreateFile")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CreateFile>> listenersList = new ArrayList<ModelListener<CreateFile>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CreateFile>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CreateFileImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CREATEFILE = "SELECT createFile FROM CreateFile createFile";
	private static final String _SQL_COUNT_CREATEFILE = "SELECT COUNT(createFile) FROM CreateFile createFile";
	private static final String _ORDER_BY_ENTITY_ALIAS = "createFile.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CreateFile exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CreateFilePersistenceImpl.class);
	private static CreateFile _nullCreateFile = new CreateFileImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CreateFile> toCacheModel() {
				return _nullCreateFileCacheModel;
			}
		};

	private static CacheModel<CreateFile> _nullCreateFileCacheModel = new CacheModel<CreateFile>() {
			@Override
			public CreateFile toEntityModel() {
				return _nullCreateFile;
			}
		};
}