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

package com.liferay.docs.guestbook.service.persistence;

import com.liferay.docs.guestbook.model.GuestBook;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the guest book service. This utility wraps {@link GuestBookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author User
 * @see GuestBookPersistence
 * @see GuestBookPersistenceImpl
 * @generated
 */
public class GuestBookUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(GuestBook guestBook) {
		getPersistence().clearCache(guestBook);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GuestBook> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GuestBook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GuestBook> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static GuestBook update(GuestBook guestBook)
		throws SystemException {
		return getPersistence().update(guestBook);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static GuestBook update(GuestBook guestBook,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(guestBook, serviceContext);
	}

	/**
	* Returns all the guest books where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the guest books where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.guestbook.model.impl.GuestBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of guest books
	* @param end the upper bound of the range of guest books (not inclusive)
	* @return the range of matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the guest books where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.guestbook.model.impl.GuestBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of guest books
	* @param end the upper bound of the range of guest books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first guest book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching guest book
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first guest book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching guest book, or <code>null</code> if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last guest book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching guest book
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last guest book in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching guest book, or <code>null</code> if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the guest books before and after the current guest book in the ordered set where uuid = &#63;.
	*
	* @param guestBookId the primary key of the current guest book
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next guest book
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a guest book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook[] findByUuid_PrevAndNext(
		long guestBookId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_PrevAndNext(guestBookId, uuid, orderByComparator);
	}

	/**
	* Removes all the guest books where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of guest books where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the guest book where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.docs.guestbook.NoSuchGuestBookException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching guest book
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the guest book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching guest book, or <code>null</code> if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the guest book where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching guest book, or <code>null</code> if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the guest book where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the guest book that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of guest books where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the guest books where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the guest books where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.guestbook.model.impl.GuestBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of guest books
	* @param end the upper bound of the range of guest books (not inclusive)
	* @return the range of matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the guest books where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.guestbook.model.impl.GuestBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of guest books
	* @param end the upper bound of the range of guest books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching guest book
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching guest book, or <code>null</code> if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching guest book
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching guest book, or <code>null</code> if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the guest books before and after the current guest book in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param guestBookId the primary key of the current guest book
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next guest book
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a guest book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook[] findByUuid_C_PrevAndNext(
		long guestBookId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(guestBookId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the guest books where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of guest books where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the guest books where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the guest books where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.guestbook.model.impl.GuestBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of guest books
	* @param end the upper bound of the range of guest books (not inclusive)
	* @return the range of matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the guest books where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.guestbook.model.impl.GuestBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of guest books
	* @param end the upper bound of the range of guest books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first guest book in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching guest book
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first guest book in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching guest book, or <code>null</code> if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last guest book in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching guest book
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last guest book in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching guest book, or <code>null</code> if a matching guest book could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the guest books before and after the current guest book in the ordered set where groupId = &#63;.
	*
	* @param guestBookId the primary key of the current guest book
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next guest book
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a guest book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook[] findByGroupId_PrevAndNext(
		long guestBookId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(guestBookId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the guest books where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of guest books where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching guest books
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Caches the guest book in the entity cache if it is enabled.
	*
	* @param guestBook the guest book
	*/
	public static void cacheResult(
		com.liferay.docs.guestbook.model.GuestBook guestBook) {
		getPersistence().cacheResult(guestBook);
	}

	/**
	* Caches the guest books in the entity cache if it is enabled.
	*
	* @param guestBooks the guest books
	*/
	public static void cacheResult(
		java.util.List<com.liferay.docs.guestbook.model.GuestBook> guestBooks) {
		getPersistence().cacheResult(guestBooks);
	}

	/**
	* Creates a new guest book with the primary key. Does not add the guest book to the database.
	*
	* @param guestBookId the primary key for the new guest book
	* @return the new guest book
	*/
	public static com.liferay.docs.guestbook.model.GuestBook create(
		long guestBookId) {
		return getPersistence().create(guestBookId);
	}

	/**
	* Removes the guest book with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param guestBookId the primary key of the guest book
	* @return the guest book that was removed
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a guest book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook remove(
		long guestBookId)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(guestBookId);
	}

	public static com.liferay.docs.guestbook.model.GuestBook updateImpl(
		com.liferay.docs.guestbook.model.GuestBook guestBook)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(guestBook);
	}

	/**
	* Returns the guest book with the primary key or throws a {@link com.liferay.docs.guestbook.NoSuchGuestBookException} if it could not be found.
	*
	* @param guestBookId the primary key of the guest book
	* @return the guest book
	* @throws com.liferay.docs.guestbook.NoSuchGuestBookException if a guest book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook findByPrimaryKey(
		long guestBookId)
		throws com.liferay.docs.guestbook.NoSuchGuestBookException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(guestBookId);
	}

	/**
	* Returns the guest book with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param guestBookId the primary key of the guest book
	* @return the guest book, or <code>null</code> if a guest book with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.guestbook.model.GuestBook fetchByPrimaryKey(
		long guestBookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(guestBookId);
	}

	/**
	* Returns all the guest books.
	*
	* @return the guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the guest books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.guestbook.model.impl.GuestBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of guest books
	* @param end the upper bound of the range of guest books (not inclusive)
	* @return the range of guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the guest books.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.guestbook.model.impl.GuestBookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of guest books
	* @param end the upper bound of the range of guest books (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of guest books
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.guestbook.model.GuestBook> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the guest books from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of guest books.
	*
	* @return the number of guest books
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static GuestBookPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (GuestBookPersistence)PortletBeanLocatorUtil.locate(com.liferay.docs.guestbook.service.ClpSerializer.getServletContextName(),
					GuestBookPersistence.class.getName());

			ReferenceRegistry.registerReference(GuestBookUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(GuestBookPersistence persistence) {
	}

	private static GuestBookPersistence _persistence;
}