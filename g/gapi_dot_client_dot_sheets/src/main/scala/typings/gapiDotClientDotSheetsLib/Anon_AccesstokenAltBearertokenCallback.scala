package typings
package gapiDotClientDotSheetsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAltBearertokenCallback extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines if the update response should include the values
    * of the cells that were appended. By default, responses
    * do not include the updated values.
    */
  var includeValuesInResponse: js.UndefOr[scala.Boolean] = js.undefined
  /** How the input data should be inserted. */
  var insertDataOption: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The A1 notation of a range to search for a logical table of data.
    * Values will be appended after the last row of the table.
    */
  var range: java.lang.String
  /**
    * Determines how dates, times, and durations in the response should be
    * rendered. This is ignored if response_value_render_option is
    * FORMATTED_VALUE.
    * The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var responseDateTimeRenderOption: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Determines how values in the response should be rendered.
    * The default render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var responseValueRenderOption: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the spreadsheet to update. */
  var spreadsheetId: java.lang.String
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
  /** How the input data should be interpreted. */
  var valueInputOption: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccesstokenAltBearertokenCallback {
  @scala.inline
  def apply(
    range: java.lang.String,
    spreadsheetId: java.lang.String,
    `$.xgafv`: java.lang.String = null,
    access_token: java.lang.String = null,
    alt: java.lang.String = null,
    bearer_token: java.lang.String = null,
    callback: java.lang.String = null,
    fields: java.lang.String = null,
    includeValuesInResponse: js.UndefOr[scala.Boolean] = js.undefined,
    insertDataOption: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pp: js.UndefOr[scala.Boolean] = js.undefined,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    responseDateTimeRenderOption: java.lang.String = null,
    responseValueRenderOption: java.lang.String = null,
    uploadType: java.lang.String = null,
    upload_protocol: java.lang.String = null,
    valueInputOption: java.lang.String = null
  ): Anon_AccesstokenAltBearertokenCallback = {
    val __obj = js.Dynamic.literal(range = range, spreadsheetId = spreadsheetId)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(includeValuesInResponse)) __obj.updateDynamic("includeValuesInResponse")(includeValuesInResponse)
    if (insertDataOption != null) __obj.updateDynamic("insertDataOption")(insertDataOption)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (responseDateTimeRenderOption != null) __obj.updateDynamic("responseDateTimeRenderOption")(responseDateTimeRenderOption)
    if (responseValueRenderOption != null) __obj.updateDynamic("responseValueRenderOption")(responseValueRenderOption)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    if (valueInputOption != null) __obj.updateDynamic("valueInputOption")(valueInputOption)
    __obj.asInstanceOf[Anon_AccesstokenAltBearertokenCallback]
  }
}

