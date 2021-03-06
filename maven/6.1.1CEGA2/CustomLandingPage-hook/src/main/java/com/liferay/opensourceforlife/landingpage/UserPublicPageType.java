/**
 * 
 */

package com.liferay.opensourceforlife.landingpage;

import javax.servlet.http.HttpServletRequest;

import com.liferay.opensourceforlife.util.CustomLandingPageUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Tejas Kanani
 */
public class UserPublicPageType implements LandingPageType
{

	public String getLandingPagePath(final HttpServletRequest request) throws PortalException,
			SystemException
	{
		return CustomLandingPageUtil.getDisplayURL(request, false);
	}

}
