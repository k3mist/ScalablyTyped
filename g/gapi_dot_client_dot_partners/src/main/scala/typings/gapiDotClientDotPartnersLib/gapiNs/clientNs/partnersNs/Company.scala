package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Company extends js.Object {
  /**
    * URL of the company's additional websites used to verify the dynamic badges.
    * These are stored as full URLs as entered by the user, but only the TLD will
    * be used for the actual verification.
    */
  var additionalWebsites: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Email domains that allow users with a matching email address to get
    * auto-approved for associating with this company.
    */
  var autoApprovalEmailDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Partner badge tier */
  var badgeTier: js.UndefOr[java.lang.String] = js.undefined
  /** The list of Google Partners certification statuses for the company. */
  var certificationStatuses: js.UndefOr[js.Array[CertificationStatus]] = js.undefined
  /** Company type labels listed on the company's profile. */
  var companyTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The minimum monthly budget that the company accepts for partner business,
    * converted to the requested currency code.
    */
  var convertedMinMonthlyBudget: js.UndefOr[Money] = js.undefined
  /** The ID of the company. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Industries the company can help with. */
  var industries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of localized info for the company. */
  var localizedInfos: js.UndefOr[js.Array[LocalizedCompanyInfo]] = js.undefined
  /**
    * The list of all company locations.
    * If set, must include the
    * primary_location
    * in the list.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  /** The name of the company. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unconverted minimum monthly budget that the company accepts for partner
    * business.
    */
  var originalMinMonthlyBudget: js.UndefOr[Money] = js.undefined
  /** The Primary AdWords Manager Account id. */
  var primaryAdwordsManagerAccountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The primary language code of the company, as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var primaryLanguageCode: js.UndefOr[java.lang.String] = js.undefined
  /** The primary location of the company. */
  var primaryLocation: js.UndefOr[Location] = js.undefined
  /** The public viewability status of the company's profile. */
  var profileStatus: js.UndefOr[java.lang.String] = js.undefined
  /** Basic information from the company's public profile. */
  var publicProfile: js.UndefOr[PublicProfile] = js.undefined
  /**
    * Information related to the ranking of the company within the list of
    * companies.
    */
  var ranks: js.UndefOr[js.Array[Rank]] = js.undefined
  /** Services the company can help with. */
  var services: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of Google Partners specialization statuses for the company. */
  var specializationStatus: js.UndefOr[js.Array[SpecializationStatus]] = js.undefined
  /** URL of the company's website. */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Company {
  @scala.inline
  def apply(
    additionalWebsites: js.Array[java.lang.String] = null,
    autoApprovalEmailDomains: js.Array[java.lang.String] = null,
    badgeTier: java.lang.String = null,
    certificationStatuses: js.Array[CertificationStatus] = null,
    companyTypes: js.Array[java.lang.String] = null,
    convertedMinMonthlyBudget: Money = null,
    id: java.lang.String = null,
    industries: js.Array[java.lang.String] = null,
    localizedInfos: js.Array[LocalizedCompanyInfo] = null,
    locations: js.Array[Location] = null,
    name: java.lang.String = null,
    originalMinMonthlyBudget: Money = null,
    primaryAdwordsManagerAccountId: java.lang.String = null,
    primaryLanguageCode: java.lang.String = null,
    primaryLocation: Location = null,
    profileStatus: java.lang.String = null,
    publicProfile: PublicProfile = null,
    ranks: js.Array[Rank] = null,
    services: js.Array[java.lang.String] = null,
    specializationStatus: js.Array[SpecializationStatus] = null,
    websiteUrl: java.lang.String = null
  ): Company = {
    val __obj = js.Dynamic.literal()
    if (additionalWebsites != null) __obj.updateDynamic("additionalWebsites")(additionalWebsites)
    if (autoApprovalEmailDomains != null) __obj.updateDynamic("autoApprovalEmailDomains")(autoApprovalEmailDomains)
    if (badgeTier != null) __obj.updateDynamic("badgeTier")(badgeTier)
    if (certificationStatuses != null) __obj.updateDynamic("certificationStatuses")(certificationStatuses)
    if (companyTypes != null) __obj.updateDynamic("companyTypes")(companyTypes)
    if (convertedMinMonthlyBudget != null) __obj.updateDynamic("convertedMinMonthlyBudget")(convertedMinMonthlyBudget)
    if (id != null) __obj.updateDynamic("id")(id)
    if (industries != null) __obj.updateDynamic("industries")(industries)
    if (localizedInfos != null) __obj.updateDynamic("localizedInfos")(localizedInfos)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (name != null) __obj.updateDynamic("name")(name)
    if (originalMinMonthlyBudget != null) __obj.updateDynamic("originalMinMonthlyBudget")(originalMinMonthlyBudget)
    if (primaryAdwordsManagerAccountId != null) __obj.updateDynamic("primaryAdwordsManagerAccountId")(primaryAdwordsManagerAccountId)
    if (primaryLanguageCode != null) __obj.updateDynamic("primaryLanguageCode")(primaryLanguageCode)
    if (primaryLocation != null) __obj.updateDynamic("primaryLocation")(primaryLocation)
    if (profileStatus != null) __obj.updateDynamic("profileStatus")(profileStatus)
    if (publicProfile != null) __obj.updateDynamic("publicProfile")(publicProfile)
    if (ranks != null) __obj.updateDynamic("ranks")(ranks)
    if (services != null) __obj.updateDynamic("services")(services)
    if (specializationStatus != null) __obj.updateDynamic("specializationStatus")(specializationStatus)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[Company]
  }
}

