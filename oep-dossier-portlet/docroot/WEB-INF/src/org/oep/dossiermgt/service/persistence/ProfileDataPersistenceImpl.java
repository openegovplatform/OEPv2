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

package org.oep.dossiermgt.service.persistence;

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

import org.oep.dossiermgt.NoSuchProfileDataException;
import org.oep.dossiermgt.model.ProfileData;
import org.oep.dossiermgt.model.impl.ProfileDataImpl;
import org.oep.dossiermgt.model.impl.ProfileDataModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the profile data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see ProfileDataPersistence
 * @see ProfileDataUtil
 * @generated
 */
public class ProfileDataPersistenceImpl extends BasePersistenceImpl<ProfileData>
	implements ProfileDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ProfileDataUtil} to access the profile data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ProfileDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ProfileDataModelImpl.ENTITY_CACHE_ENABLED,
			ProfileDataModelImpl.FINDER_CACHE_ENABLED, ProfileDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ProfileDataModelImpl.ENTITY_CACHE_ENABLED,
			ProfileDataModelImpl.FINDER_CACHE_ENABLED, ProfileDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ProfileDataModelImpl.ENTITY_CACHE_ENABLED,
			ProfileDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ProfileDataPersistenceImpl() {
		setModelClass(ProfileData.class);
	}

	/**
	 * Caches the profile data in the entity cache if it is enabled.
	 *
	 * @param profileData the profile data
	 */
	@Override
	public void cacheResult(ProfileData profileData) {
		EntityCacheUtil.putResult(ProfileDataModelImpl.ENTITY_CACHE_ENABLED,
			ProfileDataImpl.class, profileData.getPrimaryKey(), profileData);

		profileData.resetOriginalValues();
	}

	/**
	 * Caches the profile datas in the entity cache if it is enabled.
	 *
	 * @param profileDatas the profile datas
	 */
	@Override
	public void cacheResult(List<ProfileData> profileDatas) {
		for (ProfileData profileData : profileDatas) {
			if (EntityCacheUtil.getResult(
						ProfileDataModelImpl.ENTITY_CACHE_ENABLED,
						ProfileDataImpl.class, profileData.getPrimaryKey()) == null) {
				cacheResult(profileData);
			}
			else {
				profileData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all profile datas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ProfileDataImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ProfileDataImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the profile data.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProfileData profileData) {
		EntityCacheUtil.removeResult(ProfileDataModelImpl.ENTITY_CACHE_ENABLED,
			ProfileDataImpl.class, profileData.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ProfileData> profileDatas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ProfileData profileData : profileDatas) {
			EntityCacheUtil.removeResult(ProfileDataModelImpl.ENTITY_CACHE_ENABLED,
				ProfileDataImpl.class, profileData.getPrimaryKey());
		}
	}

	/**
	 * Creates a new profile data with the primary key. Does not add the profile data to the database.
	 *
	 * @param profileDataId the primary key for the new profile data
	 * @return the new profile data
	 */
	@Override
	public ProfileData create(long profileDataId) {
		ProfileData profileData = new ProfileDataImpl();

		profileData.setNew(true);
		profileData.setPrimaryKey(profileDataId);

		return profileData;
	}

	/**
	 * Removes the profile data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param profileDataId the primary key of the profile data
	 * @return the profile data that was removed
	 * @throws org.oep.dossiermgt.NoSuchProfileDataException if a profile data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProfileData remove(long profileDataId)
		throws NoSuchProfileDataException, SystemException {
		return remove((Serializable)profileDataId);
	}

	/**
	 * Removes the profile data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the profile data
	 * @return the profile data that was removed
	 * @throws org.oep.dossiermgt.NoSuchProfileDataException if a profile data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProfileData remove(Serializable primaryKey)
		throws NoSuchProfileDataException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ProfileData profileData = (ProfileData)session.get(ProfileDataImpl.class,
					primaryKey);

			if (profileData == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProfileDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(profileData);
		}
		catch (NoSuchProfileDataException nsee) {
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
	protected ProfileData removeImpl(ProfileData profileData)
		throws SystemException {
		profileData = toUnwrappedModel(profileData);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(profileData)) {
				profileData = (ProfileData)session.get(ProfileDataImpl.class,
						profileData.getPrimaryKeyObj());
			}

			if (profileData != null) {
				session.delete(profileData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (profileData != null) {
			clearCache(profileData);
		}

		return profileData;
	}

	@Override
	public ProfileData updateImpl(
		org.oep.dossiermgt.model.ProfileData profileData)
		throws SystemException {
		profileData = toUnwrappedModel(profileData);

		boolean isNew = profileData.isNew();

		Session session = null;

		try {
			session = openSession();

			if (profileData.isNew()) {
				session.save(profileData);

				profileData.setNew(false);
			}
			else {
				session.merge(profileData);
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

		EntityCacheUtil.putResult(ProfileDataModelImpl.ENTITY_CACHE_ENABLED,
			ProfileDataImpl.class, profileData.getPrimaryKey(), profileData);

		return profileData;
	}

	protected ProfileData toUnwrappedModel(ProfileData profileData) {
		if (profileData instanceof ProfileDataImpl) {
			return profileData;
		}

		ProfileDataImpl profileDataImpl = new ProfileDataImpl();

		profileDataImpl.setNew(profileData.isNew());
		profileDataImpl.setPrimaryKey(profileData.getPrimaryKey());

		profileDataImpl.setProfileDataId(profileData.getProfileDataId());
		profileDataImpl.setUserId(profileData.getUserId());
		profileDataImpl.setGroupId(profileData.getGroupId());
		profileDataImpl.setCompanyId(profileData.getCompanyId());
		profileDataImpl.setCreateDate(profileData.getCreateDate());
		profileDataImpl.setModifiedDate(profileData.getModifiedDate());
		profileDataImpl.setFieldName(profileData.getFieldName());
		profileDataImpl.setFieldValue(profileData.getFieldValue());

		return profileDataImpl;
	}

	/**
	 * Returns the profile data with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the profile data
	 * @return the profile data
	 * @throws org.oep.dossiermgt.NoSuchProfileDataException if a profile data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProfileData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProfileDataException, SystemException {
		ProfileData profileData = fetchByPrimaryKey(primaryKey);

		if (profileData == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProfileDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return profileData;
	}

	/**
	 * Returns the profile data with the primary key or throws a {@link org.oep.dossiermgt.NoSuchProfileDataException} if it could not be found.
	 *
	 * @param profileDataId the primary key of the profile data
	 * @return the profile data
	 * @throws org.oep.dossiermgt.NoSuchProfileDataException if a profile data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProfileData findByPrimaryKey(long profileDataId)
		throws NoSuchProfileDataException, SystemException {
		return findByPrimaryKey((Serializable)profileDataId);
	}

	/**
	 * Returns the profile data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the profile data
	 * @return the profile data, or <code>null</code> if a profile data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProfileData fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ProfileData profileData = (ProfileData)EntityCacheUtil.getResult(ProfileDataModelImpl.ENTITY_CACHE_ENABLED,
				ProfileDataImpl.class, primaryKey);

		if (profileData == _nullProfileData) {
			return null;
		}

		if (profileData == null) {
			Session session = null;

			try {
				session = openSession();

				profileData = (ProfileData)session.get(ProfileDataImpl.class,
						primaryKey);

				if (profileData != null) {
					cacheResult(profileData);
				}
				else {
					EntityCacheUtil.putResult(ProfileDataModelImpl.ENTITY_CACHE_ENABLED,
						ProfileDataImpl.class, primaryKey, _nullProfileData);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ProfileDataModelImpl.ENTITY_CACHE_ENABLED,
					ProfileDataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return profileData;
	}

	/**
	 * Returns the profile data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param profileDataId the primary key of the profile data
	 * @return the profile data, or <code>null</code> if a profile data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ProfileData fetchByPrimaryKey(long profileDataId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)profileDataId);
	}

	/**
	 * Returns all the profile datas.
	 *
	 * @return the profile datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProfileData> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the profile datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.ProfileDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of profile datas
	 * @param end the upper bound of the range of profile datas (not inclusive)
	 * @return the range of profile datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProfileData> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the profile datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.dossiermgt.model.impl.ProfileDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of profile datas
	 * @param end the upper bound of the range of profile datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of profile datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ProfileData> findAll(int start, int end,
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

		List<ProfileData> list = (List<ProfileData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PROFILEDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PROFILEDATA;

				if (pagination) {
					sql = sql.concat(ProfileDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ProfileData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ProfileData>(list);
				}
				else {
					list = (List<ProfileData>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the profile datas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ProfileData profileData : findAll()) {
			remove(profileData);
		}
	}

	/**
	 * Returns the number of profile datas.
	 *
	 * @return the number of profile datas
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

				Query q = session.createQuery(_SQL_COUNT_PROFILEDATA);

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
	 * Initializes the profile data persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.dossiermgt.model.ProfileData")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ProfileData>> listenersList = new ArrayList<ModelListener<ProfileData>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ProfileData>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ProfileDataImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PROFILEDATA = "SELECT profileData FROM ProfileData profileData";
	private static final String _SQL_COUNT_PROFILEDATA = "SELECT COUNT(profileData) FROM ProfileData profileData";
	private static final String _ORDER_BY_ENTITY_ALIAS = "profileData.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ProfileData exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ProfileDataPersistenceImpl.class);
	private static ProfileData _nullProfileData = new ProfileDataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ProfileData> toCacheModel() {
				return _nullProfileDataCacheModel;
			}
		};

	private static CacheModel<ProfileData> _nullProfileDataCacheModel = new CacheModel<ProfileData>() {
			@Override
			public ProfileData toEntityModel() {
				return _nullProfileData;
			}
		};
}