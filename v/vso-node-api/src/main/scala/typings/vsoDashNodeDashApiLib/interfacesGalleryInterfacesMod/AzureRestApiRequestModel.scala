package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureRestApiRequestModel extends js.Object {
  /**
    * Gets or sets the Asset details
    */
  var assetDetails: AssetDetails
  /**
    * Gets or sets the asset id
    */
  var assetId: java.lang.String
  /**
    * Gets or sets the asset version
    */
  var assetVersion: scala.Double
  /**
    * Gets or sets the customer support email
    */
  var customerSupportEmail: java.lang.String
  /**
    * Gets or sets the integration contact email
    */
  var integrationContactEmail: java.lang.String
  /**
    * Gets or sets the asset version
    */
  var operation: java.lang.String
  /**
    * Gets or sets the plan identifier if any.
    */
  var planId: java.lang.String
  /**
    * Gets or sets the publisher id
    */
  var publisherId: java.lang.String
  /**
    * Gets or sets the resource type
    */
  var `type`: java.lang.String
}

object AzureRestApiRequestModel {
  @scala.inline
  def apply(
    assetDetails: AssetDetails,
    assetId: java.lang.String,
    assetVersion: scala.Double,
    customerSupportEmail: java.lang.String,
    integrationContactEmail: java.lang.String,
    operation: java.lang.String,
    planId: java.lang.String,
    publisherId: java.lang.String,
    `type`: java.lang.String
  ): AzureRestApiRequestModel = {
    val __obj = js.Dynamic.literal(assetDetails = assetDetails, assetId = assetId, assetVersion = assetVersion, customerSupportEmail = customerSupportEmail, integrationContactEmail = integrationContactEmail, operation = operation, planId = planId, publisherId = publisherId, `type` = `type`)
  
    __obj.asInstanceOf[AzureRestApiRequestModel]
  }
}

