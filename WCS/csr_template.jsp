	<%@ include file="../../include/JSTLEnvironmentSetup.jspf"%>
	<%@ include file="../../include/ErrorMessageSetup.jspf"%>
	<%@ taglib uri="http://commerce.ibm.com/foundation" prefix="wcf"%>
<!-- OrderSearch_Main.jsp Start -->
<script>
$(function() {
    $("#search").click(CSRToolsJS.loadOrderSearchResult);
});

$('#CSRModule').css('height', '275px');
</script>

<%--UI specific script--%>

<div>
    <section id="mainSection">
        <ul class='bCrumb'>
            <li>
                <div class="home"></div>
            </li>
            <li><i class="fa fa-angle-right"></i>
            </li>
            <!-- Widget Heading goes here -->
            <li id='bcFSection'>
                <c:out value="${param.module}" />
            </li>
            <!-- Widget Heading ends here -->
        </ul>
        <div class="mainContainer">
            <!-- Widget control starts here -->
            <div class='orderSearch'>
                <span class='mbrsCls'>
                    <!--			<c:out value="${param.module}" />-->
                    <c:if test="${not empty param.headerCaption and param.headerCaption ne 'undefined'}">
                        <div class="headerCaption">${param.headerCaption}</div>
                    </c:if>
                </span>
                <!--  This div is used to display inline error messages for empty fields -->
                <div id="searchBox"></div>
                <br/>
                <div>
                    <div class='mcDiv'>
                        <div class='srchTble'>
                            <!-- Input field -->
                            <div class="col-large">
                                <label for="order-id">
                                    <fmt:message key="ORDERSEARCH_ORDERID" bundle="${storeText}" />
                                </label>
                                <input autocomplete="off" type="text" id="first-name" name="orderId" class="srchTblTxtBox" autocomplete="off" group="orderId">
                            </div>
                            <!-- divider -->
                            <div class="col-med or marLeft45">
                                <span>
                                    <fmt:message key="ORDERSEARCH_OR" bundle="${storeText}" />
                                </span>
                            </div>
                            <!-- button -->
                            <div class="col-large">
                                <div class="blue-btn" onclick="javascript:CSRToolsJS.editOrder('${order.orderIdentifier.uniqueID}',true,'PlaceOrder','${orderIdent.logonId}');return false;" href="#">
                                    <span class="clickable">
                                        <fmt:message key="ORDERSEARCH_EDIT" bundle="${storeText}" />
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div id="ordersearchResult"></div>
                        <%--<table id="orderSearchGrid" class="orderSearchGrid"></table>--%></div>
                </div>
            </div>
            <!-- Widget Control Ends Here -->
    </section>
    </div>
    <div id="loader" style="display:none">
        <%-- <img src="${jspStoreImgDir}/loading.gif" />--%></div>
    <input autocomplete="off" type="hidden" name="actionType" value="FIND_ORDER" />
    <input autocomplete="off" type="hidden" name="URL" value="OrderSearch" />
    <input autocomplete="off" type="hidden" name="module" value="${param.module}" />
    <input autocomplete="off" type="hidden" name="showArchive" value="Y" />
</div>

<div class="csr_bdr" style="margin: 0 0 10px 40px;"></div>


<div id="responseBox"></div>
<input type="hidden" value="${param.module}" id="functionality" autocomplete="off" />


<!-- Session Variables -->
Store id: ${CommandContext.storeId}
CSR Id : ${CommandContext.callerId}
User Id : ${CommandContext.userId}
User first Name : ${person.contactInfo.contactName.firstName }
User Last Name : ${person.contactInfo.contactName.lastName }
User Title : ${person.contactInfo.contactName.personTitle }

Initialising User Facade : 

<wcf:getData type="com.ibm.commerce.member.facade.datatypes.PersonType" var="person" expressionBuilder="findByUniqueID">
    <wcf:param name="personId" value="${CommandContext.userId}" />
    <wcf:param name="accessProfile" value="IBM_All" />
 </wcf:getData>

Initialising CSR facade :
<wcbase:useBean id="csrAuthorizeBean" classname="com.atech.commerce.csr.beans.CSRAuthorizationBean" scope="request">
    <c:set target="${csrAuthorizeBean}" property="userId" value="${CommandContext.callerId}" />
</wcbase:useBean>
