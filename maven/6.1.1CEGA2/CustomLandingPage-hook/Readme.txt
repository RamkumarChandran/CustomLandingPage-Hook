Custom Landing Page Hook
------------------------

It's a Custom Landing Page Hook developed in Liferay 6.1.1 GA2. It will allow you to choose on which page user will land on after login.
Right now it's having below options for landing page.

##
## Set this property as per your needs for landing page after user log in. It could be from one of
## the value from below options
## 1. userPrivatePage
## 2. userPublicPage
## 3. sitePublicPage
## 4. sitePrivatePage
## 5. organizationPublicPage
## 6. organizationPrivatePage
##
custom.landing.page.type={userPrivatePage/userPublicPage/sitePublicPage/sitePrivatePage/organizationPublicPage/organizationPrivatePage} 

This propery need to be set in portal.properties located in Custom Landing Page hook itself. Either you can modify it directly in war. Or you can download the source code from Git repositry and you can build war from source with your desired changes.

Custonm Landing Page Hook - Git Source
---------------------------------------
https://github.com/OS4L/CustomLandingPage-Hook

Both Ant & Maven based source code is available in Git.

Packaged War can be download from either

- 
https://raw.github.com/OS4L/CustomLandingPage-Hook/master/maven/6.1.1CEGA2/CustomLandingPage-hook/Package/CustomLandingPage-hook-6.1.1.1.war?raw=true



Have a happy Custom Landing !!! :)