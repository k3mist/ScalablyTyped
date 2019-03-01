package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  /** Account permissions assigned to this account. */
  var accountPermissionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Profile for this account. This is a read-only field that can be left blank. */
  var accountProfile: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this account is active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Maximum number of active ads allowed for this account. */
  var activeAdsLimitTier: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to serve creatives with Active View tags. If disabled, viewability data will not be available for any impressions. */
  var activeViewOptOut: js.UndefOr[scala.Boolean] = js.undefined
  /** User role permissions available to the user roles of this account. */
  var availablePermissionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** ID of the country associated with this account. */
  var countryId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID of currency associated with this account. This is a required field.
    * Acceptable values are:
    * - "1" for USD
    * - "2" for GBP
    * - "3" for ESP
    * - "4" for SEK
    * - "5" for CAD
    * - "6" for JPY
    * - "7" for DEM
    * - "8" for AUD
    * - "9" for FRF
    * - "10" for ITL
    * - "11" for DKK
    * - "12" for NOK
    * - "13" for FIM
    * - "14" for ZAR
    * - "15" for IEP
    * - "16" for NLG
    * - "17" for EUR
    * - "18" for KRW
    * - "19" for TWD
    * - "20" for SGD
    * - "21" for CNY
    * - "22" for HKD
    * - "23" for NZD
    * - "24" for MYR
    * - "25" for BRL
    * - "26" for PTE
    * - "27" for MXP
    * - "28" for CLP
    * - "29" for TRY
    * - "30" for ARS
    * - "31" for PEN
    * - "32" for ILS
    * - "33" for CHF
    * - "34" for VEF
    * - "35" for COP
    * - "36" for GTQ
    * - "37" for PLN
    * - "39" for INR
    * - "40" for THB
    * - "41" for IDR
    * - "42" for CZK
    * - "43" for RON
    * - "44" for HUF
    * - "45" for RUB
    * - "46" for AED
    * - "47" for BGN
    * - "48" for HRK
    * - "49" for MXN
    */
  var currencyId: js.UndefOr[java.lang.String] = js.undefined
  /** Default placement dimensions for this account. */
  var defaultCreativeSizeId: js.UndefOr[java.lang.String] = js.undefined
  /** Description of this account. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this account. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#account". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Locale of this account.
    * Acceptable values are:
    * - "cs" (Czech)
    * - "de" (German)
    * - "en" (English)
    * - "en-GB" (English United Kingdom)
    * - "es" (Spanish)
    * - "fr" (French)
    * - "it" (Italian)
    * - "ja" (Japanese)
    * - "ko" (Korean)
    * - "pl" (Polish)
    * - "pt-BR" (Portuguese Brazil)
    * - "ru" (Russian)
    * - "sv" (Swedish)
    * - "tr" (Turkish)
    * - "zh-CN" (Chinese Simplified)
    * - "zh-TW" (Chinese Traditional)
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum image size allowed for this account, in kilobytes. Value must be greater than or equal to 1. */
  var maximumImageSize: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this account. This is a required field, and must be less than 128 characters long and be globally unique. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Whether campaigns created in this account will be enabled for Nielsen OCR reach ratings by default. */
  var nielsenOcrEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Reporting configuration of this account. */
  var reportsConfiguration: js.UndefOr[ReportsConfiguration] = js.undefined
  /** Share Path to Conversion reports with Twitter. */
  var shareReportsWithTwitter: js.UndefOr[scala.Boolean] = js.undefined
  /** File size limit in kilobytes of Rich Media teaser creatives. Acceptable values are 1 to 10240, inclusive. */
  var teaserSizeLimit: js.UndefOr[java.lang.String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    accountPermissionIds: js.Array[java.lang.String] = null,
    accountProfile: java.lang.String = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    activeAdsLimitTier: java.lang.String = null,
    activeViewOptOut: js.UndefOr[scala.Boolean] = js.undefined,
    availablePermissionIds: js.Array[java.lang.String] = null,
    countryId: java.lang.String = null,
    currencyId: java.lang.String = null,
    defaultCreativeSizeId: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    locale: java.lang.String = null,
    maximumImageSize: java.lang.String = null,
    name: java.lang.String = null,
    nielsenOcrEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    reportsConfiguration: ReportsConfiguration = null,
    shareReportsWithTwitter: js.UndefOr[scala.Boolean] = js.undefined,
    teaserSizeLimit: java.lang.String = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (accountPermissionIds != null) __obj.updateDynamic("accountPermissionIds")(accountPermissionIds)
    if (accountProfile != null) __obj.updateDynamic("accountProfile")(accountProfile)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (activeAdsLimitTier != null) __obj.updateDynamic("activeAdsLimitTier")(activeAdsLimitTier)
    if (!js.isUndefined(activeViewOptOut)) __obj.updateDynamic("activeViewOptOut")(activeViewOptOut)
    if (availablePermissionIds != null) __obj.updateDynamic("availablePermissionIds")(availablePermissionIds)
    if (countryId != null) __obj.updateDynamic("countryId")(countryId)
    if (currencyId != null) __obj.updateDynamic("currencyId")(currencyId)
    if (defaultCreativeSizeId != null) __obj.updateDynamic("defaultCreativeSizeId")(defaultCreativeSizeId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maximumImageSize != null) __obj.updateDynamic("maximumImageSize")(maximumImageSize)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(nielsenOcrEnabled)) __obj.updateDynamic("nielsenOcrEnabled")(nielsenOcrEnabled)
    if (reportsConfiguration != null) __obj.updateDynamic("reportsConfiguration")(reportsConfiguration)
    if (!js.isUndefined(shareReportsWithTwitter)) __obj.updateDynamic("shareReportsWithTwitter")(shareReportsWithTwitter)
    if (teaserSizeLimit != null) __obj.updateDynamic("teaserSizeLimit")(teaserSizeLimit)
    __obj.asInstanceOf[Account]
  }
}

