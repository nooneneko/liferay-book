<%@ include file="/html/guestbook/init.jsp"%>

<%
	long guestBookId = (Long) renderRequest.getAttribute("guestBookId");
%>

<aui:nav cssClass="nav-tabs">

	<%
		List<GuestBook> guestbooks = GuestBookLocalServiceUtil.getGuestbooks(scopeGroupId);
			for (GuestBook curGuestbook : guestbooks) {
				String cssClass = StringPool.BLANK;
				if (curGuestbook.getGuestBookId() == guestBookId) {
					cssClass = "active";
				}
	%>

	<portlet:renderURL var="viewPageURL">
		<portlet:param name="mvcPath" value="/html/guestbook/view.jsp" />
		<portlet:param name="guestBookId"
			value="<%=String.valueOf(curGuestbook.getGuestBookId())%>" />
	</portlet:renderURL>

	<aui:nav-item cssClass="<%=cssClass%>" href="<%=viewPageURL%>"
		label="<%=HtmlUtil.escape(curGuestbook.getName())%>">
	</aui:nav-item>

	<%
	
		}
	%>

</aui:nav>

<aui:button-row>

	<portlet:renderURL var="addGuestbookURL">
		<portlet:param name="mvcPath" value="/html/guestbook/edit_guestbook.jsp"/>
	</portlet:renderURL>

	<portlet:renderURL var="addEntryURL">
        <portlet:param name="mvcPath" value="/html/guestbook/edit_entry.jsp" />
        <portlet:param name="guestBookId" value="<%=String.valueOf(guestBookId)%>"/>
	</portlet:renderURL>
	
	<aui:button onClick="<%= addGuestbookURL.toString() %>" value="Add Guestbook"/>
	<aui:button onClick="<%= addEntryURL.toString() %>" value="Add Entry"/>
	
</aui:button-row>

<liferay-ui:search-container total="<%=EntryLocalServiceUtil.getEntriesCount()%>">

	<liferay-ui:search-container-results results="<%=EntryLocalServiceUtil.getEntrys(scopeGroupId, guestBookId, searchContainer.getStart(), searchContainer.getEnd()) %>"/>
	
	<liferay-ui:search-container-row className="com.liferay.docs.guestbook.model.Entry" modelVar="entry">
		<liferay-ui:search-container-column-text property="name"/>
		<liferay-ui:search-container-column-text property="message"/>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator/>
</liferay-ui:search-container>