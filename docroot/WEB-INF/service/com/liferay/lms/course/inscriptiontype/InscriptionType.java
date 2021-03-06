package com.liferay.lms.course.inscriptiontype;

import java.util.Locale;
import java.util.Set;

import javax.portlet.PortletResponse;

import com.liferay.lms.InscriptionException;
import com.liferay.lms.model.Course;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.ServiceContext;

public interface InscriptionType 
{
	public long getTypeId();
	public String getTitle(Locale locale);
	public String getDescription(Locale locale);
	public String getSpecificContentPage();
	public String setExtraContent(UploadRequest uploadRequest,PortletResponse portletResponse,Course course);
	public String getPortletId();
	public boolean usePortletDefaultRegistration();
	public boolean canEnrollUser(Course course, long userId, boolean checkCompetences, Locale locale,PermissionChecker permissionChecker) throws InscriptionException, PortalException, SystemException;
	public String enrollUser(long courseId, long userId, long teamId, ServiceContext serviceContext) throws PortalException, SystemException;
	public boolean unsubscribeUser(Course course, long userId) throws PortalException, SystemException;
	public boolean canUnsubscribe();
	public Set<Integer> getGroupTypesAvailable();
	public boolean isActive(long companyId);
	public String getAllowedTime(long courseId, long userId, Locale locale);
	public boolean showMessageDenied();
}
