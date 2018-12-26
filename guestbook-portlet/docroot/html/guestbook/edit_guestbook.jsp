<%@include file = "/html/guestbook/init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/guestbook/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addGuestBook" var="addGuestbookURL"></portlet:actionURL>

<aui:form action="<%= addGuestbookURL %>" name="<portlet:namespace />fm">

        <aui:fieldset>

            <aui:input name="name" />

        </aui:fieldset>

        <aui:button-row>

            <aui:button type="submit"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>

        </aui:button-row>
</aui:form>