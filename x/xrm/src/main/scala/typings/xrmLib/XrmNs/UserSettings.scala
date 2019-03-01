package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds information about the current user settings.
  */
trait UserSettings extends js.Object {
  /**
    * Returns the ID of the default dashboard for the current user.
    */
  var defaultDashboardId: java.lang.String
  /**
    * Indicates whether guided help is enabled for the current user.
    */
  var isGuidedHelpEnabled: scala.Boolean
  /**
    * Indicates whether high contrast is enabled for the current user.
    */
  var isHighContrastEnabled: scala.Boolean
  /**
    * Indicates whether the language for the current user is a right-to-left (RTL) language.
    */
  var isRTL: scala.Boolean
  /**
    * Returns the language ID for the current user.
    */
  var languageId: scala.Double
  /**
    * Returns an array of strings that represent the GUID values of each of the security role privilege that the user is associated with or any teams that the user is associated with.
    */
  var securityRolePrivileges: js.Array[java.lang.String]
  /**
    * Returns an array of strings that represent the GUID values of each of the security role that the user is associated with or any teams that the user is associated with.
    */
  var securityRoles: js.Array[java.lang.String]
  /**
    * Returns the transaction currency ID for the current user.
    */
  var transactionCurrencyId: java.lang.String
  /**
    * Returns the GUID of the SystemUser.Id value for the current user.
    */
  var userId: java.lang.String
  /**
    * Returns the name of the current user.
    */
  var userName: java.lang.String
  /**
    * Returns the date formatting information for the current user.
    */
  def dateFormattingInfo(): DateFormattingInfo
  /**
    * Returns the difference in minutes between the local time and Coordinated Universal Time (UTC).
    */
  def getTimeZoneOffsetMinutes(): scala.Double
}

object UserSettings {
  @scala.inline
  def apply(
    dateFormattingInfo: js.Function0[DateFormattingInfo],
    defaultDashboardId: java.lang.String,
    getTimeZoneOffsetMinutes: js.Function0[scala.Double],
    isGuidedHelpEnabled: scala.Boolean,
    isHighContrastEnabled: scala.Boolean,
    isRTL: scala.Boolean,
    languageId: scala.Double,
    securityRolePrivileges: js.Array[java.lang.String],
    securityRoles: js.Array[java.lang.String],
    transactionCurrencyId: java.lang.String,
    userId: java.lang.String,
    userName: java.lang.String
  ): UserSettings = {
    val __obj = js.Dynamic.literal(dateFormattingInfo = dateFormattingInfo, defaultDashboardId = defaultDashboardId, getTimeZoneOffsetMinutes = getTimeZoneOffsetMinutes, isGuidedHelpEnabled = isGuidedHelpEnabled, isHighContrastEnabled = isHighContrastEnabled, isRTL = isRTL, languageId = languageId, securityRolePrivileges = securityRolePrivileges, securityRoles = securityRoles, transactionCurrencyId = transactionCurrencyId, userId = userId, userName = userName)
  
    __obj.asInstanceOf[UserSettings]
  }
}

