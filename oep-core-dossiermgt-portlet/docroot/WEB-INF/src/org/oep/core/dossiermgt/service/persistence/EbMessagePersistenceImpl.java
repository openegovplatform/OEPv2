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

package org.oep.core.dossiermgt.service.persistence;

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

import org.oep.core.dossiermgt.NoSuchEbMessageException;
import org.oep.core.dossiermgt.model.EbMessage;
import org.oep.core.dossiermgt.model.impl.EbMessageImpl;
import org.oep.core.dossiermgt.model.impl.EbMessageModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the eb message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author trungdk
 * @see EbMessagePersistence
 * @see EbMessageUtil
 * @generated
 */
public class EbMessagePersistenceImpl extends BasePersistenceImpl<EbMessage>
	implements EbMessagePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EbMessageUtil} to access the eb message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EbMessageImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EbMessageModelImpl.ENTITY_CACHE_ENABLED,
			EbMessageModelImpl.FINDER_CACHE_ENABLED, EbMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EbMessageModelImpl.ENTITY_CACHE_ENABLED,
			EbMessageModelImpl.FINDER_CACHE_ENABLED, EbMessageImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EbMessageModelImpl.ENTITY_CACHE_ENABLED,
			EbMessageModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EbMessagePersistenceImpl() {
		setModelClass(EbMessage.class);
	}

	/**
	 * Caches the eb message in the entity cache if it is enabled.
	 *
	 * @param ebMessage the eb message
	 */
	@Override
	public void cacheResult(EbMessage ebMessage) {
		EntityCacheUtil.putResult(EbMessageModelImpl.ENTITY_CACHE_ENABLED,
			EbMessageImpl.class, ebMessage.getPrimaryKey(), ebMessage);

		ebMessage.resetOriginalValues();
	}

	/**
	 * Caches the eb messages in the entity cache if it is enabled.
	 *
	 * @param ebMessages the eb messages
	 */
	@Override
	public void cacheResult(List<EbMessage> ebMessages) {
		for (EbMessage ebMessage : ebMessages) {
			if (EntityCacheUtil.getResult(
						EbMessageModelImpl.ENTITY_CACHE_ENABLED,
						EbMessageImpl.class, ebMessage.getPrimaryKey()) == null) {
				cacheResult(ebMessage);
			}
			else {
				ebMessage.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all eb messages.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EbMessageImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EbMessageImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the eb message.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EbMessage ebMessage) {
		EntityCacheUtil.removeResult(EbMessageModelImpl.ENTITY_CACHE_ENABLED,
			EbMessageImpl.class, ebMessage.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EbMessage> ebMessages) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EbMessage ebMessage : ebMessages) {
			EntityCacheUtil.removeResult(EbMessageModelImpl.ENTITY_CACHE_ENABLED,
				EbMessageImpl.class, ebMessage.getPrimaryKey());
		}
	}

	/**
	 * Creates a new eb message with the primary key. Does not add the eb message to the database.
	 *
	 * @param ebMessageId the primary key for the new eb message
	 * @return the new eb message
	 */
	@Override
	public EbMessage create(long ebMessageId) {
		EbMessage ebMessage = new EbMessageImpl();

		ebMessage.setNew(true);
		ebMessage.setPrimaryKey(ebMessageId);

		return ebMessage;
	}

	/**
	 * Removes the eb message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ebMessageId the primary key of the eb message
	 * @return the eb message that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchEbMessageException if a eb message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbMessage remove(long ebMessageId)
		throws NoSuchEbMessageException, SystemException {
		return remove((Serializable)ebMessageId);
	}

	/**
	 * Removes the eb message with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the eb message
	 * @return the eb message that was removed
	 * @throws org.oep.core.dossiermgt.NoSuchEbMessageException if a eb message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbMessage remove(Serializable primaryKey)
		throws NoSuchEbMessageException, SystemException {
		Session session = null;

		try {
			session = openSession();

			EbMessage ebMessage = (EbMessage)session.get(EbMessageImpl.class,
					primaryKey);

			if (ebMessage == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEbMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ebMessage);
		}
		catch (NoSuchEbMessageException nsee) {
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
	protected EbMessage removeImpl(EbMessage ebMessage)
		throws SystemException {
		ebMessage = toUnwrappedModel(ebMessage);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ebMessage)) {
				ebMessage = (EbMessage)session.get(EbMessageImpl.class,
						ebMessage.getPrimaryKeyObj());
			}

			if (ebMessage != null) {
				session.delete(ebMessage);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ebMessage != null) {
			clearCache(ebMessage);
		}

		return ebMessage;
	}

	@Override
	public EbMessage updateImpl(
		org.oep.core.dossiermgt.model.EbMessage ebMessage)
		throws SystemException {
		ebMessage = toUnwrappedModel(ebMessage);

		boolean isNew = ebMessage.isNew();

		Session session = null;

		try {
			session = openSession();

			if (ebMessage.isNew()) {
				session.save(ebMessage);

				ebMessage.setNew(false);
			}
			else {
				session.merge(ebMessage);
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

		EntityCacheUtil.putResult(EbMessageModelImpl.ENTITY_CACHE_ENABLED,
			EbMessageImpl.class, ebMessage.getPrimaryKey(), ebMessage);

		return ebMessage;
	}

	protected EbMessage toUnwrappedModel(EbMessage ebMessage) {
		if (ebMessage instanceof EbMessageImpl) {
			return ebMessage;
		}

		EbMessageImpl ebMessageImpl = new EbMessageImpl();

		ebMessageImpl.setNew(ebMessage.isNew());
		ebMessageImpl.setPrimaryKey(ebMessage.getPrimaryKey());

		ebMessageImpl.setEbMessageId(ebMessage.getEbMessageId());
		ebMessageImpl.setCompanyId(ebMessage.getCompanyId());
		ebMessageImpl.setUserId(ebMessage.getUserId());
		ebMessageImpl.setGroupId(ebMessage.getGroupId());
		ebMessageImpl.setCreateDate(ebMessage.getCreateDate());
		ebMessageImpl.setMessageId(ebMessage.getMessageId());
		ebMessageImpl.setCpaId(ebMessage.getCpaId());
		ebMessageImpl.setService(ebMessage.getService());
		ebMessageImpl.setAction(ebMessage.getAction());
		ebMessageImpl.setConversationId(ebMessage.getConversationId());
		ebMessageImpl.setFromPartyId(ebMessage.getFromPartyId());
		ebMessageImpl.setFromPartyType(ebMessage.getFromPartyType());
		ebMessageImpl.setToPartyId(ebMessage.getToPartyId());
		ebMessageImpl.setToPartyType(ebMessage.getToPartyType());
		ebMessageImpl.setRefToMessageId(ebMessage.getRefToMessageId());
		ebMessageImpl.setStatus(ebMessage.getStatus());
		ebMessageImpl.setStatusDescription(ebMessage.getStatusDescription());
		ebMessageImpl.setAckMessageId(ebMessage.getAckMessageId());
		ebMessageImpl.setAckStatus(ebMessage.getAckStatus());
		ebMessageImpl.setAckStatusDescription(ebMessage.getAckStatusDescription());
		ebMessageImpl.setMessageDescription(ebMessage.getMessageDescription());
		ebMessageImpl.setInbound(ebMessage.getInbound());

		return ebMessageImpl;
	}

	/**
	 * Returns the eb message with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the eb message
	 * @return the eb message
	 * @throws org.oep.core.dossiermgt.NoSuchEbMessageException if a eb message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbMessage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEbMessageException, SystemException {
		EbMessage ebMessage = fetchByPrimaryKey(primaryKey);

		if (ebMessage == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEbMessageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ebMessage;
	}

	/**
	 * Returns the eb message with the primary key or throws a {@link org.oep.core.dossiermgt.NoSuchEbMessageException} if it could not be found.
	 *
	 * @param ebMessageId the primary key of the eb message
	 * @return the eb message
	 * @throws org.oep.core.dossiermgt.NoSuchEbMessageException if a eb message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbMessage findByPrimaryKey(long ebMessageId)
		throws NoSuchEbMessageException, SystemException {
		return findByPrimaryKey((Serializable)ebMessageId);
	}

	/**
	 * Returns the eb message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the eb message
	 * @return the eb message, or <code>null</code> if a eb message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbMessage fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		EbMessage ebMessage = (EbMessage)EntityCacheUtil.getResult(EbMessageModelImpl.ENTITY_CACHE_ENABLED,
				EbMessageImpl.class, primaryKey);

		if (ebMessage == _nullEbMessage) {
			return null;
		}

		if (ebMessage == null) {
			Session session = null;

			try {
				session = openSession();

				ebMessage = (EbMessage)session.get(EbMessageImpl.class,
						primaryKey);

				if (ebMessage != null) {
					cacheResult(ebMessage);
				}
				else {
					EntityCacheUtil.putResult(EbMessageModelImpl.ENTITY_CACHE_ENABLED,
						EbMessageImpl.class, primaryKey, _nullEbMessage);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EbMessageModelImpl.ENTITY_CACHE_ENABLED,
					EbMessageImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ebMessage;
	}

	/**
	 * Returns the eb message with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ebMessageId the primary key of the eb message
	 * @return the eb message, or <code>null</code> if a eb message with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public EbMessage fetchByPrimaryKey(long ebMessageId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)ebMessageId);
	}

	/**
	 * Returns all the eb messages.
	 *
	 * @return the eb messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EbMessage> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the eb messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.EbMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eb messages
	 * @param end the upper bound of the range of eb messages (not inclusive)
	 * @return the range of eb messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EbMessage> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the eb messages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.dossiermgt.model.impl.EbMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eb messages
	 * @param end the upper bound of the range of eb messages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of eb messages
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<EbMessage> findAll(int start, int end,
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

		List<EbMessage> list = (List<EbMessage>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EBMESSAGE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EBMESSAGE;

				if (pagination) {
					sql = sql.concat(EbMessageModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EbMessage>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<EbMessage>(list);
				}
				else {
					list = (List<EbMessage>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the eb messages from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (EbMessage ebMessage : findAll()) {
			remove(ebMessage);
		}
	}

	/**
	 * Returns the number of eb messages.
	 *
	 * @return the number of eb messages
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

				Query q = session.createQuery(_SQL_COUNT_EBMESSAGE);

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
	 * Initializes the eb message persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.dossiermgt.model.EbMessage")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<EbMessage>> listenersList = new ArrayList<ModelListener<EbMessage>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<EbMessage>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EbMessageImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EBMESSAGE = "SELECT ebMessage FROM EbMessage ebMessage";
	private static final String _SQL_COUNT_EBMESSAGE = "SELECT COUNT(ebMessage) FROM EbMessage ebMessage";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ebMessage.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EbMessage exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EbMessagePersistenceImpl.class);
	private static EbMessage _nullEbMessage = new EbMessageImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EbMessage> toCacheModel() {
				return _nullEbMessageCacheModel;
			}
		};

	private static CacheModel<EbMessage> _nullEbMessageCacheModel = new CacheModel<EbMessage>() {
			@Override
			public EbMessage toEntityModel() {
				return _nullEbMessage;
			}
		};
}