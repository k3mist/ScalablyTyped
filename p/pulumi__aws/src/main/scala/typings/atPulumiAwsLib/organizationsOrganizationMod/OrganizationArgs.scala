package typings
package atPulumiAwsLib.organizationsOrganizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationArgs extends js.Object {
  /**
    * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `feature_set` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
    */
  val awsServiceAccessPrincipals: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Specify "ALL" (default) or "CONSOLIDATED_BILLING".
    */
  val featureSet: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object OrganizationArgs {
  @scala.inline
  def apply(
    awsServiceAccessPrincipals: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    featureSet: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): OrganizationArgs = {
    val __obj = js.Dynamic.literal()
    if (awsServiceAccessPrincipals != null) __obj.updateDynamic("awsServiceAccessPrincipals")(awsServiceAccessPrincipals.asInstanceOf[js.Any])
    if (featureSet != null) __obj.updateDynamic("featureSet")(featureSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationArgs]
  }
}

